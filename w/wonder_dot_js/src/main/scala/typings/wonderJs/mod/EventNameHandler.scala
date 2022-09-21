package typings.wonderJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wonder.js/dist/es2015", "EventNameHandler")
@js.native
open class EventNameHandler ()
  extends typings.wonderJs.eventNameHandlerMod.EventNameHandler
/* static members */
object EventNameHandler {
  
  @JSImport("wonder.js/dist/es2015", "EventNameHandler")
  @js.native
  val ^ : js.Any = js.native
  
  inline def handleEventName(domEventName: typings.wonderJs.eventNameHandlerMod.EEventName): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("handleEventName")(domEventName.asInstanceOf[js.Any]).asInstanceOf[Any]
}
