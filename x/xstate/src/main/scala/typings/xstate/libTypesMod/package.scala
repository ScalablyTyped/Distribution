package typings.xstate.libTypesMod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Omit
import typings.std.Partial
import typings.std.PromiseLike
import typings.std.Record
import typings.xstate.anon.Activities
import typings.xstate.anon.Context
import typings.xstate.anon.DataAny
import typings.xstate.anon.Delays
import typings.xstate.anon.Guards
import typings.xstate.anon.Services
import typings.xstate.anon.TypeString
import typings.xstate.anon.`1`
import typings.xstate.anon.`2`
import typings.xstate.anon.`3`
import typings.xstate.libInterpreterMod.Interpreter
import typings.xstate.libStateMod.State
import typings.xstate.libStateNodeMod.StateNode
import typings.xstate.libTypegenTypesMod.ResolveTypegenMeta
import typings.xstate.libTypegenTypesMod.TypegenConstraint
import typings.xstate.libTypegenTypesMod.TypegenDisabled
import typings.xstate.xstateBooleans.`false`
import typings.xstate.xstateBooleans.`true`
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

type ActionType = String

type Actions[TContext, TEvent /* <: EventObject */] = SingleOrArray[Action[TContext, TEvent]]

type Activity[TContext, TEvent /* <: EventObject */] = String | (ActivityDefinition[TContext, TEvent])

type ActivityConfig[TContext, TEvent /* <: EventObject */] = js.Function2[
/* ctx */ TContext, 
/* activity */ ActivityDefinition[TContext, TEvent], 
DisposeActivityFunction | Unit]

type ActivityMap = StringDictionary[(ActivityDefinition[Any, Any]) | `false`]

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
  - typings.xstate.libTypesMod.RaiseAction[scala.Any]
  - typings.xstate.libTypesMod.SendAction[TContext, TEvent, scala.Any]
  - typings.xstate.libTypesMod.AssignAction[TContext, TEvent]
  - typings.xstate.libTypesMod.LogAction[TContext, TEvent]
  - typings.xstate.libTypesMod.CancelAction
  - typings.xstate.libTypesMod.StopAction[TContext, TEvent]
  - typings.xstate.libTypesMod.ChooseAction[TContext, TEvent]
  - typings.xstate.libTypesMod.ActionFunction[TContext, TEvent, typings.xstate.libTypesMod.BaseActionObject]
*/
type BaseAction[TContext, TEvent /* <: EventObject */, TAction /* <: BaseActionObject */] = (_BaseAction[TContext, TEvent, TAction]) | RaiseAction[Any] | (SendAction[TContext, TEvent, Any]) | (ActionFunction[TContext, TEvent, BaseActionObject]) | (/* import warning: importer.ImportType#apply Failed type conversion: xstate.xstate/lib/types.SimpleActionsOf<TAction>['type'] */ js.Any) | TAction

type BaseActions[TContext, TEvent /* <: EventObject */, TAction /* <: BaseActionObject */] = SingleOrArray[BaseAction[TContext, TEvent, TAction]]

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  A extends B ? A : B
  }}}
  */
type Cast[A, B] = A

type Compute[A /* <: Any */] = (/* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof A ]: A[K]} */ js.Any) & Any

type Condition[TContext, TEvent /* <: EventObject */] = String | (ConditionPredicate[TContext, TEvent]) | (Guard[TContext, TEvent])

type ConditionPredicate[TContext, TEvent /* <: EventObject */] = js.Function3[
/* context */ TContext, 
/* event */ TEvent, 
/* meta */ GuardMeta[TContext, TEvent], 
Boolean]

type ConditionalTransitionConfig[TContext, TEvent /* <: EventObject */] = js.Array[TransitionConfig[TContext, TEvent]]

type DefaultContext = js.UndefOr[Record[String, Any]]

type DefaultGuardType = xstateDotguard

type DelayConfig[TContext, TEvent /* <: EventObject */] = Double | (DelayExpr[TContext, TEvent])

type DelayExpr[TContext, TEvent /* <: EventObject */] = ExprWithMeta[TContext, TEvent, Double]

type DelayFunctionMap[TContext, TEvent /* <: EventObject */] = Record[String, DelayConfig[TContext, TEvent]]

type DelayedTransitions[TContext, TEvent /* <: EventObject */] = (Record[String | Double, String | (SingleOrArray[TransitionConfig[TContext, TEvent]])]) | (js.Array[
(TransitionConfig[TContext, TEvent]) & (typings.xstate.anon.Delay[TContext, TEvent])])

type DisposeActivityFunction = js.Function0[Unit]

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  <A>(): A extends A2 ? true : false extends <A>(): A extends A1 ? true : false ? true : false
  }}}
  */
type Equals[A1 /* <: Any */, A2 /* <: Any */] = `true`

