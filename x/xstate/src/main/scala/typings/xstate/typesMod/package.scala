package typings.xstate.typesMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.std.Omit
import typings.std.Partial
import typings.std.Record
import typings.std.ReturnType
import typings.xstate.anon.Activities
import typings.xstate.anon.Context
import typings.xstate.anon.DataAny
import typings.xstate.anon.Delays
import typings.xstate.anon.Guards
import typings.xstate.anon.Services
import typings.xstate.anon.TypeString
import typings.xstate.anon.`3`
import typings.xstate.anon.`4`
import typings.xstate.anon.`5`
import typings.xstate.anon.`6`
import typings.xstate.interpreterMod.Interpreter
import typings.xstate.stateMod.State
import typings.xstate.stateNodeMod.StateNode
import typings.xstate.typegenTypesMod.MarkAllImplementationsAsProvided
import typings.xstate.typegenTypesMod.ResolveTypegenMeta
import typings.xstate.typegenTypesMod.TypegenConstraint
import typings.xstate.typegenTypesMod.TypegenDisabled
import typings.xstate.xstateBooleans.`false`
import typings.xstate.xstateStrings.`type`
import typings.xstate.xstateStrings.actions
import typings.xstate.xstateStrings.delays
import typings.xstate.xstateStrings.guards
import typings.xstate.xstateStrings.missingImplementations
import typings.xstate.xstateStrings.resolved
import typings.xstate.xstateStrings.services
import typings.xstate.xstateStrings.xstateDotguard
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type Action[TContext, TEvent /* <: EventObject */] = ActionType | (ActionObject[TContext, TEvent]) | (ActionFunction[TContext, TEvent, BaseActionObject])

type ActionFunction[TContext, TEvent /* <: EventObject */, TAction /* <: BaseActionObject */] = js.Function3[
/* context */ TContext, 
/* event */ TEvent, 
/* meta */ ActionMeta[TContext, TEvent, TAction], 
Unit]

type ActionFunctionMap[TContext, TEvent /* <: EventObject */, TAction /* <: BaseActionObject */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ K in TAction['type'] ]:? xstate.xstate/lib/types.ActionObject<TContext, TEvent> | xstate.xstate/lib/types.ActionFunction<TContext, TEvent, TAction extends {  type :K}? TAction : never>}
  */ typings.xstate.xstateStrings.ActionFunctionMap & TopLevel[Any]

type ActionType = String

type Actions[TContext, TEvent /* <: EventObject */] = SingleOrArray[Action[TContext, TEvent]]

type Activity[TContext, TEvent /* <: EventObject */] = String | (ActivityDefinition[TContext, TEvent])

type ActivityConfig[TContext, TEvent /* <: EventObject */] = js.Function2[
/* ctx */ TContext, 
/* activity */ ActivityDefinition[TContext, TEvent], 
DisposeActivityFunction | Unit]

type ActivityMap = StringDictionary[(ActivityDefinition[Any, Any]) | `false`]

type ActorRefFrom[T] = (ActorRef[Any | scala.Nothing, Any]) | (ActorRefWithDeprecatedState[Any, Any, Any, MarkAllImplementationsAsProvided[Any]])

type AdjacencyMap = StringDictionary[Record[String, TransitionMap]]

type AnyActorRef = ActorRef[Any, Any]

type AnyInterpreter = Interpreter[Any, Any, Any, Any, Any]

type AnyState = State[Any, Any, Any, Any, Any]

type AnyStateConfig = StateConfig[Any, AnyEventObject]

type AnyStateMachine = StateMachine[Any, Any, Any, Any, Any, Any, Any]

type AnyStateNodeDefinition = StateNodeDefinition[Any, Any, Any]

type Assigner[TContext, TEvent /* <: EventObject */] = js.Function3[
/* context */ TContext, 
/* event */ TEvent, 
/* meta */ AssignMeta[TContext, TEvent], 
Partial[TContext]]

