package typings.uirouterCore.resolveInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
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
    * - {@link CustomAsyncPolicy}
    *   - You can define a custom function that will be called with the resolveFn value.
    *   - This function must return a promise.
    *   - The transition will wait for this promise before proceeding
    *
    *   NOTE: The previous `RXWAIT` policy has become a CustomAsyncPolicy function exported in `@uirouter/rx` package.
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
  var async: js.UndefOr[PolicyAsync] = js.native
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
  var when: js.UndefOr[PolicyWhen] = js.native
}

object ResolvePolicy {
  @scala.inline
  def apply(): ResolvePolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResolvePolicy]
  }
  @scala.inline
  implicit class ResolvePolicyOps[Self <: ResolvePolicy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAsyncFunction1(value: /* data */ js.Any => js.Promise[js.Any]): Self = this.set("async", js.Any.fromFunction1(value))
    @scala.inline
    def setAsync(value: PolicyAsync): Self = this.set("async", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAsync: Self = this.set("async", js.undefined)
    @scala.inline
    def setWhen(value: PolicyWhen): Self = this.set("when", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWhen: Self = this.set("when", js.undefined)
  }
  
}

