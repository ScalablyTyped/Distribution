package typings
package atUirouterAngularjsLib.atUirouterAngularjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uirouter/angularjs", "core")
@js.native
object coreNs extends js.Object {
  @js.native
  abstract class BaseLocationServices protected ()
    extends atUirouterCoreLib.atUirouterCoreMod.BaseLocationServices {
    def this(router: atUirouterCoreLib.libRouterMod.UIRouter, fireAfterUpdate: scala.Boolean) = this()
  }
  
  @js.native
  class BaseUrlRule protected ()
    extends atUirouterCoreLib.atUirouterCoreMod.BaseUrlRule {
    def this(`match`: atUirouterCoreLib.libUrlInterfaceMod.UrlRuleMatchFn) = this()
    def this(`match`: atUirouterCoreLib.libUrlInterfaceMod.UrlRuleMatchFn, handler: atUirouterCoreLib.libUrlInterfaceMod.UrlRuleHandlerFn) = this()
  }
  
  @js.native
  class BrowserLocationConfig ()
    extends atUirouterCoreLib.atUirouterCoreMod.BrowserLocationConfig {
    def this(router: js.Any) = this()
    def this(router: js.Any, _isHtml5: scala.Boolean) = this()
  }
  
  @js.native
  class Glob protected ()
    extends atUirouterCoreLib.atUirouterCoreMod.Glob {
    def this(text: java.lang.String) = this()
  }
  
  @js.native
  class HashLocationService protected ()
    extends atUirouterCoreLib.atUirouterCoreMod.HashLocationService {
    def this(router: atUirouterCoreLib.libRouterMod.UIRouter) = this()
  }
  
  @js.native
  class HookBuilder protected ()
    extends atUirouterCoreLib.atUirouterCoreMod.HookBuilder {
    def this(transition: atUirouterCoreLib.libTransitionTransitionMod.Transition) = this()
  }
  
  @js.native
  class MemoryLocationConfig ()
    extends atUirouterCoreLib.atUirouterCoreMod.MemoryLocationConfig
  
  @js.native
  class MemoryLocationService protected ()
    extends atUirouterCoreLib.atUirouterCoreMod.MemoryLocationService {
    def this(router: atUirouterCoreLib.libRouterMod.UIRouter) = this()
  }
  
  @js.native
  class Param protected ()
    extends atUirouterCoreLib.atUirouterCoreMod.Param {
    def this(id: java.lang.String, `type`: atUirouterCoreLib.libParamsParamTypeMod.ParamType, location: atUirouterCoreLib.libParamsParamMod.DefType, urlConfig: atUirouterCoreLib.libUrlMod.UrlConfig, state: atUirouterCoreLib.libStateInterfaceMod.StateDeclaration) = this()
  }
  
  @js.native
  class ParamFactory protected ()
    extends atUirouterCoreLib.atUirouterCoreMod.ParamFactory {
    def this(router: atUirouterCoreLib.libRouterMod.UIRouter) = this()
  }
  
  @js.native
  class ParamType protected ()
    extends atUirouterCoreLib.atUirouterCoreMod.ParamType {
    /**
      * @param def  A configuration object which contains the custom type definition.  The object's
      *        properties will override the default methods and/or pattern in `ParamType`'s public interface.
      * @returns a new ParamType object
      */
    def this(`def`: atUirouterCoreLib.libParamsInterfaceMod.ParamTypeDefinition) = this()
  }
  
  @js.native
  /** @internalapi */
  class ParamTypes ()
    extends atUirouterCoreLib.atUirouterCoreMod.ParamTypes
  
  @js.native
  class PathNode protected ()
    extends atUirouterCoreLib.atUirouterCoreMod.PathNode {
    /** Creates a copy of a PathNode */
    def this(node: atUirouterCoreLib.libPathPathNodeMod.PathNode) = this()
    /** Creates a new (empty) PathNode for a State */
    def this(state: atUirouterCoreLib.libStateStateObjectMod.StateObject) = this()
  }
  
  @js.native
  class PathUtils ()
    extends atUirouterCoreLib.atUirouterCoreMod.PathUtils
  
  @js.native
  class PushStateLocationService protected ()
    extends atUirouterCoreLib.atUirouterCoreMod.PushStateLocationService {
    def this(router: atUirouterCoreLib.libRouterMod.UIRouter) = this()
  }
  
  @js.native
  class Queue[T] ()
    extends atUirouterCoreLib.atUirouterCoreMod.Queue[T] {
    def this(_items: js.Array[T]) = this()
    def this(_items: js.Array[T], _limit: scala.Double) = this()
  }
  
  @js.native
  class RegisteredHook protected ()
    extends atUirouterCoreLib.atUirouterCoreMod.RegisteredHook {
    def this(tranSvc: atUirouterCoreLib.libTransitionTransitionServiceMod.TransitionService, eventType: atUirouterCoreLib.libTransitionTransitionEventTypeMod.TransitionEventType, callback: atUirouterCoreLib.libTransitionInterfaceMod.HookFn, matchCriteria: atUirouterCoreLib.libTransitionInterfaceMod.HookMatchCriteria, removeHookFromRegistry: js.Function1[
          /* hook */ atUirouterCoreLib.libTransitionHookRegistryMod.RegisteredHook, 
          scala.Unit
        ]) = this()
    def this(tranSvc: atUirouterCoreLib.libTransitionTransitionServiceMod.TransitionService, eventType: atUirouterCoreLib.libTransitionTransitionEventTypeMod.TransitionEventType, callback: atUirouterCoreLib.libTransitionInterfaceMod.HookFn, matchCriteria: atUirouterCoreLib.libTransitionInterfaceMod.HookMatchCriteria, removeHookFromRegistry: js.Function1[
          /* hook */ atUirouterCoreLib.libTransitionHookRegistryMod.RegisteredHook, 
          scala.Unit
        ], options: atUirouterCoreLib.libTransitionInterfaceMod.HookRegOptions) = this()
  }
  
  @js.native
  class Rejection protected ()
    extends atUirouterCoreLib.atUirouterCoreMod.Rejection {
    def this(`type`: scala.Double) = this()
    def this(`type`: scala.Double, message: java.lang.String) = this()
    def this(`type`: scala.Double, message: java.lang.String, detail: js.Any) = this()
  }
  
  @js.native
  class Resolvable protected ()
    extends atUirouterCoreLib.atUirouterCoreMod.Resolvable {
    /** This constructor creates a new Resolvable from the plain old [[ResolvableLiteral]] javascript object */
    def this(resolvable: atUirouterCoreLib.libResolveInterfaceMod.ResolvableLiteral) = this()
    /** This constructor creates a Resolvable copy */
    def this(resolvable: atUirouterCoreLib.libResolveResolvableMod.Resolvable) = this()
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
    def this(token: js.Any, resolveFn: js.Function, deps: js.Array[_], policy: atUirouterCoreLib.libResolveInterfaceMod.ResolvePolicy) = this()
    def this(token: js.Any, resolveFn: js.Function, deps: js.Array[_], policy: atUirouterCoreLib.libResolveInterfaceMod.ResolvePolicy, data: js.Any) = this()
  }
  