/* Rewritten from type alias, can be one of: 
  - / * import warning: importer.ImportType#apply Failed type conversion: xstate.xstate/lib/types.SimpleActionsOf<TAction>['type'] * / js.Any
  - TAction
  - typings.xstate.typesMod.RaiseAction[scala.Any]
  - typings.xstate.typesMod.SendAction[TContext, TEvent, scala.Any]
  - typings.xstate.typesMod.AssignAction[TContext, TEvent]
  - typings.xstate.typesMod.LogAction[TContext, TEvent]
  - typings.xstate.typesMod.CancelAction
  - typings.xstate.typesMod.StopAction[TContext, TEvent]
  - typings.xstate.typesMod.ChooseAction[TContext, TEvent]
  - typings.xstate.typesMod.ActionFunction[TContext, TEvent, typings.xstate.typesMod.BaseActionObject]
*/
type BaseAction[TContext, TEvent /* <: EventObject */, TAction /* <: BaseActionObject */] = (_BaseAction[TContext, TEvent, TAction]) | RaiseAction[Any] | (SendAction[TContext, TEvent, Any]) | (ActionFunction[TContext, TEvent, BaseActionObject]) | (/* import warning: importer.ImportType#apply Failed type conversion: xstate.xstate/lib/types.SimpleActionsOf<TAction>['type'] */ js.Any) | TAction

type BaseActions[TContext, TEvent /* <: EventObject */, TAction /* <: BaseActionObject */] = SingleOrArray[BaseAction[TContext, TEvent, TAction]]

type Cast[A, B] = B | A

type Compute[A /* <: Any */] = typings.xstate.xstateStrings.Compute & TopLevel[A] & Any

type Condition[TContext, TEvent /* <: EventObject */] = String | (ConditionPredicate[TContext, TEvent]) | (Guard[TContext, TEvent])

type ConditionPredicate[TContext, TEvent /* <: EventObject */] = js.Function3[
/* context */ TContext, 
/* event */ TEvent, 
/* meta */ GuardMeta[TContext, TEvent], 
Boolean]

type ConditionalTransitionConfig[TContext, TEvent /* <: EventObject */] = js.Array[TransitionConfig[TContext, TEvent]]

type ContextFrom[T] = Any

type DefaultContext = js.UndefOr[Record[String, Any]]

type DefaultGuardType = xstateDotguard

type DelayConfig[TContext, TEvent /* <: EventObject */] = Double | (DelayExpr[TContext, TEvent])

type DelayExpr[TContext, TEvent /* <: EventObject */] = ExprWithMeta[TContext, TEvent, Double]

type DelayFunctionMap[TContext, TEvent /* <: EventObject */] = Record[String, DelayConfig[TContext, TEvent]]

type DelayedTransitions[TContext, TEvent /* <: EventObject */] = (Record[String | Double, String | (SingleOrArray[TransitionConfig[TContext, TEvent]])]) | (js.Array[
(TransitionConfig[TContext, TEvent]) & (typings.xstate.anon.Delay[TContext, TEvent])])

type DisposeActivityFunction = js.Function0[Unit]

type EmittedFrom[T] = Any | (/* import warning: importer.ImportType#apply Failed type conversion: any['initialState'] */ js.Any)

type Event[TEvent /* <: EventObject */] = (/* import warning: importer.ImportType#apply Failed type conversion: TEvent['type'] */ js.Any) | TEvent

type EventData = (Record[String, Any]) & `6`

type EventFrom[T, K /* <: Prop[TEvent, `type`] */, TEvent /* <: EventObject */] = (ExtractEvent[TEvent, K]) | TEvent

type EventType = String

type ExcludeType[A] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ K in std.Exclude<keyof A, 'type'> ]: A[K]}
  */ typings.xstate.xstateStrings.ExcludeType & TopLevel[A]

type Expr[TContext, TEvent /* <: EventObject */, T] = js.Function2[/* context */ TContext, /* event */ TEvent, T]

type ExprWithMeta[TContext, TEvent /* <: EventObject */, T] = js.Function3[/* context */ TContext, /* event */ TEvent, /* meta */ SCXMLEventMeta[TEvent], T]

type ExtractEvent[TEvent /* <: EventObject */, TEventType /* <: /* import warning: importer.ImportType#apply Failed type conversion: TEvent['type'] */ js.Any */] = TEvent

type ExtractExtraParameters[A, T] = ExcludeType[A]

type ExtractWithSimpleSupport[T /* <: TypeString */] = T

