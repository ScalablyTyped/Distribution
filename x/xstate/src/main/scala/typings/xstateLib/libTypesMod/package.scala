package typings
package xstateLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libTypesMod {
  /* Rewritten from type alias, can be one of: 
    - ActionType
    - ActionObject[TContext, TEvent]
    - ActionFunction[TContext, TEvent]
  */
  type Action[TContext, TEvent /* <: EventObject */] = (_Action[TContext, TEvent]) | ActionType
  type ActionFunctionMap[TContext, TEvent /* <: EventObject */] = stdLib.Record[
    java.lang.String, 
    (ActionObject[TContext, TEvent]) | (ActionFunction[TContext, TEvent])
  ]
  type ActionType = java.lang.String
  type Activity[TContext, TEvent /* <: EventObject */] = java.lang.String | (ActivityDefinition[TContext, TEvent])
  type ActivityConfig[TContext, TEvent /* <: EventObject */] = js.Function2[
    /* ctx */ TContext, 
    /* activity */ ActivityDefinition[TContext, TEvent], 
    DisposeActivityFunction | scala.Unit
  ]
  type ActivityMap = org.scalablytyped.runtime.StringDictionary[(ActivityDefinition[js.Any, js.Any]) | xstateLib.xstateLibNumbers.`false`]
  type AdjacencyMap = org.scalablytyped.runtime.StringDictionary[stdLib.Record[java.lang.String, TransitionMap]]
  type AnyStateNodeDefinition = StateNodeDefinition[js.Any, js.Any, js.Any]
  type Assigner[TContext, TEvent /* <: EventObject */] = js.Function2[/* context */ TContext, /* event */ TEvent, stdLib.Partial[TContext]]
  type Condition[TContext, TEvent /* <: EventObject */] = java.lang.String | (ConditionPredicate[TContext, TEvent]) | (Guard[TContext, TEvent])
  type ConditionPredicate[TContext, TEvent /* <: EventObject */] = js.Function3[
    /* context */ TContext, 
    /* event */ TEvent, 
    /* meta */ GuardMeta[TContext, TEvent], 
    scala.Boolean
  ]
  type ConditionalTransitionConfig[TContext, TEvent /* <: EventObject */] = js.Array[TransitionConfig[TContext, TEvent]]
  type DefaultContext = js.UndefOr[stdLib.Record[java.lang.String, js.Any]]
  type DelayConfig[TContext, TEvent /* <: EventObject */] = scala.Double | (Expr[TContext, OmniEventObject[TEvent], scala.Double])
  type DelayedTransitions[TContext, TEvent /* <: EventObject */] = (stdLib.Record[
    java.lang.String | scala.Double, 
    java.lang.String | (SingleOrArray[TransitionConfig[TContext, TEvent]])
  ]) | (js.Array[
    (TransitionConfig[TContext, TEvent]) with (xstateLib.Anon_Delay[TContext, TEvent])
  ])
  type DisposeActivityFunction = js.Function0[scala.Unit]
  type DoneEvent = DoneEventObject with java.lang.String
  type Event[TEvent /* <: EventObject */] = (/* import warning: ImportType.apply Failed type conversion: TEvent['type'] */ js.Any) | TEvent
  type EventType = java.lang.String
  type Expr[TContext, TEvent /* <: EventObject */, T] = js.Function2[/* context */ TContext, /* event */ TEvent, T]
  type Guard[TContext, TEvent /* <: EventObject */] = (GuardPredicate[TContext, TEvent]) | ((stdLib.Record[java.lang.String, _]) with xstateLib.Anon_TypeString)
  type InvokeCallback = js.Function2[/* sender */ Sender[js.Any], /* onEvent */ Receiver[EventObject], js.Any]
  type InvokeConfig[TContext, TEvent /* <: EventObject */] = (xstateLib.Anon_Data[TContext, TEvent]) | (StateMachine[js.Any, js.Any, js.Any])
  type InvokeCreator[TFinalContext, TContext] = js.Function2[
    /* context */ TContext, 
    /* event */ EventObject, 
    js.Thenable[TFinalContext] | (StateMachine[TFinalContext, js.Any, js.Any]) | InvokeCallback
  ]
  type InvokesConfig[TContext, TEvent /* <: EventObject */] = SingleOrArray[InvokeConfig[TContext, TEvent]]
  type Mapper[TContext, TEvent /* <: EventObject */] = js.Function2[/* context */ TContext, /* event */ TEvent, js.Any]
  type MetaObject = stdLib.Record[java.lang.String, js.Any]
  type OmniEvent[TEvent /* <: EventObject */] = (/* import warning: ImportType.apply Failed type conversion: TEvent['type'] */ js.Any) | js.UndefOr[ActionTypes] | OmniEventObject[TEvent]
  type OmniEventObject[TEvent /* <: EventObject */] = TEvent | BuiltInEvent[TEvent]
  type PathMap[TContext, TEvent /* <: EventObject */] = org.scalablytyped.runtime.StringDictionary[js.Array[Segment[TContext, TEvent]]]
  type PathsMap[TContext, TEvent /* <: EventObject */] = org.scalablytyped.runtime.StringDictionary[PathsItem[TContext, TEvent]]
  type PropertyAssigner[TContext, TEvent /* <: EventObject */] = stdLib.Partial[
    /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof TContext ]: (context : TContext, event : TEvent): TContext[K] | TContext[K]}
    */ xstateLib.xstateLibStrings.PropertyAssigner with js.Any
  ]
  type PropertyMapper[TContext, TEvent /* <: EventObject */] = stdLib.Partial[
    org.scalablytyped.runtime.StringDictionary[(js.Function2[/* context */ TContext, /* event */ TEvent, js.Any]) | js.Any]
  ]
  type Receiver[TEvent /* <: EventObject */] = js.Function1[/* listener */ js.Function1[/* event */ TEvent, scala.Unit], scala.Unit]
  type SendExpr[TContext, TEvent /* <: EventObject */] = js.Function2[/* context */ TContext, /* event */ TEvent, OmniEvent[TEvent]]
  type Sender[TEvent /* <: EventObject */] = js.Function1[/* event */ Event[TEvent], scala.Unit]
  type ServiceConfig[TContext] = java.lang.String | (StateMachine[js.Any, js.Any, js.Any]) | (InvokeCreator[js.Any, TContext])
  type SingleOrArray[T] = js.Array[T] | T
  type StandardMachineConfig[TContext, TStateSchema /* <: StateSchema */, TEvent /* <: EventObject */] = CompoundStateNodeConfig[TContext, TStateSchema, TEvent]
  type StateKey = java.lang.String | (xstateLib.libStateMod.State[js.Any, EventObject])
  type StateNodesConfig[TContext, TStateSchema /* <: StateSchema */, TEvent /* <: EventObject */] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof TStateSchema['states'] ]: xstate.xstate/lib/StateNode.StateNode<TContext, TStateSchema['states'][K], TEvent>}
    */ xstateLib.xstateLibStrings.StateNodesConfig with TStateSchema
  /* Rewritten from type alias, can be one of: 
    - xstateLib.xstateLibStrings.atomic
    - xstateLib.xstateLibStrings.compound
    - xstateLib.xstateLibStrings.parallel
    - xstateLib.xstateLibStrings.`final`
    - xstateLib.xstateLibStrings.history
    - java.lang.String
  */
  type StateTypes = _StateTypes | java.lang.String
  type StateValue = java.lang.String | StateValueMap
  type StatesConfig[TContext, TStateSchema /* <: StateSchema */, TEvent /* <: EventObject */] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof TStateSchema['states'] ]: xstate.xstate/lib/types.StateNodeConfig<TContext, TStateSchema['states'][K], TEvent>}
    */ xstateLib.xstateLibStrings.StatesConfig with TStateSchema
  type StatesDefinition[TContext, TStateSchema /* <: StateSchema */, TEvent /* <: EventObject */] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof TStateSchema['states'] ]: xstate.xstate/lib/types.StateNodeDefinition<TContext, TStateSchema['states'][K], TEvent>}
    */ xstateLib.xstateLibStrings.StatesDefinition with TStateSchema
  type Transition[TContext, TEvent /* <: EventObject */] = java.lang.String | (TransitionConfig[TContext, TEvent]) | (ConditionalTransitionConfig[TContext, TEvent])
  type TransitionsConfig[TContext, TEvent /* <: EventObject */] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in TEvent['type'] | xstate.xstate/lib/types.ActionTypes | undefined ]:? string | number | xstate.xstate/lib/StateNode.StateNode<TContext, any, xstate.xstate/lib/types.OmniEventObject<xstate.xstate/lib/types.EventObject>> | xstate.xstate/lib/types.SingleOrArray<xstate.xstate/lib/types.TransitionConfig<TContext, std.Extract<TEvent, {  type  :K}>>>}
    */ xstateLib.xstateLibStrings.TransitionsConfig with js.Any
  type TransitionsDefinition[TContext, TEvent /* <: EventObject */] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in TEvent['type'] ]: std.Array<xstate.xstate/lib/types.TransitionDefinition<TContext, std.Extract<TEvent, {  type  :K}>>>}
    */ xstateLib.xstateLibStrings.TransitionsDefinition with js.Any
  type Updater[TContext, TEvent /* <: EventObject */, TAssignAction /* <: AnyAssignAction[TContext, TEvent] */] = js.Function3[
    /* context */ TContext, 
    /* event */ OmniEventObject[TEvent], 
    /* assignActions */ js.Array[TAssignAction], 
    TContext
  ]
  type ValueAdjacencyMap[TContext, TEvent /* <: EventObject */] = org.scalablytyped.runtime.StringDictionary[stdLib.Record[java.lang.String, xstateLib.libStateMod.State[TContext, TEvent]]]
}