  @js.native
  class ResolveContext protected ()
    extends atUirouterCoreLib.atUirouterCoreMod.ResolveContext {
    def this(_path: js.Array[atUirouterCoreLib.libPathPathNodeMod.PathNode]) = this()
  }
  
  @js.native
  class StateBuilder protected ()
    extends atUirouterCoreLib.atUirouterCoreMod.StateBuilder {
    def this(matcher: atUirouterCoreLib.libStateStateMatcherMod.StateMatcher, urlMatcherFactory: atUirouterCoreLib.libUrlUrlMatcherFactoryMod.UrlMatcherFactory) = this()
  }
  
  @js.native
  class StateMatcher protected ()
    extends atUirouterCoreLib.atUirouterCoreMod.StateMatcher {
    def this(_states: org.scalablytyped.runtime.StringDictionary[atUirouterCoreLib.libStateStateObjectMod.StateObject]) = this()
  }
  
  @js.native
  /** @deprecated use State.create() */
  class StateObject ()
    extends atUirouterCoreLib.atUirouterCoreMod.StateObject {
    def this(config: atUirouterCoreLib.libStateInterfaceMod.StateDeclaration) = this()
  }
  
  @js.native
  class StateParams ()
    extends atUirouterCoreLib.atUirouterCoreMod.StateParams {
    def this(params: atUirouterCoreLib.libCommonCommonMod.Obj) = this()
  }
  
  @js.native
  class StateQueueManager protected ()
    extends atUirouterCoreLib.atUirouterCoreMod.StateQueueManager {
    def this(router: atUirouterCoreLib.libRouterMod.UIRouter, states: org.scalablytyped.runtime.StringDictionary[atUirouterCoreLib.libStateStateObjectMod.StateObject], builder: atUirouterCoreLib.libStateStateBuilderMod.StateBuilder, listeners: js.Array[atUirouterCoreLib.libStateStateRegistryMod.StateRegistryListener]) = this()
  }
  
  @js.native
  class StateRegistry protected ()
    extends atUirouterCoreLib.atUirouterCoreMod.StateRegistry {
    /** @internalapi */
    def this(router: atUirouterCoreLib.libRouterMod.UIRouter) = this()
  }
  
  @js.native
  class StateService protected ()
    extends atUirouterCoreLib.atUirouterCoreMod.StateService {
    /** @internalapi */
    def this(/** @hidden */ router: atUirouterCoreLib.libRouterMod.UIRouter) = this()
  }
  
  @js.native
  class TargetState protected ()
    extends atUirouterCoreLib.atUirouterCoreMod.TargetState {
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
    def this(_stateRegistry: atUirouterCoreLib.libStateStateRegistryMod.StateRegistry, _identifier: atUirouterCoreLib.libStateInterfaceMod.StateOrName) = this()
    def this(_stateRegistry: atUirouterCoreLib.libStateStateRegistryMod.StateRegistry, _identifier: atUirouterCoreLib.libStateInterfaceMod.StateOrName, _params: atUirouterCoreLib.libParamsInterfaceMod.RawParams) = this()
    def this(_stateRegistry: atUirouterCoreLib.libStateStateRegistryMod.StateRegistry, _identifier: atUirouterCoreLib.libStateInterfaceMod.StateOrName, _params: atUirouterCoreLib.libParamsInterfaceMod.RawParams, _options: atUirouterCoreLib.libTransitionInterfaceMod.TransitionOptions) = this()
  }
  
  @js.native
  /** @hidden */
  class Trace ()
    extends atUirouterCoreLib.atUirouterCoreMod.Trace
  
  @js.native
  class Transition protected ()
    extends atUirouterCoreLib.atUirouterCoreMod.Transition {
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
    def this(fromPath: js.Array[atUirouterCoreLib.libPathPathNodeMod.PathNode], targetState: atUirouterCoreLib.libStateTargetStateMod.TargetState, router: atUirouterCoreLib.libRouterMod.UIRouter) = this()
  }
  
  @js.native
  class TransitionEventType protected ()
    extends atUirouterCoreLib.atUirouterCoreMod.TransitionEventType {
    def this(name: java.lang.String, hookPhase: atUirouterCoreLib.libTransitionInterfaceMod.TransitionHookPhase, hookOrder: scala.Double, criteriaMatchPath: atUirouterCoreLib.libTransitionInterfaceMod.PathType) = this()
    def this(name: java.lang.String, hookPhase: atUirouterCoreLib.libTransitionInterfaceMod.TransitionHookPhase, hookOrder: scala.Double, criteriaMatchPath: atUirouterCoreLib.libTransitionInterfaceMod.PathType, reverseSort: scala.Boolean) = this()
    def this(name: java.lang.String, hookPhase: atUirouterCoreLib.libTransitionInterfaceMod.TransitionHookPhase, hookOrder: scala.Double, criteriaMatchPath: atUirouterCoreLib.libTransitionInterfaceMod.PathType, reverseSort: scala.Boolean, getResultHandler: atUirouterCoreLib.libTransitionTransitionHookMod.GetResultHandler) = this()
    def this(name: java.lang.String, hookPhase: atUirouterCoreLib.libTransitionInterfaceMod.TransitionHookPhase, hookOrder: scala.Double, criteriaMatchPath: atUirouterCoreLib.libTransitionInterfaceMod.PathType, reverseSort: scala.Boolean, getResultHandler: atUirouterCoreLib.libTransitionTransitionHookMod.GetResultHandler, getErrorHandler: atUirouterCoreLib.libTransitionTransitionHookMod.GetErrorHandler) = this()
    def this(name: java.lang.String, hookPhase: atUirouterCoreLib.libTransitionInterfaceMod.TransitionHookPhase, hookOrder: scala.Double, criteriaMatchPath: atUirouterCoreLib.libTransitionInterfaceMod.PathType, reverseSort: scala.Boolean, getResultHandler: atUirouterCoreLib.libTransitionTransitionHookMod.GetResultHandler, getErrorHandler: atUirouterCoreLib.libTransitionTransitionHookMod.GetErrorHandler, synchronous: scala.Boolean) = this()
  }
  
  @js.native
  class TransitionHook protected ()
    extends atUirouterCoreLib.atUirouterCoreMod.TransitionHook {
    def this(transition: atUirouterCoreLib.libTransitionTransitionMod.Transition, stateContext: atUirouterCoreLib.libStateInterfaceMod.StateDeclaration, registeredHook: atUirouterCoreLib.libTransitionHookRegistryMod.RegisteredHook, options: atUirouterCoreLib.libTransitionInterfaceMod.TransitionHookOptions) = this()
  }
  
