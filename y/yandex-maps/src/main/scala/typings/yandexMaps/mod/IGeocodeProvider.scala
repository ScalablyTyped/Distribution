package typings.yandexMaps.mod

import typings.yandexMaps.anon.BoundedBy
import typings.yandexMaps.anon.Results
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IGeocodeProvider extends StObject {
  
  def geocode(request: String): js.Promise[js.Object] = js.native
  def geocode(request: String, options: BoundedBy): js.Promise[js.Object] = js.native
  
  def suggest(request: String): js.Promise[js.Object] = js.native
  def suggest(request: String, options: Results): js.Promise[js.Object] = js.native
}
