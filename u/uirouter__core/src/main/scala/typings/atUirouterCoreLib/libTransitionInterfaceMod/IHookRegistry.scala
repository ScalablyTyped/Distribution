package typings
package atUirouterCoreLib.libTransitionInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IHookRegistry extends js.Object {
  /** @hidden place to store the hooks */
  var _registeredHooks: org.scalablytyped.runtime.StringDictionary[js.Array[atUirouterCoreLib.libTransitionHookRegistryMod.RegisteredHook]] = js.native
  /**
       * Returns all the registered hooks of a given `hookName` type
       *
       * #### Example:
       * ```
       * $transitions.getHooks("onEnter")
       * ```
       */
  def getHooks(hookName: java.lang.String): js.Array[atUirouterCoreLib.libTransitionHookRegistryMod.RegisteredHook] = js.native
  /**
       * Registers a [[TransitionHookFn]], called *before a transition starts*.
       *
       * Registers a transition lifecycle hook, which is invoked before a transition even begins.
       * This hook can be useful to implement logic which prevents a transition from even starting, such
       * as authentication, redirection
       *
       * See [[TransitionHookFn]] for the signature of the function.
       *
       * The [[HookMatchCriteria]] is used to determine which Transitions the hook should be invoked for.
       * To match all Transitions, use an empty criteria object `{}`.
       *
       * ### Lifecycle
       *
       * `onBefore` hooks are invoked *before a Transition starts*.
       * No resolves have been fetched yet.
       * Each `onBefore` hook is invoked synchronously, in the same call stack as [[StateService.transitionTo]].
       * The registered `onBefore` hooks are invoked in priority order.
       *
       * Note: during the `onBefore` phase, additional hooks can be added to the specific [[Transition]] instance.
       * These "on-the-fly" hooks only affect the currently running transition..
       *
       * ### Return value
       *
       * The hook's return value can be used to pause, cancel, or redirect the current Transition.
       * See [[HookResult]] for more information.
       *
       * If any hook modifies the transition *synchronously* (by throwing, returning `false`, or returning
       * a [[TargetState]]), the remainder of the hooks are skipped.
       * If a hook returns a promise, the remainder of the `onBefore` hooks are still invoked synchronously.
       * All promises are resolved, and processed asynchronously before the `onStart` phase of the Transition.
       *
       * ### Examples
       *
       * #### Default Substate
       *
       * This example redirects any transition from 'home' to 'home.dashboard'.  This is commonly referred to as a
       * "default substate".
       *
       * @example
       * ```js
       * // ng2
       * transitionService.onBefore({ to: 'home' }, (trans: Transition) =>
       *     trans.router.stateService.target("home.dashboard"));
       * ```
       *
       * #### Data Driven Default Substate
       *
       * This example provides data-driven default substate functionality. It matches on a transition to any state
       * which has `defaultSubstate: "some.sub.state"` defined.  See: [[Transition.to]] which returns the "to state"
       * definition.
       *
       * @example
       * ```js
       * // ng1
       * // state declaration
       * {
       *   name: 'home',
       *   template: '<div ui-view/>',
       *   defaultSubstate: 'home.dashboard'
       * }
       *
       * var criteria = {
       *   to: function(state) {
       *     return state.defaultSubstate != null;
       *   }
       * }
       *
       * $transitions.onBefore(criteria, function(trans: Transition) {
       *   var substate = trans.to().defaultSubstate;
       *   return trans.router.stateService.target(substate);
       * });
       * ```
       *
       *
       * #### Require authentication
       *
       * This example cancels a transition to a state which requires authentication, if the user is not currently authenticated.
       *
       * This example assumes a state tree where all states which require authentication are children of a parent `'requireauth'` state.
       * This example assumes `MyAuthService` synchronously returns a boolean from `isAuthenticated()`.
       *
       * #### Example:
       * ```js
       * // ng1
       * $transitions.onBefore( { to: 'requireauth.**' }, function(trans) {
       *   var myAuthService = trans.injector().get('MyAuthService');
       *   // If isAuthenticated returns false, the transition is cancelled.
       *   return myAuthService.isAuthenticated();
       * });
       * ```
       *
       * @param matchCriteria defines which Transitions the Hook should be invoked for.
       * @param callback the hook function which will be invoked.
       * @returns a function which deregisters the hook.
       */
  def onBefore(matchCriteria: HookMatchCriteria, callback: TransitionHookFn): js.Function = js.native
  /**
       * Registers a [[TransitionHookFn]], called *before a transition starts*.
       *
       * Registers a transition lifecycle hook, which is invoked before a transition even begins.
       * This hook can be useful to implement logic which prevents a transition from even starting, such
       * as authentication, redirection
       *
       * See [[TransitionHookFn]] for the signature of the function.
       *
       * The [[HookMatchCriteria]] is used to determine which Transitions the hook should be invoked for.
       * To match all Transitions, use an empty criteria object `{}`.
       *
       * ### Lifecycle
       *
       * `onBefore` hooks are invoked *before a Transition starts*.
       * No resolves have been fetched yet.
       * Each `onBefore` hook is invoked synchronously, in the same call stack as [[StateService.transitionTo]].
       * The registered `onBefore` hooks are invoked in priority order.
       *
       * Note: during the `onBefore` phase, additional hooks can be added to the specific [[Transition]] instance.
       * These "on-the-fly" hooks only affect the currently running transition..
       *
       * ### Return value
       *
       * The hook's return value can be used to pause, cancel, or redirect the current Transition.
       * See [[HookResult]] for more information.
       *
       * If any hook modifies the transition *synchronously* (by throwing, returning `false`, or returning
       * a [[TargetState]]), the remainder of the hooks are skipped.
       * If a hook returns a promise, the remainder of the `onBefore` hooks are still invoked synchronously.
       * All promises are resolved, and processed asynchronously before the `onStart` phase of the Transition.
       *
       * ### Examples
       *
       * #### Default Substate
       *
       * This example redirects any transition from 'home' to 'home.dashboard'.  This is commonly referred to as a
       * "default substate".
       *
       * @example
       * ```js
       * // ng2
       * transitionService.onBefore({ to: 'home' }, (trans: Transition) =>
       *     trans.router.stateService.target("home.dashboard"));
       * ```
       *
       * #### Data Driven Default Substate
       *
       * This example provides data-driven default substate functionality. It matches on a transition to any state
       * which has `defaultSubstate: "some.sub.state"` defined.  See: [[Transition.to]] which returns the "to state"
       * definition.
       *
       * @example
       * ```js
       * // ng1
       * // state declaration
       * {
       *   name: 'home',
       *   template: '<div ui-view/>',
       *   defaultSubstate: 'home.dashboard'
       * }
       *
       * var criteria = {
       *   to: function(state) {
       *     return state.defaultSubstate != null;
       *   }
       * }
       *
       * $transitions.onBefore(criteria, function(trans: Transition) {
       *   var substate = trans.to().defaultSubstate;
       *   return trans.router.stateService.target(substate);
       * });
       * ```
       *
       *
       * #### Require authentication
       *
       * This example cancels a transition to a state which requires authentication, if the user is not currently authenticated.
       *
       * This example assumes a state tree where all states which require authentication are children of a parent `'requireauth'` state.
       * This example assumes `MyAuthService` synchronously returns a boolean from `isAuthenticated()`.
       *
       * #### Example:
       * ```js
       * // ng1
       * $transitions.onBefore( { to: 'requireauth.**' }, function(trans) {
       *   var myAuthService = trans.injector().get('MyAuthService');
       *   // If isAuthenticated returns false, the transition is cancelled.
       *   return myAuthService.isAuthenticated();
       * });
       * ```
       *
       * @param matchCriteria defines which Transitions the Hook should be invoked for.
       * @param callback the hook function which will be invoked.
       * @returns a function which deregisters the hook.
       */
  def onBefore(matchCriteria: HookMatchCriteria, callback: TransitionHookFn, options: HookRegOptions): js.Function = js.native
  /**
       * Registers a [[TransitionStateHookFn]], called when a specific state is entered.
       *
       * Registers a lifecycle hook, which is invoked (during a transition) when a specific state is being entered.
       *
       * Since this hook is run only when the specific state is being *entered*, it can be useful for
       * performing tasks when entering a submodule/feature area such as initializing a stateful service,
       * or for guarding access to a submodule/feature area.
       *
       * See [[TransitionStateHookFn]] for the signature of the function.
       *
       * The [[HookMatchCriteria]] is used to determine which Transitions the hook should be invoked for.
       * `onEnter` hooks generally specify `{ entering: 'somestate' }`.
       * To match all Transitions, use an empty criteria object `{}`.
       *
       * ### Lifecycle
       *
       * `onEnter` hooks are invoked when the Transition is entering a state.
       * States are entered after the `onRetain` phase is complete.
       * If more than one state is being entered, the parent state is entered first.
       * The registered `onEnter` hooks for a state are invoked in priority order.
       *
       * Note: A built-in `onEnter` hook with high priority is used to fetch lazy resolve data for states being entered.
       *
       * ### Return value
       *
       * The hook's return value can be used to pause, cancel, or redirect the current Transition.
       * See [[HookResult]] for more information.
       *
       * ### Inside a state declaration
       *
       * Instead of registering `onEnter` hooks using the [[TransitionService]], you may define an `onEnter` hook
       * directly on a state declaration (see: [[StateDeclaration.onEnter]]).
       *
       *
       * ### Examples
       *
       * #### Audit Log
       *
       * This example uses a service to log that a user has entered the admin section of an app.
       * This assumes that there are substates of the "admin" state, such as "admin.users", "admin.pages", etc.
       * @example
       * ```
       *
       * $transitions.onEnter({ entering: 'admin' }, function(transition, state) {
       *   var AuditService = trans.injector().get('AuditService');
       *   AuditService.log("Entered " + state.name + " module while transitioning to " + transition.to().name);
       * }
       * ```
       *
       * #### Audit Log (inside a state declaration)
       *
       * The `onEnter` inside this state declaration is syntactic sugar for the previous Audit Log example.
       * ```
       * {
       *   name: 'admin',
       *   component: 'admin',
       *   onEnter: function($transition$, $state$) {
       *     var AuditService = $transition$.injector().get('AuditService');
       *     AuditService.log("Entered " + state.name + " module while transitioning to " + transition.to().name);
       *   }
       * }
       * ```
       *
       * Note: A state declaration's `onEnter` function is injected for Angular 1 only.
       *
       * @param matchCriteria defines which Transitions the Hook should be invoked for.
       * @param callback the hook function which will be injected and invoked.
       * @returns a function which deregisters the hook.
       */
  def onEnter(matchCriteria: HookMatchCriteria, callback: TransitionStateHookFn): js.Function = js.native
  /**
       * Registers a [[TransitionStateHookFn]], called when a specific state is entered.
       *
       * Registers a lifecycle hook, which is invoked (during a transition) when a specific state is being entered.
       *
       * Since this hook is run only when the specific state is being *entered*, it can be useful for
       * performing tasks when entering a submodule/feature area such as initializing a stateful service,
       * or for guarding access to a submodule/feature area.
       *
       * See [[TransitionStateHookFn]] for the signature of the function.
       *
       * The [[HookMatchCriteria]] is used to determine which Transitions the hook should be invoked for.
       * `onEnter` hooks generally specify `{ entering: 'somestate' }`.
       * To match all Transitions, use an empty criteria object `{}`.
       *
       * ### Lifecycle
       *
       * `onEnter` hooks are invoked when the Transition is entering a state.
       * States are entered after the `onRetain` phase is complete.
       * If more than one state is being entered, the parent state is entered first.
       * The registered `onEnter` hooks for a state are invoked in priority order.
       *
       * Note: A built-in `onEnter` hook with high priority is used to fetch lazy resolve data for states being entered.
       *
       * ### Return value
       *
       * The hook's return value can be used to pause, cancel, or redirect the current Transition.
       * See [[HookResult]] for more information.
       *
       * ### Inside a state declaration
       *
       * Instead of registering `onEnter` hooks using the [[TransitionService]], you may define an `onEnter` hook
       * directly on a state declaration (see: [[StateDeclaration.onEnter]]).
       *
       *
       * ### Examples
       *
       * #### Audit Log
       *
       * This example uses a service to log that a user has entered the admin section of an app.
       * This assumes that there are substates of the "admin" state, such as "admin.users", "admin.pages", etc.
       * @example
       * ```
       *
       * $transitions.onEnter({ entering: 'admin' }, function(transition, state) {
       *   var AuditService = trans.injector().get('AuditService');
       *   AuditService.log("Entered " + state.name + " module while transitioning to " + transition.to().name);
       * }
       * ```
       *
       * #### Audit Log (inside a state declaration)
       *
       * The `onEnter` inside this state declaration is syntactic sugar for the previous Audit Log example.
       * ```
       * {
       *   name: 'admin',
       *   component: 'admin',
       *   onEnter: function($transition$, $state$) {
       *     var AuditService = $transition$.injector().get('AuditService');
       *     AuditService.log("Entered " + state.name + " module while transitioning to " + transition.to().name);
       *   }
       * }
       * ```
       *
       * Note: A state declaration's `onEnter` function is injected for Angular 1 only.
       *
       * @param matchCriteria defines which Transitions the Hook should be invoked for.
       * @param callback the hook function which will be injected and invoked.
       * @returns a function which deregisters the hook.
       */
  def onEnter(matchCriteria: HookMatchCriteria, callback: TransitionStateHookFn, options: HookRegOptions): js.Function = js.native
  /**
       * Registers a [[TransitionHookFn]], called after a transition has errored.
       *
       * Registers a transition lifecycle hook, which is invoked after a transition has been rejected for any reason.
       *
       * See [[TransitionHookFn]] for the signature of the function.
       *
       * The [[HookMatchCriteria]] is used to determine which Transitions the hook should be invoked for.
       * To match all Transitions, use an empty criteria object `{}`.
       *
       * ### Lifecycle
       *
       * The `onError` hooks are chained off the Transition's promise (see [[Transition.promise]]).
       * If a Transition fails, its promise is rejected and the `onError` hooks are invoked.
       * The `onError` hooks are invoked in priority order.
       *
       * Since these hooks are run after the transition is over, their return value is ignored.
       *
       * A transition "errors" if it was started, but failed to complete (for any reason).
       * A *non-exhaustive list* of reasons a transition can error:
       *
       * - A transition was cancelled because a new transition started while it was still running (`Transition superseded`)
       * - A transition was cancelled by a Transition Hook returning false
       * - A transition was redirected by a Transition Hook returning a [[TargetState]]
       * - A Transition Hook or resolve function threw an error
       * - A Transition Hook returned a rejected promise
       * - A resolve function returned a rejected promise
       *
       * To check the failure reason, inspect the return value of [[Transition.error]].
       *
       * Note: `onError` should be used for targeted error handling, or error recovery.
       * For simple catch-all error reporting, use [[StateService.defaultErrorHandler]].
       *
       * ### Return value
       *
       * Since the Transition is already completed, the hook's return value is ignored
       *
       * @param matchCriteria defines which Transitions the Hook should be invoked for.
       * @param callback the hook function which will be injected and invoked.
       * @returns a function which deregisters the hook.
       */
  def onError(matchCriteria: HookMatchCriteria, callback: TransitionHookFn): js.Function = js.native
  /**
       * Registers a [[TransitionHookFn]], called after a transition has errored.
       *
       * Registers a transition lifecycle hook, which is invoked after a transition has been rejected for any reason.
       *
       * See [[TransitionHookFn]] for the signature of the function.
       *
       * The [[HookMatchCriteria]] is used to determine which Transitions the hook should be invoked for.
       * To match all Transitions, use an empty criteria object `{}`.
       *
       * ### Lifecycle
       *
       * The `onError` hooks are chained off the Transition's promise (see [[Transition.promise]]).
       * If a Transition fails, its promise is rejected and the `onError` hooks are invoked.
       * The `onError` hooks are invoked in priority order.
       *
       * Since these hooks are run after the transition is over, their return value is ignored.
       *
       * A transition "errors" if it was started, but failed to complete (for any reason).
       * A *non-exhaustive list* of reasons a transition can error:
       *
       * - A transition was cancelled because a new transition started while it was still running (`Transition superseded`)
       * - A transition was cancelled by a Transition Hook returning false
       * - A transition was redirected by a Transition Hook returning a [[TargetState]]
       * - A Transition Hook or resolve function threw an error
       * - A Transition Hook returned a rejected promise
       * - A resolve function returned a rejected promise
       *
       * To check the failure reason, inspect the return value of [[Transition.error]].
       *
       * Note: `onError` should be used for targeted error handling, or error recovery.
       * For simple catch-all error reporting, use [[StateService.defaultErrorHandler]].
       *
       * ### Return value
       *
       * Since the Transition is already completed, the hook's return value is ignored
       *
       * @param matchCriteria defines which Transitions the Hook should be invoked for.
       * @param callback the hook function which will be injected and invoked.
       * @returns a function which deregisters the hook.
       */
  def onError(matchCriteria: HookMatchCriteria, callback: TransitionHookFn, options: HookRegOptions): js.Function = js.native
  /**
       * Registers a [[TransitionStateHookFn]], called when a specific state is exited.
       *
       * Registers a lifecycle hook, which is invoked (during a transition) when a specific state is being exited.
       *
       * Since this hook is run only when the specific state is being *exited*, it can be useful for
       * performing tasks when leaving a submodule/feature area such as cleaning up a stateful service,
       * or for preventing the user from leaving a state or submodule until some criteria is satisfied.
       *
       * See [[TransitionStateHookFn]] for the signature of the function.
       *
       * The [[HookMatchCriteria]] is used to determine which Transitions the hook should be invoked for.
       * `onExit` hooks generally specify `{ exiting: 'somestate' }`.
       * To match all Transitions, use an empty criteria object `{}`.
       *
       * ### Lifecycle
       *
       * `onExit` hooks are invoked when the Transition is exiting a state.
       * States are exited after any `onStart` phase is complete.
       * If more than one state is being exited, the child states are exited first.
       * The registered `onExit` hooks for a state are invoked in priority order.
       *
       * ### Return value
       *
       * The hook's return value can be used to pause, cancel, or redirect the current Transition.
       * See [[HookResult]] for more information.
       *
       * ### Inside a state declaration
       *
       * Instead of registering `onExit` hooks using the [[TransitionService]], you may define an `onExit` hook
       * directly on a state declaration (see: [[StateDeclaration.onExit]]).
       *
       * Note: A state declaration's `onExit` function is injected for Angular 1 only.
       *
       * @param matchCriteria defines which Transitions the Hook should be invoked for.
       * @param callback the hook function which will be injected and invoked.
       * @returns a function which deregisters the hook.
       */
  def onExit(matchCriteria: HookMatchCriteria, callback: TransitionStateHookFn): js.Function = js.native
  /**
       * Registers a [[TransitionStateHookFn]], called when a specific state is exited.
       *
       * Registers a lifecycle hook, which is invoked (during a transition) when a specific state is being exited.
       *
       * Since this hook is run only when the specific state is being *exited*, it can be useful for
       * performing tasks when leaving a submodule/feature area such as cleaning up a stateful service,
       * or for preventing the user from leaving a state or submodule until some criteria is satisfied.
       *
       * See [[TransitionStateHookFn]] for the signature of the function.
       *
       * The [[HookMatchCriteria]] is used to determine which Transitions the hook should be invoked for.
       * `onExit` hooks generally specify `{ exiting: 'somestate' }`.
       * To match all Transitions, use an empty criteria object `{}`.
       *
       * ### Lifecycle
       *
       * `onExit` hooks are invoked when the Transition is exiting a state.
       * States are exited after any `onStart` phase is complete.
       * If more than one state is being exited, the child states are exited first.
       * The registered `onExit` hooks for a state are invoked in priority order.
       *
       * ### Return value
       *
       * The hook's return value can be used to pause, cancel, or redirect the current Transition.
       * See [[HookResult]] for more information.
       *
       * ### Inside a state declaration
       *
       * Instead of registering `onExit` hooks using the [[TransitionService]], you may define an `onExit` hook
       * directly on a state declaration (see: [[StateDeclaration.onExit]]).
       *
       * Note: A state declaration's `onExit` function is injected for Angular 1 only.
       *
       * @param matchCriteria defines which Transitions the Hook should be invoked for.
       * @param callback the hook function which will be injected and invoked.
       * @returns a function which deregisters the hook.
       */
  def onExit(matchCriteria: HookMatchCriteria, callback: TransitionStateHookFn, options: HookRegOptions): js.Function = js.native
  /**
       * Registers a [[TransitionHookFn]], called *just before a transition finishes*.
       *
       * Registers a transition lifecycle hook, which is invoked just before a transition finishes.
       * This hook is a last chance to cancel or redirect a transition.
       *
       * See [[TransitionHookFn]] for the signature of the function.
       *
       * The [[HookMatchCriteria]] is used to determine which Transitions the hook should be invoked for.
       * To match all Transitions, use an empty criteria object `{}`.
       *
       * ### Lifecycle
       *
       * `onFinish` hooks are invoked after the `onEnter` phase is complete.
       * These hooks are invoked just before the transition is "committed".
       * Each hook is invoked in priority order.
       *
       * ### Return value
       *
       * The hook's return value can be used to pause, cancel, or redirect the current Transition.
       * See [[HookResult]] for more information.
       *
       * @param matchCriteria defines which Transitions the Hook should be invoked for.
       * @param callback the hook function which will be injected and invoked.
       * @returns a function which deregisters the hook.
       */
  def onFinish(matchCriteria: HookMatchCriteria, callback: TransitionHookFn): js.Function = js.native
  /**
       * Registers a [[TransitionHookFn]], called *just before a transition finishes*.
       *
       * Registers a transition lifecycle hook, which is invoked just before a transition finishes.
       * This hook is a last chance to cancel or redirect a transition.
       *
       * See [[TransitionHookFn]] for the signature of the function.
       *
       * The [[HookMatchCriteria]] is used to determine which Transitions the hook should be invoked for.
       * To match all Transitions, use an empty criteria object `{}`.
       *
       * ### Lifecycle
       *
       * `onFinish` hooks are invoked after the `onEnter` phase is complete.
       * These hooks are invoked just before the transition is "committed".
       * Each hook is invoked in priority order.
       *
       * ### Return value
       *
       * The hook's return value can be used to pause, cancel, or redirect the current Transition.
       * See [[HookResult]] for more information.
       *
       * @param matchCriteria defines which Transitions the Hook should be invoked for.
       * @param callback the hook function which will be injected and invoked.
       * @returns a function which deregisters the hook.
       */
  def onFinish(matchCriteria: HookMatchCriteria, callback: TransitionHookFn, options: HookRegOptions): js.Function = js.native
  /**
       * Registers a [[TransitionStateHookFn]], called when a specific state is retained/kept.
       *
       * Registers a lifecycle hook, which is invoked (during a transition) for
       * a specific state that was previously active will remain active (is not being entered nor exited).
       *
       * This hook is invoked when a state is "retained" or "kept".
       * It means the transition is coming *from* a substate of the retained state *to* a substate of the retained state.
       * This hook can be used to perform actions when the user moves from one substate to another, such as between steps in a wizard.
       *
       * The [[HookMatchCriteria]] is used to determine which Transitions the hook should be invoked for.
       * `onRetain` hooks generally specify `{ retained: 'somestate' }`.
       * To match all Transitions, use an empty criteria object `{}`.
       *
       * ### Lifecycle
       *
       * `onRetain` hooks are invoked after any `onExit` hooks have been fired.
       * If more than one state is retained, the child states' `onRetain` hooks are invoked first.
       * The registered `onRetain` hooks for a state are invoked in priority order.
       *
       * ### Return value
       *
       * The hook's return value can be used to pause, cancel, or redirect the current Transition.
       * See [[HookResult]] for more information.
       *
       * ### Inside a state declaration
       *
       * Instead of registering `onRetain` hooks using the [[TransitionService]], you may define an `onRetain` hook
       * directly on a state declaration (see: [[StateDeclaration.onRetain]]).
       *
       * Note: A state declaration's `onRetain` function is injected for Angular 1 only.
       *
       * @param matchCriteria defines which Transitions the Hook should be invoked for.
       * @param callback the hook function which will be injected and invoked.
       * @returns a function which deregisters the hook.
       */
  def onRetain(matchCriteria: HookMatchCriteria, callback: TransitionStateHookFn): js.Function = js.native
  /**
       * Registers a [[TransitionStateHookFn]], called when a specific state is retained/kept.
       *
       * Registers a lifecycle hook, which is invoked (during a transition) for
       * a specific state that was previously active will remain active (is not being entered nor exited).
       *
       * This hook is invoked when a state is "retained" or "kept".
       * It means the transition is coming *from* a substate of the retained state *to* a substate of the retained state.
       * This hook can be used to perform actions when the user moves from one substate to another, such as between steps in a wizard.
       *
       * The [[HookMatchCriteria]] is used to determine which Transitions the hook should be invoked for.
       * `onRetain` hooks generally specify `{ retained: 'somestate' }`.
       * To match all Transitions, use an empty criteria object `{}`.
       *
       * ### Lifecycle
       *
       * `onRetain` hooks are invoked after any `onExit` hooks have been fired.
       * If more than one state is retained, the child states' `onRetain` hooks are invoked first.
       * The registered `onRetain` hooks for a state are invoked in priority order.
       *
       * ### Return value
       *
       * The hook's return value can be used to pause, cancel, or redirect the current Transition.
       * See [[HookResult]] for more information.
       *
       * ### Inside a state declaration
       *
       * Instead of registering `onRetain` hooks using the [[TransitionService]], you may define an `onRetain` hook
       * directly on a state declaration (see: [[StateDeclaration.onRetain]]).
       *
       * Note: A state declaration's `onRetain` function is injected for Angular 1 only.
       *
       * @param matchCriteria defines which Transitions the Hook should be invoked for.
       * @param callback the hook function which will be injected and invoked.
       * @returns a function which deregisters the hook.
       */
  def onRetain(matchCriteria: HookMatchCriteria, callback: TransitionStateHookFn, options: HookRegOptions): js.Function = js.native
  /**
       * Registers a [[TransitionHookFn]], called when a transition starts.
       *
       * Registers a transition lifecycle hook, which is invoked as a transition starts running.
       * This hook can be useful to perform some asynchronous action before completing a transition.
       *
       * See [[TransitionHookFn]] for the signature of the function.
       *
       * The [[HookMatchCriteria]] is used to determine which Transitions the hook should be invoked for.
       * To match all Transitions, use an empty criteria object `{}`.
       *
       * ### Lifecycle
       *
       * `onStart` hooks are invoked asynchronously when the Transition starts running.
       * This happens after the `onBefore` phase is complete.
       * At this point, the Transition has not yet exited nor entered any states.
       * The registered `onStart` hooks are invoked in priority order.
       *
       * Note: A built-in `onStart` hook with high priority is used to fetch any eager resolve data.
       *
       * ### Return value
       *
       * The hook's return value can be used to pause, cancel, or redirect the current Transition.
       * See [[HookResult]] for more information.
       *
       * ### Example
       *
       * #### Login during transition
       *
       * This example intercepts any transition to a state which requires authentication, when the user is
       * not currently authenticated.  It allows the user to authenticate asynchronously, then resumes the
       * transition.  If the user did not authenticate successfully, it redirects to the "guest" state, which
       * does not require authentication.
       *
       * This example assumes:
       * - a state tree where all states which require authentication are children of a parent `'auth'` state.
       * - `MyAuthService.isAuthenticated()` synchronously returns a boolean.
       * - `MyAuthService.authenticate()` presents a login dialog, and returns a promise which is resolved
       *   or rejected, whether or not the login attempt was successful.
       *
       * #### Example:
       * ```js
       * // ng1
       * $transitions.onStart( { to: 'auth.**' }, function(trans) {
       *   var $state = trans.router.stateService;
       *   var MyAuthService = trans.injector().get('MyAuthService');
       *
       *   // If the user is not authenticated
       *   if (!MyAuthService.isAuthenticated()) {
       *
       *     // Then return a promise for a successful login.
       *     // The transition will wait for this promise to settle
       *
       *     return MyAuthService.authenticate().catch(function() {
       *
       *       // If the authenticate() method failed for whatever reason,
       *       // redirect to a 'guest' state which doesn't require auth.
       *       return $state.target("guest");
       *     });
       *   }
       * });
       * ```
       *
       * @param matchCriteria defines which Transitions the Hook should be invoked for.
       * @param callback the hook function which will be injected and invoked.
       * @returns a function which deregisters the hook.
       */
  def onStart(matchCriteria: HookMatchCriteria, callback: TransitionHookFn): js.Function = js.native
  /**
       * Registers a [[TransitionHookFn]], called when a transition starts.
       *
       * Registers a transition lifecycle hook, which is invoked as a transition starts running.
       * This hook can be useful to perform some asynchronous action before completing a transition.
       *
       * See [[TransitionHookFn]] for the signature of the function.
       *
       * The [[HookMatchCriteria]] is used to determine which Transitions the hook should be invoked for.
       * To match all Transitions, use an empty criteria object `{}`.
       *
       * ### Lifecycle
       *
       * `onStart` hooks are invoked asynchronously when the Transition starts running.
       * This happens after the `onBefore` phase is complete.
       * At this point, the Transition has not yet exited nor entered any states.
       * The registered `onStart` hooks are invoked in priority order.
       *
       * Note: A built-in `onStart` hook with high priority is used to fetch any eager resolve data.
       *
       * ### Return value
       *
       * The hook's return value can be used to pause, cancel, or redirect the current Transition.
       * See [[HookResult]] for more information.
       *
       * ### Example
       *
       * #### Login during transition
       *
       * This example intercepts any transition to a state which requires authentication, when the user is
       * not currently authenticated.  It allows the user to authenticate asynchronously, then resumes the
       * transition.  If the user did not authenticate successfully, it redirects to the "guest" state, which
       * does not require authentication.
       *
       * This example assumes:
       * - a state tree where all states which require authentication are children of a parent `'auth'` state.
       * - `MyAuthService.isAuthenticated()` synchronously returns a boolean.
       * - `MyAuthService.authenticate()` presents a login dialog, and returns a promise which is resolved
       *   or rejected, whether or not the login attempt was successful.
       *
       * #### Example:
       * ```js
       * // ng1
       * $transitions.onStart( { to: 'auth.**' }, function(trans) {
       *   var $state = trans.router.stateService;
       *   var MyAuthService = trans.injector().get('MyAuthService');
       *
       *   // If the user is not authenticated
       *   if (!MyAuthService.isAuthenticated()) {
       *
       *     // Then return a promise for a successful login.
       *     // The transition will wait for this promise to settle
       *
       *     return MyAuthService.authenticate().catch(function() {
       *
       *       // If the authenticate() method failed for whatever reason,
       *       // redirect to a 'guest' state which doesn't require auth.
       *       return $state.target("guest");
       *     });
       *   }
       * });
       * ```
       *
       * @param matchCriteria defines which Transitions the Hook should be invoked for.
       * @param callback the hook function which will be injected and invoked.
       * @returns a function which deregisters the hook.
       */
  def onStart(matchCriteria: HookMatchCriteria, callback: TransitionHookFn, options: HookRegOptions): js.Function = js.native
  /**
       * Registers a [[TransitionHookFn]], called after a successful transition completed.
       *
       * Registers a transition lifecycle hook, which is invoked after a transition successfully completes.
       *
       * See [[TransitionHookFn]] for the signature of the function.
       *
       * The [[HookMatchCriteria]] is used to determine which Transitions the hook should be invoked for.
       * To match all Transitions, use an empty criteria object `{}`.
       *
       * ### Lifecycle
       *
       * `onSuccess` hooks are chained off the Transition's promise (see [[Transition.promise]]).
       * If the Transition is successful and its promise is resolved, then the `onSuccess` hooks are invoked.
       * Since these hooks are run after the transition is over, their return value is ignored.
       * The `onSuccess` hooks are invoked in priority order.
       *
       * ### Return value
       *
       * Since the Transition is already completed, the hook's return value is ignored
       *
       * @param matchCriteria defines which Transitions the Hook should be invoked for.
       * @param callback the hook function which will be injected and invoked.
       * @returns a function which deregisters the hook.
       */
  def onSuccess(matchCriteria: HookMatchCriteria, callback: TransitionHookFn): js.Function = js.native
  /**
       * Registers a [[TransitionHookFn]], called after a successful transition completed.
       *
       * Registers a transition lifecycle hook, which is invoked after a transition successfully completes.
       *
       * See [[TransitionHookFn]] for the signature of the function.
       *
       * The [[HookMatchCriteria]] is used to determine which Transitions the hook should be invoked for.
       * To match all Transitions, use an empty criteria object `{}`.
       *
       * ### Lifecycle
       *
       * `onSuccess` hooks are chained off the Transition's promise (see [[Transition.promise]]).
       * If the Transition is successful and its promise is resolved, then the `onSuccess` hooks are invoked.
       * Since these hooks are run after the transition is over, their return value is ignored.
       * The `onSuccess` hooks are invoked in priority order.
       *
       * ### Return value
       *
       * Since the Transition is already completed, the hook's return value is ignored
       *
       * @param matchCriteria defines which Transitions the Hook should be invoked for.
       * @param callback the hook function which will be injected and invoked.
       * @returns a function which deregisters the hook.
       */
  def onSuccess(matchCriteria: HookMatchCriteria, callback: TransitionHookFn, options: HookRegOptions): js.Function = js.native
}

