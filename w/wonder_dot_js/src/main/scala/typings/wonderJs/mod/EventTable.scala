package typings.wonderJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wonder.js/dist/es2015", "EventTable")
@js.native
class EventTable ()
  extends typings.wonderJs.eventTableMod.EventTable
/* static members */
object EventTable {
  
  @JSImport("wonder.js/dist/es2015", "EventTable")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getEventType(eventName: typings.wonderJs.eventNameHandlerMod.EEventName): typings.wonderJs.eeventtypeMod.EEventType = ^.asInstanceOf[js.Dynamic].applyDynamic("getEventType")(eventName.asInstanceOf[js.Any]).asInstanceOf[typings.wonderJs.eeventtypeMod.EEventType]
}
