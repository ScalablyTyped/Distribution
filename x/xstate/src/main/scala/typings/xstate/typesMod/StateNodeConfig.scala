package typings.xstate.typesMod

import typings.xstate.anon.ContextAny
import typings.xstate.anon.ContextTContext
import typings.xstate.anon.`0`
import typings.xstate.anon.`1`
import typings.xstate.stateNodeMod.StateNode
import typings.xstate.xstateStrings.`final`
import typings.xstate.xstateStrings.atomic
import typings.xstate.xstateStrings.compound
import typings.xstate.xstateStrings.deep
import typings.xstate.xstateStrings.history
import typings.xstate.xstateStrings.parallel
import typings.xstate.xstateStrings.shallow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StateNodeConfig[TContext, TStateSchema /* <: StateSchema[_] */, TEvent /* <: EventObject */] extends SimpleOrStateNodeConfig[TContext, TStateSchema, TEvent] {
  
  /**
    * The activities to be started upon entering the state node,
    * and stopped upon exiting the state node.
    */
  var activities: js.UndefOr[SingleOrArray[Activity[TContext, TEvent]]] = js.native
  
  /**
    * The mapping (or array) of delays (in milliseconds) to their potential transition(s).
    * The delayed transitions are taken after the specified delay in an interpreter.
    */
  var after: js.UndefOr[DelayedTransitions[TContext, TEvent]] = js.native
  
  /**
    * An eventless transition that is always taken when this state node is active.
    * Equivalent to a transition specified as an empty `''`' string in the `on` property.
    */
  var always: js.UndefOr[TransitionConfigOrTarget[TContext, TEvent]] = js.native
  
  /**
    * The initial context (extended state) of the machine.
    *
    * Can be an object or a function that returns an object.
    */
  var context: js.UndefOr[TContext | js.Function0[TContext]] = js.native
  
  /**
    * The data sent with the "done.state._id_" event if this is a final state node.
    *
    * The data will be evaluated with the current `context` and placed on the `.data` property
    * of the event.
    */
  var data: js.UndefOr[(Mapper[TContext, TEvent, _]) | (PropertyMapper[TContext, TEvent, _])] = js.native
  
  /**
    * The string delimiter for serializing the path to a string. The default is "."
    */
  var delimiter: js.UndefOr[String] = js.native
  
  /**
    * The action(s) to be executed upon entering the state node.
    */
  var entry: js.UndefOr[Actions[TContext, TEvent]] = js.native
  
  /**
    * The action(s) to be executed upon exiting the state node.
    */
  var exit: js.UndefOr[Actions[TContext, TEvent]] = js.native
  
  /**
    * Indicates whether the state node is a history state node, and what
    * type of history:
    * shallow, deep, true (shallow), false (none), undefined (none)
    */
  var history: js.UndefOr[shallow | deep | Boolean] = js.native
  
  /**
    * The unique ID of the state node, which can be referenced as a transition target via the
    * `#id` syntax.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * The initial state node key.
    */
  var initial: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: keyof TStateSchema['states'] */ js.Any
  ] = js.native
  
  /**
    * The services to invoke upon entering this state node. These services will be stopped upon exiting this state node.
    */
  var invoke: js.UndefOr[
    SingleOrArray[(InvokeConfig[TContext, TEvent]) | (StateMachine[_, _, _, ContextAny])]
  ] = js.native
  
  /**
    * The relative key of the state node, which represents its location in the overall state value.
    * This is automatically determined by the configuration shape via the key where it was defined.
    */
  var key: js.UndefOr[String] = js.native
  
  /**
    * The meta data associated with this state node, which will be returned in State instances.
    */
  var meta: js.UndefOr[js.Any] = js.native
  
  /**
    * The mapping of event types to their potential transition(s).
    */
  var on: js.UndefOr[TransitionsConfig[TContext, TEvent]] = js.native
  
  /**
    * The potential transition(s) to be taken upon reaching a final child state node.
    *
    * This is equivalent to defining a `[done(id)]` transition on this state node's `on` property.
    */
  var onDone: js.UndefOr[String | (SingleOrArray[TransitionConfig[TContext, DoneEventObject]])] = js.native
  
  /**
    * The action(s) to be executed upon entering the state node.
    *
    * @deprecated Use `entry` instead.
    */
  var onEntry: js.UndefOr[Actions[TContext, TEvent]] = js.native
  
  /**
    * The action(s) to be executed upon exiting the state node.
    *
    * @deprecated Use `exit` instead.
    */
  var onExit: js.UndefOr[Actions[TContext, TEvent]] = js.native
  
  /**
    * The order this state node appears. Corresponds to the implicit SCXML document order.
    */
  var order: js.UndefOr[Double] = js.native
  
  /**
    * @deprecated
    */
  var parallel: js.UndefOr[Boolean] = js.native
  
  /**
    * @private
    */
  var parent: js.UndefOr[StateNode[TContext, _, TEvent, ContextTContext[TContext]]] = js.native
  
  /**
    * The mapping of state node keys to their state node configurations (recursive).
    */
  var states: js.UndefOr[StatesConfig[TContext, TStateSchema, TEvent]] = js.native
  
  var strict: js.UndefOr[Boolean] = js.native
  
  /**
    * The type of this state node:
    *
    *  - `'atomic'` - no child state nodes
    *  - `'compound'` - nested child state nodes (XOR)
    *  - `'parallel'` - orthogonal nested child state nodes (AND)
    *  - `'history'` - history state node
    *  - `'final'` - final state node
    */
  var `type`: js.UndefOr[atomic | compound | parallel | `final` | history] = js.native
}
object StateNodeConfig {
  
