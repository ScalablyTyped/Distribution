package typings.atUirouterCore.libResolveInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResolvePolicy extends js.Object {
  /**
    * Determines the unwrapping behavior of asynchronous resolve values.
    *
    * - `WAIT` (default)
    *   - If a promise is returned from the resolveFn, wait for the promise before proceeding
    *   - The unwrapped value from the promise
    * - `NOWAIT`
    *   - If a promise is returned from the resolve, do not wait for the promise.
    *   - Any other value returned is wrapped in a promise.
    *   - The promise will not be unwrapped.
    *   - The promise itself will be provided when the resolve is injected or bound elsewhere.
    * - `RXWAIT`
    *   - When an Observable is returned from the resolveFn, wait until the Observable emits at least one item.
    *   - The Observable item will not be unwrapped.
    *   - The Observable stream itself will be provided when the resolve is injected or bound elsewhere.
    *
    * #### Example:
    * The `Transition` will not wait for the resolve promise(s) from `main` to settle before continuing.
    * Resolves for `main` will be provided to components wrapped in a `Promise`.
    *
    * The `Transition` will wait for the `main.home` resolve promises.
    * Resolved values will be unwrapped before being provided to components.
    * ```js
    * var mainState = {
    *   name: 'main',
    *   resolve: mainResolves, // defined elsewhere
    *   resolvePolicy: { async: 'NOWAIT' },
    * }
    * var homeState = {
    *   name: 'main.home',
    *   resolve: homeResolves, // defined elsewhere
    *   resolvePolicy: { async: 'WAIT' }, // default
    * }
    * ```
    */
  var async: js.UndefOr[PolicyAsync] = js.undefined
  /**
    * Defines when a Resolvable is resolved (fetched) during a transition
    *
    * - `LAZY` (default)
    *   - Resolved as the resolve's state is being entered
    * - `EAGER`
    *   - Resolved as the transition is starting
    *
    * #### Example:
    * Resolves for `main` and `main.home` are fetched when each state is entered.
    * All of `main` resolves are processed before fetching `main.home` resolves.
    * ```js
    * var state = {
    *   name: 'main',
    *   resolve: mainResolves, // defined elsewhere
    *   resolvePolicy: { when: 'LAZY' }, // default
    * }
    *
    * var state = {
    *   name: 'main.home',
    *   resolve: homeResolves, // defined elsewhere
    *   resolvePolicy: { when: 'LAZY' }, // default
    * }
    * ```
    *
    * #### Example:
    * Resolves for `main` and `main.home` are fetched at the same time when the transition starts.
    * This happens earlier in the lifecycle than when states are entered.
    * All of the `main` and `main.home` resolves are fetched as soon as possible.
    * ```js
    * var mainState = {
    *   name: 'main',
    *   resolve: mainResolves, // defined elsewhere
    *   resolvePolicy: { when: 'EAGER' },
    * }
    *
    * var homeState = {
    *   name: 'main.home',
    *   resolve: homeResolves, // defined elsewhere
    *   resolvePolicy: { when: 'EAGER' },
    * }
    * ```
    */
  var when: js.UndefOr[PolicyWhen] = js.undefined
}

object ResolvePolicy {
  @scala.inline
  def apply(async: PolicyAsync = null, when: PolicyWhen = null): ResolvePolicy = {
    val __obj = js.Dynamic.literal()
    if (async != null) __obj.updateDynamic("async")(async.asInstanceOf[js.Any])
    if (when != null) __obj.updateDynamic("when")(when.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolvePolicy]
  }
}