  @js.native
  class TransitionService protected ()
    extends atUirouterCoreLib.atUirouterCoreMod.TransitionService {
    /** @hidden */
    def this(_router: atUirouterCoreLib.libRouterMod.UIRouter) = this()
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
    extends atUirouterCoreLib.atUirouterCoreMod.UIRouter {
    def this(locationService: atUirouterCoreLib.libCommonCoreservicesMod.LocationServices) = this()
    def this(locationService: atUirouterCoreLib.libCommonCoreservicesMod.LocationServices, locationConfig: atUirouterCoreLib.libCommonCoreservicesMod.LocationConfig) = this()
  }
  
  @js.native
  class UIRouterGlobals ()
    extends atUirouterCoreLib.atUirouterCoreMod.UIRouterGlobals
  
  @js.native
  abstract class UIRouterPluginBase ()
    extends atUirouterCoreLib.atUirouterCoreMod.UIRouterPluginBase
  
  @js.native
  class UrlConfig protected ()
    extends atUirouterCoreLib.atUirouterCoreMod.UrlConfig {
    /** @hidden */ def this(/** @hidden */ router: atUirouterCoreLib.libRouterMod.UIRouter) = this()
  }
  
  @js.native
  class UrlMatcher protected ()
    extends atUirouterCoreLib.atUirouterCoreMod.UrlMatcher {
    /**
      * @param pattern The pattern to compile into a matcher.
      * @param paramTypes The [[ParamTypes]] registry
      * @param paramFactory A [[ParamFactory]] object
      * @param config  A [[UrlMatcherCompileConfig]] configuration object
      */
    def this(pattern: java.lang.String, paramTypes: atUirouterCoreLib.libParamsParamTypesMod.ParamTypes, paramFactory: atUirouterCoreLib.libUrlUrlMatcherFactoryMod.ParamFactory) = this()
    def this(pattern: java.lang.String, paramTypes: atUirouterCoreLib.libParamsParamTypesMod.ParamTypes, paramFactory: atUirouterCoreLib.libUrlUrlMatcherFactoryMod.ParamFactory, config: atUirouterCoreLib.libUrlInterfaceMod.UrlMatcherCompileConfig) = this()
  }
  
  @js.native
  class UrlMatcherFactory protected ()
    extends atUirouterCoreLib.atUirouterCoreMod.UrlMatcherFactory {
    def this(/** @hidden */ router: atUirouterCoreLib.libRouterMod.UIRouter) = this()
  }
  
  @js.native
  class UrlRouter protected ()
    extends atUirouterCoreLib.atUirouterCoreMod.UrlRouter {
    /** @hidden */
    def this(/** @hidden */ router: atUirouterCoreLib.libRouterMod.UIRouter) = this()
  }
  
  @js.native
  class UrlRuleFactory protected ()
    extends atUirouterCoreLib.atUirouterCoreMod.UrlRuleFactory {
    def this(router: atUirouterCoreLib.libRouterMod.UIRouter) = this()
  }
  
  @js.native
  class UrlRules protected ()
    extends atUirouterCoreLib.atUirouterCoreMod.UrlRules {
    /** @hidden */
    def this(/** @hidden */ router: atUirouterCoreLib.libRouterMod.UIRouter) = this()
  }
  
  @js.native
  class UrlService protected ()
    extends atUirouterCoreLib.atUirouterCoreMod.UrlService {
    /** @hidden */
    def this(/** @hidden */ router: atUirouterCoreLib.libRouterMod.UIRouter) = this()
  }
  
  @js.native
  class ViewService protected ()
    extends atUirouterCoreLib.atUirouterCoreMod.ViewService {
    /** @hidden */
    def this(/** @hidden */ router: atUirouterCoreLib.libRouterMod.UIRouter) = this()
  }
  
  @JSName("$injector")
  val $injector: atUirouterCoreLib.libCommonCoreservicesMod.$InjectorLike = js.native
  @JSName("$q")
  val $q: atUirouterCoreLib.libCommonCoreservicesMod.$QLike = js.native
  val NATIVE_INJECTOR_TOKEN: java.lang.String = js.native
  var defaultResolvePolicy: atUirouterCoreLib.libResolveInterfaceMod.ResolvePolicy = js.native
  var defaultTransOpts: atUirouterCoreLib.libTransitionInterfaceMod.TransitionOptions = js.native
  @JSName("equals")
  val equals_FcoreNs: js.Any = js.native
  val forEach: js.Any = js.native
  val fromJson: js.Any = js.native
  val hostRegex: stdLib.RegExp = js.native
  val isDefined: atUirouterCoreLib.libCommonCommonMod.Predicate[js.Any] = js.native
  val isNullOrUndefined: atUirouterCoreLib.libCommonCommonMod.Predicate[js.Any] = js.native
  var mapObj: js.Function3[
    /* collection */ org.scalablytyped.runtime.StringDictionary[js.Any], 
    /* callback */ atUirouterCoreLib.libCommonCommonMod.Mapper[js.Any, js.Any], 
    /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof collection */ /* target */ js.UndefOr[
      /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof collection */ js.Any
    ], 
    org.scalablytyped.runtime.StringDictionary[js.Any]
  ] = js.native
  val propEq: js.Function = js.native
  val root: js.Any = js.native
  val services: atUirouterCoreLib.libCommonCoreservicesMod.CoreServices = js.native
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
  val trace: atUirouterCoreLib.libCommonTraceMod.Trace = js.native
  def _extend(
    toObj: atUirouterCoreLib.libCommonCommonMod.Obj,
    fromObjs: atUirouterCoreLib.libCommonCommonMod.Obj*
  ): js.Any = js.native
  def _inArray(array: js.Array[_]): js.Function1[/* obj */ js.Any, scala.Boolean] = js.native
  def _inArray(array: js.Array[_], obj: js.Any): scala.Boolean = js.native
  def _pushTo[T](arr: js.Array[T]): js.Function1[/* val */ T, T] = js.native
  def _pushTo[T](arr: js.Array[T], `val`: T): T = js.native
  def _removeFrom[T](array: js.Array[T]): js.Function1[/* obj */ T, js.Array[T]] = js.native
  def _removeFrom[T](array: js.Array[T], obj: T): js.Array[T] = js.native
  def all(fn1: atUirouterCoreLib.libCommonCommonMod.Predicate[_]): js.Function1[/* arr */ js.Array[_], scala.Boolean] = js.native
  def allTrueR(memo: scala.Boolean, elem: js.Any): js.Any = js.native
  def ancestors(
    first: atUirouterCoreLib.libStateStateObjectMod.StateObject,
    second: atUirouterCoreLib.libStateStateObjectMod.StateObject
  ): js.Array[atUirouterCoreLib.libStateStateObjectMod.StateObject] = js.native
  def and(
    fn1: atUirouterCoreLib.libCommonCommonMod.Predicate[_],
    fn2: atUirouterCoreLib.libCommonCommonMod.Predicate[_]
  ): atUirouterCoreLib.libCommonCommonMod.Predicate[_] = js.native
  def any(fn1: atUirouterCoreLib.libCommonCommonMod.Predicate[_]): js.Function1[/* arr */ js.Array[_], scala.Boolean] = js.native
  def anyTrueR(memo: scala.Boolean, elem: js.Any): js.Any = js.native
  def applyPairs(memo: atUirouterCoreLib.libCommonCommonMod.TypedMap[_], keyValTuple: js.Array[_]): atUirouterCoreLib.libCommonCommonMod.TypedMap[_] = js.native
  def arrayTuples(args: js.Any*): js.Array[_] = js.native
  def assertFn(predicateOrMap: js.Function): js.Any = js.native
  def assertFn(predicateOrMap: js.Function, errMsg: java.lang.String): js.Any = js.native
  def assertFn(predicateOrMap: js.Function, errMsg: js.Function): js.Any = js.native
  def assertMap[T, U](mapFn: js.Function1[/* t */ T, U], errMsg: java.lang.String): js.Function1[/* t */ T, U] = js.native
  def assertMap[T, U](mapFn: js.Function1[/* t */ T, U], errMsg: js.Function): js.Function1[/* t */ T, U] = js.native
  def assertPredicate[T](predicate: atUirouterCoreLib.libCommonCommonMod.Predicate[T], errMsg: java.lang.String): atUirouterCoreLib.libCommonCommonMod.Predicate[T] = js.native
  def assertPredicate[T](predicate: atUirouterCoreLib.libCommonCommonMod.Predicate[T], errMsg: js.Function): atUirouterCoreLib.libCommonCommonMod.Predicate[T] = js.native
  def beforeAfterSubstr(char: java.lang.String): js.Function1[/* str */ java.lang.String, js.Array[java.lang.String]] = js.native
  def buildUrl(loc: atUirouterCoreLib.libCommonCoreservicesMod.LocationServices): java.lang.String = js.native
  def compose(): js.Function0[_] = js.native
  def copy(src: atUirouterCoreLib.libCommonCommonMod.Obj): atUirouterCoreLib.libCommonCommonMod.Obj = js.native
  def copy(src: atUirouterCoreLib.libCommonCommonMod.Obj, dest: atUirouterCoreLib.libCommonCommonMod.Obj): atUirouterCoreLib.libCommonCommonMod.Obj = js.native
  def createProxyFunctions(source: js.Function, target: atUirouterCoreLib.libCommonCommonMod.Obj, bind: js.Function): atUirouterCoreLib.libCommonCommonMod.Obj = js.native
  def createProxyFunctions(
    source: js.Function,
    target: atUirouterCoreLib.libCommonCommonMod.Obj,
    bind: js.Function,
    fnNames: js.Array[java.lang.String]
  ): atUirouterCoreLib.libCommonCommonMod.Obj = js.native
  def createProxyFunctions(
    source: js.Function,
    target: atUirouterCoreLib.libCommonCommonMod.Obj,
    bind: js.Function,
    fnNames: js.Array[java.lang.String],
    latebind: scala.Boolean
  ): atUirouterCoreLib.libCommonCommonMod.Obj = js.native
  def curry(fn: js.Function): js.Function = js.native
  def defaults(opts: js.Any, defaultsList: atUirouterCoreLib.libCommonCommonMod.Obj*): js.Any = js.native
  def deregAll(functions: js.Array[js.Function]): scala.Unit = js.native
  def eq(comp: js.Any): atUirouterCoreLib.libCommonCommonMod.Predicate[_] = js.native
  def filter[T](
    collection: atUirouterCoreLib.libCommonCommonMod.TypedMap[T],
    callback: js.Function2[/* t */ T, /* key */ js.UndefOr[java.lang.String], scala.Boolean]
  ): atUirouterCoreLib.libCommonCommonMod.TypedMap[T] = js.native
  def filter[T](
    collection: js.Array[T],
    callback: js.Function2[/* t */ T, /* key */ js.UndefOr[scala.Double], scala.Boolean]
  ): js.Array[T] = js.native
  def find[T](
    collection: atUirouterCoreLib.libCommonCommonMod.TypedMap[T],
    callback: atUirouterCoreLib.libCommonCommonMod.Predicate[T]
  ): T = js.native
  def find[T](collection: js.Array[T], callback: atUirouterCoreLib.libCommonCommonMod.Predicate[T]): T = js.native
  def flatten(arr: js.Array[_]): js.Any = js.native
  def flattenR(memo: js.Array[_], elem: js.Any): js.Any = js.native
  def fnToString(fn: atUirouterCoreLib.libCommonCommonMod.IInjectable): js.Any = js.native
  def functionToString(fn: js.Function): js.Any = js.native
  def getParams(queryString: java.lang.String): js.Any = js.native
  def hashLocationPlugin(router: atUirouterCoreLib.libRouterMod.UIRouter): atUirouterCoreLib.libVanillaInterfaceMod.LocationPlugin = js.native
  def identity(x: js.Any): js.Any = js.native
  def inherit(parent: atUirouterCoreLib.libCommonCommonMod.Obj): js.Any = js.native
  def inherit(parent: atUirouterCoreLib.libCommonCommonMod.Obj, extra: atUirouterCoreLib.libCommonCommonMod.Obj): js.Any = js.native
  def invoke(fnName: java.lang.String): js.Function = js.native
  def invoke(fnName: java.lang.String, args: js.Array[_]): js.Function = js.native
  def is[T](ctor: org.scalablytyped.runtime.Instantiable1[/* args (repeated) */ js.Any, T]): js.Function1[/* obj */ js.Any, /* is T */ scala.Boolean] = js.native
  def isArray(arg: js.Any): /* is std.Array<any> */ scala.Boolean = js.native
  def isDate(x: js.Any): /* is std.Date */ scala.Boolean = js.native
  def isFunction(x: js.Any): /* is std.Function */ scala.Boolean = js.native
  def isInjectable(`val`: js.Any): scala.Boolean = js.native
  def isNull(o: js.Any): scala.Boolean = js.native
  def isNumber(x: js.Any): /* is number */ scala.Boolean = js.native
  def isObject(x: js.Any): scala.Boolean = js.native
  def isPromise(x: js.Any): /* is std.Promise<any> */ scala.Boolean = js.native
  def isRegExp(x: js.Any): /* is std.RegExp */ scala.Boolean = js.native
  def isString(x: js.Any): /* is string */ scala.Boolean = js.native
  def isUndefined(x: js.Any): scala.Boolean = js.native
  def joinNeighborsR(acc: js.Array[_], x: js.Any): js.Array[_] = js.native
  def kebobString(camelCase: java.lang.String): java.lang.String = js.native
  def keyValsToObjectR(accum: js.Any, hasKeyVal: js.Tuple2[_, _]): js.Any = js.native
  def locationPluginFactory(
    name: java.lang.String,
    isHtml5: scala.Boolean,
    serviceClass: atUirouterCoreLib.Anon_UiRouter,
    configurationClass: atUirouterCoreLib.Anon_IsHtml5
  ): js.Function1[
    /* uiRouter */ atUirouterCoreLib.libRouterMod.UIRouter, 
    atUirouterCoreLib.Anon_Configuration
  ] = js.native
  def makeEvent(
    registry: atUirouterCoreLib.libTransitionInterfaceMod.IHookRegistry,
    transitionService: atUirouterCoreLib.libTransitionTransitionServiceMod.TransitionService,
    eventType: atUirouterCoreLib.libTransitionTransitionEventTypeMod.TransitionEventType
  ): js.Function3[
    /* matchObject */ js.Any, 
    /* callback */ js.Any, 
    /* options */ js.UndefOr[js.Object], 
    _
  ] = js.native
  def makeStub[T](service: java.lang.String, methods: js.Array[java.lang.String]): T = js.native
  def map[T, U](collection: js.Array[T], callback: atUirouterCoreLib.libCommonCommonMod.Mapper[T, U]): js.Array[U] = js.native
  def map[T, U](
    collection: js.Array[T],
    callback: atUirouterCoreLib.libCommonCommonMod.Mapper[T, U],
    target: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof collection */ js.Any
  ): js.Array[U] = js.native
  def map[T, U](
    collection: org.scalablytyped.runtime.StringDictionary[T],
    callback: atUirouterCoreLib.libCommonCommonMod.Mapper[T, U]
  ): org.scalablytyped.runtime.StringDictionary[U] = js.native
  def map[T, U](
    collection: org.scalablytyped.runtime.StringDictionary[T],
    callback: atUirouterCoreLib.libCommonCommonMod.Mapper[T, U],
    target: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof collection */ js.Any
  ): org.scalablytyped.runtime.StringDictionary[U] = js.native
  def matchState(
    state: atUirouterCoreLib.libStateStateObjectMod.StateObject,
    criterion: atUirouterCoreLib.libTransitionInterfaceMod.HookMatchCriterion,
    transition: atUirouterCoreLib.libTransitionTransitionMod.Transition
  ): scala.Boolean = js.native
  def maxLength(max: scala.Double, str: java.lang.String): java.lang.String = js.native
  def memoryLocationPlugin(router: atUirouterCoreLib.libRouterMod.UIRouter): atUirouterCoreLib.libVanillaInterfaceMod.LocationPlugin = js.native
  def mergeR(memo: atUirouterCoreLib.libCommonCommonMod.Obj, item: atUirouterCoreLib.libCommonCommonMod.Obj): atUirouterCoreLib.libCommonCommonMod.Obj = js.native
  def noop(): js.Any = js.native
  def not(fn: atUirouterCoreLib.libCommonCommonMod.Predicate[_]): atUirouterCoreLib.libCommonCommonMod.Predicate[_] = js.native
  def omit(obj: atUirouterCoreLib.libCommonCommonMod.Obj, propNames: js.Array[java.lang.String]): atUirouterCoreLib.libCommonCommonMod.Obj = js.native
  def or(
    fn1: atUirouterCoreLib.libCommonCommonMod.Predicate[_],
    fn2: atUirouterCoreLib.libCommonCommonMod.Predicate[_]
  ): atUirouterCoreLib.libCommonCommonMod.Predicate[_] = js.native
  def padString(length: scala.Double, str: java.lang.String): java.lang.String = js.native
  def pairs(obj: atUirouterCoreLib.libCommonCommonMod.Obj): js.Array[js.Array[_]] = js.native
  def parse(name: java.lang.String): js.Any = js.native
  def parseUrl(url: java.lang.String): atUirouterCoreLib.Anon_Hash = js.native
  def pattern(struct: js.Array[js.Array[js.Function]]): js.Function = js.native
  def pick(obj: atUirouterCoreLib.libCommonCommonMod.Obj, propNames: js.Array[java.lang.String]): atUirouterCoreLib.libCommonCommonMod.Obj = js.native
  def pipe(funcs: js.Function*): js.Function1[/* obj */ js.Any, _] = js.native
  def pluck(collection: org.scalablytyped.runtime.StringDictionary[js.Any], propName: java.lang.String): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
  def pluck[T](collection: js.Array[atUirouterCoreLib.libCommonCommonMod.Obj], propName: java.lang.String): js.Array[T] = js.native
  def prop(name: java.lang.String): js.Function1[/* obj */ js.Any, _] = js.native
  def pushR(arr: js.Array[_], obj: js.Any): js.Array[_] = js.native
  def pushStateLocationPlugin(router: atUirouterCoreLib.libRouterMod.UIRouter): atUirouterCoreLib.libVanillaInterfaceMod.LocationPlugin = js.native
  def resolvablesBuilder(state: atUirouterCoreLib.libStateStateObjectMod.StateObject): js.Array[atUirouterCoreLib.libResolveResolvableMod.Resolvable] = js.native
  def servicesPlugin(router: atUirouterCoreLib.libRouterMod.UIRouter): atUirouterCoreLib.libVanillaInterfaceMod.ServicesPlugin = js.native
  def silenceUncaughtInPromise(promise: js.Promise[_]): js.Promise[_] = js.native
  def silentRejection(error: js.Any): js.Promise[_] = js.native
  def splitEqual(str: java.lang.String): js.Array[java.lang.String] = js.native
  def splitHash(str: java.lang.String): js.Array[java.lang.String] = js.native
  def splitOnDelim(delim: java.lang.String): js.Function1[/* str */ java.lang.String, js.Array[java.lang.String]] = js.native
  def splitQuery(str: java.lang.String): js.Array[java.lang.String] = js.native
  def stringify(o: js.Any): java.lang.String = js.native
  def stripLastPathElement(str: java.lang.String): java.lang.String = js.native
  def tail[T](arr: js.Array[T]): T = js.native
  def trimHashVal(str: java.lang.String): java.lang.String = js.native
  def uniqR[T](acc: js.Array[T], token: T): js.Array[T] = js.native
  def unnest(arr: js.Array[_]): js.Any = js.native
  def unnestR(memo: js.Array[_], elem: js.Array[_]): js.Array[_] = js.native
  def `val`[T](v: T): js.Function0[T] = js.native
  def values[T](obj: atUirouterCoreLib.libCommonCommonMod.TypedMap[T]): js.Array[T] = js.native
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
    /* 2 */ val HOOK: atUirouterCoreLib.libCommonTraceMod.Category.HOOK with scala.Double = js.native
    /* 0 */ val RESOLVE: atUirouterCoreLib.libCommonTraceMod.Category.RESOLVE with scala.Double = js.native
    /* 1 */ val TRANSITION: atUirouterCoreLib.libCommonTraceMod.Category.TRANSITION with scala.Double = js.native
    /* 3 */ val UIVIEW: atUirouterCoreLib.libCommonTraceMod.Category.UIVIEW with scala.Double = js.native
    /* 4 */ val VIEWCONFIG: atUirouterCoreLib.libCommonTraceMod.Category.VIEWCONFIG with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[atUirouterCoreLib.libCommonTraceMod.Category with scala.Double] = js.native
  }
  
