package typings.xstate.typesMod

import typings.xstate.anon.ContextTContext
import typings.xstate.stateNodeMod.StateNode
import typings.xstate.xstateStrings.Asterisk
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DelayedTransitionDefinition[TContext, TEvent /* <: EventObject */]
  extends StObject
     with TransitionDefinition[TContext, TEvent] {
  
  var delay: Double | String | (DelayExpr[TContext, TEvent])
}
object DelayedTransitionDefinition {
  
  inline def apply[TContext, TEvent /* <: EventObject */](
    actions: js.Array[ActionObject[TContext, TEvent]],
    delay: Double | String | (DelayExpr[TContext, TEvent]),
    eventType: (/* import warning: importer.ImportType#apply Failed type conversion: TEvent['type'] */ js.Any) | typings.xstate.typesMod.ActionTypes.NullEvent | Asterisk,
    source: StateNode[TContext, js.Any, TEvent, ContextTContext[TContext]],
    toJSON: () => typings.xstate.anon.Actions[TContext, TEvent]
  ): DelayedTransitionDefinition[TContext, TEvent] = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], delay = delay.asInstanceOf[js.Any], eventType = eventType.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON))
    __obj.asInstanceOf[DelayedTransitionDefinition[TContext, TEvent]]
  }
  
  extension [Self <: DelayedTransitionDefinition[?, ?], TContext, TEvent /* <: EventObject */](x: Self & (DelayedTransitionDefinition[TContext, TEvent])) {
    
    inline def setDelay(value: Double | String | (DelayExpr[TContext, TEvent])): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    inline def setDelayFunction3(value: (TContext, TEvent, /* meta */ SCXMLEventMeta[TEvent]) => Double): Self = StObject.set(x, "delay", js.Any.fromFunction3(value))
  }
}
