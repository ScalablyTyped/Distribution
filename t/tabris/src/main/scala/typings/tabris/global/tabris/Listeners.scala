package typings.tabris.global.tabris

import typings.tabris.anon.PickNativeObjectonoffonce
import typings.tabris.anon.Target
import typings.tabris.mod.TargetType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("tabris.Listeners")
@js.native
class Listeners[EventData /* <: Target */] protected ()
  extends typings.tabris.mod.Listeners[EventData] {
  def this(target: TargetType[EventData], `type`: String) = this()
}
/* static members */
object Listeners {
  
  @JSGlobal("tabris.Listeners")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getListenerStore(target: js.Object): PickNativeObjectonoffonce = ^.asInstanceOf[js.Dynamic].applyDynamic("getListenerStore")(target.asInstanceOf[js.Any]).asInstanceOf[PickNativeObjectonoffonce]
}
