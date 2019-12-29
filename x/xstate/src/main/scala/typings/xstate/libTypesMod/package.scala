package typings.xstate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libTypesMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.std.Partial
  import typings.std.Record
  import typings.std.Required
  import typings.std.ReturnType
  import typings.xstate.Anon_AutoForwardData
  import typings.xstate.Anon_Delay
  import typings.xstate.Anon_TypeString
  import typings.xstate.libStateMod.State
  import typings.xstate.libStateNodeMod.StateNode
  import typings.xstate.xstateBooleans.`false`
  import typings.xstate.xstateStrings.xstateDotguard

  /* Rewritten from type alias, can be one of: 
    - typings.xstate.libTypesMod.ActionType
    - typings.xstate.libTypesMod.ActionObject[TContext, TEvent]
    - typings.xstate.libTypesMod.ActionFunction[TContext, TEvent]
    - typings.xstate.libTypesMod.AssignAction[typings.std.Required[TContext], TEvent]
    - typings.xstate.libTypesMod.SendAction[TContext, TEvent]
    - typings.xstate.libTypesMod.RaiseAction[TEvent]
  */
  type Action[TContext, TEvent /* <: EventObject */] = (_Action[TContext, TEvent]) | (AssignAction[Required[TContext], TEvent]) | ActionType | (ActionFunction[TContext, TEvent])
  type ActionFunction[TContext, TEvent /* <: EventObject */] = js.Function3[
    /* context */ TContext, 
    /* event */ TEvent, 
    /* meta */ ActionMeta[TContext, TEvent], 
    js.Any | Unit
  ]
  type ActionFunctionMap[TContext, TEvent /* <: EventObject */] = Record[String, (ActionObject[TContext, TEvent]) | (ActionFunction[TContext, TEvent])]
  type ActionType = String
  type Actions[TContext, TEvent /* <: EventObject */] = SingleOrArray[Action[TContext, TEvent]]
  type Activity[TContext, TEvent /* <: EventObject */] = String | (ActivityDefinition[TContext, TEvent])
  type ActivityConfig[TContext, TEvent /* <: EventObject */] = js.Function2[
    /* ctx */ TContext, 
    /* activity */ ActivityDefinition[TContext, TEvent], 
    DisposeActivityFunction | Unit
  ]
  type ActivityMap = StringDictionary[(ActivityDefinition[js.Any, js.Any]) | `false`]
  type AdjacencyMap = StringDictionary[Record[String, TransitionMap]]
  type AnyStateNodeDefinition = StateNodeDefinition[js.Any, js.Any, js.Any]
  type Assigner[TContext, TEvent /* <: EventObject */] = js.Function3[
    /* context */ TContext, 
    /* event */ TEvent, 
    /* meta */ AssignMeta[TContext, TEvent], 
    Partial[TContext]
  ]
  type Condition[TContext, TEvent /* <: EventObject */] = String | (ConditionPredicate[TContext, TEvent]) | (Guard[TContext, TEvent])
  type ConditionPredicate[TContext, TEvent /* <: EventObject */] = js.Function3[
    /* context */ TContext, 
    /* event */ TEvent, 
    /* meta */ GuardMeta[TContext, TEvent], 
    Boolean
  ]
  type ConditionalTransitionConfig[TContext, TEvent /* <: EventObject */] = js.Array[TransitionConfig[TContext, TEvent]]
  type DefaultContext = js.UndefOr[Record[String, js.Any]]
  type DefaultGuardType = xstateDotguard
  type DelayConfig[TContext, TEvent /* <: EventObject */] = Double | (DelayExpr[TContext, TEvent])
  type DelayExpr[TContext, TEvent /* <: EventObject */] = ExprWithMeta[TContext, TEvent, Double]
  type DelayFunctionMap[TContext, TEvent /* <: EventObject */] = Record[String, DelayConfig[TContext, TEvent]]
  type DelayedTransitions[TContext, TEvent /* <: EventObject */] = (Record[String | Double, String | (SingleOrArray[TransitionConfig[TContext, TEvent]])]) | (js.Array[(TransitionConfig[TContext, TEvent]) with (Anon_Delay[TContext, TEvent])])
  type DisposeActivityFunction = js.Function0[Unit]
  type DoneEvent = DoneEventObject with String
  type Event[TEvent /* <: EventObject */] = (/* import warning: importer.ImportType#apply Failed type conversion: TEvent['type'] */ js.Any) | TEvent
  type EventData = (Record[String, _]) with js.Object
  type EventType = String
  type Expr[TContext, TEvent /* <: EventObject */, T] = js.Function2[/* context */ TContext, /* event */ TEvent, T]
  type ExprWithMeta[TContext, TEvent /* <: EventObject */, T] = js.Function3[/* context */ TContext, /* event */ TEvent, /* meta */ SCXMLEventMeta[TEvent], T]
  type ExtractStateValue[TS /* <: StateSchema[_] */, TSS] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof TSS ]:? TSS[K] extends {  states  :any}? keyof TSS[K]['states'] : never | / * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias xstate.xstate/lib/types.ExtractStateValue<TSS[K], TSS[K]['states']> * / object}
    */ typings.xstate.xstateStrings.ExtractStateValue with TSS
  type Guard[TContext, TEvent /* <: EventObject */] = (GuardPredicate[TContext, TEvent]) | ((Record[String, _]) with Anon_TypeString)
  type InvokeCallback = js.Function2[/* sender */ Sender[js.Any], /* onEvent */ Receiver[EventObject], js.Any]
  type InvokeConfig[TContext, TEvent /* <: EventObject */] = (Anon_AutoForwardData[TContext, TEvent]) | (StateMachine[js.Any, js.Any, js.Any, Typestate[js.Any]])
  type InvokeCreator[TContext, TFinalContext] = js.Function2[
    /* context */ TContext, 
    /* event */ AnyEventObject, 
    js.Thenable[TFinalContext] | (StateMachine[TFinalContext, js.Any, js.Any, Typestate[TFinalContext]]) | Subscribable[js.Any] | InvokeCallback
  ]
  type LogExpr[TContext, TEvent /* <: EventObject */] = ExprWithMeta[TContext, TEvent, js.Any]
  type Mapper[TContext, TEvent /* <: EventObject */] = js.Function2[/* context */ TContext, /* event */ TEvent, js.Any]
  type MetaObject = Record[String, js.Any]
  type PathMap[TContext, TEvent /* <: EventObject */] = StringDictionary[PathItem[TContext, TEvent]]
  type PathsMap[TContext, TEvent /* <: EventObject */] = StringDictionary[PathsItem[TContext, TEvent]]
  type PropertyAssigner[TContext, TEvent /* <: EventObject */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof TContext ]:? (context : TContext, event : TEvent, meta : xstate.xstate/lib/types.AssignMeta<TContext, TEvent>): TContext[K] | TContext[K]}
    */ typings.xstate.xstateStrings.PropertyAssigner with js.Any
  type PropertyMapper[TContext, TEvent /* <: EventObject */] = Partial[
    StringDictionary[(js.Function2[/* context */ TContext, /* event */ TEvent, js.Any]) | js.Any]
  ]
  type Receiver[TEvent /* <: EventObject */] = js.Function1[/* listener */ js.Function1[/* event */ TEvent, Unit], Unit]
  type SendExpr[TContext, TEvent /* <: EventObject */] = ExprWithMeta[TContext, TEvent, TEvent]
  type Sender[TEvent /* <: EventObject */] = js.Function1[/* event */ Event[TEvent], Unit]
  type ServiceConfig[TContext] = String | (StateMachine[js.Any, js.Any, js.Any, Typestate[js.Any]]) | (InvokeCreator[TContext, js.Any])
  type SingleOrArray[T] = js.Array[T] | T
  type Spawnable = (StateMachine[js.Any, js.Any, js.Any, Typestate[js.Any]]) | js.Promise[js.Any] | InvokeCallback | Subscribable[js.Any]
  type StandardMachineConfig[TContext, TStateSchema /* <: StateSchema[_] */, TEvent /* <: EventObject */] = StateNodeConfig[TContext, TStateSchema, TEvent]
  type StateFrom[TMachine /* <: StateMachine[_, _, _, Typestate[_]] */] = ReturnType[
    /* import warning: importer.ImportType#apply Failed type conversion: TMachine['transition'] */ js.Any
  ]
  type StateKey = String | (State[js.Any, EventObject, js.Any, js.Any])
  type StateNodesConfig[TContext, TStateSchema /* <: StateSchema[_] */, TEvent /* <: EventObject */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof TStateSchema['states'] ]: xstate.xstate/lib/StateNode.StateNode<TContext, TStateSchema['states'][K], TEvent, any>}
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
  type StatesConfig[TContext, TStateSchema /* <: StateSchema[_] */, TEvent /* <: EventObject */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof TStateSchema['states'] ]: xstate.xstate/lib/types.StateNodeConfig<TContext, TStateSchema['states'][K], TEvent>}
    */ typings.xstate.xstateStrings.StatesConfig with TStateSchema
  type StatesDefinition[TContext, TStateSchema /* <: StateSchema[_] */, TEvent /* <: EventObject */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof TStateSchema['states'] ]: xstate.xstate/lib/types.StateNodeDefinition<TContext, TStateSchema['states'][K], TEvent>}
    */ typings.xstate.xstateStrings.StatesDefinition with TStateSchema
  type Transition[TContext, TEvent /* <: EventObject */] = String | (TransitionConfig[TContext, TEvent]) | (ConditionalTransitionConfig[TContext, TEvent])
  type TransitionConfigTargetShortcut[TContext, TEvent /* <: EventObject */] = js.UndefOr[String | (StateNode[TContext, js.Any, TEvent, js.Any])]
  type TransitionDefinitionMap[TContext, TEvent /* <: EventObject */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in TEvent['type'] | xstate.xstate/lib/types.ActionTypes.NullEvent | '*' ]: std.Array<xstate.xstate/lib/types.TransitionDefinition<TContext, K extends TEvent['type']? std.Extract<TEvent, {  type  :K}> : xstate.xstate/lib/types.EventObject>>}
    */ typings.xstate.xstateStrings.TransitionDefinitionMap with TEvent
  type TransitionTarget[TContext, TEvent /* <: EventObject */] = SingleOrArray[String | (StateNode[TContext, js.Any, TEvent, js.Any])]
  type TransitionTargets[TContext] = js.Array[String | (StateNode[TContext, js.Any, EventObject, js.Any])]
  type TransitionsConfig[TContext, TEvent /* <: EventObject */] = (TransitionsConfigMap[TContext, TEvent]) | (TransitionsConfigArray[TContext, TEvent])
  type TransitionsConfigArray[TContext, TEvent /* <: EventObject */] = js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ K in TEvent['type'] | xstate.xstate/lib/types.ActionTypes.NullEvent | '*' ]: xstate.xstate/lib/types.TransitionConfig<TContext, K extends TEvent['type']? std.Extract<TEvent, {  type  :K}> : xstate.xstate/lib/types.EventObject> & {  event  :K}}[TEvent['type'] | xstate.xstate/lib/types.ActionTypes.NullEvent | '*'] */ js.Any
  ]
  type TransitionsConfigMap[TContext, TEvent /* <: EventObject */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in TEvent['type'] | xstate.xstate/lib/types.ActionTypes.NullEvent | '*' ]:? xstate.xstate/lib/types.SingleOrArray<xstate.xstate/lib/types.TransitionConfigTargetShortcut<TContext, TEvent> | xstate.xstate/lib/types.TransitionConfig<TContext, K extends TEvent['type']? std.Extract<TEvent, {  type  :K}> : xstate.xstate/lib/types.EventObject> & {  event? :undefined}>}
    */ typings.xstate.xstateStrings.TransitionsConfigMap with TEvent
  type ValueAdjacencyMap[TContext, TEvent /* <: EventObject */] = StringDictionary[Record[String, State[TContext, TEvent, js.Any, js.Any]]]
}
