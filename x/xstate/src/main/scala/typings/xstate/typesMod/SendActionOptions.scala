package typings.xstate.typesMod

import typings.xstate.actorMod.Actor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SendActionOptions[TContext, TEvent /* <: EventObject */] extends StObject {
  
  var delay: js.UndefOr[Double | String | (DelayExpr[TContext, TEvent])] = js.native
  
  var id: js.UndefOr[String | Double] = js.native
  
  var to: js.UndefOr[
    String | (ExprWithMeta[TContext, TEvent, String | Double | (Actor[_, AnyEventObject])])
  ] = js.native
}
object SendActionOptions {
  
  @scala.inline
  def apply[TContext, TEvent /* <: EventObject */](): SendActionOptions[TContext, TEvent] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SendActionOptions[TContext, TEvent]]
  }
  
  @scala.inline
  implicit class SendActionOptionsMutableBuilder[Self <: SendActionOptions[_, _], TContext, TEvent /* <: EventObject */] (val x: Self with (SendActionOptions[TContext, TEvent])) extends AnyVal {
    
    @scala.inline
    def setDelay(value: Double | String | (DelayExpr[TContext, TEvent])): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelayFunction3(value: (TContext, TEvent, /* meta */ SCXMLEventMeta[TEvent]) => Double): Self = StObject.set(x, "delay", js.Any.fromFunction3(value))
    
    @scala.inline
    def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
    
    @scala.inline
    def setId(value: String | Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setTo(value: String | (ExprWithMeta[TContext, TEvent, String | Double | (Actor[_, AnyEventObject])])): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToFunction3(
      value: (TContext, TEvent, /* meta */ SCXMLEventMeta[TEvent]) => String | Double | (Actor[_, AnyEventObject])
    ): Self = StObject.set(x, "to", js.Any.fromFunction3(value))
    
    @scala.inline
    def setToUndefined: Self = StObject.set(x, "to", js.undefined)
  }
}
