package typings.xstate

import org.scalablytyped.runtime.StringDictionary
import typings.std.Partial
import typings.std.Record
import typings.xstate.Anon_AutoForwardData
import typings.xstate.Anon_Delay
import typings.xstate.Anon_TypeString
import typings.xstate.esStateMod.State
import typings.xstate.esStateNodeMod.StateNode
import typings.xstate.xstateNumbers.`false`
import typings.xstate.xstateStrings.xstateDOTguard
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object esTypesMod {
  type Action[TContext, TEvent /* <: EventObject */] = ActionType | (ActionObject[TContext, TEvent]) | (ActionFunction[TContext, TEvent])
  type ActionFunction[TContext, TEvent /* <: EventObject */] = js.Function3[
    /* context */ TContext, 
    /* event */ TEvent, 
    /* meta */ ActionMeta[TContext, TEvent], 
    js.Any | Unit
  ]
  type ActionFunctionMap[TContext, TEvent /* <: EventObject */] = Record[String, (ActionObject[TContext, TEvent]) | (ActionFunction[TContext, TEvent])]
  type ActionType = String
  type Activity[TContext, TEvent /* <: EventObject */] = String | (ActivityDefinition[TContext, TEvent])
  type ActivityConfig[TContext, TEvent /* <: EventObject */] = js.Function2[
    /* ctx */ TContext, 
    /* activity */ ActivityDefinition[TContext, TEvent], 
    DisposeActivityFunction | Unit
  ]
  type ActivityMap = StringDictionary[(ActivityDefinition[js.Any, js.Any]) | `false`]
  type AdjacencyMap = StringDictionary[Record[String, TransitionMap]]
  type AnyStateNodeDefinition = StateNodeDefinition[js.Any, js.Any, js.Any]
  type Assigner[TContext, TEvent /* <: EventObject */] = js.Function2[/* context */ TContext, /* event */ TEvent, Partial[TContext]]
  type Condition[TContext, TEvent /* <: EventObject */] = String | (ConditionPredicate[TContext, TEvent]) | (Guard[TContext, TEvent])
  type ConditionPredicate[TContext, TEvent /* <: EventObject */] = js.Function3[
    /* context */ TContext, 
    /* event */ TEvent, 
    /* meta */ GuardMeta[TContext, TEvent], 
    Boolean
  ]
  type ConditionalTransitionConfig[TContext, TEvent /* <: EventObject */] = js.Array[TransitionConfig[TContext, TEvent]]
  type DefaultContext = js.UndefOr[Record[String, js.Any]]
  type DefaultGuardType = xstateDOTguard
  type DelayConfig[TContext, TEvent /* <: EventObject */] = Double | (Expr[TContext, OmniEventObject[TEvent], Double])
  type DelayedTransitions[TContext, TEvent /* <: EventObject */] = (Record[String | Double, String | (SingleOrArray[TransitionConfig[TContext, TEvent]])]) | (js.Array[(TransitionConfig[TContext, TEvent]) with (Anon_Delay[TContext, TEvent])])
  type DisposeActivityFunction = js.Function0[Unit]
  type DoneEvent = DoneEventObject with String
  type Event[TEvent /* <: EventObject */] = (/* import warning: ImportType.apply Failed type conversion: TEvent['type'] */ js.Any) | TEvent
  type EventType = String
  type Expr[TContext, TEvent /* <: EventObject */, T] = js.Function2[/* context */ TContext, /* event */ TEvent, T]
  type Guard[TContext, TEvent /* <: EventObject */] = (GuardPredicate[TContext, TEvent]) | ((Record[String, _]) with Anon_TypeString)
  type InvokeCallback = js.Function2[/* sender */ Sender[js.Any], /* onEvent */ Receiver[EventObject], js.Any]
  type InvokeConfig[TContext, TEvent /* <: EventObject */] = (Anon_AutoForwardData[TContext, TEvent]) | (StateMachine[js.Any, js.Any, js.Any])
  type InvokeCreator[TContext, TFinalContext] = js.Function2[
    /* context */ TContext, 
    /* event */ EventObject, 
    js.Thenable[TFinalContext] | (StateMachine[TFinalContext, js.Any, js.Any]) | Subscribable[js.Any] | InvokeCallback
  ]
  type InvokesConfig[TContext, TEvent /* <: EventObject */] = SingleOrArray[InvokeConfig[TContext, TEvent]]
  type Mapper[TContext, TEvent /* <: EventObject */] = js.Function2[/* context */ TContext, /* event */ TEvent, js.Any]
  type MetaObject = Record[String, js.Any]
  type OmniEvent[TEvent /* <: EventObject */] = (/* import warning: ImportType.apply Failed type conversion: TEvent['type'] */ js.Any) | OmniEventObject[TEvent]
  type OmniEventObject[TEvent /* <: EventObject */] = TEvent | BuiltInEvent[TEvent]
  type PathMap[TContext, TEvent /* <: EventObject */] = StringDictionary[PathItem[TContext, TEvent]]
  type PathsMap[TContext, TEvent /* <: EventObject */] = StringDictionary[PathsItem[TContext, TEvent]]
  type PropertyAssigner[TContext, TEvent /* <: EventObject */] = Partial[
    /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof TContext ]: (context : TContext, event : TEvent): TContext[K] | TContext[K]}
    */ typings.xstate.xstateStrings.PropertyAssigner with js.Any
  ]
  type PropertyMapper[TContext, TEvent /* <: EventObject */] = Partial[
    StringDictionary[(js.Function2[/* context */ TContext, /* event */ TEvent, js.Any]) | js.Any]
  ]
  type Receiver[TEvent /* <: EventObject */] = js.Function1[/* listener */ js.Function1[/* event */ TEvent, Unit], Unit]
  type SendExpr[TContext, TEvent /* <: EventObject */] = js.Function2[/* context */ TContext, /* event */ TEvent, OmniEvent[TEvent]]
  type Sender[TEvent /* <: EventObject */] = js.Function1[/* event */ Event[TEvent], Unit]
  type ServiceConfig[TContext] = String | (StateMachine[js.Any, js.Any, js.Any]) | (InvokeCreator[TContext, js.Any])
  type SingleOrArray[T] = js.Array[T] | T
  type StandardMachineConfig[TContext, TStateSchema /* <: StateSchema */, TEvent /* <: EventObject */] = CompoundStateNodeConfig[TContext, TStateSchema, TEvent]
  type StateKey = String | (State[js.Any, EventObject])
  type StateNodesConfig[TContext, TStateSchema /* <: StateSchema */, TEvent /* <: EventObject */] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof TStateSchema['states'] ]: xstate.xstate/es/StateNode.StateNode<TContext, TStateSchema['states'][K], TEvent>}
    */ typings.xstate.xstateStrings.StateNodesConfig with TStateSchema
  /* Rewritten from type alias, can be one of: 
    - typings.xstate.xstateStrings.atomic
    - typings.xstate.xstateStrings.compound
    - typings.xstate.xstateStrings.parallel
    - typings.xstate.xstateStrings.`final`
    - typings.xstate.xstateStrings.history
    - java.lang.String
  */
  type StateTypes = _StateTypes | String
  type StateValue = String | StateValueMap
  type StatesConfig[TContext, TStateSchema /* <: StateSchema */, TEvent /* <: EventObject */] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof TStateSchema['states'] ]: xstate.xstate/es/types.StateNodeConfig<TContext, TStateSchema['states'][K], TEvent>}
    */ typings.xstate.xstateStrings.StatesConfig with TStateSchema
  type StatesDefinition[TContext, TStateSchema /* <: StateSchema */, TEvent /* <: EventObject */] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof TStateSchema['states'] ]: xstate.xstate/es/types.StateNodeDefinition<TContext, TStateSchema['states'][K], TEvent>}
    */ typings.xstate.xstateStrings.StatesDefinition with TStateSchema
  type Transition[TContext, TEvent /* <: EventObject */] = String | (TransitionConfig[TContext, TEvent]) | (ConditionalTransitionConfig[TContext, TEvent])
  type TransitionTarget[TContext] = SingleOrArray[String | (StateNode[TContext, js.Any, OmniEventObject[EventObject]])]
  type TransitionTargets[TContext] = js.Array[String | (StateNode[TContext, js.Any, OmniEventObject[EventObject]])]
  type TransitionsConfig[TContext, TEvent /* <: EventObject */] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in TEvent['type'] | xstate.xstate/es/types.BuiltInEvent<TEvent>['type'] ]:? string | number | xstate.xstate/es/StateNode.StateNode<TContext, any, TEvent> | xstate.xstate/es/types.SingleOrArray<xstate.xstate/es/types.TransitionConfig<TContext, TEvent extends {  type  :K}? TEvent : xstate.xstate/es/types.EventObject>>}
    */ typings.xstate.xstateStrings.TransitionsConfig with js.Any
  type TransitionsDefinition[TContext, TEvent /* <: EventObject */] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in TEvent['type'] ]: std.Array<xstate.xstate/es/types.TransitionDefinition<TContext, std.Extract<TEvent, {  type  :K}>>>}
    */ typings.xstate.xstateStrings.TransitionsDefinition with js.Any
  type Updater[TContext, TEvent /* <: EventObject */, TAssignAction /* <: AnyAssignAction[TContext, TEvent] */] = js.Function3[
    /* context */ TContext, 
    /* event */ OmniEventObject[TEvent], 
    /* assignActions */ js.Array[TAssignAction], 
    TContext
  ]
  type ValueAdjacencyMap[TContext, TEvent /* <: EventObject */] = StringDictionary[Record[String, State[TContext, TEvent]]]
}
