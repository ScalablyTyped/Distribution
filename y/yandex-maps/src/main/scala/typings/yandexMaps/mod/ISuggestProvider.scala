package typings.yandexMaps.mod

import typings.yandexMaps.anon.OmitISuggestOptionsprovid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISuggestProvider extends StObject {
  
  def suggest(request: String): js.Promise[js.Array[ISuggestResult]] = js.native
  def suggest(request: String, options: OmitISuggestOptionsprovid): js.Promise[js.Array[ISuggestResult]] = js.native
}