type Event[TEvent /* <: EventObject */] = (/* import warning: importer.ImportType#apply Failed type conversion: TEvent['type'] */ js.Any) | TEvent

type EventData = (Record[String, Any]) & `1`

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  xstate.xstate/lib/types.IsNever<K> extends true ? TEvent : xstate.xstate/lib/types.ExtractEvent<TEvent, K>
  }}}
  */
type EventFrom[T, K /* <: Prop[TEvent, `type`] */, TEvent /* <: EventObject */] = TEvent

type EventType = String

/** NOTE: Mapped type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
  * This translation is imprecise and ignores the effect of the type mapping. 
  * TS definition: {{{
  {[ K in std.Exclude<keyof A, 'type'> ]: A[K]}
  }}}
  */
type ExcludeType[A] = A

type Expr[TContext, TEvent /* <: EventObject */, T] = js.Function2[/* context */ TContext, /* event */ TEvent, T]

type ExprWithMeta[TContext, TEvent /* <: EventObject */, T] = js.Function3[/* context */ TContext, /* event */ TEvent, /* meta */ SCXMLEventMeta[TEvent], T]

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  TEvent extends any ? TEventType extends TEvent['type'] ? TEvent : never : never
  }}}
  */
type ExtractEvent[TEvent /* <: EventObject */, TEventType /* <: /* import warning: importer.ImportType#apply Failed type conversion: TEvent['type'] */ js.Any */] = TEvent

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  A extends {  type :T} ? xstate.xstate/lib/types.ExcludeType<A> : never
  }}}
  */
type ExtractExtraParameters[A, T] = ExcludeType[A]

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  T extends any ? {  type :T['type']} extends T ? T : never : never
  }}}
  */
type ExtractWithSimpleSupport[T /* <: TypeString */] = T

type GenerateActionsConfigPart[TContext, TResolvedTypesMeta, TRequireMissingImplementations, TMissingImplementations] = (MaybeMakeMissingImplementationsRequired[actions, Prop[TMissingImplementations, actions], TRequireMissingImplementations]) & (`2`[TContext, TResolvedTypesMeta])

type GenerateDelaysConfigPart[TContext, TResolvedTypesMeta, TRequireMissingImplementations, TMissingImplementations] = (MaybeMakeMissingImplementationsRequired[delays, Prop[TMissingImplementations, delays], TRequireMissingImplementations]) & (Delays[TContext, TResolvedTypesMeta])

type GenerateGuardsConfigPart[TContext, TResolvedTypesMeta, TRequireMissingImplementations, TMissingImplementations] = (MaybeMakeMissingImplementationsRequired[guards, Prop[TMissingImplementations, guards], TRequireMissingImplementations]) & (Guards[TContext, TResolvedTypesMeta])

type GenerateServicesConfigPart[TContext, TResolvedTypesMeta, TRequireMissingImplementations, TMissingImplementations] = (MaybeMakeMissingImplementationsRequired[services, Prop[TMissingImplementations, services], TRequireMissingImplementations]) & (Services[TContext, TResolvedTypesMeta])

type Guard[TContext, TEvent /* <: EventObject */] = (GuardPredicate[TContext, TEvent]) | ((Record[String, Any]) & TypeString)

type InternalMachineOptions[TContext, TEvent /* <: EventObject */, TResolvedTypesMeta, TRequireMissingImplementations /* <: Boolean */, TMissingImplementations] = (GenerateActionsConfigPart[TContext, TResolvedTypesMeta, TRequireMissingImplementations, TMissingImplementations]) & (GenerateDelaysConfigPart[TContext, TResolvedTypesMeta, TRequireMissingImplementations, TMissingImplementations]) & (GenerateGuardsConfigPart[TContext, TResolvedTypesMeta, TRequireMissingImplementations, TMissingImplementations]) & (GenerateServicesConfigPart[TContext, TResolvedTypesMeta, TRequireMissingImplementations, TMissingImplementations]) & (Activities[TContext, TEvent])

type InvokeCallback[TEvent /* <: EventObject */, TSentEvent /* <: EventObject */] = js.Function2[
/* callback */ Sender[TSentEvent], 
/* onReceive */ Receiver[TEvent], 
js.Function0[Unit] | js.Promise[Any] | Unit]

type InvokeCreator[TContext, TSourceEvent /* <: EventObject */, TFinalContext, TInputEvent /* <: EventObject */, // keeping a slot for it here, but it's actually not used right now to ensure that the communication contract between actors is satisfied
TOutputEvent /* <: EventObject */] = js.Function3[
/* context */ TContext, 
/* event */ TSourceEvent, 
/* meta */ InvokeMeta, 
PromiseLike[TFinalContext] | (StateMachine[TFinalContext, Any, Any, Any, Any, Any, Any]) | Subscribable[EventObject] | (InvokeCallback[TInputEvent, TOutputEvent]) | (Behavior[Any, Any])]

