package typings.xstate.typesMod

import typings.xstate.typesMod.ActionTypes.Raise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RaiseActionObject[TEvent /* <: EventObject */] extends StObject {
  
  var _event: typings.xstate.typesMod.SCXML.Event[TEvent]
  
  var `type`: Raise
}
object RaiseActionObject {
  
  inline def apply[TEvent /* <: EventObject */](_event: typings.xstate.typesMod.SCXML.Event[TEvent], `type`: Raise): RaiseActionObject[TEvent] = {
    val __obj = js.Dynamic.literal(_event = _event.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RaiseActionObject[TEvent]]
  }
  
  extension [Self <: RaiseActionObject[?], TEvent /* <: EventObject */](x: Self & RaiseActionObject[TEvent]) {
    
    inline def setType(value: Raise): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def set_event(value: typings.xstate.typesMod.SCXML.Event[TEvent]): Self = StObject.set(x, "_event", value.asInstanceOf[js.Any])
  }
}
