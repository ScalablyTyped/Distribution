package typings.xstate.typesMod

import typings.xstate.anon.ContextTContext
import typings.xstate.stateNodeMod.StateNode
import typings.xstate.xstateStrings.Asterisk
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DelayedTransitionDefinition[TContext, TEvent /* <: EventObject */] extends TransitionDefinition[TContext, TEvent] {
  
  var delay: Double | String | (DelayExpr[TContext, TEvent]) = js.native
}
object DelayedTransitionDefinition {
  
  @scala.inline
  def apply[TContext, TEvent /* <: EventObject */](
    actions: js.Array[ActionObject[TContext, TEvent]],
    delay: Double | String | (DelayExpr[TContext, TEvent]),
    eventType: (/* import warning: importer.ImportType#apply Failed type conversion: TEvent['type'] */ js.Any) | typings.xstate.typesMod.ActionTypes.NullEvent | Asterisk,
    source: StateNode[TContext, _, TEvent, ContextTContext[TContext]],
    toJSON: () => typings.xstate.anon.Actions[TContext, TEvent]
  ): DelayedTransitionDefinition[TContext, TEvent] = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], delay = delay.asInstanceOf[js.Any], eventType = eventType.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON))
    __obj.asInstanceOf[DelayedTransitionDefinition[TContext, TEvent]]
  }
  
  @scala.inline
  implicit class DelayedTransitionDefinitionMutableBuilder[Self <: DelayedTransitionDefinition[_, _], TContext, TEvent /* <: EventObject */] (val x: Self with (DelayedTransitionDefinition[TContext, TEvent])) extends AnyVal {
    
    @scala.inline
    def setDelay(value: Double | String | (DelayExpr[TContext, TEvent])): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelayFunction3(value: (TContext, TEvent, /* meta */ SCXMLEventMeta[TEvent]) => Double): Self = StObject.set(x, "delay", js.Any.fromFunction3(value))
  }
}