type IsAny[T] = Equals[T, Any]

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  [T] extends [never] ? true : false
  }}}
  */
type IsNever[T] = `true`

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

type Mapper[TContext, TEvent /* <: EventObject */, TParams /* <: js.Object */] = js.Function2[/* context */ TContext, /* event */ TEvent, TParams]

type Merge[M, N] = (Omit[M, /* keyof N */ String]) & N

type MetaObject = Record[String, Any]

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  {} extends T ? never : T
  }}}
  */
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
/* _event */ typings.xstate.libTypesMod.SCXML.Event[EventObject], 
Unit]

type Receiver[TEvent /* <: EventObject */] = js.Function1[/* listener */ js.Function1[/* event */ TEvent, Unit], Unit]

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  T extends xstate.xstate/lib/types.AnyFunction ? std.ReturnType<T> : T
  }}}
  */
type ReturnTypeOrValue[T] = T

type SendExpr[TContext, TEvent /* <: EventObject */, TSentEvent /* <: EventObject */] = ExprWithMeta[TContext, TEvent, TSentEvent]

type Sender[TEvent /* <: EventObject */] = js.Function1[/* event */ Event[TEvent], Unit]

type ServiceConfig[TContext, TEvent /* <: EventObject */] = String | AnyStateMachine | (InvokeCreator[TContext, TEvent, Any, Any, TEvent])

type ServiceMap = Record[String, DataAny]

/**
  * Extracts action objects that have no extra properties.
  */
/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  xstate.xstate/lib/types.ActionObject<any, any> extends T ? T : xstate.xstate/lib/types.ExtractWithSimpleSupport<T>
  }}}
  */
type SimpleActionsOf[T /* <: BaseActionObject */] = T

type SimpleEventsOf[TEvent /* <: EventObject */] = ExtractWithSimpleSupport[TEvent]

type SimpleOrStateNodeConfig[TContext, TStateSchema /* <: StateSchema[Any] */, TEvent /* <: EventObject */] = (AtomicStateNodeConfig[TContext, TEvent]) | (StateNodeConfig[TContext, TStateSchema, TEvent, BaseActionObject])

type SingleOrArray[T] = js.Array[T] | T

type Spawnable = AnyStateMachine | PromiseLike[Any] | (InvokeCallback[AnyEventObject, AnyEventObject]) | InteropObservable[Any] | Subscribable[Any] | (Behavior[Any, Any])

type SpawnedActorRef[TEvent /* <: EventObject */, TEmitted] = ActorRef[TEvent, TEmitted]

type StandardMachineConfig[TContext, TStateSchema /* <: StateSchema[Any] */, TEvent /* <: EventObject */] = StateNodeConfig[TContext, TStateSchema, TEvent, BaseActionObject]

type StateKey = String | AnyState

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

type Transition[TContext, TEvent /* <: EventObject */] = String | (TransitionConfig[TContext, TEvent]) | (ConditionalTransitionConfig[TContext, TEvent])

type TransitionConfigOrTarget[TContext, TEvent /* <: EventObject */] = SingleOrArray[
(TransitionConfigTarget[TContext, TEvent]) | (TransitionConfig[TContext, TEvent])]

type TransitionConfigTarget[TContext, TEvent /* <: EventObject */] = js.UndefOr[
String | (StateNode[TContext, Any, TEvent, Context[TContext], ServiceMap, TypegenDisabled])]

type TransitionTarget[TContext, TEvent /* <: EventObject */] = SingleOrArray[
String | (StateNode[TContext, Any, TEvent, Context[TContext], ServiceMap, TypegenDisabled])]

type TransitionTargets[TContext] = js.Array[
String | (StateNode[TContext, Any, EventObject, Context[TContext], ServiceMap, TypegenDisabled])]

type TransitionsConfig[TContext, TEvent /* <: EventObject */] = (TransitionsConfigMap[TContext, TEvent]) | (TransitionsConfigArray[TContext, TEvent])

type TransitionsConfigArray[TContext, TEvent /* <: EventObject */] = js.Array[
(/* import warning: importer.ImportType#apply Failed type conversion: TEvent extends xstate.xstate/lib/types.EventObject ? xstate.xstate/lib/types.TransitionConfig<TContext, TEvent> & {  event :TEvent['type']} : never */ js.Any) | ((TransitionConfig[TContext, TEvent]) & typings.xstate.anon.Event) | ((TransitionConfig[TContext, TEvent]) & `3`)]

type ValueAdjacencyMap[TContext, TEvent /* <: EventObject */] = StringDictionary[Record[String, State[TContext, TEvent, Any, Context[TContext], TypegenDisabled]]]

type Values[T] = /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
