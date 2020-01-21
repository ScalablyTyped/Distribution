package typings.uirouterCore

import typings.uirouterCore.interfaceMod.UIInjector
import typings.uirouterCore.paramsInterfaceMod.RawParams
import typings.uirouterCore.routerMod.UIRouter
import typings.uirouterCore.stateInterfaceMod.HrefOptions
import typings.uirouterCore.stateInterfaceMod.LazyLoadResult
import typings.uirouterCore.stateInterfaceMod.StateDeclaration
import typings.uirouterCore.stateInterfaceMod.StateOrName
import typings.uirouterCore.stateInterfaceMod.TransitionPromise
import typings.uirouterCore.stateObjectMod.StateObject
import typings.uirouterCore.stateParamsMod.StateParams
import typings.uirouterCore.targetStateMod.TargetState
import typings.uirouterCore.transitionInterfaceMod.HookResult
import typings.uirouterCore.transitionInterfaceMod.TransitionOptions
import typings.uirouterCore.transitionTransitionMod.Transition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uirouter/core/lib/state/stateService", JSImport.Namespace)
@js.native
object stateServiceMod extends js.Object {
  @js.native
  class StateService protected () extends js.Object {
    /** @internalapi */
    def this(/** @hidden */ router: UIRouter) = this()
    /**
      * The current [[StateObject]]
      *
      * This is a passthrough through to [[UIRouterGlobals.$current]]
      */
    @JSName("$current")
    var $current: StateObject = js.native
    /** @hidden */
    var _defaultErrorHandler: js.Any = js.native
    /**
      * Handler for when [[transitionTo]] is called with an invalid state.
      *
      * Invokes the [[onInvalid]] callbacks, in natural order.
      * Each callback's return value is checked in sequence until one of them returns an instance of TargetState.
      * The results of the callbacks are wrapped in $q.when(), so the callbacks may return promises.
      *
      * If a callback returns an TargetState, then it is used as arguments to $state.transitionTo() and the result returned.
      *
      * @internalapi
      */
    var _handleInvalidTargetState: js.Any = js.native
    /**
      * The current [[StateDeclaration]]
      *
      * This is a passthrough through to [[UIRouterGlobals.current]]
      */
    var current: StateDeclaration = js.native
    var getCurrentPath: js.Any = js.native
    /** @internalapi */
    var invalidCallbacks: js.Array[OnInvalidCallback] = js.native
    /**
      * The latest successful state parameters
      *
      * This is a passthrough through to [[UIRouterGlobals.params]]
      */
    var params: StateParams = js.native
    var router: js.Any = js.native
    /**
      * The [[Transition]] currently in progress (or null)
      *
      * This is a passthrough through to [[UIRouterGlobals.transition]]
      */
    var transition: Transition = js.native
    /**
      * Sets or gets the default [[transitionTo]] error handler.
      *
      * The error handler is called when a [[Transition]] is rejected or when any error occurred during the Transition.
      * This includes errors caused by resolves and transition hooks.
      *
      * Note:
      * This handler does not receive certain Transition rejections.
      * Redirected and Ignored Transitions are not considered to be errors by [[StateService.transitionTo]].
      *
      * The built-in default error handler logs the error to the console.
      *
      * You can provide your own custom handler.
      *
      * #### Example:
      * ```js
      * stateService.defaultErrorHandler(function() {
      *   // Do not log transitionTo errors
      * });
      * ```
      *
      * @param handler a global error handler function
      * @returns the current global error handler
      */
    def defaultErrorHandler(): js.Function1[/* error */ js.Any, Unit] = js.native
    def defaultErrorHandler(handler: js.Function1[/* error */ js.Any, Unit]): js.Function1[/* error */ js.Any, Unit] = js.native
    /** @internalapi */
    def dispose(): Unit = js.native
    def get(): js.Array[StateDeclaration] = js.native
    def get(stateOrName: StateOrName): StateDeclaration = js.native
    /**
      * Gets a registered [[StateDeclaration]] object
      *
      * Returns the state declaration object for any specific state, or for all registered states.
      *
      * @param stateOrName (absolute or relative) If provided, will only get the declaration object for the requested state.
      * If not provided, returns an array of ALL states.
      * @param base When `stateOrName` is a relative state reference (such as `.bar.baz`), the state will be retrieved relative to this state.
      *
      * @returns a [[StateDeclaration]] object (or array of all registered [[StateDeclaration]] objects.)
      */
    def get(stateOrName: StateOrName, base: StateOrName): StateDeclaration = js.native
    /**
      * Transition to a different state and/or parameters
      *
      * Convenience method for transitioning to a new state.
      *
      * `$state.go` calls `$state.transitionTo` internally but automatically sets options to
      * `{ location: true, inherit: true, relative: router.globals.$current, notify: true }`.
      * This allows you to use either an absolute or relative `to` argument (because of `relative: router.globals.$current`).
      * It also allows you to specify * only the parameters you'd like to update, while letting unspecified parameters
      * inherit from the current parameter values (because of `inherit: true`).
      *
      * #### Example:
      * ```js
      * let app = angular.module('app', ['ui.router']);
      *
      * app.controller('ctrl', function ($scope, $state) {
      *   $scope.changeState = function () {
      *     $state.go('contact.detail');
      *   };
      * });
      * ```
      *
      * @param to Absolute state name, state object, or relative state path (relative to current state).
      *
      * Some examples:
      *
      * - `$state.go('contact.detail')` - will go to the `contact.detail` state
      * - `$state.go('^')` - will go to the parent state
      * - `$state.go('^.sibling')` - if current state is `home.child`, will go to the `home.sibling` state
      * - `$state.go('.child.grandchild')` - if current state is home, will go to the `home.child.grandchild` state
      *
      * @param params A map of the parameters that will be sent to the state, will populate $stateParams.
      *
      *    Any parameters that are not specified will be inherited from current parameter values (because of `inherit: true`).
      *    This allows, for example, going to a sibling state that shares parameters defined by a parent state.
      *
      * @param options Transition options
      *
      * @returns {promise} A promise representing the state of the new transition.
      */
    def go(to: StateOrName): TransitionPromise = js.native
    def go(to: StateOrName, params: RawParams): TransitionPromise = js.native
    def go(to: StateOrName, params: RawParams, options: TransitionOptions): TransitionPromise = js.native
    /**
      * Generates a URL for a state and parameters
      *
      * Returns the url for the given state populated with the given params.
      *
      * #### Example:
      * ```js
      * expect($state.href("about.person", { person: "bob" })).toEqual("/about/bob");
      * ```
      *
      * @param stateOrName The state name or state object you'd like to generate a url from.
      * @param params An object of parameter values to fill the state's required parameters.
      * @param options Options object. The options are:
      *
      * @returns {string} compiled state url
      */
    def href(stateOrName: StateOrName): String = js.native
    def href(stateOrName: StateOrName, params: RawParams): String = js.native
    def href(stateOrName: StateOrName, params: RawParams, options: HrefOptions): String = js.native
    /**
      * Checks if the current state *includes* the provided state
      *
      * A method to determine if the current active state is equal to or is the child of the
      * state stateName. If any params are passed then they will be tested for a match as well.
      * Not all the parameters need to be passed, just the ones you'd like to test for equality.
      *
      * #### Example when `$state.$current.name === 'contacts.details.item'`
      * ```js
      * // Using partial names
      * $state.includes("contacts"); // returns true
      * $state.includes("contacts.details"); // returns true
      * $state.includes("contacts.details.item"); // returns true
      * $state.includes("contacts.list"); // returns false
      * $state.includes("about"); // returns false
      * ```
      *
      * #### Glob Examples when `* $state.$current.name === 'contacts.details.item.url'`:
      * ```js
      * $state.includes("*.details.*.*"); // returns true
      * $state.includes("*.details.**"); // returns true
      * $state.includes("**.item.**"); // returns true
      * $state.includes("*.details.item.url"); // returns true
      * $state.includes("*.details.*.url"); // returns true
      * $state.includes("*.details.*"); // returns false
      * $state.includes("item.**"); // returns false
      * ```
      *
      * @param stateOrName A partial name, relative name, glob pattern,
      *   or state object to be searched for within the current state name.
      * @param params A param object, e.g. `{sectionId: section.id}`,
      *   that you'd like to test against the current active state.
      * @param options An options object. The options are:
      *   - `relative`: If `stateOrName` is a relative state name and `options.relative` is set, .is will
      *     test relative to `options.relative` state (or name).
      *
      * @returns {boolean} Returns true if it does include the state
      */
    def includes(stateOrName: StateOrName): Boolean = js.native
    def includes(stateOrName: StateOrName, params: RawParams): Boolean = js.native
    def includes(stateOrName: StateOrName, params: RawParams, options: TransitionOptions): Boolean = js.native
    /**
      * Checks if the current state *is* the provided state
      *
      * Similar to [[includes]] but only checks for the full state name.
      * If params is supplied then it will be tested for strict equality against the current
      * active params object, so all params must match with none missing and no extras.
      *
      * #### Example:
      * ```js
      * $state.$current.name = 'contacts.details.item';
      *
      * // absolute name
      * $state.is('contact.details.item'); // returns true
      * $state.is(contactDetailItemStateObject); // returns true
      * ```
      *
      * // relative name (. and ^), typically from a template
      * // E.g. from the 'contacts.details' template
      * ```html
      * <div ng-class="{highlighted: $state.is('.item')}">Item</div>
      * ```
      *
      * @param stateOrName The state name (absolute or relative) or state object you'd like to check.
      * @param params A param object, e.g. `{sectionId: section.id}`, that you'd like
      * to test against the current active state.
      * @param options An options object. The options are:
      *   - `relative`: If `stateOrName` is a relative state name and `options.relative` is set, .is will
      *     test relative to `options.relative` state (or name).
      *
      * @returns Returns true if it is the state.
      */
    def is(stateOrName: StateOrName): Boolean = js.native
    def is(stateOrName: StateOrName, params: RawParams): Boolean = js.native
    def is(stateOrName: StateOrName, params: RawParams, options: AnonRelative): Boolean = js.native
    /**
      * Lazy loads a state
      *
      * Explicitly runs a state's [[StateDeclaration.lazyLoad]] function.
      *
      * @param stateOrName the state that should be lazy loaded
      * @param transition the optional Transition context to use (if the lazyLoad function requires an injector, etc)
      * Note: If no transition is provided, a noop transition is created using the from the current state to the current state.
      * This noop transition is not actually run.
      *
      * @returns a promise to lazy load
      */
    def lazyLoad(stateOrName: StateOrName): js.Promise[LazyLoadResult] = js.native
    def lazyLoad(stateOrName: StateOrName, transition: Transition): js.Promise[LazyLoadResult] = js.native
    /**
      * Registers an Invalid State handler
      *
      * Registers a [[OnInvalidCallback]] function to be invoked when [[StateService.transitionTo]]
      * has been called with an invalid state reference parameter
      *
      * Example:
      * ```js
      * stateService.onInvalid(function(to, from, injector) {
      *   if (to.name() === 'foo') {
      *     let lazyLoader = injector.get('LazyLoadService');
      *     return lazyLoader.load('foo')
      *         .then(() => stateService.target('foo'));
      *   }
      * });
      * ```
      *
      * @param {function} callback invoked when the toState is invalid
      *   This function receives the (invalid) toState, the fromState, and an injector.
      *   The function may optionally return a [[TargetState]] or a Promise for a TargetState.
      *   If one is returned, it is treated as a redirect.
      *
      * @returns a function which deregisters the callback
      */
    def onInvalid(callback: OnInvalidCallback): js.Function = js.native
    /**
      * Reloads the current state
      *
      * A method that force reloads the current state, or a partial state hierarchy.
      * All resolves are re-resolved, and components reinstantiated.
      *
      * #### Example:
      * ```js
      * let app angular.module('app', ['ui.router']);
      *
      * app.controller('ctrl', function ($scope, $state) {
      *   $scope.reload = function(){
      *     $state.reload();
      *   }
      * });
      * ```
      *
      * Note: `reload()` is just an alias for:
      *
      * ```js
      * $state.transitionTo($state.current, $state.params, {
      *   reload: true, inherit: false
      * });
      * ```
      *
      * @param reloadState A state name or a state object.
      *    If present, this state and all its children will be reloaded, but ancestors will not reload.
      *
      * #### Example:
      * ```js
      * //assuming app application consists of 3 states: 'contacts', 'contacts.detail', 'contacts.detail.item'
      * //and current state is 'contacts.detail.item'
      * let app angular.module('app', ['ui.router']);
      *
      * app.controller('ctrl', function ($scope, $state) {
      *   $scope.reload = function(){
      *     //will reload 'contact.detail' and nested 'contact.detail.item' states
      *     $state.reload('contact.detail');
      *   }
      * });
      * ```
      *
      * @returns A promise representing the state of the new transition. See [[StateService.go]]
      */
    def reload(): js.Promise[StateObject] = js.native
    def reload(reloadState: StateOrName): js.Promise[StateObject] = js.native
    /**
      * Creates a [[TargetState]]
      *
      * This is a factory method for creating a TargetState
      *
      * This may be returned from a Transition Hook to redirect a transition, for example.
      */
    def target(identifier: StateOrName): TargetState = js.native
    def target(identifier: StateOrName, params: RawParams): TargetState = js.native
    def target(identifier: StateOrName, params: RawParams, options: TransitionOptions): TargetState = js.native
    /**
      * Low-level method for transitioning to a new state.
      *
      * The [[go]] method (which uses `transitionTo` internally) is recommended in most situations.
      *
      * #### Example:
      * ```js
      * let app = angular.module('app', ['ui.router']);
      *
      * app.controller('ctrl', function ($scope, $state) {
      *   $scope.changeState = function () {
      *     $state.transitionTo('contact.detail');
      *   };
      * });
      * ```
      *
      * @param to State name or state object.
      * @param toParams A map of the parameters that will be sent to the state,
      *      will populate $stateParams.
      * @param options Transition options
      *
      * @returns A promise representing the state of the new transition. See [[go]]
      */
    def transitionTo(to: StateOrName): TransitionPromise = js.native
    def transitionTo(to: StateOrName, toParams: RawParams): TransitionPromise = js.native
    def transitionTo(to: StateOrName, toParams: RawParams, options: TransitionOptions): TransitionPromise = js.native
  }
  
  type OnInvalidCallback = js.Function3[
    /* toState */ js.UndefOr[TargetState], 
    /* fromState */ js.UndefOr[TargetState], 
    /* injector */ js.UndefOr[UIInjector], 
    HookResult
  ]
}

