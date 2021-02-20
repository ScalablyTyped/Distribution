package typings.xstate.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StateLike[TContext] extends StObject {
  
  var _event: typings.xstate.typesMod.SCXML.Event[EventObject] = js.native
  
  var context: TContext = js.native
  
  var event: EventObject = js.native
  
  var value: StateValue = js.native
}
object StateLike {
  
  @scala.inline
  def apply[TContext](
    _event: typings.xstate.typesMod.SCXML.Event[EventObject],
    context: TContext,
    event: EventObject,
    value: StateValue
  ): StateLike[TContext] = {
    val __obj = js.Dynamic.literal(_event = _event.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[StateLike[TContext]]
  }
  
  @scala.inline
  implicit class StateLikeMutableBuilder[Self <: StateLike[_], TContext] (val x: Self with StateLike[TContext]) extends AnyVal {
    
    @scala.inline
    def setContext(value: TContext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvent(value: EventObject): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: StateValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_event(value: typings.xstate.typesMod.SCXML.Event[EventObject]): Self = StObject.set(x, "_event", value.asInstanceOf[js.Any])
  }
}
