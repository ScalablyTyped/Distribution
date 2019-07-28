package typings.atUirouterCore.libTransitionTransitionMod

import org.scalablytyped.runtime.StringDictionary
import typings.atUirouterCore.Anon_FromTo
import typings.atUirouterCore.TypeofClassTransition
import typings.atUirouterCore.atUirouterCoreStrings.SameAsCurrent
import typings.atUirouterCore.atUirouterCoreStrings.SameAsPending
import typings.atUirouterCore.libInterfaceMod.UIInjector
import typings.atUirouterCore.libPathPathNodeMod.PathNode
import typings.atUirouterCore.libResolveInterfaceMod.ResolvableLiteral
import typings.atUirouterCore.libResolveResolvableMod.Resolvable
import typings.atUirouterCore.libRouterMod.UIRouter
import typings.atUirouterCore.libStateInterfaceMod.StateDeclaration
import typings.atUirouterCore.libStateInterfaceMod.StateOrName
import typings.atUirouterCore.libStateStateObjectMod.StateObject
import typings.atUirouterCore.libStateTargetStateMod.TargetState
import typings.atUirouterCore.libTransitionInterfaceMod.IHookRegistry
import typings.atUirouterCore.libTransitionInterfaceMod.RegisteredHooks
import typings.atUirouterCore.libTransitionInterfaceMod.TransitionOptions
import typings.atUirouterCore.libTransitionInterfaceMod.TreeChanges
import typings.atUirouterCore.libTransitionRejectFactoryMod.Rejection
import typings.atUirouterCore.libViewInterfaceMod.ViewConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uirouter/core/lib/transition/transition", "Transition")
@js.native
class Transition protected () extends IHookRegistry {
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
  def this(fromPath: js.Array[PathNode], targetState: TargetState, router: UIRouter) = this()
  /**
    * A unique identifier for the transition.
    *
    * This is an auto incrementing integer, starting from `0`.
    */
  @JSName("$id")
  var $id: Double = js.native
  /** @hidden */
  var _aborted: Boolean = js.native
  /** @hidden If a transition doesn't exit/enter any states, returns any [[Param]] whose value changed */
  var _changedParams: js.Any = js.native
  /** @hidden */
  var _deferred: js.Any = js.native
  /** @hidden */
  var _error: js.Any = js.native
  /** @hidden */
  var _hookBuilder: js.Any = js.native
  /** @hidden */
  var _options: js.Any = js.native
  /** @hidden Holds the hook registration functions such as those passed to Transition.onStart() */
  @JSName("_registeredHooks")
  var _registeredHooks_Transition: RegisteredHooks = js.native
  /** @hidden */
  var _targetState: js.Any = js.native
  /** @hidden */
  var _treeChanges: js.Any = js.native
  var applyViewConfigs: js.Any = js.native
  /** @hidden
    * Creates the transition-level hook registration functions
    * (which can then be used to register hooks)
    */
  var createTransitionHookRegFns: js.Any = js.native
  /**
    * This promise is resolved or rejected based on the outcome of the Transition.
    *
    * When the transition is successful, the promise is resolved
    * When the transition is unsuccessful, the promise is rejected with the [[Rejection]] or javascript error
    */
  var promise: js.Promise[_] = js.native
  /**
    * A reference to the [[UIRouter]] instance
    *
    * This reference can be used to access the router services, such as the [[StateService]]
    */
  var router: UIRouter = js.native
  /**
    * A boolean which indicates if the transition was successful
    *
    * After a successful transition, this value is set to true.
    * After an unsuccessful transition, this value is set to false.
    *
    * The value will be undefined if the transition is not complete
    */
  var success: Boolean = js.native
  /**
    * @internalapi
    *
    * @returns the internal from [State] object
    */
  @JSName("$from")
  def $from(): StateObject = js.native
  /**
    * @internalapi
    *
    * @returns the internal to [State] object
    */
  @JSName("$to")
  def $to(): StateObject = js.native
  /** @hidden */
  def _ignoredReason(): js.UndefOr[SameAsCurrent | SameAsPending] = js.native
  /**
    * Aborts this transition
    *
    * Imperative API to abort a Transition.
    * This only applies to Transitions that are not yet complete.
    */
  def abort(): Unit = js.native
  def addResolvable(resolvable: ResolvableLiteral): Unit = js.native
  def addResolvable(resolvable: ResolvableLiteral, state: StateOrName): Unit = js.native
  /**
    * Dynamically adds a new [[Resolvable]] (i.e., [[StateDeclaration.resolve]]) to this transition.
    *
    * Allows a transition hook to dynamically add a Resolvable to this Transition.
    *
    * Use the [[Transition.injector]] to retrieve the resolved data in subsequent hooks ([[UIInjector.get]]).
    *
    * If a `state` argument is provided, the Resolvable is processed when that state is being entered.
    * If no `state` is provided then the root state is used.
    * If the given `state` has already been entered, the Resolvable is processed when any child state is entered.
    * If no child states will be entered, the Resolvable is processed during the `onFinish` phase of the Transition.
    *
    * The `state` argument also scopes the resolved data.
    * The resolved data is available from the injector for that `state` and any children states.
    *
    * #### Example:
    * ```js
    * transitionService.onBefore({}, transition => {
    *   transition.addResolvable({
    *     token: 'myResolve',
    *     deps: ['MyService'],
    *     resolveFn: myService => myService.getData()
    *   });
    * });
    * ```
    *
    * @param resolvable a [[ResolvableLiteral]] object (or a [[Resolvable]])
    * @param state the state in the "to path" which should receive the new resolve (otherwise, the root state)
    */
  def addResolvable(resolvable: Resolvable): Unit = js.native
  def addResolvable(resolvable: Resolvable, state: StateOrName): Unit = js.native
  /**
    * Returns true if the transition is dynamic.
    *
    * A transition is dynamic if no states are entered nor exited, but at least one dynamic parameter has changed.
    *
    * @returns true if the Transition is dynamic
    */
  def dynamic(): Boolean = js.native
  /**
    * Gets the states being entered.
    *
    * @returns an array of states that will be entered during this transition.
    */
  def entering(): js.Array[StateDeclaration] = js.native
  /**
    * The Transition error reason.
    *
    * If the transition is invalid (and could not be run), returns the reason the transition is invalid.
    * If the transition was valid and ran, but was not successful, returns the reason the transition failed.
    *
    * @returns a transition rejection explaining why the transition is invalid, or the reason the transition failed.
    */
  def error(): Rejection = js.native
  /**
    * Gets the states being exited.
    *
    * @returns an array of states that will be exited during this transition.
    */
  def exiting(): js.Array[StateDeclaration] = js.native
  /**
    * Returns the "from state"
    *
    * Returns the state that the transition is coming *from*.
    *
    * @returns The state declaration object for the Transition's ("from state").
    */
  def from(): StateDeclaration = js.native
  /**
    * Gets all available resolve tokens (keys)
    *
    * This method can be used in conjunction with [[injector]] to inspect the resolve values
    * available to the Transition.
    *
    * This returns all the tokens defined on [[StateDeclaration.resolve]] blocks, for the states
    * in the Transition's [[TreeChanges.to]] path.
    *
    * #### Example:
    * This example logs all resolve values
    * ```js
    * let tokens = trans.getResolveTokens();
    * tokens.forEach(token => console.log(token + " = " + trans.injector().get(token)));
    * ```
    *
    * #### Example:
    * This example creates promises for each resolve value.
    * This triggers fetches of resolves (if any have not yet been fetched).
    * When all promises have all settled, it logs the resolve values.
    * ```js
    * let tokens = trans.getResolveTokens();
    * let promise = tokens.map(token => trans.injector().getAsync(token));
    * Promise.all(promises).then(values => console.log("Resolved values: " + values));
    * ```
    *
    * Note: Angular 1 users whould use `$q.all()`
    *
    * @param pathname resolve context's path name (e.g., `to` or `from`)
    *
    * @returns an array of resolve tokens (keys)
    */
  def getResolveTokens(): js.Array[_] = js.native
  def getResolveTokens(pathname: String): js.Array[_] = js.native
  /**
    * Returns true if the transition is ignored.
    *
    * A transition is ignored if no states are entered nor exited, and no parameter values have changed.
    *
    * @returns true if the Transition is ignored.
    */
  def ignored(): Boolean = js.native
  /**
    * Creates a [[UIInjector]] Dependency Injector
    *
    * Returns a Dependency Injector for the Transition's target state (to state).
    * The injector provides resolve values which the target state has access to.
    *
    * The `UIInjector` can also provide values from the native root/global injector (ng1/ng2).
    *
    * #### Example:
    * ```js
    * .onEnter({ entering: 'myState' }, trans => {
    *   var myResolveValue = trans.injector().get('myResolve');
    *   // Inject a global service from the global/native injector (if it exists)
    *   var MyService = trans.injector().get('MyService');
    * })
    * ```
    *
    * In some cases (such as `onBefore`), you may need access to some resolve data but it has not yet been fetched.
    * You can use [[UIInjector.getAsync]] to get a promise for the data.
    * #### Example:
    * ```js
    * .onBefore({}, trans => {
    *   return trans.injector().getAsync('myResolve').then(myResolveValue =>
    *     return myResolveValue !== 'ABORT';
    *   });
    * });
    * ```
    *
    * If a `state` is provided, the injector that is returned will be limited to resolve values that the provided state has access to.
    * This can be useful if both a parent state `foo` and a child state `foo.bar` have both defined a resolve such as `data`.
    * #### Example:
    * ```js
    * .onEnter({ to: 'foo.bar' }, trans => {
    *   // returns result of `foo` state's `myResolve` resolve
    *   // even though `foo.bar` also has a `myResolve` resolve
    *   var fooData = trans.injector('foo').get('myResolve');
    * });
    * ```
    *
    * If you need resolve data from the exiting states, pass `'from'` as `pathName`.
    * The resolve data from the `from` path will be returned.
    * #### Example:
    * ```js
    * .onExit({ exiting: 'foo.bar' }, trans => {
    *   // Gets the resolve value of `myResolve` from the state being exited
    *   var fooData = trans.injector(null, 'from').get('myResolve');
    * });
    * ```
    *
    *
    * @param state Limits the resolves provided to only the resolves the provided state has access to.
    * @param pathName Default: `'to'`: Chooses the path for which to create the injector. Use this to access resolves for `exiting` states.
    *
    * @returns a [[UIInjector]]
    */
  def injector(): UIInjector = js.native
  def injector(state: StateOrName): UIInjector = js.native
  def injector(state: StateOrName, pathName: String): UIInjector = js.native
  def is(compare: Anon_FromTo): Boolean = js.native
  /**
    * Determines whether two transitions are equivalent.
    * @deprecated
    */
  def is(compare: Transition): Boolean = js.native
  /** Checks if this transition is currently active/running. */
  def isActive(): Boolean = js.native
  /**
    * Get the transition options
    *
    * @returns the options for this Transition.
    */
  def options(): TransitionOptions = js.native
  /**
    * Gets the original transition in a redirect chain
    *
    * A transition might belong to a long chain of multiple redirects.
    * This method walks the [[redirectedFrom]] chain back to the original (first) transition in the chain.
    *
    * #### Example:
    * ```js
    * // states
    * registry.register({ name: 'A', redirectTo: 'B' });
    * registry.register({ name: 'B', redirectTo: 'C' });
    * registry.register({ name: 'C', redirectTo: 'D' });
    * registry.register({ name: 'D' });
    *
    * let transitionA = $state.go('A').transition
    *
    * $transitions.onSuccess({ to: 'D' }, (trans) => {
    *   trans.to().name === 'D'; // true
    *   trans.redirectedFrom().to().name === 'C'; // true
    *   trans.originalTransition() === transitionA; // true
    *   trans.originalTransition().to().name === 'A'; // true
    * });
    * ```
    *
    * @returns The original Transition that started a redirect chain
    */
  def originalTransition(): Transition = js.native
  /**
    * Gets transition parameter values
    *
    * Returns the parameter values for a transition as key/value pairs.
    * This object is immutable.
    *
    * By default, returns the new parameter values (for the "to state").
    *
    * #### Example:
    * ```js
    * var toParams = transition.params();
    * ```
    *
    * To return the previous parameter values,  supply `'from'` as the `pathname` argument.
    *
    * #### Example:
    * ```js
    * var fromParams = transition.params('from');
    * ```
    *
    * @param pathname the name of the treeChanges path to get parameter values for:
    *   (`'to'`, `'from'`, `'entering'`, `'exiting'`, `'retained'`)
    *
    * @returns transition parameter values for the desired path.
    */
  def params(): StringDictionary[js.Any] = js.native
  def params(pathname: String): StringDictionary[js.Any] = js.native
  /**
    * Gets the new values of any parameters that changed during this transition.
    *
    * Returns any parameter values that have changed during a transition, as key/value pairs.
    *
    * - Any parameter values that have changed will be present on the returned object reflecting the new value.
    * - Any parameters that *not* have changed will not be present on the returned object.
    * - Any new parameters that weren't present in the "from" state, but are now present in the "to" state will be present on the returned object.
    * - Any previous parameters that are no longer present (because the "to" state doesn't have them) will be included with a value of `undefined`.
    *
    * The returned object is immutable.
    *
    * #### Examples:
    *
    * Given:
    * ```js
    * var stateA = { name: 'stateA', url: '/stateA/:param1/param2' }
    * var stateB = { name: 'stateB', url: '/stateB/:param3' }
    * var stateC = { name: 'stateB.nest', url: '/nest/:param4' }
    * ```
    *
    * #### Example 1
    *
    * From `/stateA/abc/def` to `/stateA/abc/xyz`
    *
    * ```js
    * var changed = transition.paramsChanged()
    * // changed is { param2: 'xyz' }
    * ```
    *
    * The value of `param2` changed to `xyz`.
    * The value of `param1` stayed the same so its value is not present.
    *
    * #### Example 2
    *
    * From `/stateA/abc/def` to `/stateB/123`
    *
    * ```js
    * var changed = transition.paramsChanged()
    * // changed is { param1: undefined, param2: undefined, param3: '123' }
    * ```
    *
    * The value `param3` is present because it is a new param.
    * Both `param1` and `param2` are no longer present so their value is undefined.
    *
    * #### Example 3
    *
    * From `/stateB/123` to `/stateB/123/nest/456`
    *
    * ```js
    * var changed = transition.paramsChanged()
    * // changed is { param4: '456' }
    * ```
    *
    * The value `param4` is present because it is a new param.
    * The value of `param3` did not change, so its value is not present.
    *
    * @returns an immutable object with changed parameter keys/values.
    */
  def paramsChanged(): StringDictionary[js.Any] = js.native
  @JSName("paramsChanged")
  def paramsChanged_T_T[T](): T = js.native
  @JSName("params")
  def params_T_T[T](): T = js.native
  @JSName("params")
  def params_T_T[T](pathname: String): T = js.native
  /**
    * Creates a new transition that is a redirection of the current one.
    *
    * This transition can be returned from a [[TransitionService]] hook to
    * redirect a transition to a new state and/or set of parameters.
    *
    * @internalapi
    *
    * @returns Returns a new [[Transition]] instance.
    */
  def redirect(targetState: TargetState): Transition = js.native
  /**
    * Gets the transition from which this transition was redirected.
    *
    * If the current transition is a redirect, this method returns the transition that was redirected.
    *
    * #### Example:
    * ```js
    * let transitionA = $state.go('A').transition
    * transitionA.onStart({}, () => $state.target('B'));
    * $transitions.onSuccess({ to: 'B' }, (trans) => {
    *   trans.to().name === 'B'; // true
    *   trans.redirectedFrom() === transitionA; // true
    * });
    * ```
    *
    * @returns The previous Transition, or null if this Transition is not the result of a redirection
    */
  def redirectedFrom(): Transition = js.native
  /**
    * Gets the states being retained.
    *
    * @returns an array of states that are already entered from a previous Transition, that will not be
    *    exited during this Transition
    */
  def retained(): js.Array[StateDeclaration] = js.native
  /**
    * Runs the transition
    *
    * This method is generally called from the [[StateService.transitionTo]]
    *
    * @internalapi
    *
    * @returns a promise for a successful transition.
    */
  def run(): js.Promise[_] = js.native
  /**
    * Gets the Target State
    *
    * A transition's [[TargetState]] encapsulates the [[to]] state, the [[params]], and the [[options]] as a single object.
    *
    * @returns the [[TargetState]] of this Transition
    */
  def targetState(): TargetState = js.native
  /**
    * Returns the "to state"
    *
    * Returns the state that the transition is going *to*.
    *
    * @returns The state declaration object for the Transition's target state ("to state").
    */
  def to(): StateDeclaration = js.native
  def treeChanges(): TreeChanges = js.native
  /**
    * Return the transition's tree changes
    *
    * A transition goes from one state/parameters to another state/parameters.
    * During a transition, states are entered and/or exited.
    *
    * This function returns various branches (paths) which represent the changes to the
    * active state tree that are caused by the transition.
    *
    * @param pathname The name of the tree changes path to get:
    *   (`'to'`, `'from'`, `'entering'`, `'exiting'`, `'retained'`)
    */
  def treeChanges(pathname: String): js.Array[PathNode] = js.native
  /**
    * Checks if the Transition is valid
    *
    * @returns true if the Transition is valid
    */
  def valid(): Boolean = js.native
  /**
    * Get the [[ViewConfig]]s associated with this Transition
    *
    * Each state can define one or more views (template/controller), which are encapsulated as `ViewConfig` objects.
    * This method fetches the `ViewConfigs` for a given path in the Transition (e.g., "to" or "entering").
    *
    * @param pathname the name of the path to fetch views for:
    *   (`'to'`, `'from'`, `'entering'`, `'exiting'`, `'retained'`)
    * @param state If provided, only returns the `ViewConfig`s for a single state in the path
    *
    * @returns a list of ViewConfig objects for the given path.
    */
  def views(): js.Array[ViewConfig] = js.native
  def views(pathname: String): js.Array[ViewConfig] = js.native
  def views(pathname: String, state: StateObject): js.Array[ViewConfig] = js.native
}

/* static members */
@JSImport("@uirouter/core/lib/transition/transition", "Transition")
@js.native
object Transition extends js.Object {
  /** @hidden */
  var diToken: TypeofClassTransition = js.native
}

