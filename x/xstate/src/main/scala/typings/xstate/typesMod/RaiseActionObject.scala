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
  
  @scala.inline
  def apply[TEvent /* <: EventObject */](_event: typings.xstate.typesMod.SCXML.Event[TEvent], `type`: Raise): RaiseActionObject[TEvent] = {
    val __obj = js.Dynamic.literal(_event = _event.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RaiseActionObject[TEvent]]
  }
  
  @scala.inline
  implicit class RaiseActionObjectMutableBuilder[Self <: RaiseActionObject[?], TEvent /* <: EventObject */] (val x: Self & RaiseActionObject[TEvent]) extends AnyVal {
    
    @scala.inline
    def setType(value: Raise): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_event(value: typings.xstate.typesMod.SCXML.Event[TEvent]): Self = StObject.set(x, "_event", value.asInstanceOf[js.Any])
  }
}
