package typings.xstate.typesMod

import typings.xstate.actorMod.Actor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SendAction[TContext, TEvent /* <: EventObject */, TSentEvent /* <: EventObject */] extends ActionObject[TContext, TEvent] {
  
  var delay: js.UndefOr[Double | String | (DelayExpr[TContext, TEvent])] = js.native
  
  var event: TSentEvent | (SendExpr[TContext, TEvent, TSentEvent]) = js.native
  
  var id: String | Double = js.native
  
  var to: js.UndefOr[
    String | Double | (Actor[_, AnyEventObject]) | (ExprWithMeta[TContext, TEvent, String | Double | (Actor[_, AnyEventObject])])
  ] = js.native
}
object SendAction {
  
  @scala.inline
  def apply[TContext, TEvent /* <: EventObject */, TSentEvent /* <: EventObject */](event: TSentEvent | (SendExpr[TContext, TEvent, TSentEvent]), id: String | Double, `type`: String): SendAction[TContext, TEvent, TSentEvent] = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendAction[TContext, TEvent, TSentEvent]]
  }
  
  @scala.inline
  implicit class SendActionMutableBuilder[Self <: SendAction[_, _, _], TContext, TEvent /* <: EventObject */, TSentEvent /* <: EventObject */] (val x: Self with (SendAction[TContext, TEvent, TSentEvent])) extends AnyVal {
    
    @scala.inline
    def setDelay(value: Double | String | (DelayExpr[TContext, TEvent])): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelayFunction3(value: (TContext, TEvent, /* meta */ SCXMLEventMeta[TEvent]) => Double): Self = StObject.set(x, "delay", js.Any.fromFunction3(value))
    
    @scala.inline
    def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
    
    @scala.inline
    def setEvent(value: TSentEvent | (SendExpr[TContext, TEvent, TSentEvent])): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventFunction3(value: (TContext, TEvent, /* meta */ SCXMLEventMeta[TEvent]) => TSentEvent): Self = StObject.set(x, "event", js.Any.fromFunction3(value))
    
    @scala.inline
    def setId(value: String | Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTo(
      value: String | Double | (Actor[_, AnyEventObject]) | (ExprWithMeta[TContext, TEvent, String | Double | (Actor[_, AnyEventObject])])
    ): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToFunction3(
      value: (TContext, TEvent, /* meta */ SCXMLEventMeta[TEvent]) => String | Double | (Actor[_, AnyEventObject])
    ): Self = StObject.set(x, "to", js.Any.fromFunction3(value))
    
    @scala.inline
    def setToUndefined: Self = StObject.set(x, "to", js.undefined)
  }
}
