package typings.xstate.typesMod

import typings.xstate.anon.ContextTContext
import typings.xstate.anon.`3`
import typings.xstate.stateNodeMod.StateNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Edge[TContext, TEvent /* <: EventObject */, TEventType /* <: /* import warning: importer.ImportType#apply Failed type conversion: TEvent['type'] */ js.Any */] extends StObject {
  
  var actions: js.Array[Action[TContext, TEvent]] = js.native
  
  var cond: js.UndefOr[Condition[TContext, TEvent with (`3`[TEventType, TEvent])]] = js.native
  
  var event: TEventType = js.native
  
  var meta: js.UndefOr[MetaObject] = js.native
  
  var source: StateNode[TContext, _, TEvent, ContextTContext[TContext]] = js.native
  
  var target: StateNode[TContext, _, TEvent, ContextTContext[TContext]] = js.native
  
  var transition: TransitionDefinition[TContext, TEvent] = js.native
}
object Edge {
  
  @scala.inline
  def apply[TContext, TEvent /* <: EventObject */, TEventType /* <: /* import warning: importer.ImportType#apply Failed type conversion: TEvent['type'] */ js.Any */](
    actions: js.Array[Action[TContext, TEvent]],
    event: TEventType,
    source: StateNode[TContext, _, TEvent, ContextTContext[TContext]],
    target: StateNode[TContext, _, TEvent, ContextTContext[TContext]],
    transition: TransitionDefinition[TContext, TEvent]
  ): Edge[TContext, TEvent, TEventType] = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], transition = transition.asInstanceOf[js.Any])
    __obj.asInstanceOf[Edge[TContext, TEvent, TEventType]]
  }
  
  @scala.inline
  implicit class EdgeMutableBuilder[Self <: Edge[_, _, _], TContext, TEvent /* <: EventObject */, TEventType /* <: /* import warning: importer.ImportType#apply Failed type conversion: TEvent['type'] */ js.Any */] (val x: Self with (Edge[TContext, TEvent, TEventType])) extends AnyVal {
    
    @scala.inline
    def setActions(value: js.Array[Action[TContext, TEvent]]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionsVarargs(value: (Action[TContext, TEvent])*): Self = StObject.set(x, "actions", js.Array(value :_*))
    
    @scala.inline
    def setCond(value: Condition[TContext, TEvent with (`3`[TEventType, TEvent])]): Self = StObject.set(x, "cond", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCondFunction3(
      value: (TContext, TEvent with (`3`[TEventType, TEvent]), /* meta */ GuardMeta[TContext, TEvent with (`3`[TEventType, TEvent])]) => Boolean
    ): Self = StObject.set(x, "cond", js.Any.fromFunction3(value))
    
    @scala.inline
    def setCondUndefined: Self = StObject.set(x, "cond", js.undefined)
    
    @scala.inline
    def setEvent(value: TEventType): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeta(value: MetaObject): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
    
    @scala.inline
    def setSource(value: StateNode[TContext, _, TEvent, ContextTContext[TContext]]): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTarget(value: StateNode[TContext, _, TEvent, ContextTContext[TContext]]): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransition(value: TransitionDefinition[TContext, TEvent]): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
  }
}
