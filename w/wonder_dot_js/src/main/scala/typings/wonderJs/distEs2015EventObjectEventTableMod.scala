package typings.wonderJs

import typings.wonderJs.distEs2015EventObjectEeventtypeMod.EEventType
import typings.wonderJs.distEs2015EventObjectEventNameHandlerMod.EEventName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEs2015EventObjectEventTableMod {
  
  @JSImport("wonder.js/dist/es2015/event/object/EventTable", "EventTable")
  @js.native
  open class EventTable () extends StObject
  /* static members */
  object EventTable {
    
    @JSImport("wonder.js/dist/es2015/event/object/EventTable", "EventTable")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getEventType(eventName: EEventName): EEventType = ^.asInstanceOf[js.Dynamic].applyDynamic("getEventType")(eventName.asInstanceOf[js.Any]).asInstanceOf[EEventType]
  }
}
