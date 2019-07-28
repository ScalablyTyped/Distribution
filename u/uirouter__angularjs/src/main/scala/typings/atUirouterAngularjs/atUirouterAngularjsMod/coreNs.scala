package typings.atUirouterAngularjs.atUirouterAngularjsMod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import typings.atUirouterCore.Anon_Configuration
import typings.atUirouterCore.Anon_EAGER
import typings.atUirouterCore.Anon_Hash
import typings.atUirouterCore.Anon_IsHtml5
import typings.atUirouterCore.Anon_NOWAIT
import typings.atUirouterCore.Anon_UiRouter
import typings.atUirouterCore.Anon_UiViewContextAnchor
import typings.atUirouterCore.TypeofClassTransition
import typings.atUirouterCore.libCommonCommonMod.IInjectable
import typings.atUirouterCore.libCommonCommonMod.Mapper
import typings.atUirouterCore.libCommonCommonMod.Obj
import typings.atUirouterCore.libCommonCommonMod.Predicate
import typings.atUirouterCore.libCommonCommonMod.TypedMap
import typings.atUirouterCore.libCommonCoreservicesMod.$InjectorLike
import typings.atUirouterCore.libCommonCoreservicesMod.$QLike
import typings.atUirouterCore.libCommonCoreservicesMod.CoreServices
import typings.atUirouterCore.libCommonCoreservicesMod.LocationConfig
import typings.atUirouterCore.libCommonCoreservicesMod.LocationServices
import typings.atUirouterCore.libParamsInterfaceMod.ParamTypeDefinition
import typings.atUirouterCore.libParamsInterfaceMod.RawParams
import typings.atUirouterCore.libPathPathNodeMod.GetParamsFn
import typings.atUirouterCore.libResolveInterfaceMod.ResolvableLiteral
import typings.atUirouterCore.libResolveInterfaceMod.ResolvePolicy
import typings.atUirouterCore.libStateInterfaceMod.StateDeclaration
import typings.atUirouterCore.libStateInterfaceMod.StateOrName
import typings.atUirouterCore.libStateInterfaceMod._StateDeclaration
import typings.atUirouterCore.libStateStateRegistryMod.StateRegistryListener
import typings.atUirouterCore.libTransitionInterfaceMod.HookFn
import typings.atUirouterCore.libTransitionInterfaceMod.HookMatchCriteria
import typings.atUirouterCore.libTransitionInterfaceMod.HookMatchCriterion
import typings.atUirouterCore.libTransitionInterfaceMod.HookRegOptions
import typings.atUirouterCore.libTransitionInterfaceMod.HookResult
import typings.atUirouterCore.libTransitionInterfaceMod.IHookRegistry
import typings.atUirouterCore.libTransitionInterfaceMod.PathType
import typings.atUirouterCore.libTransitionInterfaceMod.TransitionHookOptions
import typings.atUirouterCore.libTransitionInterfaceMod.TransitionOptions
import typings.atUirouterCore.libTransitionInterfaceMod.TreeChanges
import typings.atUirouterCore.libTransitionTransitionHookMod.ErrorHandler
import typings.atUirouterCore.libTransitionTransitionHookMod.GetErrorHandler
import typings.atUirouterCore.libTransitionTransitionHookMod.GetResultHandler
import typings.atUirouterCore.libTransitionTransitionHookMod.ResultHandler
import typings.atUirouterCore.libUrlInterfaceMod.UrlMatcherCompileConfig
import typings.atUirouterCore.libUrlInterfaceMod.UrlRuleHandlerFn
import typings.atUirouterCore.libUrlInterfaceMod.UrlRuleMatchFn
import typings.atUirouterCore.libVanillaInterfaceMod.LocationPlugin
import typings.atUirouterCore.libVanillaInterfaceMod.ServicesPlugin
import typings.atUirouterCore.libViewInterfaceMod.ActiveUIView
import typings.atUirouterCore.libViewInterfaceMod.ViewConfig
import typings.atUirouterCore.libViewInterfaceMod.ViewContext
import typings.std.Error
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uirouter/angularjs", "core")
@js.native
object coreNs extends js.Object {
  @js.native
  abstract class BaseLocationServices protected ()
    extends typings.atUirouterCore.atUirouterCoreMod.BaseLocationServices {
    def this(router: typings.atUirouterCore.libRouterMod.UIRouter, fireAfterUpdate: Boolean) = this()
  }
  
  @js.native
  class BaseUrlRule protected ()
    extends typings.atUirouterCore.atUirouterCoreMod.BaseUrlRule {
    def this(`match`: UrlRuleMatchFn) = this()
    def this(`match`: UrlRuleMatchFn, handler: UrlRuleHandlerFn) = this()
  }
  
  @js.native
  class BrowserLocationConfig ()
    extends typings.atUirouterCore.atUirouterCoreMod.BrowserLocationConfig {
    def this(router: js.Any) = this()
    def this(router: js.Any, _isHtml5: Boolean) = this()
  }
  
  @js.native
  class Glob protected ()
    extends typings.atUirouterCore.atUirouterCoreMod.Glob {
    def this(text: String) = this()
  }
  
  @js.native
  class HashLocationService protected ()
    extends typings.atUirouterCore.atUirouterCoreMod.HashLocationService {
    def this(router: typings.atUirouterCore.libRouterMod.UIRouter) = this()
  }
  
  @js.native
  class HookBuilder protected ()
    extends typings.atUirouterCore.atUirouterCoreMod.HookBuilder {
    def this(transition: typings.atUirouterCore.libTransitionTransitionMod.Transition) = this()
  }
  
  @js.native
  class MemoryLocationConfig ()
    extends typings.atUirouterCore.atUirouterCoreMod.MemoryLocationConfig
  
  @js.native
  class MemoryLocationService protected ()
    extends typings.atUirouterCore.atUirouterCoreMod.MemoryLocationService {
    def this(router: typings.atUirouterCore.libRouterMod.UIRouter) = this()
  }
  
  @js.native
  class Param protected ()
    extends typings.atUirouterCore.atUirouterCoreMod.Param {
    def this(
      id: String,
      `type`: typings.atUirouterCore.libParamsParamTypeMod.ParamType,
      location: typings.atUirouterCore.libParamsParamMod.DefType,
      urlConfig: typings.atUirouterCore.libUrlMod.UrlConfig,
      state: StateDeclaration
    ) = this()
  }
  
  @js.native
  class ParamFactory protected ()
    extends typings.atUirouterCore.atUirouterCoreMod.ParamFactory {
    def this(router: typings.atUirouterCore.libRouterMod.UIRouter) = this()
  }
  
  @js.native
  class ParamType protected ()
    extends typings.atUirouterCore.atUirouterCoreMod.ParamType {
    /**
      * @param def  A configuration object which contains the custom type definition.  The object's
      *        properties will override the default methods and/or pattern in `ParamType`'s public interface.
      * @returns a new ParamType object
      */
    def this(`def`: ParamTypeDefinition) = this()
  }
  
  @js.native
  /** @internalapi */
  class ParamTypes ()
    extends typings.atUirouterCore.atUirouterCoreMod.ParamTypes
  
  @js.native
  class PathNode protected ()
    extends typings.atUirouterCore.atUirouterCoreMod.PathNode {
    /** Creates a copy of a PathNode */
    def this(node: typings.atUirouterCore.libPathPathNodeMod.PathNode) = this()
    /** Creates a new (empty) PathNode for a State */
    def this(state: typings.atUirouterCore.libStateStateObjectMod.StateObject) = this()
  }
  
  @js.native
  class PathUtils ()
    extends typings.atUirouterCore.atUirouterCoreMod.PathUtils
  
  @js.native
  class PushStateLocationService protected ()
    extends typings.atUirouterCore.atUirouterCoreMod.PushStateLocationService {
    def this(router: typings.atUirouterCore.libRouterMod.UIRouter) = this()
  }
  
  @js.native
  class Queue[T] ()
    extends typings.atUirouterCore.atUirouterCoreMod.Queue[T] {
    def this(_items: js.Array[T]) = this()
    def this(_items: js.Array[T], _limit: Double) = this()
  }
  
