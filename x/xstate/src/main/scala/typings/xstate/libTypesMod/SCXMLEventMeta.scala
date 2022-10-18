package typings.xstate.libTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SCXMLEventMeta[TEvent /* <: EventObject */] extends StObject {
  
  var _event: typings.xstate.libTypesMod.SCXML.Event[TEvent]
}
object SCXMLEventMeta {
  
  inline def apply[TEvent /* <: EventObject */](_event: typings.xstate.libTypesMod.SCXML.Event[TEvent]): SCXMLEventMeta[TEvent] = {
    val __obj = js.Dynamic.literal(_event = _event.asInstanceOf[js.Any])
    __obj.asInstanceOf[SCXMLEventMeta[TEvent]]
  }
  
  extension [Self <: SCXMLEventMeta[?], TEvent /* <: EventObject */](x: Self & SCXMLEventMeta[TEvent]) {
    
    inline def set_event(value: typings.xstate.libTypesMod.SCXML.Event[TEvent]): Self = StObject.set(x, "_event", value.asInstanceOf[js.Any])
  }
}