  @scala.inline
  def apply[TContext, TStateSchema /* <: StateSchema[_] */, TEvent /* <: EventObject */](): StateNodeConfig[TContext, TStateSchema, TEvent] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StateNodeConfig[TContext, TStateSchema, TEvent]]
  }
  
  @scala.inline
  implicit class StateNodeConfigOps[Self <: StateNodeConfig[_, _, _], TContext, TStateSchema /* <: StateSchema[_] */, TEvent /* <: EventObject */] (val x: Self with (StateNodeConfig[TContext, TStateSchema, TEvent])) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setActivitiesVarargs(value: (Activity[TContext, TEvent])*): Self = this.set("activities", js.Array(value :_*))
    
    @scala.inline
    def setActivities(value: SingleOrArray[Activity[TContext, TEvent]]): Self = this.set("activities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActivities: Self = this.set("activities", js.undefined)
    
    @scala.inline
    def setAfterVarargs(value: ((TransitionConfig[TContext, TEvent]) with (typings.xstate.anon.Delay[TContext, TEvent]))*): Self = this.set("after", js.Array(value :_*))
    
    @scala.inline
    def setAfter(value: DelayedTransitions[TContext, TEvent]): Self = this.set("after", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAfter: Self = this.set("after", js.undefined)
    
    @scala.inline
    def setAlwaysVarargs(value: ((TransitionConfigTarget[TContext, TEvent]) | (TransitionConfig[TContext, TEvent]))*): Self = this.set("always", js.Array(value :_*))
    
    @scala.inline
    def setAlways(value: TransitionConfigOrTarget[TContext, TEvent]): Self = this.set("always", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlways: Self = this.set("always", js.undefined)
    
    @scala.inline
    def setContextFunction0(value: () => TContext): Self = this.set("context", js.Any.fromFunction0(value))
    
    @scala.inline
    def setContext(value: TContext | js.Function0[TContext]): Self = this.set("context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContext: Self = this.set("context", js.undefined)
    
    @scala.inline
    def setDataFunction2(value: (TContext, TEvent) => _): Self = this.set("data", js.Any.fromFunction2(value))
    
    @scala.inline
    def setData(value: (Mapper[TContext, TEvent, _]) | (PropertyMapper[TContext, TEvent, _])): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    
    @scala.inline
    def setDelimiter(value: String): Self = this.set("delimiter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelimiter: Self = this.set("delimiter", js.undefined)
    
    @scala.inline
    def setEntryVarargs(value: (Action[TContext, TEvent])*): Self = this.set("entry", js.Array(value :_*))
    
    @scala.inline
    def setEntryFunction3(value: (TContext, TEvent, /* meta */ ActionMeta[TContext, TEvent]) => Unit): Self = this.set("entry", js.Any.fromFunction3(value))
    
    @scala.inline
    def setEntry(value: Actions[TContext, TEvent]): Self = this.set("entry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEntry: Self = this.set("entry", js.undefined)
    
    @scala.inline
    def setExitVarargs(value: (Action[TContext, TEvent])*): Self = this.set("exit", js.Array(value :_*))
    
    @scala.inline
    def setExitFunction3(value: (TContext, TEvent, /* meta */ ActionMeta[TContext, TEvent]) => Unit): Self = this.set("exit", js.Any.fromFunction3(value))
    
    @scala.inline
    def setExit(value: Actions[TContext, TEvent]): Self = this.set("exit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExit: Self = this.set("exit", js.undefined)
    
    @scala.inline
    def setHistory(value: shallow | deep | Boolean): Self = this.set("history", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHistory: Self = this.set("history", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setInitial(
      value: /* import warning: importer.ImportType#apply Failed type conversion: keyof TStateSchema['states'] */ js.Any
    ): Self = this.set("initial", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitial: Self = this.set("initial", js.undefined)
    
    @scala.inline
    def setInvokeVarargs(value: ((InvokeConfig[TContext, TEvent]) | (StateMachine[js.Any, js.Any, js.Any, ContextAny]))*): Self = this.set("invoke", js.Array(value :_*))
    
    @scala.inline
    def setInvoke(value: SingleOrArray[(InvokeConfig[TContext, TEvent]) | (StateMachine[_, _, _, ContextAny])]): Self = this.set("invoke", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInvoke: Self = this.set("invoke", js.undefined)
    
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    
    @scala.inline
    def setMeta(value: js.Any): Self = this.set("meta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMeta: Self = this.set("meta", js.undefined)
    
    @scala.inline
    def setOnVarargs(
      value: (((TransitionConfig[TContext, TEvent]) with typings.xstate.anon.Event[TEvent]) | ((TransitionConfig[TContext, TEvent]) with `0`) | ((TransitionConfig[TContext, TEvent]) with `1`))*
    ): Self = this.set("on", js.Array(value :_*))
    
    @scala.inline
    def setOn(value: TransitionsConfig[TContext, TEvent]): Self = this.set("on", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOn: Self = this.set("on", js.undefined)
    
    @scala.inline
    def setOnDoneVarargs(value: (TransitionConfig[TContext, DoneEventObject])*): Self = this.set("onDone", js.Array(value :_*))
    
    @scala.inline
    def setOnDone(value: String | (SingleOrArray[TransitionConfig[TContext, DoneEventObject]])): Self = this.set("onDone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnDone: Self = this.set("onDone", js.undefined)
    
    @scala.inline
    def setOnEntryVarargs(value: (Action[TContext, TEvent])*): Self = this.set("onEntry", js.Array(value :_*))
    
    @scala.inline
    def setOnEntryFunction3(value: (TContext, TEvent, /* meta */ ActionMeta[TContext, TEvent]) => Unit): Self = this.set("onEntry", js.Any.fromFunction3(value))
    
    @scala.inline
    def setOnEntry(value: Actions[TContext, TEvent]): Self = this.set("onEntry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnEntry: Self = this.set("onEntry", js.undefined)
    
    @scala.inline
    def setOnExitVarargs(value: (Action[TContext, TEvent])*): Self = this.set("onExit", js.Array(value :_*))
    
    @scala.inline
    def setOnExitFunction3(value: (TContext, TEvent, /* meta */ ActionMeta[TContext, TEvent]) => Unit): Self = this.set("onExit", js.Any.fromFunction3(value))
    
    @scala.inline
    def setOnExit(value: Actions[TContext, TEvent]): Self = this.set("onExit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnExit: Self = this.set("onExit", js.undefined)
    
    @scala.inline
    def setOrder(value: Double): Self = this.set("order", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrder: Self = this.set("order", js.undefined)
    
    @scala.inline
    def setParallel(value: Boolean): Self = this.set("parallel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParallel: Self = this.set("parallel", js.undefined)
    
    @scala.inline
    def setParent(value: StateNode[TContext, _, TEvent, ContextTContext[TContext]]): Self = this.set("parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParent: Self = this.set("parent", js.undefined)
    
    @scala.inline
    def setStates(value: StatesConfig[TContext, TStateSchema, TEvent]): Self = this.set("states", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStates: Self = this.set("states", js.undefined)
    
    @scala.inline
    def setStrict(value: Boolean): Self = this.set("strict", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrict: Self = this.set("strict", js.undefined)
    
    @scala.inline
    def setType(value: atomic | compound | parallel | `final` | history): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