  @js.native
  class RegisteredHook protected ()
    extends typings.atUirouterCore.atUirouterCoreMod.RegisteredHook {
    def this(
      tranSvc: typings.atUirouterCore.libTransitionTransitionServiceMod.TransitionService,
      eventType: typings.atUirouterCore.libTransitionTransitionEventTypeMod.TransitionEventType,
      callback: HookFn,
      matchCriteria: HookMatchCriteria,
      removeHookFromRegistry: js.Function1[
            /* hook */ typings.atUirouterCore.libTransitionHookRegistryMod.RegisteredHook, 
            Unit
          ]
    ) = this()
    def this(
      tranSvc: typings.atUirouterCore.libTransitionTransitionServiceMod.TransitionService,
      eventType: typings.atUirouterCore.libTransitionTransitionEventTypeMod.TransitionEventType,
      callback: HookFn,
      matchCriteria: HookMatchCriteria,
      removeHookFromRegistry: js.Function1[
            /* hook */ typings.atUirouterCore.libTransitionHookRegistryMod.RegisteredHook, 
            Unit
          ],
      options: HookRegOptions
    ) = this()
  }
  
  @js.native
  class Rejection protected ()
    extends typings.atUirouterCore.atUirouterCoreMod.Rejection {
    def this(`type`: Double) = this()
    def this(`type`: Double, message: String) = this()
    def this(`type`: Double, message: String, detail: js.Any) = this()
  }
  
  @js.native
  class Resolvable protected ()
    extends typings.atUirouterCore.atUirouterCoreMod.Resolvable {
    /** This constructor creates a new Resolvable from the plain old [[ResolvableLiteral]] javascript object */
    def this(resolvable: ResolvableLiteral) = this()
    /** This constructor creates a Resolvable copy */
    def this(resolvable: typings.atUirouterCore.libResolveResolvableMod.Resolvable) = this()
    /**
      * This constructor creates a new `Resolvable`
      *
      * #### Example:
      * ```js
      * var resolvable1 = new Resolvable('mytoken', http => http.get('foo.json').toPromise(), [Http]);
      *
      * var resolvable2 = new Resolvable(UserService, dep => new UserService(dep.data), [SomeDependency]);
      *
      * var resolvable1Clone = new Resolvable(resolvable1);
      * ```
      *
      * @param token The new resolvable's injection token, such as `"userList"` (a string) or `UserService` (a class).
      *              When this token is used during injection, the resolved value will be injected.
      * @param resolveFn The function that returns the resolved value, or a promise for the resolved value
      * @param deps An array of dependencies, which will be injected into the `resolveFn`
      * @param policy the [[ResolvePolicy]] defines when and how the Resolvable is processed
      * @param data Pre-resolved data. If the resolve value is already known, it may be provided here.
      */
    def this(token: js.Any, resolveFn: js.Function) = this()
    def this(token: js.Any, resolveFn: js.Function, deps: js.Array[_]) = this()
    def this(token: js.Any, resolveFn: js.Function, deps: js.Array[_], policy: ResolvePolicy) = this()
    def this(token: js.Any, resolveFn: js.Function, deps: js.Array[_], policy: ResolvePolicy, data: js.Any) = this()
  }
  
  @js.native
  class ResolveContext protected ()
    extends typings.atUirouterCore.atUirouterCoreMod.ResolveContext {
    def this(_path: js.Array[typings.atUirouterCore.libPathPathNodeMod.PathNode]) = this()
  }
  
  @js.native
  class StateBuilder protected ()
    extends typings.atUirouterCore.atUirouterCoreMod.StateBuilder {
    def this(
      matcher: typings.atUirouterCore.libStateStateMatcherMod.StateMatcher,
      urlMatcherFactory: typings.atUirouterCore.libUrlUrlMatcherFactoryMod.UrlMatcherFactory
    ) = this()
  }
  
  @js.native
  class StateMatcher protected ()
    extends typings.atUirouterCore.atUirouterCoreMod.StateMatcher {
    def this(_states: StringDictionary[typings.atUirouterCore.libStateStateObjectMod.StateObject]) = this()
  }
  
  @js.native
  /** @deprecated use State.create() */
  class StateObject ()
    extends typings.atUirouterCore.atUirouterCoreMod.StateObject {
    def this(config: StateDeclaration) = this()
  }
  
  @js.native
  class StateParams ()
    extends typings.atUirouterCore.atUirouterCoreMod.StateParams {
    def this(params: Obj) = this()
  }
  
  @js.native
  class StateQueueManager protected ()
    extends typings.atUirouterCore.atUirouterCoreMod.StateQueueManager {
    def this(
      router: typings.atUirouterCore.libRouterMod.UIRouter,
      states: StringDictionary[typings.atUirouterCore.libStateStateObjectMod.StateObject],
      builder: typings.atUirouterCore.libStateStateBuilderMod.StateBuilder,
      listeners: js.Array[StateRegistryListener]
    ) = this()
  }
  
  @js.native
  class StateRegistry protected ()
    extends typings.atUirouterCore.atUirouterCoreMod.StateRegistry {
    /** @internalapi */
    def this(router: typings.atUirouterCore.libRouterMod.UIRouter) = this()
  }
  
  @js.native
  class StateService protected ()
    extends typings.atUirouterCore.atUirouterCoreMod.StateService {
    /** @internalapi */
    def this(/** @hidden */ router: typings.atUirouterCore.libRouterMod.UIRouter) = this()
  }
  
  @js.native
  class TargetState protected ()
    extends typings.atUirouterCore.atUirouterCoreMod.TargetState {
    /**
      * The TargetState constructor
      *
      * Note: Do not construct a `TargetState` manually.
      * To create a `TargetState`, use the [[StateService.target]] factory method.
      *
      * @param _stateRegistry The StateRegistry to use to look up the _definition
      * @param _identifier An identifier for a state.
      *    Either a fully-qualified state name, or the object used to define the state.
      * @param _params Parameters for the target state
      * @param _options Transition options.
      *
      * @internalapi
      */
    def this(
      _stateRegistry: typings.atUirouterCore.libStateStateRegistryMod.StateRegistry,
      _identifier: StateOrName
    ) = this()
    def this(
      _stateRegistry: typings.atUirouterCore.libStateStateRegistryMod.StateRegistry,
      _identifier: StateOrName,
      _params: RawParams
    ) = this()
    def this(
      _stateRegistry: typings.atUirouterCore.libStateStateRegistryMod.StateRegistry,
      _identifier: StateOrName,
      _params: RawParams,
      _options: TransitionOptions
    ) = this()
  }
  
  @js.native
  /** @hidden */
  class Trace ()
    extends typings.atUirouterCore.atUirouterCoreMod.Trace
  
  @js.native
  class Transition protected ()
    extends typings.atUirouterCore.atUirouterCoreMod.Transition {
    /**
      * Creates a new Transition object.
      *
      * If the target state is not valid, an error is thrown.
      *
      * @internalapi
      *
      * @param fromPath The path of [[PathNode]]s from which the transition is leaving.  The last node in the `fromPath`
      *        encapsulates the "from state".
      * @param targetState The target state and parameters being transitioned to (also, the transition options)
      * @param router The [[UIRouter]] instance
      */
    def this(
      fromPath: js.Array[typings.atUirouterCore.libPathPathNodeMod.PathNode],
      targetState: typings.atUirouterCore.libStateTargetStateMod.TargetState,
      router: typings.atUirouterCore.libRouterMod.UIRouter
    ) = this()
  }
  
  @js.native
  class TransitionEventType protected ()
    extends typings.atUirouterCore.atUirouterCoreMod.TransitionEventType {
    def this(
      name: String,
      hookPhase: typings.atUirouterCore.libTransitionInterfaceMod.TransitionHookPhase,
      hookOrder: Double,
      criteriaMatchPath: PathType
    ) = this()
    def this(
      name: String,
      hookPhase: typings.atUirouterCore.libTransitionInterfaceMod.TransitionHookPhase,
      hookOrder: Double,
      criteriaMatchPath: PathType,
      reverseSort: Boolean
    ) = this()
    def this(
      name: String,
      hookPhase: typings.atUirouterCore.libTransitionInterfaceMod.TransitionHookPhase,
      hookOrder: Double,
      criteriaMatchPath: PathType,
      reverseSort: Boolean,
      getResultHandler: GetResultHandler
    ) = this()
    def this(
      name: String,
      hookPhase: typings.atUirouterCore.libTransitionInterfaceMod.TransitionHookPhase,
      hookOrder: Double,
      criteriaMatchPath: PathType,
      reverseSort: Boolean,
      getResultHandler: GetResultHandler,
      getErrorHandler: GetErrorHandler
    ) = this()
    def this(
      name: String,
      hookPhase: typings.atUirouterCore.libTransitionInterfaceMod.TransitionHookPhase,
      hookOrder: Double,
      criteriaMatchPath: PathType,
      reverseSort: Boolean,
      getResultHandler: GetResultHandler,
      getErrorHandler: GetErrorHandler,
      synchronous: Boolean
    ) = this()
  }
  
