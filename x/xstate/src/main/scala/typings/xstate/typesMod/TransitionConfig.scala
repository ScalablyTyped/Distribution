package typings.xstate.typesMod

import typings.std.Record
import typings.xstate.anon.ContextTContext
import typings.xstate.stateNodeMod.StateNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransitionConfig[TContext, TEvent /* <: EventObject */] extends StObject {
  
  var actions: js.UndefOr[Actions[TContext, TEvent]] = js.native
  
  var cond: js.UndefOr[Condition[TContext, TEvent]] = js.native
  
  var in: js.UndefOr[StateValue] = js.native
  
  var internal: js.UndefOr[Boolean] = js.native
  
  var meta: js.UndefOr[Record[String, _]] = js.native
  
  var target: js.UndefOr[TransitionTarget[TContext, TEvent]] = js.native
}
object TransitionConfig {
  
  @scala.inline
  def apply[TContext, TEvent /* <: EventObject */](): TransitionConfig[TContext, TEvent] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransitionConfig[TContext, TEvent]]
  }
  
  @scala.inline
  implicit class TransitionConfigMutableBuilder[Self <: TransitionConfig[_, _], TContext, TEvent /* <: EventObject */] (val x: Self with (TransitionConfig[TContext, TEvent])) extends AnyVal {
    
    @scala.inline
    def setActions(value: Actions[TContext, TEvent]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionsFunction3(value: (TContext, TEvent, /* meta */ ActionMeta[TContext, TEvent]) => Unit): Self = StObject.set(x, "actions", js.Any.fromFunction3(value))
    
    @scala.inline
    def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
    
    @scala.inline
    def setActionsVarargs(value: (Action[TContext, TEvent])*): Self = StObject.set(x, "actions", js.Array(value :_*))
    
    @scala.inline
    def setCond(value: Condition[TContext, TEvent]): Self = StObject.set(x, "cond", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCondFunction3(value: (TContext, TEvent, /* meta */ GuardMeta[TContext, TEvent]) => Boolean): Self = StObject.set(x, "cond", js.Any.fromFunction3(value))
    
    @scala.inline
    def setCondUndefined: Self = StObject.set(x, "cond", js.undefined)
    
    @scala.inline
    def setIn(value: StateValue): Self = StObject.set(x, "in", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInUndefined: Self = StObject.set(x, "in", js.undefined)
    
    @scala.inline
    def setInternal(value: Boolean): Self = StObject.set(x, "internal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInternalUndefined: Self = StObject.set(x, "internal", js.undefined)
    
    @scala.inline
    def setMeta(value: Record[String, _]): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
    
    @scala.inline
    def setTarget(value: TransitionTarget[TContext, TEvent]): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    @scala.inline
    def setTargetVarargs(value: (String | (StateNode[TContext, js.Any, TEvent, ContextTContext[TContext]]))*): Self = StObject.set(x, "target", js.Array(value :_*))
  }
}
