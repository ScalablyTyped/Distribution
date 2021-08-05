package typings.wonderJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wonder.js/dist/es2015", "CustomEvent")
@js.native
class CustomEvent protected ()
  extends typings.wonderJs.customEventMod.CustomEvent {
  def this(eventName: String) = this()
  def this(eventName: String, userData: js.Any) = this()
}
/* static members */
object CustomEvent {
  
  @JSImport("wonder.js/dist/es2015", "CustomEvent")
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(eventName: String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(eventName.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  inline def create(eventName: String, userData: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(eventName.asInstanceOf[js.Any], userData.asInstanceOf[js.Any])).asInstanceOf[js.Any]
}
