package typings.xstate.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SCXMLEventMeta[TEvent /* <: EventObject */] extends StObject {
  
  var _event: typings.xstate.typesMod.SCXML.Event[TEvent]
}
object SCXMLEventMeta {
  
  @scala.inline
  def apply[TEvent /* <: EventObject */](_event: typings.xstate.typesMod.SCXML.Event[TEvent]): SCXMLEventMeta[TEvent] = {
    val __obj = js.Dynamic.literal(_event = _event.asInstanceOf[js.Any])
    __obj.asInstanceOf[SCXMLEventMeta[TEvent]]
  }
  
  @scala.inline
  implicit class SCXMLEventMetaMutableBuilder[Self <: SCXMLEventMeta[?], TEvent /* <: EventObject */] (val x: Self & SCXMLEventMeta[TEvent]) extends AnyVal {
    
    @scala.inline
    def set_event(value: typings.xstate.typesMod.SCXML.Event[TEvent]): Self = StObject.set(x, "_event", value.asInstanceOf[js.Any])
  }
}
