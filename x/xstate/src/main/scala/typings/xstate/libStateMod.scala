package typings.xstate

import typings.std.Omit
import typings.std.Record
import typings.std.Set
import typings.xstate.anon.Tags
import typings.xstate.anon.Value
import typings.xstate.libStateNodeMod.StateNode
import typings.xstate.libTypegenTypesMod.TypegenDisabled
import typings.xstate.libTypesMod.ActionObject
import typings.xstate.libTypesMod.ActivityMap
import typings.xstate.libTypesMod.ActorRef
import typings.xstate.libTypesMod.BaseActionObject
import typings.xstate.libTypesMod.EventObject
import typings.xstate.libTypesMod.HistoryValue
import typings.xstate.libTypesMod.SCXML.Event
import typings.xstate.libTypesMod.StateConfig
import typings.xstate.libTypesMod.StateMachine
import typings.xstate.libTypesMod.StateSchema
import typings.xstate.libTypesMod.StateValue
import typings.xstate.libTypesMod.TransitionDefinition
import typings.xstate.libTypesMod.Typestate
import typings.xstate.xstateStrings.can
import typings.xstate.xstateStrings.configuration
import typings.xstate.xstateStrings.hasTag
import typings.xstate.xstateStrings.machine
import typings.xstate.xstateStrings.matches
import typings.xstate.xstateStrings.tags
import typings.xstate.xstateStrings.toStrings
import typings.xstate.xstateStrings.transitions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libStateMod {
  
  @JSImport("xstate/lib/State", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("xstate/lib/State", "State")
  @js.native
  open class State[TContext, TEvent /* <: EventObject */, TStateSchema /* <: StateSchema[TContext] */, TTypestate /* <: Typestate[TContext] */, TResolvedTypesMeta] protected () extends StObject {
    /**
      * Creates a new State instance.
      * @param value The state value
      * @param context The extended state
      * @param historyValue The tree representing historical values of the state nodes
      * @param history The previous state
      * @param actions An array of action objects to execute as side-effects
      * @param activities A mapping of activities and whether they are started (`true`) or stopped (`false`).
      * @param meta
      * @param events Internal event queue. Should be empty with run-to-completion semantics.
      * @param configuration
      */
    def this(config: StateConfig[TContext, TEvent]) = this()
    
    var _event: Event[TEvent] = js.native
    
    var _sessionid: String | Null = js.native
    
    var actions: js.Array[ActionObject[TContext, TEvent, TEvent, BaseActionObject]] = js.native
    
    var activities: ActivityMap = js.native
    
    /**
      * Determines whether sending the `event` will cause a non-forbidden transition
      * to be selected, even if the transitions have no actions nor
      * change the state value.
      *
      * @param event The event to test
      * @returns Whether the event will cause a transition
      */
    def can(event: TEvent): Boolean = js.native
    @JSName("can")
    def can_type(
      event: /* import warning: importer.ImportType#apply Failed type conversion: xstate.xstate/lib/types.SimpleEventsOf<TEvent>['type'] */ js.Any
    ): Boolean = js.native
    
    /**
      * Indicates whether the state has changed from the previous state. A state is considered "changed" if:
      *
      * - Its value is not equal to its previous value, or:
      * - It has any new actions (side-effects) to execute.
      *
      * An initial state (with no history) will return `undefined`.
      */
    var changed: js.UndefOr[Boolean] = js.native
    
    /**
      * An object mapping actor IDs to spawned actors/invoked services.
      */
    var children: Record[String, ActorRef[Any, Any]] = js.native
    
    /**
      * The enabled state nodes representative of the state value.
      */
    var configuration: js.Array[StateNode[TContext, Any, TEvent, Any, Any, TypegenDisabled]] = js.native
    
    var context: TContext = js.native
    
    /**
      * Indicates whether the state is a final state.
      */
    var done: js.UndefOr[Boolean] = js.native
    
    var event: TEvent = js.native
    
    var events: js.Array[TEvent] = js.native
    
    /**
      * Whether the current state configuration has a state node with the specified `tag`.
      * @param tag
      */
    def hasTag(
      tag: /* import warning: importer.ImportType#apply Failed type conversion: TResolvedTypesMeta extends xstate.xstate/lib/typegenTypes.TypegenEnabled ? xstate.xstate/lib/types.Prop<xstate.xstate/lib/types.Prop<TResolvedTypesMeta, 'resolved'>, 'tags'> : string */ js.Any
    ): Boolean = js.native
    
    var history: js.UndefOr[State[TContext, TEvent, TStateSchema, TTypestate, TResolvedTypesMeta]] = js.native
    
    var historyValue: js.UndefOr[HistoryValue] = js.native
    
    var machine: js.UndefOr[
        StateMachine[TContext, Any, TEvent, TTypestate, BaseActionObject, Any, TResolvedTypesMeta]
      ] = js.native
    
    /**
      * Whether the current state value is a subset of the given parent state value.
      * @param parentStateValue
      */
    def matches[TSV /* <: /* import warning: importer.ImportType#apply Failed type conversion: TResolvedTypesMeta extends xstate.xstate/lib/typegenTypes.TypegenEnabled ? xstate.xstate/lib/types.Prop<xstate.xstate/lib/types.Prop<TResolvedTypesMeta, 'resolved'>, 'matchesStates'> : never */ js.Any */](parentStateValue: TSV): Boolean = js.native
    
    var meta: Any = js.native
    
    /**
      * The next events that will cause a transition from the current state.
      */
    var nextEvents: js.Array[
        /* import warning: importer.ImportType#apply Failed type conversion: TEvent['type'] */ js.Any
      ] = js.native
    
    var tags: Set[String] = js.native
    
    def toJSON(): (Omit[
        this.type, 
        configuration | transitions | tags | machine | toStrings | typings.xstate.xstateStrings.toJSON | matches | hasTag | can
      ]) & Tags = js.native
    
    /**
      * Returns an array of all the string leaf state node paths.
      * @param stateValue
      * @param delimiter The character(s) that separate each subpath in the string state node path.
      */
    def toStrings(): js.Array[String] = js.native
    def toStrings(stateValue: Unit, delimiter: String): js.Array[String] = js.native
    def toStrings(stateValue: StateValue): js.Array[String] = js.native
    def toStrings(stateValue: StateValue, delimiter: String): js.Array[String] = js.native
    
    /**
      * The transition definitions that resulted in this state.
      */
    var transitions: js.Array[TransitionDefinition[TContext, TEvent]] = js.native
    
    var value: StateValue = js.native
  }
  /* static members */
  object State {
    
    @JSImport("xstate/lib/State", "State")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new State instance for the given `config`.
      * @param config The state config
      */
    inline def create[TC, TE /* <: EventObject */](config: StateConfig[TC, TE]): State[TC, TE, Any, Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(config.asInstanceOf[js.Any]).asInstanceOf[State[TC, TE, Any, Any, Any]]
    
    /**
      * Creates a new State instance for the given `stateValue` and `context`.
      * @param stateValue
      * @param context
      */
    inline def from[TC, TE /* <: EventObject */](stateValue: State[TC, TE, Any, Any, Any]): State[TC, TE, Any, Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(stateValue.asInstanceOf[js.Any]).asInstanceOf[State[TC, TE, Any, Any, Any]]
    inline def from[TC, TE /* <: EventObject */](stateValue: State[TC, TE, Any, Any, Any], context: TC): State[TC, TE, Any, Any, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(stateValue.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[State[TC, TE, Any, Any, Any]]
    inline def from[TC, TE /* <: EventObject */](stateValue: StateValue): State[TC, TE, Any, Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(stateValue.asInstanceOf[js.Any]).asInstanceOf[State[TC, TE, Any, Any, Any]]
    inline def from[TC, TE /* <: EventObject */](stateValue: StateValue, context: TC): State[TC, TE, Any, Any, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(stateValue.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[State[TC, TE, Any, Any, Any]]
    
    /**
      * Creates a new `State` instance for the given `stateValue` and `context` with no actions (side-effects).
      * @param stateValue
      * @param context
      */
    inline def inert[TC, TE /* <: EventObject */](stateValue: State[TC, TE, Any, Any, Any], context: TC): State[TC, TE, Any, Value[TC], TypegenDisabled] = (^.asInstanceOf[js.Dynamic].applyDynamic("inert")(stateValue.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[State[TC, TE, Any, Value[TC], TypegenDisabled]]
    inline def inert[TC, TE /* <: EventObject */](stateValue: StateValue, context: TC): State[TC, TE, Any, Value[TC], TypegenDisabled] = (^.asInstanceOf[js.Dynamic].applyDynamic("inert")(stateValue.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[State[TC, TE, Any, Value[TC], TypegenDisabled]]
  }
  
  inline def bindActionToState[TC, TE /* <: EventObject */](action: ActionObject[TC, TE, TE, BaseActionObject], state: State[TC, TE, Any, Any, Any]): ActionObject[TC, TE, TE, BaseActionObject] = (^.asInstanceOf[js.Dynamic].applyDynamic("bindActionToState")(action.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[ActionObject[TC, TE, TE, BaseActionObject]]
  
  inline def isState[TContext, TEvent /* <: EventObject */](state: Any): /* is xstate.xstate/lib/types.StateConfig<TContext, TEvent> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isState")(state.asInstanceOf[js.Any]).asInstanceOf[/* is xstate.xstate/lib/types.StateConfig<TContext, TEvent> */ Boolean]
  
  inline def isStateConfig[TContext, TEvent /* <: EventObject */](state: Any): /* is xstate.xstate/lib/types.StateConfig<TContext, TEvent> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isStateConfig")(state.asInstanceOf[js.Any]).asInstanceOf[/* is xstate.xstate/lib/types.StateConfig<TContext, TEvent> */ Boolean]
  
  inline def stateValuesEqual(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("stateValuesEqual")().asInstanceOf[Boolean]
  inline def stateValuesEqual(a: Unit, b: StateValue): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("stateValuesEqual")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def stateValuesEqual(a: StateValue): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("stateValuesEqual")(a.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def stateValuesEqual(a: StateValue, b: StateValue): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("stateValuesEqual")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