type GenerateActionsConfigPart[TContext, TResolvedTypesMeta, TRequireMissingImplementations, TMissingImplementations] = (MaybeMakeMissingImplementationsRequired[actions, Prop[TMissingImplementations, actions], TRequireMissingImplementations]) & (`5`[TContext, TResolvedTypesMeta])

type GenerateDelaysConfigPart[TContext, TResolvedTypesMeta, TRequireMissingImplementations, TMissingImplementations] = (MaybeMakeMissingImplementationsRequired[delays, Prop[TMissingImplementations, delays], TRequireMissingImplementations]) & (Delays[TContext, TResolvedTypesMeta])

type GenerateGuardsConfigPart[TContext, TResolvedTypesMeta, TRequireMissingImplementations, TMissingImplementations] = (MaybeMakeMissingImplementationsRequired[guards, Prop[TMissingImplementations, guards], TRequireMissingImplementations]) & (Guards[TContext, TResolvedTypesMeta])

type GenerateServicesConfigPart[TContext, TResolvedTypesMeta, TRequireMissingImplementations, TMissingImplementations] = (MaybeMakeMissingImplementationsRequired[services, Prop[TMissingImplementations, services], TRequireMissingImplementations]) & (Services[TContext, TResolvedTypesMeta])

type Guard[TContext, TEvent /* <: EventObject */] = (GuardPredicate[TContext, TEvent]) | ((Record[String, Any]) & TypeString)

type IndexByType[T /* <: TypeString */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ K in T['type'] ]: T extends any? K extends T['type']? T : never : never}
  */ typings.xstate.xstateStrings.IndexByType & TopLevel[T]

type InternalMachineOptions[TContext, TEvent /* <: EventObject */, TResolvedTypesMeta, TRequireMissingImplementations /* <: Boolean */, TMissingImplementations] = (GenerateActionsConfigPart[TContext, TResolvedTypesMeta, TRequireMissingImplementations, TMissingImplementations]) & (GenerateDelaysConfigPart[TContext, TResolvedTypesMeta, TRequireMissingImplementations, TMissingImplementations]) & (GenerateGuardsConfigPart[TContext, TResolvedTypesMeta, TRequireMissingImplementations, TMissingImplementations]) & (GenerateServicesConfigPart[TContext, TResolvedTypesMeta, TRequireMissingImplementations, TMissingImplementations]) & (Activities[TContext, TEvent])

type InterpreterFrom[T /* <: AnyStateMachine | (js.Function1[/* repeated */ Any, AnyStateMachine]) */] = Interpreter[Any, Any, Any, Any, MarkAllImplementationsAsProvided[Any]]

type InvokeCallback[TEvent /* <: EventObject */, TSentEvent /* <: EventObject */] = js.Function2[
/* callback */ Sender[TSentEvent], 
/* onReceive */ Receiver[TEvent], 
js.Function0[Unit] | js.Promise[Any] | Unit]

type InvokeCreator[TContext, TSourceEvent /* <: EventObject */, TFinalContext, TInputEvent /* <: EventObject */, // keeping a slot for it here, but it's actually not used right now to ensure that the communication contract between actors is satisfied
TOutputEvent /* <: EventObject */] = js.Function3[
/* context */ TContext, 
/* event */ TSourceEvent, 
/* meta */ InvokeMeta, 
js.Thenable[TFinalContext] | (StateMachine[TFinalContext, Any, Any, Any, Any, Any, Any]) | Subscribable[EventObject] | (InvokeCallback[TInputEvent, TOutputEvent]) | (Behavior[Any, Any])]

type IsAny[T] = Equals[T, Any]

type LogExpr[TContext, TEvent /* <: EventObject */] = ExprWithMeta[TContext, TEvent, Any]

type LowInfer[T] = T & js.Object

type MachineOptions[TContext, TEvent /* <: EventObject */, TAction /* <: BaseActionObject */, TServiceMap /* <: ServiceMap */, TTypesMeta /* <: TypegenConstraint */] = InternalMachineOptions[
TContext, 
TEvent, 
ResolveTypegenMeta[TTypesMeta, TEvent, TAction, TServiceMap], 
`false`, 
Prop[
  Prop[ResolveTypegenMeta[TTypesMeta, TEvent, TAction, TServiceMap], resolved], 
  missingImplementations
]]