  /** @internalapi */
  @js.native
  object DefType extends js.Object {
    /* 2 */ val CONFIG: atUirouterCoreLib.libParamsParamMod.DefType.CONFIG with scala.Double = js.native
    /* 0 */ val PATH: atUirouterCoreLib.libParamsParamMod.DefType.PATH with scala.Double = js.native
    /* 1 */ val SEARCH: atUirouterCoreLib.libParamsParamMod.DefType.SEARCH with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[atUirouterCoreLib.libParamsParamMod.DefType with scala.Double] = js.native
  }
  
  /* static members */
  @js.native
  object Glob extends js.Object {
    /** Returns a glob from the string, or null if the string isn't Glob-like */
    def fromString(text: java.lang.String): atUirouterCoreLib.libCommonGlobMod.Glob = js.native
    /** Returns true if the string has glob-like characters in it */
    def is(text: java.lang.String): scala.Boolean = js.native
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
    def changed(params: js.Array[atUirouterCoreLib.libParamsParamMod.Param]): js.Array[atUirouterCoreLib.libParamsParamMod.Param] = js.native
    def changed(
      params: js.Array[atUirouterCoreLib.libParamsParamMod.Param],
      values1: atUirouterCoreLib.libParamsInterfaceMod.RawParams
    ): js.Array[atUirouterCoreLib.libParamsParamMod.Param] = js.native
    def changed(
      params: js.Array[atUirouterCoreLib.libParamsParamMod.Param],
      values1: atUirouterCoreLib.libParamsInterfaceMod.RawParams,
      values2: atUirouterCoreLib.libParamsInterfaceMod.RawParams
    ): js.Array[atUirouterCoreLib.libParamsParamMod.Param] = js.native
    /**
      * Checks if two param value objects are equal (for a set of [[Param]] objects)
      *
      * @param params The list of [[Param]] objects to check
      * @param values1 The first set of param values
      * @param values2 The second set of param values
      *
      * @returns true if the param values in values1 and values2 are equal
      */
    def equals(params: js.Array[atUirouterCoreLib.libParamsParamMod.Param]): scala.Boolean = js.native
    def equals(params: js.Array[atUirouterCoreLib.libParamsParamMod.Param], values1: js.Object): scala.Boolean = js.native
    def equals(
      params: js.Array[atUirouterCoreLib.libParamsParamMod.Param],
      values1: js.Object,
      values2: js.Object
    ): scala.Boolean = js.native
    /** Returns true if a the parameter values are valid, according to the Param definitions */
    def validates(params: js.Array[atUirouterCoreLib.libParamsParamMod.Param]): scala.Boolean = js.native
    def validates(
      params: js.Array[atUirouterCoreLib.libParamsParamMod.Param],
      values: atUirouterCoreLib.libParamsInterfaceMod.RawParams
    ): scala.Boolean = js.native
    def values(params: js.Array[atUirouterCoreLib.libParamsParamMod.Param]): atUirouterCoreLib.libParamsInterfaceMod.RawParams = js.native
    def values(
      params: js.Array[atUirouterCoreLib.libParamsParamMod.Param],
      values: atUirouterCoreLib.libParamsInterfaceMod.RawParams
    ): atUirouterCoreLib.libParamsInterfaceMod.RawParams = js.native
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
    var any: atUirouterCoreLib.libParamsInterfaceMod.ParamTypeDefinition = js.native
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
    var bool: atUirouterCoreLib.libParamsInterfaceMod.ParamTypeDefinition = js.native
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
    var date: atUirouterCoreLib.libParamsInterfaceMod.ParamTypeDefinition = js.native
    /**
      * Built-in parameter type: `hash`
      *
      * This parameter type is used for the `#` parameter (the hash)
      * It behaves the same as the [[string]] parameter type.
      */
    var hash: atUirouterCoreLib.libParamsInterfaceMod.ParamTypeDefinition = js.native
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
    var int: atUirouterCoreLib.libParamsInterfaceMod.ParamTypeDefinition = js.native
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
    var json: atUirouterCoreLib.libParamsInterfaceMod.ParamTypeDefinition = js.native
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
    var path: atUirouterCoreLib.libParamsInterfaceMod.ParamTypeDefinition = js.native
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
    var query: atUirouterCoreLib.libParamsInterfaceMod.ParamTypeDefinition = js.native
    /**
      * Built-in parameter type: `string`
      *
      * This parameter type coerces values to strings.
      * It matches anything (`new RegExp(".*")`) in the URL
      */
    var string: atUirouterCoreLib.libParamsInterfaceMod.ParamTypeDefinition = js.native
  }
  