  @js.native
  class TransitionHook protected ()
    extends typings.atUirouterCore.atUirouterCoreMod.TransitionHook {
    def this(
      transition: typings.atUirouterCore.libTransitionTransitionMod.Transition,
      stateContext: StateDeclaration,
      registeredHook: typings.atUirouterCore.libTransitionHookRegistryMod.RegisteredHook,
      options: TransitionHookOptions
    ) = this()
  }
  
  @js.native
  class TransitionService protected ()
    extends typings.atUirouterCore.atUirouterCoreMod.TransitionService {
    /** @hidden */
    def this(_router: typings.atUirouterCore.libRouterMod.UIRouter) = this()
  }
  
  @js.native
  /**
    * Creates a new `UIRouter` object
    *
    * @param locationService a [[LocationServices]] implementation
    * @param locationConfig a [[LocationConfig]] implementation
    * @internalapi
    */
  class UIRouter ()
    extends typings.atUirouterCore.atUirouterCoreMod.UIRouter {
    def this(locationService: LocationServices) = this()
    def this(locationService: LocationServices, locationConfig: LocationConfig) = this()
  }
  
  @js.native
  class UIRouterGlobals ()
    extends typings.atUirouterCore.atUirouterCoreMod.UIRouterGlobals
  
  @js.native
  abstract class UIRouterPluginBase ()
    extends typings.atUirouterCore.atUirouterCoreMod.UIRouterPluginBase
  
  @js.native
  class UrlConfig protected ()
    extends typings.atUirouterCore.atUirouterCoreMod.UrlConfig {
    /** @hidden */ def this(/** @hidden */ router: typings.atUirouterCore.libRouterMod.UIRouter) = this()
  }
  
  @js.native
  class UrlMatcher protected ()
    extends typings.atUirouterCore.atUirouterCoreMod.UrlMatcher {
    /**
      * @param pattern The pattern to compile into a matcher.
      * @param paramTypes The [[ParamTypes]] registry
      * @param paramFactory A [[ParamFactory]] object
      * @param config  A [[UrlMatcherCompileConfig]] configuration object
      */
    def this(
      pattern: String,
      paramTypes: typings.atUirouterCore.libParamsParamTypesMod.ParamTypes,
      paramFactory: typings.atUirouterCore.libUrlUrlMatcherFactoryMod.ParamFactory
    ) = this()
    def this(
      pattern: String,
      paramTypes: typings.atUirouterCore.libParamsParamTypesMod.ParamTypes,
      paramFactory: typings.atUirouterCore.libUrlUrlMatcherFactoryMod.ParamFactory,
      config: UrlMatcherCompileConfig
    ) = this()
  }
  
  @js.native
  class UrlMatcherFactory protected ()
    extends typings.atUirouterCore.atUirouterCoreMod.UrlMatcherFactory {
    def this(/** @hidden */ router: typings.atUirouterCore.libRouterMod.UIRouter) = this()
  }
  
  @js.native
  class UrlRouter protected ()
    extends typings.atUirouterCore.atUirouterCoreMod.UrlRouter {
    /** @hidden */
    def this(/** @hidden */ router: typings.atUirouterCore.libRouterMod.UIRouter) = this()
  }
  
  @js.native
  class UrlRuleFactory protected ()
    extends typings.atUirouterCore.atUirouterCoreMod.UrlRuleFactory {
    def this(router: typings.atUirouterCore.libRouterMod.UIRouter) = this()
  }
  
  @js.native
  class UrlRules protected ()
    extends typings.atUirouterCore.atUirouterCoreMod.UrlRules {
    /** @hidden */
    def this(/** @hidden */ router: typings.atUirouterCore.libRouterMod.UIRouter) = this()
  }
  
  @js.native
  class UrlService protected ()
    extends typings.atUirouterCore.atUirouterCoreMod.UrlService {
    /** @hidden */
    def this(/** @hidden */ router: typings.atUirouterCore.libRouterMod.UIRouter) = this()
  }
  
  @js.native
  class ViewService protected ()
    extends typings.atUirouterCore.atUirouterCoreMod.ViewService {
    /** @hidden */
    def this(/** @hidden */ router: typings.atUirouterCore.libRouterMod.UIRouter) = this()
  }
  