type MachineOptionsActions[TContext, TResolvedTypesMeta, TEventsCausingActions, TIndexedEvents, TIndexedActions] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ K in keyof TEventsCausingActions ]:? xstate.xstate/lib/types.ActionObject<TContext, xstate.xstate/lib/types.Cast<xstate.xstate/lib/types.Prop<TIndexedEvents, TEventsCausingActions[K]>, xstate.xstate/lib/types.EventObject>> | xstate.xstate/lib/types.ActionFunction<TContext, xstate.xstate/lib/types.Cast<xstate.xstate/lib/types.Prop<TIndexedEvents, TEventsCausingActions[K]>, xstate.xstate/lib/types.EventObject>, xstate.xstate/lib/types.Cast<xstate.xstate/lib/types.Prop<TIndexedActions, K>, xstate.xstate/lib/types.BaseActionObject>>}
  */ typings.xstate.xstateStrings.MachineOptionsActions & TopLevel[Any]

type MachineOptionsDelays[TContext, TResolvedTypesMeta, TEventsCausingDelays, TIndexedEvents] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ K in keyof TEventsCausingDelays ]:? xstate.xstate/lib/types.DelayConfig<TContext, xstate.xstate/lib/types.Cast<xstate.xstate/lib/types.Prop<TIndexedEvents, TEventsCausingDelays[K]>, xstate.xstate/lib/types.EventObject>>}
  */ typings.xstate.xstateStrings.MachineOptionsDelays & TopLevel[TEventsCausingDelays]

type MachineOptionsFrom[T /* <: AnyStateMachine | (js.Function1[/* repeated */ Any, AnyStateMachine]) */, TRequireMissingImplementations /* <: Boolean */] = InternalMachineOptions[
Any, 
Any, 
Any, 
TRequireMissingImplementations, 
Prop[Prop[Any, resolved], missingImplementations]]

type MachineOptionsGuards[TContext, TResolvedTypesMeta, TEventsCausingGuards, TIndexedEvents] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ K in keyof TEventsCausingGuards ]:? xstate.xstate/lib/types.ConditionPredicate<TContext, xstate.xstate/lib/types.Cast<xstate.xstate/lib/types.Prop<TIndexedEvents, TEventsCausingGuards[K]>, xstate.xstate/lib/types.EventObject>>}
  */ typings.xstate.xstateStrings.MachineOptionsGuards & TopLevel[TEventsCausingGuards]

type MachineOptionsServices[TContext, TResolvedTypesMeta, TEventsCausingServices, TIndexedEvents, TInvokeSrcNameMap] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ K in keyof TEventsCausingServices ]:? xstate.xstate/lib/types.AnyStateMachine | xstate.xstate/lib/types.InvokeCreator<TContext, xstate.xstate/lib/types.Cast<xstate.xstate/lib/types.Prop<TIndexedEvents, TEventsCausingServices[K]>, xstate.xstate/lib/types.EventObject>, xstate.xstate/lib/types.Prop<xstate.xstate/lib/types.Prop<TIndexedEvents, xstate.xstate/lib/types.Prop<TInvokeSrcNameMap, K>>, 'data'>, xstate.xstate/lib/types.EventObject, xstate.xstate/lib/types.Cast<TIndexedEvents[keyof TIndexedEvents], xstate.xstate/lib/types.EventObject>>}
  */ typings.xstate.xstateStrings.MachineOptionsServices & TopLevel[Any]

type MakeKeysRequired[T /* <: String */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ K in T ]: unknown}
  */ typings.xstate.xstateStrings.MakeKeysRequired & TopLevel[Any]

type Mapper[TContext, TEvent /* <: EventObject */, TParams /* <: js.Object */] = js.Function2[/* context */ TContext, /* event */ TEvent, TParams]

type MaybeMakeMissingImplementationsRequired[TImplementationType, TMissingImplementationsForType, TRequireMissingImplementations] = js.Object | (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ K in xstate.xstate/lib/types.Cast<TImplementationType, string> ]: xstate.xstate/lib/types.MakeKeysRequired<xstate.xstate/lib/types.Cast<TMissingImplementationsForType, string>>}
  */ typings.xstate.xstateStrings.MaybeMakeMissingImplementationsRequired & TopLevel[Any])

