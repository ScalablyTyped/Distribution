package typings.wonderJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wonder.js/dist/es2015", "EventHandlerFactory")
@js.native
class EventHandlerFactory ()
  extends typings.wonderJs.eventHandlerFactoryMod.EventHandlerFactory
/* static members */
object EventHandlerFactory {
  
  @JSImport("wonder.js/dist/es2015", "EventHandlerFactory")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def createEventHandler(eventType: typings.wonderJs.eeventtypeMod.EEventType): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("createEventHandler")(eventType.asInstanceOf[js.Any]).asInstanceOf[js.Any]
}