  /* static members */
  @js.native
  object PathNode extends js.Object {
    /**
      * Returns a clone of the PathNode
      * @deprecated use instance method `node.clone()`
      */
    def clone(node: atUirouterCoreLib.libPathPathNodeMod.PathNode): atUirouterCoreLib.libPathPathNodeMod.PathNode = js.native
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
      $view: atUirouterCoreLib.libViewViewMod.ViewService,
      path: js.Array[atUirouterCoreLib.libPathPathNodeMod.PathNode],
      states: js.Array[atUirouterCoreLib.libStateStateObjectMod.StateObject]
    ): scala.Unit = js.native
    def buildPath(targetState: atUirouterCoreLib.libStateTargetStateMod.TargetState): js.Array[atUirouterCoreLib.libPathPathNodeMod.PathNode] = js.native
    /** Given a fromPath: PathNode[] and a TargetState, builds a toPath: PathNode[] */
    def buildToPath(
      fromPath: js.Array[atUirouterCoreLib.libPathPathNodeMod.PathNode],
      targetState: atUirouterCoreLib.libStateTargetStateMod.TargetState
    ): js.Array[atUirouterCoreLib.libPathPathNodeMod.PathNode] = js.native
    /**
      * Returns true if two paths are identical.
      *
      * @param pathA
      * @param pathB
      * @param paramsFn a function which returns the parameters to consider when comparing
      * @returns true if the the states and parameter values for both paths are identical
      */
    def equals(
      pathA: js.Array[atUirouterCoreLib.libPathPathNodeMod.PathNode],
      pathB: js.Array[atUirouterCoreLib.libPathPathNodeMod.PathNode]
    ): scala.Boolean = js.native
    def equals(
      pathA: js.Array[atUirouterCoreLib.libPathPathNodeMod.PathNode],
      pathB: js.Array[atUirouterCoreLib.libPathPathNodeMod.PathNode],
      paramsFn: atUirouterCoreLib.libPathPathNodeMod.GetParamsFn
    ): scala.Boolean = js.native
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
      fromPath: js.Array[atUirouterCoreLib.libPathPathNodeMod.PathNode],
      toPath: js.Array[atUirouterCoreLib.libPathPathNodeMod.PathNode]
    ): js.Array[atUirouterCoreLib.libPathPathNodeMod.PathNode] = js.native
    def inheritParams(
      fromPath: js.Array[atUirouterCoreLib.libPathPathNodeMod.PathNode],
      toPath: js.Array[atUirouterCoreLib.libPathPathNodeMod.PathNode],
      toKeys: js.Array[java.lang.String]
    ): js.Array[atUirouterCoreLib.libPathPathNodeMod.PathNode] = js.native
    /** Given a PathNode[], create an TargetState */
    def makeTargetState(
      registry: atUirouterCoreLib.libStateMod.StateRegistry,
      path: js.Array[atUirouterCoreLib.libPathPathNodeMod.PathNode]
    ): atUirouterCoreLib.libStateTargetStateMod.TargetState = js.native
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
      pathA: js.Array[atUirouterCoreLib.libPathPathNodeMod.PathNode],
      pathB: js.Array[atUirouterCoreLib.libPathPathNodeMod.PathNode]
    ): js.Array[atUirouterCoreLib.libPathPathNodeMod.PathNode] = js.native
    def matching(
      pathA: js.Array[atUirouterCoreLib.libPathPathNodeMod.PathNode],
      pathB: js.Array[atUirouterCoreLib.libPathPathNodeMod.PathNode],
      paramsFn: atUirouterCoreLib.libPathPathNodeMod.GetParamsFn
    ): js.Array[atUirouterCoreLib.libPathPathNodeMod.PathNode] = js.native
    def nonDynamicParams(node: atUirouterCoreLib.libPathPathNodeMod.PathNode): js.Array[atUirouterCoreLib.libParamsParamMod.Param] = js.native
    /** Gets the raw parameter values from a path */
    def paramValues(path: js.Array[atUirouterCoreLib.libPathPathNodeMod.PathNode]): js.Object = js.native
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
      path: js.Array[atUirouterCoreLib.libPathPathNodeMod.PathNode],
      predicate: atUirouterCoreLib.libCommonCommonMod.Predicate[atUirouterCoreLib.libPathPathNodeMod.PathNode]
    ): js.Array[atUirouterCoreLib.libPathPathNodeMod.PathNode] = js.native
    /**
      * Computes the tree changes (entering, exiting) between a fromPath and toPath.
      */
    def treeChanges(
      fromPath: js.Array[atUirouterCoreLib.libPathPathNodeMod.PathNode],
      toPath: js.Array[atUirouterCoreLib.libPathPathNodeMod.PathNode],
      reloadState: atUirouterCoreLib.libStateStateObjectMod.StateObject
    ): atUirouterCoreLib.libTransitionInterfaceMod.TreeChanges = js.native
  }
  
  @js.native
  object RejectType extends js.Object {
    /* 3 */ val ABORTED: atUirouterCoreLib.libTransitionRejectFactoryMod.RejectType.ABORTED with scala.Double = js.native
    /* 6 */ val ERROR: atUirouterCoreLib.libTransitionRejectFactoryMod.RejectType.ERROR with scala.Double = js.native
    /* 5 */ val IGNORED: atUirouterCoreLib.libTransitionRejectFactoryMod.RejectType.IGNORED with scala.Double = js.native
    /* 4 */ val INVALID: atUirouterCoreLib.libTransitionRejectFactoryMod.RejectType.INVALID with scala.Double = js.native
    /* 2 */ val SUPERSEDED: atUirouterCoreLib.libTransitionRejectFactoryMod.RejectType.SUPERSEDED with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[atUirouterCoreLib.libTransitionRejectFactoryMod.RejectType with scala.Double] = js.native
  }
  
  /* static members */
  @js.native
  object Rejection extends js.Object {
    /** Returns a Rejection due to aborted transition */
    def aborted(): atUirouterCoreLib.libTransitionRejectFactoryMod.Rejection = js.native
    def aborted(detail: js.Any): atUirouterCoreLib.libTransitionRejectFactoryMod.Rejection = js.native
    /** Returns a Rejection due to aborted transition */
    def errored(): atUirouterCoreLib.libTransitionRejectFactoryMod.Rejection = js.native
    def errored(detail: js.Any): atUirouterCoreLib.libTransitionRejectFactoryMod.Rejection = js.native
    /** Returns a Rejection due to ignored transition */
    def ignored(): atUirouterCoreLib.libTransitionRejectFactoryMod.Rejection = js.native
    def ignored(detail: js.Any): atUirouterCoreLib.libTransitionRejectFactoryMod.Rejection = js.native
    /** Returns a Rejection due to invalid transition */
    def invalid(): atUirouterCoreLib.libTransitionRejectFactoryMod.Rejection = js.native
    def invalid(detail: js.Any): atUirouterCoreLib.libTransitionRejectFactoryMod.Rejection = js.native
    /** Returns true if the obj is a rejected promise created from the `asPromise` factory */
    def isRejectionPromise(obj: js.Any): scala.Boolean = js.native
    /**
      * Returns a Rejection
      *
      * Normalizes a value as a Rejection.
      * If the value is already a Rejection, returns it.
      * Otherwise, wraps and returns the value as a Rejection (Rejection type: ERROR).
      *
      * @returns `detail` if it is already a `Rejection`, else returns an ERROR Rejection.
      */
    def normalize(): atUirouterCoreLib.libTransitionRejectFactoryMod.Rejection = js.native
    def normalize(detail: atUirouterCoreLib.libTransitionRejectFactoryMod.Rejection): atUirouterCoreLib.libTransitionRejectFactoryMod.Rejection = js.native
    def normalize(detail: js.Any): atUirouterCoreLib.libTransitionRejectFactoryMod.Rejection = js.native
    def normalize(detail: stdLib.Error): atUirouterCoreLib.libTransitionRejectFactoryMod.Rejection = js.native
    /** Returns a Rejection due to redirected transition */
    def redirected(): atUirouterCoreLib.libTransitionRejectFactoryMod.Rejection = js.native
    def redirected(detail: js.Any): atUirouterCoreLib.libTransitionRejectFactoryMod.Rejection = js.native
    /** Returns a Rejection due to transition superseded */
    def superseded(): atUirouterCoreLib.libTransitionRejectFactoryMod.Rejection = js.native
    def superseded(detail: js.Any): atUirouterCoreLib.libTransitionRejectFactoryMod.Rejection = js.native
    def superseded(detail: js.Any, options: js.Any): atUirouterCoreLib.libTransitionRejectFactoryMod.Rejection = js.native
  }
  
  /* static members */
  @js.native
  object Resolvable extends js.Object {
    def fromData(token: js.Any, data: js.Any): atUirouterCoreLib.libResolveResolvableMod.Resolvable = js.native
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
    def create(stateDecl: atUirouterCoreLib.libStateInterfaceMod._StateDeclaration): atUirouterCoreLib.libStateStateObjectMod.StateObject = js.native
    /** Predicate which returns true if the object is an internal [[StateObject]] object */
    def isState(obj: js.Any): /* is @uirouter/core.@uirouter/core/lib/state/stateObject.StateObject */ scala.Boolean = js.native
    /** Predicate which returns true if the object is an class with @State() decorator */
    def isStateClass(stateDecl: atUirouterCoreLib.libStateInterfaceMod._StateDeclaration): scala.Boolean = js.native
  }
  
  /* static members */
  @js.native
  object TargetState extends js.Object {
    /** Returns true if the object has a state property that might be a state or state name */
    def isDef(obj: js.Any): /* is @uirouter/core.@uirouter/core/lib/state/interface.TargetStateDef */ scala.Boolean = js.native
  }
  
  /* static members */
  @js.native
  object Transition extends js.Object {
    /** @hidden */
    var diToken: atUirouterCoreLib.TypeofClassTransition = js.native
  }
  
  /* static members */
  @js.native
  object TransitionHook extends js.Object {
    /**
      * These GetResultHandler(s) are used by [[invokeHook]] below
      * Each HookType chooses a GetResultHandler (See: [[TransitionService._defineCoreEvents]])
      */
    @JSName("HANDLE_RESULT")
    var HANDLE_RESULT_Original: atUirouterCoreLib.libTransitionTransitionHookMod.GetResultHandler = js.native
    /**
      * These GetErrorHandler(s) are used by [[invokeHook]] below
      * Each HookType chooses a GetErrorHandler (See: [[TransitionService._defineCoreEvents]])
      */
    @JSName("LOG_ERROR")
    var LOG_ERROR_Original: atUirouterCoreLib.libTransitionTransitionHookMod.GetErrorHandler = js.native
    /**
      * If the result is a promise rejection, log it.
      * Otherwise, ignore the result.
      */
    @JSName("LOG_REJECTED_RESULT")
    var LOG_REJECTED_RESULT_Original: atUirouterCoreLib.libTransitionTransitionHookMod.GetResultHandler = js.native
    @JSName("REJECT_ERROR")
    var REJECT_ERROR_Original: atUirouterCoreLib.libTransitionTransitionHookMod.GetErrorHandler = js.native
    @JSName("THROW_ERROR")
    var THROW_ERROR_Original: atUirouterCoreLib.libTransitionTransitionHookMod.GetErrorHandler = js.native
    /**
      * These GetResultHandler(s) are used by [[invokeHook]] below
      * Each HookType chooses a GetResultHandler (See: [[TransitionService._defineCoreEvents]])
      */
    def HANDLE_RESULT(hook: atUirouterCoreLib.libTransitionTransitionHookMod.TransitionHook): atUirouterCoreLib.libTransitionTransitionHookMod.ResultHandler = js.native
    /**
      * These GetErrorHandler(s) are used by [[invokeHook]] below
      * Each HookType chooses a GetErrorHandler (See: [[TransitionService._defineCoreEvents]])
      */
    def LOG_ERROR(hook: atUirouterCoreLib.libTransitionTransitionHookMod.TransitionHook): atUirouterCoreLib.libTransitionTransitionHookMod.ErrorHandler = js.native
    /**
      * If the result is a promise rejection, log it.
      * Otherwise, ignore the result.
      */
    def LOG_REJECTED_RESULT(hook: atUirouterCoreLib.libTransitionTransitionHookMod.TransitionHook): atUirouterCoreLib.libTransitionTransitionHookMod.ResultHandler = js.native
    def REJECT_ERROR(hook: atUirouterCoreLib.libTransitionTransitionHookMod.TransitionHook): atUirouterCoreLib.libTransitionTransitionHookMod.ErrorHandler = js.native
    def THROW_ERROR(hook: atUirouterCoreLib.libTransitionTransitionHookMod.TransitionHook): atUirouterCoreLib.libTransitionTransitionHookMod.ErrorHandler = js.native
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
    def chain(hooks: js.Array[atUirouterCoreLib.libTransitionTransitionHookMod.TransitionHook]): js.Promise[_] = js.native
    def chain(
      hooks: js.Array[atUirouterCoreLib.libTransitionTransitionHookMod.TransitionHook],
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
      hooks: js.Array[atUirouterCoreLib.libTransitionTransitionHookMod.TransitionHook],
      doneCallback: js.Function1[/* result */ js.UndefOr[atUirouterCoreLib.libTransitionInterfaceMod.HookResult], T]
    ): js.Promise[_] | T = js.native
    /**
      * Run all TransitionHooks, ignoring their return value.
      */
    def runAllHooks(hooks: js.Array[atUirouterCoreLib.libTransitionTransitionHookMod.TransitionHook]): scala.Unit = js.native
  }
  
  @js.native
  object TransitionHookPhase extends js.Object {
    /* 1 */ val BEFORE: atUirouterCoreLib.libTransitionInterfaceMod.TransitionHookPhase.BEFORE with scala.Double = js.native
    /* 0 */ val CREATE: atUirouterCoreLib.libTransitionInterfaceMod.TransitionHookPhase.CREATE with scala.Double = js.native
    /* 4 */ val ERROR: atUirouterCoreLib.libTransitionInterfaceMod.TransitionHookPhase.ERROR with scala.Double = js.native
    /* 2 */ val RUN: atUirouterCoreLib.libTransitionInterfaceMod.TransitionHookPhase.RUN with scala.Double = js.native
    /* 3 */ val SUCCESS: atUirouterCoreLib.libTransitionInterfaceMod.TransitionHookPhase.SUCCESS with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[
        atUirouterCoreLib.libTransitionInterfaceMod.TransitionHookPhase with scala.Double
      ] = js.native
  }
  
  @js.native
  object TransitionHookScope extends js.Object {
    /* 1 */ val STATE: atUirouterCoreLib.libTransitionInterfaceMod.TransitionHookScope.STATE with scala.Double = js.native
    /* 0 */ val TRANSITION: atUirouterCoreLib.libTransitionInterfaceMod.TransitionHookScope.TRANSITION with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[
        atUirouterCoreLib.libTransitionInterfaceMod.TransitionHookScope with scala.Double
      ] = js.native
  }
  
  /* static members */
  @js.native
  object UrlMatcher extends js.Object {
    /** @hidden */
    var nameValidator: stdLib.RegExp = js.native
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
      a: atUirouterCoreLib.libUrlUrlMatcherMod.UrlMatcher,
      b: atUirouterCoreLib.libUrlUrlMatcherMod.UrlMatcher
    ): scala.Double = js.native
    /** @hidden */
    def encodeDashes(str: java.lang.String): java.lang.String = js.native
    /** @hidden Given a matcher, return an array with the matcher's path segments and path params, in order */
    def pathSegmentsAndParams(matcher: atUirouterCoreLib.libUrlUrlMatcherMod.UrlMatcher): js.Any = js.native
    /** @hidden Given a matcher, return an array with the matcher's query params */
    def queryParams(matcher: atUirouterCoreLib.libUrlUrlMatcherMod.UrlMatcher): js.Array[atUirouterCoreLib.libParamsParamMod.Param] = js.native
  }
  
  /* static members */
  @js.native
  object UrlRuleFactory extends js.Object {
    def isUrlRule(obj: js.Any): scala.Boolean = js.native
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
    def matches(
      uiViewsByFqn: atUirouterCoreLib.libCommonCommonMod.TypedMap[atUirouterCoreLib.libViewInterfaceMod.ActiveUIView],
      uiView: atUirouterCoreLib.libViewInterfaceMod.ActiveUIView
    ): js.Function1[/* viewConfig */ atUirouterCoreLib.libViewInterfaceMod.ViewConfig, scala.Boolean] = js.native
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
    def normalizeUIViewTarget(context: atUirouterCoreLib.libViewInterfaceMod.ViewContext): atUirouterCoreLib.Anon_UiViewContextAnchor = js.native
    def normalizeUIViewTarget(context: atUirouterCoreLib.libViewInterfaceMod.ViewContext, rawViewName: java.lang.String): atUirouterCoreLib.Anon_UiViewContextAnchor = js.native
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
    def apply(array: js.Array[_]): js.Function1[/* obj */ js.Any, scala.Boolean] = js.native
    def apply(array: js.Array[_], obj: js.Any): scala.Boolean = js.native
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
    var async: atUirouterCoreLib.Anon_NOWAIT = js.native
    var when: atUirouterCoreLib.Anon_EAGER = js.native
  }
  
}