type Merge[M, N] = (Omit[M, /* keyof N */ String]) & N

type MetaObject = Record[String, Any]

type NeverIfEmpty[T] = T

type NoInfer[T] = /* import warning: importer.ImportType#apply Failed type conversion: [T][T extends any ? 0 : any] */ js.Any

type PartialAssigner[TContext, TEvent /* <: EventObject */, TKey /* <: /* keyof TContext */ String */] = js.Function3[
/* context */ TContext, 
/* event */ TEvent, 
/* meta */ AssignMeta[TContext, TEvent], 
/* import warning: importer.ImportType#apply Failed type conversion: TContext[TKey] */ js.Any]

type PathMap[TContext, TEvent /* <: EventObject */] = StringDictionary[PathItem[TContext, TEvent]]

type PathsMap[TContext, TEvent /* <: EventObject */] = StringDictionary[PathsItem[TContext, TEvent]]

type PredictableActionArgumentsExec = js.Function3[
/* action */ ActionObject[Any, EventObject], 
/* context */ Any, 
/* _event */ typings.xstate.typesMod.SCXML.Event[EventObject], 
Unit]

type Prop[T, K] = /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any

type PropertyAssigner[TContext, TEvent /* <: EventObject */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ K in keyof TContext ]:? xstate.xstate/lib/types.PartialAssigner<TContext, TEvent, K> | TContext[K]}
  */ typings.xstate.xstateStrings.PropertyAssigner & TopLevel[TContext]

type PropertyMapper[TContext, TEvent /* <: EventObject */, TParams /* <: js.Object */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ K in keyof TParams ]:? (context : TContext, event : TEvent): TParams[K] | TParams[K]}
  */ typings.xstate.xstateStrings.PropertyMapper & TopLevel[Any]

type Receiver[TEvent /* <: EventObject */] = js.Function1[/* listener */ js.Function1[/* event */ TEvent, Unit], Unit]

type ResolveEventType[T] = Any

type ResolvedTypesMetaFrom[T] = Any

type ReturnTypeOrValue[T] = T | ReturnType[T]

type SendExpr[TContext, TEvent /* <: EventObject */, TSentEvent /* <: EventObject */] = ExprWithMeta[TContext, TEvent, TSentEvent]

type Sender[TEvent /* <: EventObject */] = js.Function1[/* event */ Event[TEvent], Unit]

type ServiceConfig[TContext, TEvent /* <: EventObject */] = String | AnyStateMachine | (InvokeCreator[TContext, TEvent, Any, Any, TEvent])

type ServiceMap = Record[String, DataAny]

/**
  * Extracts action objects that have no extra properties.
  */
type SimpleActionsOf[T /* <: BaseActionObject */] = ExtractWithSimpleSupport[T] | T

type SimpleEventsOf[TEvent /* <: EventObject */] = ExtractWithSimpleSupport[TEvent]

type SimpleOrStateNodeConfig[TContext, TStateSchema /* <: StateSchema[Any] */, TEvent /* <: EventObject */] = (AtomicStateNodeConfig[TContext, TEvent]) | (StateNodeConfig[TContext, TStateSchema, TEvent, BaseActionObject])

type SingleOrArray[T] = js.Array[T] | T

type Spawnable = AnyStateMachine | js.Thenable[Any] | (InvokeCallback[AnyEventObject, AnyEventObject]) | InteropObservable[Any] | Subscribable[Any] | (Behavior[Any, Any])

type SpawnedActorRef[TEvent /* <: EventObject */, TEmitted] = ActorRef[TEvent, TEmitted]

type StandardMachineConfig[TContext, TStateSchema /* <: StateSchema[Any] */, TEvent /* <: EventObject */] = StateNodeConfig[TContext, TStateSchema, TEvent, BaseActionObject]

type StateFrom[T /* <: AnyStateMachine | (js.Function1[/* repeated */ Any, AnyStateMachine]) */] = ReturnType[
/* import warning: importer.ImportType#apply Failed type conversion: std.ReturnType<T>['transition'] */ js.Any]

