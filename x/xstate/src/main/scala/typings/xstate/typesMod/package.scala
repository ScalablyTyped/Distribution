package typings.xstate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesMod {
  /* Rewritten from type alias, can be one of: 
    - typings.xstate.typesMod.ActionType
    - typings.xstate.typesMod.ActionObject[TContext, TEvent]
    - typings.xstate.typesMod.ActionFunction[TContext, TEvent]
    - typings.xstate.typesMod.AssignAction[typings.std.Required[TContext], TEvent]
    - typings.xstate.typesMod.SendAction[TContext, TEvent]
    - typings.xstate.typesMod.RaiseAction[typings.xstate.typesMod.AnyEventObject]
  */
  type Action[TContext, TEvent /* <: typings.xstate.typesMod.EventObject */] = (typings.xstate.typesMod._Action[TContext, TEvent]) | (typings.xstate.typesMod.AssignAction[typings.std.Required[TContext], TEvent]) | typings.xstate.typesMod.RaiseAction[typings.xstate.typesMod.AnyEventObject] | typings.xstate.typesMod.ActionType | (typings.xstate.typesMod.ActionFunction[TContext, TEvent])
  type ActionFunction[TContext, TEvent /* <: typings.xstate.typesMod.EventObject */] = js.Function3[
    /* context */ TContext, 
    /* event */ TEvent, 
    /* meta */ typings.xstate.typesMod.ActionMeta[TContext, TEvent], 
    js.Any | scala.Unit
  ]
  type ActionFunctionMap[TContext, TEvent /* <: typings.xstate.typesMod.EventObject */] = typings.std.Record[
    java.lang.String, 
    (typings.xstate.typesMod.ActionObject[TContext, TEvent]) | (typings.xstate.typesMod.ActionFunction[TContext, TEvent])
  ]
  type ActionType = java.lang.String
  type Actions[TContext, TEvent /* <: typings.xstate.typesMod.EventObject */] = typings.xstate.typesMod.SingleOrArray[typings.xstate.typesMod.Action[TContext, TEvent]]
  type Activity[TContext, TEvent /* <: typings.xstate.typesMod.EventObject */] = java.lang.String | (typings.xstate.typesMod.ActivityDefinition[TContext, TEvent])
  type ActivityConfig[TContext, TEvent /* <: typings.xstate.typesMod.EventObject */] = js.Function2[
    /* ctx */ TContext, 
    /* activity */ typings.xstate.typesMod.ActivityDefinition[TContext, TEvent], 
    typings.xstate.typesMod.DisposeActivityFunction | scala.Unit
  ]
  type ActivityMap = org.scalablytyped.runtime.StringDictionary[
    (typings.xstate.typesMod.ActivityDefinition[js.Any, js.Any]) | typings.xstate.xstateBooleans.`false`
  ]
  type AdjacencyMap = org.scalablytyped.runtime.StringDictionary[typings.std.Record[java.lang.String, typings.xstate.typesMod.TransitionMap]]
  type AnyStateNodeDefinition = typings.xstate.typesMod.StateNodeDefinition[js.Any, js.Any, js.Any]
  type Assigner[TContext, TEvent /* <: typings.xstate.typesMod.EventObject */] = js.Function3[
    /* context */ TContext, 
    /* event */ TEvent, 
    /* meta */ typings.xstate.typesMod.AssignMeta[TContext, TEvent], 
    typings.std.Partial[TContext]
  ]
  type Condition[TContext, TEvent /* <: typings.xstate.typesMod.EventObject */] = java.lang.String | (typings.xstate.typesMod.ConditionPredicate[TContext, TEvent]) | (typings.xstate.typesMod.Guard[TContext, TEvent])
  type ConditionPredicate[TContext, TEvent /* <: typings.xstate.typesMod.EventObject */] = js.Function3[
    /* context */ TContext, 
    /* event */ TEvent, 
    /* meta */ typings.xstate.typesMod.GuardMeta[TContext, TEvent], 
    scala.Boolean
  ]
  type ConditionalTransitionConfig[TContext, TEvent /* <: typings.xstate.typesMod.EventObject */] = js.Array[typings.xstate.typesMod.TransitionConfig[TContext, TEvent]]
  type DefaultContext = js.UndefOr[typings.std.Record[java.lang.String, js.Any]]
  type DefaultGuardType = typings.xstate.xstateStrings.xstateDotguard
  type DelayConfig[TContext, TEvent /* <: typings.xstate.typesMod.EventObject */] = scala.Double | (typings.xstate.typesMod.DelayExpr[TContext, TEvent])
  type DelayExpr[TContext, TEvent /* <: typings.xstate.typesMod.EventObject */] = typings.xstate.typesMod.ExprWithMeta[TContext, TEvent, scala.Double]
  type DelayFunctionMap[TContext, TEvent /* <: typings.xstate.typesMod.EventObject */] = typings.std.Record[java.lang.String, typings.xstate.typesMod.DelayConfig[TContext, TEvent]]
  type DelayedTransitions[TContext, TEvent /* <: typings.xstate.typesMod.EventObject */] = (typings.std.Record[
    java.lang.String | scala.Double, 
    java.lang.String | (typings.xstate.typesMod.SingleOrArray[typings.xstate.typesMod.TransitionConfig[TContext, TEvent]])
  ]) | (js.Array[
    (typings.xstate.typesMod.TransitionConfig[TContext, TEvent]) with (typings.xstate.AnonDelay[TContext, TEvent])
  ])
  type DisposeActivityFunction = js.Function0[scala.Unit]
  type DoneEvent = typings.xstate.typesMod.DoneEventObject with java.lang.String
  type Event[TEvent /* <: typings.xstate.typesMod.EventObject */] = (/* import warning: importer.ImportType#apply Failed type conversion: TEvent['type'] */ js.Any) | TEvent
  type EventData = (typings.std.Record[java.lang.String, _]) with js.Object
  type EventType = java.lang.String
  type Expr[TContext, TEvent /* <: typings.xstate.typesMod.EventObject */, T] = js.Function2[/* context */ TContext, /* event */ TEvent, T]
  type ExprWithMeta[TContext, TEvent /* <: typings.xstate.typesMod.EventObject */, T] = js.Function3[
    /* context */ TContext, 
    /* event */ TEvent, 
    /* meta */ typings.xstate.typesMod.SCXMLEventMeta[TEvent], 
    T
  ]
  type ExtractStateValue[TS /* <: typings.xstate.typesMod.StateSchema[_] */, TSS] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof TSS ]:? TSS[K] extends {  states  :any}? keyof TSS[K]['states'] : never | / * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias xstate.xstate/lib/types.ExtractStateValue<TSS[K], TSS[K]['states']> * / object}
    */ typings.xstate.xstateStrings.ExtractStateValue with TSS
  type Guard[TContext, TEvent /* <: typings.xstate.typesMod.EventObject */] = (typings.xstate.typesMod.GuardPredicate[TContext, TEvent]) | ((typings.std.Record[java.lang.String, _]) with typings.xstate.AnonTypeString)
  type InvokeCallback = js.Function2[
    /* callback */ typings.xstate.typesMod.Sender[js.Any], 
    /* onReceive */ typings.xstate.typesMod.Receiver[typings.xstate.typesMod.EventObject], 
    js.Any
  ]
  type InvokeConfig[TContext, TEvent /* <: typings.xstate.typesMod.EventObject */] = (typings.xstate.AnonAutoForwardData[TContext, TEvent]) | (typings.xstate.typesMod.StateMachine[js.Any, js.Any, js.Any, js.Any])
  type InvokeCreator[TContext, TEvent, TFinalContext] = js.Function2[
    /* context */ TContext, 
    /* event */ TEvent, 
    js.Thenable[TFinalContext] | (typings.xstate.typesMod.StateMachine[TFinalContext, js.Any, js.Any, js.Any]) | typings.xstate.typesMod.Subscribable[js.Any] | typings.xstate.typesMod.InvokeCallback
  ]
  type LogExpr[TContext, TEvent /* <: typings.xstate.typesMod.EventObject */] = typings.xstate.typesMod.ExprWithMeta[TContext, TEvent, js.Any]
  type Mapper[TContext, TEvent /* <: typings.xstate.typesMod.EventObject */] = js.Function2[/* context */ TContext, /* event */ TEvent, js.Any]
  type MetaObject = typings.std.Record[java.lang.String, js.Any]
  type PathMap[TContext, TEvent /* <: typings.xstate.typesMod.EventObject */] = org.scalablytyped.runtime.StringDictionary[typings.xstate.typesMod.PathItem[TContext, TEvent]]
  type PathsMap[TContext, TEvent /* <: typings.xstate.typesMod.EventObject */] = org.scalablytyped.runtime.StringDictionary[typings.xstate.typesMod.PathsItem[TContext, TEvent]]
  type PropertyAssigner[TContext, TEvent /* <: typings.xstate.typesMod.EventObject */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof TContext ]:? (context : TContext, event : TEvent, meta : xstate.xstate/lib/types.AssignMeta<TContext, TEvent>): TContext[K] | TContext[K]}
    */ typings.xstate.xstateStrings.PropertyAssigner with js.Any
  type PropertyMapper[TContext, TEvent /* <: typings.xstate.typesMod.EventObject */] = typings.std.Partial[
    org.scalablytyped.runtime.StringDictionary[(js.Function2[/* context */ TContext, /* event */ TEvent, js.Any]) | js.Any]
  ]
  type Receiver[TEvent /* <: typings.xstate.typesMod.EventObject */] = js.Function1[/* listener */ js.Function1[/* event */ TEvent, scala.Unit], scala.Unit]
  type SendExpr[TContext, TEvent /* <: typings.xstate.typesMod.EventObject */] = typings.xstate.typesMod.ExprWithMeta[TContext, TEvent, TEvent]
  type Sender[TEvent /* <: typings.xstate.typesMod.EventObject */] = js.Function1[/* event */ typings.xstate.typesMod.Event[TEvent], scala.Unit]
  type ServiceConfig[TContext] = java.lang.String | (typings.xstate.typesMod.StateMachine[js.Any, js.Any, js.Any, js.Any]) | (typings.xstate.typesMod.InvokeCreator[TContext, typings.xstate.typesMod.AnyEventObject, js.Any])
  type SingleOrArray[T] = js.Array[T] | T
  type Spawnable = (typings.xstate.typesMod.StateMachine[js.Any, js.Any, js.Any, js.Any]) | js.Promise[js.Any] | typings.xstate.typesMod.InvokeCallback | typings.xstate.typesMod.Subscribable[js.Any]
  type StandardMachineConfig[TContext, TStateSchema /* <: typings.xstate.typesMod.StateSchema[_] */, TEvent /* <: typings.xstate.typesMod.EventObject */] = typings.xstate.typesMod.StateNodeConfig[TContext, TStateSchema, TEvent]
  type StateFrom[TMachine /* <: typings.xstate.typesMod.StateMachine[_, _, _, _] */] = typings.std.ReturnType[
    /* import warning: importer.ImportType#apply Failed type conversion: TMachine['transition'] */ js.Any
  ]
  type StateKey = java.lang.String | (typings.xstate.stateMod.State[js.Any, typings.xstate.typesMod.EventObject, js.Any, js.Any])
  type StateNodesConfig[TContext, TStateSchema /* <: typings.xstate.typesMod.StateSchema[_] */, TEvent /* <: typings.xstate.typesMod.EventObject */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
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
  type StateTypes = typings.xstate.typesMod._StateTypes | java.lang.String
  type StateValue = java.lang.String | typings.xstate.typesMod.StateValueMap
  type StatesConfig[TContext, TStateSchema /* <: typings.xstate.typesMod.StateSchema[_] */, TEvent /* <: typings.xstate.typesMod.EventObject */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof TStateSchema['states'] ]: xstate.xstate/lib/types.StateNodeConfig<TContext, TStateSchema['states'][K], TEvent>}
    */ typings.xstate.xstateStrings.StatesConfig with TStateSchema
  type StatesDefinition[TContext, TStateSchema /* <: typings.xstate.typesMod.StateSchema[_] */, TEvent /* <: typings.xstate.typesMod.EventObject */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof TStateSchema['states'] ]: xstate.xstate/lib/types.StateNodeDefinition<TContext, TStateSchema['states'][K], TEvent>}
    */ typings.xstate.xstateStrings.StatesDefinition with TStateSchema
  type Transition[TContext, TEvent /* <: typings.xstate.typesMod.EventObject */] = java.lang.String | (typings.xstate.typesMod.TransitionConfig[TContext, TEvent]) | (typings.xstate.typesMod.ConditionalTransitionConfig[TContext, TEvent])
  type TransitionConfigTargetShortcut[TContext, TEvent /* <: typings.xstate.typesMod.EventObject */] = js.UndefOr[
    java.lang.String | (typings.xstate.stateNodeMod.StateNode[TContext, js.Any, TEvent, js.Any])
  ]
  type TransitionDefinitionMap[TContext, TEvent /* <: typings.xstate.typesMod.EventObject */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in TEvent['type'] | xstate.xstate/lib/types.ActionTypes.NullEvent | '*' ]: std.Array<xstate.xstate/lib/types.TransitionDefinition<TContext, K extends TEvent['type']? std.Extract<TEvent, {  type  :K}> : xstate.xstate/lib/types.EventObject>>}
    */ typings.xstate.xstateStrings.TransitionDefinitionMap with TEvent
  type TransitionTarget[TContext, TEvent /* <: typings.xstate.typesMod.EventObject */] = typings.xstate.typesMod.SingleOrArray[
    java.lang.String | (typings.xstate.stateNodeMod.StateNode[TContext, js.Any, TEvent, js.Any])
  ]
  type TransitionTargets[TContext] = js.Array[
    java.lang.String | (typings.xstate.stateNodeMod.StateNode[TContext, js.Any, typings.xstate.typesMod.EventObject, js.Any])
  ]
  type TransitionsConfig[TContext, TEvent /* <: typings.xstate.typesMod.EventObject */] = (typings.xstate.typesMod.TransitionsConfigMap[TContext, TEvent]) | (typings.xstate.typesMod.TransitionsConfigArray[TContext, TEvent])
  type TransitionsConfigArray[TContext, TEvent /* <: typings.xstate.typesMod.EventObject */] = js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ K in TEvent['type'] | xstate.xstate/lib/types.ActionTypes.NullEvent | '*' ]: xstate.xstate/lib/types.TransitionConfig<TContext, K extends TEvent['type']? std.Extract<TEvent, {  type  :K}> : xstate.xstate/lib/types.EventObject> & {  event  :K}}[TEvent['type'] | xstate.xstate/lib/types.ActionTypes.NullEvent | '*'] */ js.Any
  ]
  type TransitionsConfigMap[TContext, TEvent /* <: typings.xstate.typesMod.EventObject */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in TEvent['type'] | xstate.xstate/lib/types.ActionTypes.NullEvent | '*' ]:? xstate.xstate/lib/types.SingleOrArray<xstate.xstate/lib/types.TransitionConfigTargetShortcut<TContext, TEvent> | xstate.xstate/lib/types.TransitionConfig<TContext, K extends TEvent['type']? std.Extract<TEvent, {  type  :K}> : xstate.xstate/lib/types.EventObject> & {  event? :undefined}>}
    */ typings.xstate.xstateStrings.TransitionsConfigMap with TEvent
  type ValueAdjacencyMap[TContext, TEvent /* <: typings.xstate.typesMod.EventObject */] = org.scalablytyped.runtime.StringDictionary[
    typings.std.Record[java.lang.String, typings.xstate.stateMod.State[TContext, TEvent, js.Any, js.Any]]
  ]
}
