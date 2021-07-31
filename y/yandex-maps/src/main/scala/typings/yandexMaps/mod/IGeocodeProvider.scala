package typings.yandexMaps.mod

import typings.yandexMaps.anon.Results
import typings.yandexMaps.anon.StrictBounds
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IGeocodeProvider extends StObject {
  
  def geocode(request: String): js.Promise[js.Object] = js.native
  def geocode(request: String, options: Results): js.Promise[js.Object] = js.native
  
  def suggest(request: String): js.Promise[js.Object] = js.native
  def suggest(request: String, options: StrictBounds): js.Promise[js.Object] = js.native
}