type StateKey = String | AnyState

type StateNodesConfig[TContext, TStateSchema /* <: StateSchema[Any] */, TEvent /* <: EventObject */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ K in keyof TStateSchema['states'] ]: xstate.xstate/lib/StateNode.StateNode<TContext, TStateSchema['states'][K] & {}, TEvent, {  value :any,   context :TContext}, xstate.xstate/lib/types.ServiceMap, xstate.xstate/lib/typegenTypes.TypegenDisabled>}
  */ typings.xstate.xstateStrings.StateNodesConfig & TopLevel[TStateSchema]

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

type StateValueFrom[TMachine /* <: AnyStateMachine */] = Any

type StatesConfig[TContext, TStateSchema /* <: StateSchema[Any] */, TEvent /* <: EventObject */, TAction /* <: BaseActionObject */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ K in keyof TStateSchema['states'] ]: xstate.xstate/lib/types.StateNodeConfig<TContext, TStateSchema['states'][K] & {}, TEvent, TAction>}
  */ typings.xstate.xstateStrings.StatesConfig & TopLevel[TStateSchema]

type StatesDefinition[TContext, TStateSchema /* <: StateSchema[Any] */, TEvent /* <: EventObject */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ K in keyof TStateSchema['states'] ]: xstate.xstate/lib/types.StateNodeDefinition<TContext, TStateSchema['states'][K] & {}, TEvent>}
  */ typings.xstate.xstateStrings.StatesDefinition & TopLevel[TStateSchema]

type Transition[TContext, TEvent /* <: EventObject */] = String | (TransitionConfig[TContext, TEvent]) | (ConditionalTransitionConfig[TContext, TEvent])

type TransitionConfigOrTarget[TContext, TEvent /* <: EventObject */] = SingleOrArray[
(TransitionConfigTarget[TContext, TEvent]) | (TransitionConfig[TContext, TEvent])]

type TransitionConfigTarget[TContext, TEvent /* <: EventObject */] = js.UndefOr[
String | (StateNode[TContext, Any, TEvent, Context[TContext], ServiceMap, TypegenDisabled])]

type TransitionDefinitionMap[TContext, TEvent /* <: EventObject */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ K in TEvent['type'] | xstate.xstate/lib/types.ActionTypes.NullEvent | '*' ]: std.Array<xstate.xstate/lib/types.TransitionDefinition<TContext, K extends TEvent['type']? std.Extract<TEvent, {  type :K}> : xstate.xstate/lib/types.EventObject>>}
  */ typings.xstate.xstateStrings.TransitionDefinitionMap & TopLevel[TEvent]

type TransitionTarget[TContext, TEvent /* <: EventObject */] = SingleOrArray[
String | (StateNode[TContext, Any, TEvent, Context[TContext], ServiceMap, TypegenDisabled])]

type TransitionTargets[TContext] = js.Array[
String | (StateNode[TContext, Any, EventObject, Context[TContext], ServiceMap, TypegenDisabled])]

type TransitionsConfig[TContext, TEvent /* <: EventObject */] = (TransitionsConfigMap[TContext, TEvent]) | (TransitionsConfigArray[TContext, TEvent])

type TransitionsConfigArray[TContext, TEvent /* <: EventObject */] = js.Array[
((TransitionConfig[TContext, TEvent]) & typings.xstate.anon.Event[TEvent]) | ((TransitionConfig[TContext, TEvent]) & `3`) | ((TransitionConfig[TContext, TEvent]) & `4`)]

type TransitionsConfigMap[TContext, TEvent /* <: EventObject */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ K in TEvent['type'] | '' | '*' ]:? K extends '' | '*'? xstate.xstate/lib/types.TransitionConfigOrTarget<TContext, TEvent> : xstate.xstate/lib/types.TransitionConfigOrTarget<TContext, xstate.xstate/lib/types.ExtractEvent<TEvent, K>>}
  */ typings.xstate.xstateStrings.TransitionsConfigMap & TopLevel[Any]

type ValueAdjacencyMap[TContext, TEvent /* <: EventObject */] = StringDictionary[Record[String, State[TContext, TEvent, Any, Context[TContext], TypegenDisabled]]]

type Values[T] = /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