  @JSName("$injector")
  val $injector: $InjectorLike = js.native
  @JSName("$q")
  val $q: $QLike = js.native
  val NATIVE_INJECTOR_TOKEN: String = js.native
  var defaultResolvePolicy: ResolvePolicy = js.native
  var defaultTransOpts: TransitionOptions = js.native
  @JSName("equals")
  val equals_FcoreNs: js.Any = js.native
  val forEach: js.Any = js.native
  val fromJson: js.Any = js.native
  val hostRegex: RegExp = js.native
  val isDefined: Predicate[js.Any] = js.native
  val isNullOrUndefined: Predicate[js.Any] = js.native
  var mapObj: js.Function3[
    /* collection */ StringDictionary[js.Any], 
    /* callback */ Mapper[js.Any, js.Any], 
    /* target */ js.UndefOr[
      /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof collection */ js.Any
    ], 
    StringDictionary[js.Any]
  ] = js.native
  val propEq: js.Function = js.native
  val root: js.Any = js.native
  val services: CoreServices = js.native
  val toJson: js.Any = js.native
  /**
    * The [[Trace]] singleton
    *
    * #### Example:
    * ```js
    * import {trace} from "@uirouter/core";
    * trace.enable(1, 5);
    * ```
    */
  val trace: typings.atUirouterCore.libCommonTraceMod.Trace = js.native
  def _extend(toObj: Obj, fromObjs: Obj*): js.Any = js.native
  def _inArray(array: js.Array[_]): js.Function1[/* obj */ js.Any, Boolean] = js.native
  def _inArray(array: js.Array[_], obj: js.Any): Boolean = js.native
  def _pushTo[T](arr: js.Array[T]): js.Function1[/* val */ T, T] = js.native
  def _pushTo[T](arr: js.Array[T], `val`: T): T = js.native
  def _removeFrom[T](array: js.Array[T]): js.Function1[/* obj */ T, js.Array[T]] = js.native
  def _removeFrom[T](array: js.Array[T], obj: T): js.Array[T] = js.native
  def all(fn1: Predicate[_]): js.Function1[/* arr */ js.Array[_], Boolean] = js.native
  def allTrueR(memo: Boolean, elem: js.Any): js.Any = js.native
  def ancestors(
    first: typings.atUirouterCore.libStateStateObjectMod.StateObject,
    second: typings.atUirouterCore.libStateStateObjectMod.StateObject
  ): js.Array[typings.atUirouterCore.libStateStateObjectMod.StateObject] = js.native
  def and(fn1: Predicate[_], fn2: Predicate[_]): Predicate[_] = js.native
  def any(fn1: Predicate[_]): js.Function1[/* arr */ js.Array[_], Boolean] = js.native
  def anyTrueR(memo: Boolean, elem: js.Any): js.Any = js.native
  def applyPairs(memo: TypedMap[_], keyValTuple: js.Array[_]): TypedMap[_] = js.native
  def arrayTuples(args: js.Any*): js.Array[_] = js.native
  def assertFn(predicateOrMap: js.Function): js.Any = js.native
  def assertFn(predicateOrMap: js.Function, errMsg: String): js.Any = js.native
  def assertFn(predicateOrMap: js.Function, errMsg: js.Function): js.Any = js.native
  def assertMap[T, U](mapFn: js.Function1[/* t */ T, U], errMsg: String): js.Function1[/* t */ T, U] = js.native
  def assertMap[T, U](mapFn: js.Function1[/* t */ T, U], errMsg: js.Function): js.Function1[/* t */ T, U] = js.native
  def assertPredicate[T](predicate: Predicate[T], errMsg: String): Predicate[T] = js.native
  def assertPredicate[T](predicate: Predicate[T], errMsg: js.Function): Predicate[T] = js.native
  def beforeAfterSubstr(char: String): js.Function1[/* str */ String, js.Array[String]] = js.native
  def buildUrl(loc: LocationServices): String = js.native
  def compose(): js.Function0[_] = js.native
  def copy(src: Obj): Obj = js.native
  def copy(src: Obj, dest: Obj): Obj = js.native
  def createProxyFunctions(source: js.Function, target: Obj, bind: js.Function): Obj = js.native
  def createProxyFunctions(source: js.Function, target: Obj, bind: js.Function, fnNames: js.Array[String]): Obj = js.native
  def createProxyFunctions(source: js.Function, target: Obj, bind: js.Function, fnNames: js.Array[String], latebind: Boolean): Obj = js.native
  def curry(fn: js.Function): js.Function = js.native
  def defaults(opts: js.Any, defaultsList: Obj*): js.Any = js.native
  def deregAll(functions: js.Array[js.Function]): Unit = js.native
  def eq(comp: js.Any): Predicate[_] = js.native
  def filter[T](collection: js.Array[T], callback: js.Function2[/* t */ T, /* key */ js.UndefOr[Double], Boolean]): js.Array[T] = js.native
  def filter[T](collection: TypedMap[T], callback: js.Function2[/* t */ T, /* key */ js.UndefOr[String], Boolean]): TypedMap[T] = js.native
  def find[T](collection: js.Array[T], callback: Predicate[T]): T = js.native
  def find[T](collection: TypedMap[T], callback: Predicate[T]): T = js.native
  def flatten(arr: js.Array[_]): js.Any = js.native
  def flattenR(memo: js.Array[_], elem: js.Any): js.Any = js.native
  def fnToString(fn: IInjectable): js.Any = js.native
  def functionToString(fn: js.Function): js.Any = js.native
  def getParams(queryString: String): js.Any = js.native
  def hashLocationPlugin(router: typings.atUirouterCore.libRouterMod.UIRouter): LocationPlugin = js.native
  def identity(x: js.Any): js.Any = js.native
  def inherit(parent: Obj): js.Any = js.native
  def inherit(parent: Obj, extra: Obj): js.Any = js.native
  def invoke(fnName: String): js.Function = js.native
  def invoke(fnName: String, args: js.Array[_]): js.Function = js.native
  def is[T](ctor: Instantiable1[/* args (repeated) */ js.Any, T]): js.Function1[/* obj */ js.Any, /* is T */ Boolean] = js.native
  def isArray(arg: js.Any): /* is std.Array<any> */ Boolean = js.native
  def isDate(x: js.Any): /* is std.Date */ Boolean = js.native
  def isFunction(x: js.Any): /* is std.Function */ Boolean = js.native
  def isInjectable(`val`: js.Any): Boolean = js.native
  def isNull(o: js.Any): Boolean = js.native
  def isNumber(x: js.Any): /* is number */ Boolean = js.native
  def isObject(x: js.Any): Boolean = js.native
  def isPromise(x: js.Any): /* is std.Promise<any> */ Boolean = js.native
  def isRegExp(x: js.Any): /* is std.RegExp */ Boolean = js.native
  def isString(x: js.Any): /* is string */ Boolean = js.native
  def isUndefined(x: js.Any): Boolean = js.native
  def joinNeighborsR(acc: js.Array[_], x: js.Any): js.Array[_] = js.native
  def kebobString(camelCase: String): String = js.native
  def keyValsToObjectR(accum: js.Any, hasKeyVal: js.Tuple2[_, _]): js.Any = js.native
  def locationPluginFactory(name: String, isHtml5: Boolean, serviceClass: Anon_UiRouter, configurationClass: Anon_IsHtml5): js.Function1[/* uiRouter */ typings.atUirouterCore.libRouterMod.UIRouter, Anon_Configuration] = js.native
  def makeEvent(
    registry: IHookRegistry,
    transitionService: typings.atUirouterCore.libTransitionTransitionServiceMod.TransitionService,
    eventType: typings.atUirouterCore.libTransitionTransitionEventTypeMod.TransitionEventType
  ): js.Function3[
    /* matchObject */ js.Any, 
    /* callback */ js.Any, 
    /* options */ js.UndefOr[js.Object], 
    _
  ] = js.native
  def makeStub[T](service: String, methods: js.Array[String]): T = js.native
  def map[T, U](collection: js.Array[T], callback: Mapper[T, U]): js.Array[U] = js.native
  def map[T, U](
    collection: js.Array[T],
    callback: Mapper[T, U],
    target: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof collection */ js.Any
  ): js.Array[U] = js.native
  def map[T, U](collection: StringDictionary[T], callback: Mapper[T, U]): StringDictionary[U] = js.native
  def map[T, U](
    collection: StringDictionary[T],
    callback: Mapper[T, U],
    target: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof collection */ js.Any
  ): StringDictionary[U] = js.native
  def matchState(
    state: typings.atUirouterCore.libStateStateObjectMod.StateObject,
    criterion: HookMatchCriterion,
    transition: typings.atUirouterCore.libTransitionTransitionMod.Transition
  ): Boolean = js.native
  def maxLength(max: Double, str: String): String = js.native
  def memoryLocationPlugin(router: typings.atUirouterCore.libRouterMod.UIRouter): LocationPlugin = js.native
  def mergeR(memo: Obj, item: Obj): Obj = js.native
  def noop(): js.Any = js.native
  def not(fn: Predicate[_]): Predicate[_] = js.native
  def omit(obj: Obj, propNames: js.Array[String]): Obj = js.native
  def or(fn1: Predicate[_], fn2: Predicate[_]): Predicate[_] = js.native
  def padString(length: Double, str: String): String = js.native
  def pairs(obj: Obj): js.Array[js.Array[_]] = js.native
  def parse(name: String): js.Any = js.native
  def parseUrl(url: String): Anon_Hash = js.native
  def pattern(struct: js.Array[js.Array[js.Function]]): js.Function = js.native
  def pick(obj: Obj, propNames: js.Array[String]): Obj = js.native
  def pipe(funcs: js.Function*): js.Function1[/* obj */ js.Any, _] = js.native
  def pluck(collection: StringDictionary[js.Any], propName: String): StringDictionary[js.Any] = js.native
  def pluck[T](collection: js.Array[Obj], propName: String): js.Array[T] = js.native
  def prop(name: String): js.Function1[/* obj */ js.Any, _] = js.native
  def pushR(arr: js.Array[_], obj: js.Any): js.Array[_] = js.native
  def pushStateLocationPlugin(router: typings.atUirouterCore.libRouterMod.UIRouter): LocationPlugin = js.native
  def resolvablesBuilder(state: typings.atUirouterCore.libStateStateObjectMod.StateObject): js.Array[typings.atUirouterCore.libResolveResolvableMod.Resolvable] = js.native
  def servicesPlugin(router: typings.atUirouterCore.libRouterMod.UIRouter): ServicesPlugin = js.native
  def silenceUncaughtInPromise(promise: js.Promise[_]): js.Promise[_] = js.native
  def silentRejection(error: js.Any): js.Promise[_] = js.native
  def splitEqual(str: String): js.Array[String] = js.native
  def splitHash(str: String): js.Array[String] = js.native
  def splitOnDelim(delim: String): js.Function1[/* str */ String, js.Array[String]] = js.native
  def splitQuery(str: String): js.Array[String] = js.native
  def stringify(o: js.Any): String = js.native
  def stripLastPathElement(str: String): String = js.native
  def tail[T](arr: js.Array[T]): T = js.native
  def trimHashVal(str: String): String = js.native
  def uniqR[T](acc: js.Array[T], token: T): js.Array[T] = js.native
  def unnest(arr: js.Array[_]): js.Any = js.native
  def unnestR(memo: js.Array[_], elem: js.Array[_]): js.Array[_] = js.native
  def `val`[T](v: T): js.Function0[T] = js.native
  def values[T](obj: TypedMap[T]): js.Array[T] = js.native
  /**
    * Trace categories Enum
    *
    * Enable or disable a category using [[Trace.enable]] or [[Trace.disable]]
    *
    * `trace.enable(Category.TRANSITION)`
    *
    * These can also be provided using a matching string, or position ordinal
    *
    * `trace.enable("TRANSITION")`
    *
    * `trace.enable(1)`
    */
  @js.native
  object Category extends js.Object {
    /* 2 */ val HOOK: typings.atUirouterCore.libCommonTraceMod.Category.HOOK with Double = js.native
    /* 0 */ val RESOLVE: typings.atUirouterCore.libCommonTraceMod.Category.RESOLVE with Double = js.native
    /* 1 */ val TRANSITION: typings.atUirouterCore.libCommonTraceMod.Category.TRANSITION with Double = js.native
    /* 3 */ val UIVIEW: typings.atUirouterCore.libCommonTraceMod.Category.UIVIEW with Double = js.native
    /* 4 */ val VIEWCONFIG: typings.atUirouterCore.libCommonTraceMod.Category.VIEWCONFIG with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.atUirouterCore.libCommonTraceMod.Category with Double] = js.native
  }
  
  /** @internalapi */
  @js.native
  object DefType extends js.Object {
    /* 2 */ val CONFIG: typings.atUirouterCore.libParamsParamMod.DefType.CONFIG with Double = js.native
    /* 0 */ val PATH: typings.atUirouterCore.libParamsParamMod.DefType.PATH with Double = js.native
    /* 1 */ val SEARCH: typings.atUirouterCore.libParamsParamMod.DefType.SEARCH with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.atUirouterCore.libParamsParamMod.DefType with Double] = js.native
  }
  
  /* static members */
  @js.native
  object Glob extends js.Object {
    /** Returns a glob from the string, or null if the string isn't Glob-like */
    def fromString(text: String): typings.atUirouterCore.libCommonGlobMod.Glob = js.native
    /** Returns true if the string has glob-like characters in it */
    def is(text: String): Boolean = js.native
  }
  
  /* static members */
  @js.native
  object Param extends js.Object {
    /**
      * Finds [[Param]] objects which have different param values
      *
      * Filters a list of [[Param]] objects to only those whose parameter values differ in two param value objects
      *
      * @param params: The list of Param objects to filter
      * @param values1: The first set of parameter values
      * @param values2: the second set of parameter values
      *
      * @returns any Param objects whose values were different between values1 and values2
      */
    def changed(params: js.Array[typings.atUirouterCore.libParamsParamMod.Param]): js.Array[typings.atUirouterCore.libParamsParamMod.Param] = js.native
    def changed(params: js.Array[typings.atUirouterCore.libParamsParamMod.Param], values1: RawParams): js.Array[typings.atUirouterCore.libParamsParamMod.Param] = js.native
    def changed(
      params: js.Array[typings.atUirouterCore.libParamsParamMod.Param],
      values1: RawParams,
      values2: RawParams
    ): js.Array[typings.atUirouterCore.libParamsParamMod.Param] = js.native
    /**
      * Checks if two param value objects are equal (for a set of [[Param]] objects)
      *
      * @param params The list of [[Param]] objects to check
      * @param values1 The first set of param values
      * @param values2 The second set of param values
      *
      * @returns true if the param values in values1 and values2 are equal
      */
    def equals(params: js.Array[typings.atUirouterCore.libParamsParamMod.Param]): Boolean = js.native
    def equals(params: js.Array[typings.atUirouterCore.libParamsParamMod.Param], values1: js.Object): Boolean = js.native
    def equals(
      params: js.Array[typings.atUirouterCore.libParamsParamMod.Param],
      values1: js.Object,
      values2: js.Object
    ): Boolean = js.native
    /** Returns true if a the parameter values are valid, according to the Param definitions */
    def validates(params: js.Array[typings.atUirouterCore.libParamsParamMod.Param]): Boolean = js.native
    def validates(params: js.Array[typings.atUirouterCore.libParamsParamMod.Param], values: RawParams): Boolean = js.native
    def values(params: js.Array[typings.atUirouterCore.libParamsParamMod.Param]): RawParams = js.native
    def values(params: js.Array[typings.atUirouterCore.libParamsParamMod.Param], values: RawParams): RawParams = js.native
  }
  
  /* static members */
  @js.native
  object ParamTypes extends js.Object {
    /**
      * Built-in parameter type: `any`
      *
      * This parameter type is used by default for url-less parameters (parameters that do not appear in the URL).
      * This type does not encode or decode.
      * It is compared using a deep `equals` comparison.
      *
      * #### Example:
      * This example defines a non-url parameter on a [[StateDeclaration]].
      * ```js
      * .state({
      *   name: 'new',
      *   url: '/new',
      *   params: {
      *     inrepyto: null
      *   }
      * });
      * ```
      * ```js
      * $state.go('new', { inreplyto: currentMessage });
      * ```
      */
    var any: ParamTypeDefinition = js.native
    /**
      * Built-in parameter type: `bool`
      *
      * This parameter type serializes `true`/`false` as `1`/`0`
      *
      * #### Example:
      * ```js
      * .state({
      *   name: 'inbox',
      *   url: '/inbox?{unread:bool}'
      * });
      * ```
      * ```js
      * $state.go('inbox', { unread: true });
      * ```
      *
      * The URL will serialize to: `/inbox?unread=1`.
      *
      * Conversely, if the url is `/inbox?unread=0`, the value of the `unread` parameter will be a `false`.
      */
    var bool: ParamTypeDefinition = js.native
    /**
      * Built-in parameter type: `date`
      *
      * This parameter type can be used to serialize Javascript dates as parameter values.
      *
      * #### Example:
      * ```js
      * .state({
      *   name: 'search',
      *   url: '/search?{start:date}'
      * });
      * ```
      * ```js
      * $state.go('search', { start: new Date(2000, 0, 1) });
      * ```
      *
      * The URL will serialize to: `/search?start=2000-01-01`.
      *
      * Conversely, if the url is `/search?start=2016-12-25`, the value of the `start` parameter will be a `Date` object where:
      *
      * - `date.getFullYear() === 2016`
      * - `date.getMonth() === 11` (month is 0-based)
      * - `date.getDate() === 25`
      */
    var date: ParamTypeDefinition = js.native
    /**
      * Built-in parameter type: `hash`
      *
      * This parameter type is used for the `#` parameter (the hash)
      * It behaves the same as the [[string]] parameter type.
      */
    var hash: ParamTypeDefinition = js.native
    /**
      * Built-in parameter type: `int`
      *
      * This parameter type serializes javascript integers (`number`s which represent an integer) to the URL.
      *
      * #### Example:
      * ```js
      * .state({
      *   name: 'user',
      *   url: '/user/{id:int}'
      * });
      * ```
      * ```js
      * $state.go('user', { id: 1298547 });
      * ```
      *
      * The URL will serialize to: `/user/1298547`.
      *
      * When the parameter value is read, it will be the `number` `1298547`, not the string `"1298547"`.
      */
    var int: ParamTypeDefinition = js.native
    /**
      * Built-in parameter type: `json`
      *
      * This parameter type can be used to serialize javascript objects into the URL using JSON serialization.
      *
      * #### Example:
      * This example serializes an plain javascript object to the URL
      * ```js
      * .state({
      *   name: 'map',
      *   url: '/map/{coords:json}'
      * });
      * ```
      * ```js
      * $state.go('map', { coords: { x: 10399.2, y: 49071 });
      * ```
      *
      * The URL will serialize to: `/map/%7B%22x%22%3A10399.2%2C%22y%22%3A49071%7D`
      */
    var json: ParamTypeDefinition = js.native
    /**
      * Built-in parameter type: `path`
      *
      * This parameter type is the default type for path parameters.
      * A path parameter is any parameter declared in the path portion of a url
      *
      * - `/foo/:param1/:param2`: two path parameters
      *
      * This parameter type behaves exactly like the [[string]] type with one exception.
      * When matching parameter values in the URL, the `path` type does not match forward slashes `/`.
      *
      * #### Angular 1 note:
      * In ng1, this type is overridden with one that pre-encodes slashes as `~2F` instead of `%2F`.
      * For more details about this angular 1 behavior, see: https://github.com/angular-ui/ui-router/issues/2598
      */
    var path: ParamTypeDefinition = js.native
    /**
      * Built-in parameter type: `query`
      *
      * This parameter type is the default type for query/search parameters.
      * It behaves the same as the [[string]] parameter type.
      *
      * A query parameter is any parameter declared in the query/search portion of a url
      *
      * - `/bar?param2`: a query parameter
      */
    var query: ParamTypeDefinition = js.native
    /**
      * Built-in parameter type: `string`
      *
      * This parameter type coerces values to strings.
      * It matches anything (`new RegExp(".*")`) in the URL
      */
    var string: ParamTypeDefinition = js.native
  }
  
  /* static members */
  @js.native
  object PathNode extends js.Object {
    /**
      * Returns a clone of the PathNode
      * @deprecated use instance method `node.clone()`
      */
    def clone(node: typings.atUirouterCore.libPathPathNodeMod.PathNode): typings.atUirouterCore.libPathPathNodeMod.PathNode = js.native
  }
  
  /* static members */
  @js.native
  object PathUtils extends js.Object {
    /**
      * Creates ViewConfig objects and adds to nodes.
      *
      * On each [[PathNode]], creates ViewConfig objects from the views: property of the node's state
      */
    def applyViewConfigs(
      $view: typings.atUirouterCore.libViewViewMod.ViewService,
      path: js.Array[typings.atUirouterCore.libPathPathNodeMod.PathNode],
      states: js.Array[typings.atUirouterCore.libStateStateObjectMod.StateObject]
    ): Unit = js.native
    def buildPath(targetState: typings.atUirouterCore.libStateTargetStateMod.TargetState): js.Array[typings.atUirouterCore.libPathPathNodeMod.PathNode] = js.native
    /** Given a fromPath: PathNode[] and a TargetState, builds a toPath: PathNode[] */
    def buildToPath(
      fromPath: js.Array[typings.atUirouterCore.libPathPathNodeMod.PathNode],
      targetState: typings.atUirouterCore.libStateTargetStateMod.TargetState
    ): js.Array[typings.atUirouterCore.libPathPathNodeMod.PathNode] = js.native
    /**
      * Returns true if two paths are identical.
      *
      * @param pathA
      * @param pathB
      * @param paramsFn a function which returns the parameters to consider when comparing
      * @returns true if the the states and parameter values for both paths are identical
      */
    def equals(
      pathA: js.Array[typings.atUirouterCore.libPathPathNodeMod.PathNode],
      pathB: js.Array[typings.atUirouterCore.libPathPathNodeMod.PathNode]
    ): Boolean = js.native
    def equals(
      pathA: js.Array[typings.atUirouterCore.libPathPathNodeMod.PathNode],
      pathB: js.Array[typings.atUirouterCore.libPathPathNodeMod.PathNode],
      paramsFn: GetParamsFn
    ): Boolean = js.native
    /**
      * Given a fromPath and a toPath, returns a new to path which inherits parameters from the fromPath
      *
      * For a parameter in a node to be inherited from the from path:
      * - The toPath's node must have a matching node in the fromPath (by state).
      * - The parameter name must not be found in the toKeys parameter array.
      *
      * Note: the keys provided in toKeys are intended to be those param keys explicitly specified by some
      * caller, for instance, $state.transitionTo(..., toParams).  If a key was found in toParams,
      * it is not inherited from the fromPath.
      */
    def inheritParams(
      fromPath: js.Array[typings.atUirouterCore.libPathPathNodeMod.PathNode],
      toPath: js.Array[typings.atUirouterCore.libPathPathNodeMod.PathNode]
    ): js.Array[typings.atUirouterCore.libPathPathNodeMod.PathNode] = js.native
    def inheritParams(
      fromPath: js.Array[typings.atUirouterCore.libPathPathNodeMod.PathNode],
      toPath: js.Array[typings.atUirouterCore.libPathPathNodeMod.PathNode],
      toKeys: js.Array[String]
    ): js.Array[typings.atUirouterCore.libPathPathNodeMod.PathNode] = js.native
    /** Given a PathNode[], create an TargetState */
    def makeTargetState(
      registry: typings.atUirouterCore.libStateMod.StateRegistry,
      path: js.Array[typings.atUirouterCore.libPathPathNodeMod.PathNode]
    ): typings.atUirouterCore.libStateTargetStateMod.TargetState = js.native
    /**
      * Returns a new path which is: the subpath of the first path which matches the second path.
      *
      * The new path starts from root and contains any nodes that match the nodes in the second path.
      * It stops before the first non-matching node.
      *
      * Nodes are compared using their state property and their parameter values.
      * If a `paramsFn` is provided, only the [[Param]] returned by the function will be considered when comparing nodes.
      *
      * @param pathA the first path
      * @param pathB the second path
      * @param paramsFn a function which returns the parameters to consider when comparing
      *
      * @returns an array of PathNodes from the first path which match the nodes in the second path
      */
    def matching(
      pathA: js.Array[typings.atUirouterCore.libPathPathNodeMod.PathNode],
      pathB: js.Array[typings.atUirouterCore.libPathPathNodeMod.PathNode]
    ): js.Array[typings.atUirouterCore.libPathPathNodeMod.PathNode] = js.native
    def matching(
      pathA: js.Array[typings.atUirouterCore.libPathPathNodeMod.PathNode],
      pathB: js.Array[typings.atUirouterCore.libPathPathNodeMod.PathNode],
      paramsFn: GetParamsFn
    ): js.Array[typings.atUirouterCore.libPathPathNodeMod.PathNode] = js.native
    def nonDynamicParams(node: typings.atUirouterCore.libPathPathNodeMod.PathNode): js.Array[typings.atUirouterCore.libParamsParamMod.Param] = js.native
    /** Gets the raw parameter values from a path */
    def paramValues(path: js.Array[typings.atUirouterCore.libPathPathNodeMod.PathNode]): js.Object = js.native
    /**
      * Return a subpath of a path, which stops at the first matching node
      *
      * Given an array of nodes, returns a subset of the array starting from the first node,
      * stopping when the first node matches the predicate.
      *
      * @param path a path of [[PathNode]]s
      * @param predicate a [[Predicate]] fn that matches [[PathNode]]s
      * @returns a subpath up to the matching node, or undefined if no match is found
      */
    def subPath(
      path: js.Array[typings.atUirouterCore.libPathPathNodeMod.PathNode],
      predicate: Predicate[typings.atUirouterCore.libPathPathNodeMod.PathNode]
    ): js.Array[typings.atUirouterCore.libPathPathNodeMod.PathNode] = js.native
    /**
      * Computes the tree changes (entering, exiting) between a fromPath and toPath.
      */
    def treeChanges(
      fromPath: js.Array[typings.atUirouterCore.libPathPathNodeMod.PathNode],
      toPath: js.Array[typings.atUirouterCore.libPathPathNodeMod.PathNode],
      reloadState: typings.atUirouterCore.libStateStateObjectMod.StateObject
    ): TreeChanges = js.native
  }
  
  @js.native
  object RejectType extends js.Object {
    /* 3 */ val ABORTED: typings.atUirouterCore.libTransitionRejectFactoryMod.RejectType.ABORTED with Double = js.native
    /* 6 */ val ERROR: typings.atUirouterCore.libTransitionRejectFactoryMod.RejectType.ERROR with Double = js.native
    /* 5 */ val IGNORED: typings.atUirouterCore.libTransitionRejectFactoryMod.RejectType.IGNORED with Double = js.native
    /* 4 */ val INVALID: typings.atUirouterCore.libTransitionRejectFactoryMod.RejectType.INVALID with Double = js.native
    /* 2 */ val SUPERSEDED: typings.atUirouterCore.libTransitionRejectFactoryMod.RejectType.SUPERSEDED with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.atUirouterCore.libTransitionRejectFactoryMod.RejectType with Double] = js.native
  }
  
  /* static members */
  @js.native
  object Rejection extends js.Object {
    /** Returns a Rejection due to aborted transition */
    def aborted(): typings.atUirouterCore.libTransitionRejectFactoryMod.Rejection = js.native
    def aborted(detail: js.Any): typings.atUirouterCore.libTransitionRejectFactoryMod.Rejection = js.native
    /** Returns a Rejection due to aborted transition */
    def errored(): typings.atUirouterCore.libTransitionRejectFactoryMod.Rejection = js.native
    def errored(detail: js.Any): typings.atUirouterCore.libTransitionRejectFactoryMod.Rejection = js.native
    /** Returns a Rejection due to ignored transition */
    def ignored(): typings.atUirouterCore.libTransitionRejectFactoryMod.Rejection = js.native
    def ignored(detail: js.Any): typings.atUirouterCore.libTransitionRejectFactoryMod.Rejection = js.native
    /** Returns a Rejection due to invalid transition */
    def invalid(): typings.atUirouterCore.libTransitionRejectFactoryMod.Rejection = js.native
    def invalid(detail: js.Any): typings.atUirouterCore.libTransitionRejectFactoryMod.Rejection = js.native
    /** Returns true if the obj is a rejected promise created from the `asPromise` factory */
    def isRejectionPromise(obj: js.Any): Boolean = js.native
    /**
      * Returns a Rejection
      *
      * Normalizes a value as a Rejection.
      * If the value is already a Rejection, returns it.
      * Otherwise, wraps and returns the value as a Rejection (Rejection type: ERROR).
      *
      * @returns `detail` if it is already a `Rejection`, else returns an ERROR Rejection.
      */
    def normalize(): typings.atUirouterCore.libTransitionRejectFactoryMod.Rejection = js.native
    def normalize(detail: js.Any): typings.atUirouterCore.libTransitionRejectFactoryMod.Rejection = js.native
    def normalize(detail: typings.atUirouterCore.libTransitionRejectFactoryMod.Rejection): typings.atUirouterCore.libTransitionRejectFactoryMod.Rejection = js.native
    def normalize(detail: Error): typings.atUirouterCore.libTransitionRejectFactoryMod.Rejection = js.native
    /** Returns a Rejection due to redirected transition */
    def redirected(): typings.atUirouterCore.libTransitionRejectFactoryMod.Rejection = js.native
    def redirected(detail: js.Any): typings.atUirouterCore.libTransitionRejectFactoryMod.Rejection = js.native
    /** Returns a Rejection due to transition superseded */
    def superseded(): typings.atUirouterCore.libTransitionRejectFactoryMod.Rejection = js.native
    def superseded(detail: js.Any): typings.atUirouterCore.libTransitionRejectFactoryMod.Rejection = js.native
    def superseded(detail: js.Any, options: js.Any): typings.atUirouterCore.libTransitionRejectFactoryMod.Rejection = js.native
  }
  
  /* static members */
  @js.native
  object Resolvable extends js.Object {
    def fromData(token: js.Any, data: js.Any): typings.atUirouterCore.libResolveResolvableMod.Resolvable = js.native
  }
  
  /* static members */
  @js.native
  object StateObject extends js.Object {
    /**
      * Create a state object to put the private/internal implementation details onto.
      * The object's prototype chain looks like:
      * (Internal State Object) -> (Copy of State.prototype) -> (State Declaration object) -> (State Declaration's prototype...)
      *
      * @param stateDecl the user-supplied State Declaration
      * @returns {StateObject} an internal State object
      */
    def create(stateDecl: _StateDeclaration): typings.atUirouterCore.libStateStateObjectMod.StateObject = js.native
    /** Predicate which returns true if the object is an internal [[StateObject]] object */
    def isState(obj: js.Any): /* is @uirouter/core.@uirouter/core/lib/state/stateObject.StateObject */ Boolean = js.native
    /** Predicate which returns true if the object is an class with @State() decorator */
    def isStateClass(stateDecl: _StateDeclaration): Boolean = js.native
  }
  
  /* static members */
  @js.native
  object TargetState extends js.Object {
    /** Returns true if the object has a state property that might be a state or state name */
    def isDef(obj: js.Any): /* is @uirouter/core.@uirouter/core/lib/state/interface.TargetStateDef */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object Transition extends js.Object {
    /** @hidden */
    var diToken: TypeofClassTransition = js.native
  }
  
  /* static members */
  @js.native
  object TransitionHook extends js.Object {
    /**
      * These GetResultHandler(s) are used by [[invokeHook]] below
      * Each HookType chooses a GetResultHandler (See: [[TransitionService._defineCoreEvents]])
      */
    @JSName("HANDLE_RESULT")
    var HANDLE_RESULT_Original: GetResultHandler = js.native
    /**
      * These GetErrorHandler(s) are used by [[invokeHook]] below
      * Each HookType chooses a GetErrorHandler (See: [[TransitionService._defineCoreEvents]])
      */
    @JSName("LOG_ERROR")
    var LOG_ERROR_Original: GetErrorHandler = js.native
    /**
      * If the result is a promise rejection, log it.
      * Otherwise, ignore the result.
      */
    @JSName("LOG_REJECTED_RESULT")
    var LOG_REJECTED_RESULT_Original: GetResultHandler = js.native
    @JSName("REJECT_ERROR")
    var REJECT_ERROR_Original: GetErrorHandler = js.native
    @JSName("THROW_ERROR")
    var THROW_ERROR_Original: GetErrorHandler = js.native
    /**
      * These GetResultHandler(s) are used by [[invokeHook]] below
      * Each HookType chooses a GetResultHandler (See: [[TransitionService._defineCoreEvents]])
      */
    def HANDLE_RESULT(hook: typings.atUirouterCore.libTransitionTransitionHookMod.TransitionHook): ResultHandler = js.native
    /**
      * These GetErrorHandler(s) are used by [[invokeHook]] below
      * Each HookType chooses a GetErrorHandler (See: [[TransitionService._defineCoreEvents]])
      */
    def LOG_ERROR(hook: typings.atUirouterCore.libTransitionTransitionHookMod.TransitionHook): ErrorHandler = js.native
    /**
      * If the result is a promise rejection, log it.
      * Otherwise, ignore the result.
      */
    def LOG_REJECTED_RESULT(hook: typings.atUirouterCore.libTransitionTransitionHookMod.TransitionHook): ResultHandler = js.native
    def REJECT_ERROR(hook: typings.atUirouterCore.libTransitionTransitionHookMod.TransitionHook): ErrorHandler = js.native
    def THROW_ERROR(hook: typings.atUirouterCore.libTransitionTransitionHookMod.TransitionHook): ErrorHandler = js.native
    /**
      * Chains together an array of TransitionHooks.
      *
      * Given a list of [[TransitionHook]] objects, chains them together.
      * Each hook is invoked after the previous one completes.
      *
      * #### Example:
      * ```js
      * var hooks: TransitionHook[] = getHooks();
      * let promise: Promise<any> = TransitionHook.chain(hooks);
      *
      * promise.then(handleSuccess, handleError);
      * ```
      *
      * @param hooks the list of hooks to chain together
      * @param waitFor if provided, the chain is `.then()`'ed off this promise
      * @returns a `Promise` for sequentially invoking the hooks (in order)
      */
    def chain(hooks: js.Array[typings.atUirouterCore.libTransitionTransitionHookMod.TransitionHook]): js.Promise[_] = js.native
    def chain(
      hooks: js.Array[typings.atUirouterCore.libTransitionTransitionHookMod.TransitionHook],
      waitFor: js.Promise[_]
    ): js.Promise[_] = js.native
    /**
      * Invokes all the provided TransitionHooks, in order.
      * Each hook's return value is checked.
      * If any hook returns a promise, then the rest of the hooks are chained off that promise, and the promise is returned.
      * If no hook returns a promise, then all hooks are processed synchronously.
      *
      * @param hooks the list of TransitionHooks to invoke
      * @param doneCallback a callback that is invoked after all the hooks have successfully completed
      *
      * @returns a promise for the async result, or the result of the callback
      */
    def invokeHooks[T](
      hooks: js.Array[typings.atUirouterCore.libTransitionTransitionHookMod.TransitionHook],
      doneCallback: js.Function1[/* result */ js.UndefOr[HookResult], T]
    ): js.Promise[_] | T = js.native
    /**
      * Run all TransitionHooks, ignoring their return value.
      */
    def runAllHooks(hooks: js.Array[typings.atUirouterCore.libTransitionTransitionHookMod.TransitionHook]): Unit = js.native
  }
  
  @js.native
  object TransitionHookPhase extends js.Object {
    /* 1 */ val BEFORE: typings.atUirouterCore.libTransitionInterfaceMod.TransitionHookPhase.BEFORE with Double = js.native
    /* 0 */ val CREATE: typings.atUirouterCore.libTransitionInterfaceMod.TransitionHookPhase.CREATE with Double = js.native
    /* 4 */ val ERROR: typings.atUirouterCore.libTransitionInterfaceMod.TransitionHookPhase.ERROR with Double = js.native
    /* 2 */ val RUN: typings.atUirouterCore.libTransitionInterfaceMod.TransitionHookPhase.RUN with Double = js.native
    /* 3 */ val SUCCESS: typings.atUirouterCore.libTransitionInterfaceMod.TransitionHookPhase.SUCCESS with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.atUirouterCore.libTransitionInterfaceMod.TransitionHookPhase with Double] = js.native
  }
  
  @js.native
  object TransitionHookScope extends js.Object {
    /* 1 */ val STATE: typings.atUirouterCore.libTransitionInterfaceMod.TransitionHookScope.STATE with Double = js.native
    /* 0 */ val TRANSITION: typings.atUirouterCore.libTransitionInterfaceMod.TransitionHookScope.TRANSITION with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.atUirouterCore.libTransitionInterfaceMod.TransitionHookScope with Double] = js.native
  }
  
  /* static members */
  @js.native
  object UrlMatcher extends js.Object {
    /** @hidden */
    var nameValidator: RegExp = js.native
    /**
      * Compare two UrlMatchers
      *
      * This comparison function converts a UrlMatcher into static and dynamic path segments.
      * Each static path segment is a static string between a path separator (slash character).
      * Each dynamic segment is a path parameter.
      *
      * The comparison function sorts static segments before dynamic ones.
      */
    def compare(
      a: typings.atUirouterCore.libUrlUrlMatcherMod.UrlMatcher,
      b: typings.atUirouterCore.libUrlUrlMatcherMod.UrlMatcher
    ): Double = js.native
    /** @hidden */
    def encodeDashes(str: String): String = js.native
    /** @hidden Given a matcher, return an array with the matcher's path segments and path params, in order */
    def pathSegmentsAndParams(matcher: typings.atUirouterCore.libUrlUrlMatcherMod.UrlMatcher): js.Any = js.native
    /** @hidden Given a matcher, return an array with the matcher's query params */
    def queryParams(matcher: typings.atUirouterCore.libUrlUrlMatcherMod.UrlMatcher): js.Array[typings.atUirouterCore.libParamsParamMod.Param] = js.native
  }
  
  /* static members */
  @js.native
  object UrlRuleFactory extends js.Object {
    def isUrlRule(obj: js.Any): Boolean = js.native
  }
  
  /* static members */
  @js.native
  object ViewService extends js.Object {
    /**
      * Given a ui-view and a ViewConfig, determines if they "match".
      *
      * A ui-view has a fully qualified name (fqn) and a context object.  The fqn is built from its overall location in
      * the DOM, describing its nesting relationship to any parent ui-view tags it is nested inside of.
      *
      * A ViewConfig has a target ui-view name and a context anchor.  The ui-view name can be a simple name, or
      * can be a segmented ui-view path, describing a portion of a ui-view fqn.
      *
      * In order for a ui-view to match ViewConfig, ui-view's $type must match the ViewConfig's $type
      *
      * If the ViewConfig's target ui-view name is a simple name (no dots), then a ui-view matches if:
      * - the ui-view's name matches the ViewConfig's target name
      * - the ui-view's context matches the ViewConfig's anchor
      *
      * If the ViewConfig's target ui-view name is a segmented name (with dots), then a ui-view matches if:
      * - There exists a parent ui-view where:
      *    - the parent ui-view's name matches the first segment (index 0) of the ViewConfig's target name
      *    - the parent ui-view's context matches the ViewConfig's anchor
      * - And the remaining segments (index 1..n) of the ViewConfig's target name match the tail of the ui-view's fqn
      *
      * Example:
      *
      * DOM:
      * <ui-view>                        <!-- created in the root context (name: "") -->
      *   <ui-view name="foo">                <!-- created in the context named: "A"      -->
      *     <ui-view>                    <!-- created in the context named: "A.B"    -->
      *       <ui-view name="bar">            <!-- created in the context named: "A.B.C"  -->
      *       </ui-view>
      *     </ui-view>
      *   </ui-view>
      * </ui-view>
      *
      * uiViews: [
      *  { fqn: "$default",                  creationContext: { name: "" } },
      *  { fqn: "$default.foo",              creationContext: { name: "A" } },
      *  { fqn: "$default.foo.$default",     creationContext: { name: "A.B" } }
      *  { fqn: "$default.foo.$default.bar", creationContext: { name: "A.B.C" } }
      * ]
      *
      * These four view configs all match the ui-view with the fqn: "$default.foo.$default.bar":
      *
      * - ViewConfig1: { uiViewName: "bar",                       uiViewContextAnchor: "A.B.C" }
      * - ViewConfig2: { uiViewName: "$default.bar",              uiViewContextAnchor: "A.B" }
      * - ViewConfig3: { uiViewName: "foo.$default.bar",          uiViewContextAnchor: "A" }
      * - ViewConfig4: { uiViewName: "$default.foo.$default.bar", uiViewContextAnchor: "" }
      *
      * Using ViewConfig3 as an example, it matches the ui-view with fqn "$default.foo.$default.bar" because:
      * - The ViewConfig's segmented target name is: [ "foo", "$default", "bar" ]
      * - There exists a parent ui-view (which has fqn: "$default.foo") where:
      *    - the parent ui-view's name "foo" matches the first segment "foo" of the ViewConfig's target name
      *    - the parent ui-view's context "A" matches the ViewConfig's anchor context "A"
      * - And the remaining segments [ "$default", "bar" ].join("."_ of the ViewConfig's target name match
      *   the tail of the ui-view's fqn "default.bar"
      *
      * @internalapi
      */
    def matches(uiViewsByFqn: TypedMap[ActiveUIView], uiView: ActiveUIView): js.Function1[/* viewConfig */ ViewConfig, Boolean] = js.native
    /**
      * Normalizes a view's name from a state.views configuration block.
      *
      * This should be used by a framework implementation to calculate the values for
      * [[_ViewDeclaration.$uiViewName]] and [[_ViewDeclaration.$uiViewContextAnchor]].
      *
      * @param context the context object (state declaration) that the view belongs to
      * @param rawViewName the name of the view, as declared in the [[StateDeclaration.views]]
      *
      * @returns the normalized uiViewName and uiViewContextAnchor that the view targets
      */
    def normalizeUIViewTarget(context: ViewContext): Anon_UiViewContextAnchor = js.native
    def normalizeUIViewTarget(context: ViewContext, rawViewName: String): Anon_UiViewContextAnchor = js.native
  }
  
  @js.native
  object extend extends js.Object {
    def apply(target: js.Object, sources: js.Any*): js.Any = js.native
    def apply[T, U](target: T, source: U): T with U = js.native
    def apply[T, U, V](target: T, source1: U, source2: V): T with U with V = js.native
    def apply[T, U, V, W](target: T, source1: U, source2: V, source3: W): T with U with V with W = js.native
  }
  
  @js.native
  object inArray extends js.Object {
    def apply(array: js.Array[_]): js.Function1[/* obj */ js.Any, Boolean] = js.native
    def apply(array: js.Array[_], obj: js.Any): Boolean = js.native
  }
  
  @js.native
  object pushTo extends js.Object {
    def apply[T](arr: js.Array[T]): js.Function1[/* val */ T, T] = js.native
    def apply[T](arr: js.Array[T], `val`: T): T = js.native
  }
  
  @js.native
  object removeFrom extends js.Object {
    def apply[T](array: js.Array[T]): js.Function1[/* obj */ T, js.Array[T]] = js.native
    def apply[T](array: js.Array[T], obj: T): js.Array[T] = js.native
  }
  
  @js.native
  object resolvePolicies extends js.Object {
    var async: Anon_NOWAIT = js.native
    var when: Anon_EAGER = js.native
  }
  
}

