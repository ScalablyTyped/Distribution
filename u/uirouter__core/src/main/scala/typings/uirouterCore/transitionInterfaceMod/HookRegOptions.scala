package typings.uirouterCore.transitionInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HookRegOptions extends js.Object {
  /**
    * Specifies what `this` is bound to during hook invocation.
    */
  var bind: js.UndefOr[js.Any] = js.undefined
  /**
    * Limits the number of times that the hook will be invoked.
    * Once the hook has been invoked this many times, it is automatically deregistered.
    */
  var invokeLimit: js.UndefOr[Double] = js.undefined
  /**
    * Sets the priority of the registered hook
    *
    * Hooks of the same type (onBefore, onStart, etc) are invoked in priority order.  A hook with a higher priority
    * is invoked before a hook with a lower priority.
    *
    * The default hook priority is 0
    */
  var priority: js.UndefOr[Double] = js.undefined
}

object HookRegOptions {
  @scala.inline
  def apply(
    bind: js.Any = null,
    invokeLimit: js.UndefOr[Double] = js.undefined,
    priority: js.UndefOr[Double] = js.undefined
  ): HookRegOptions = {
    val __obj = js.Dynamic.literal()
    if (bind != null) __obj.updateDynamic("bind")(bind.asInstanceOf[js.Any])
    if (!js.isUndefined(invokeLimit)) __obj.updateDynamic("invokeLimit")(invokeLimit.get.asInstanceOf[js.Any])
    if (!js.isUndefined(priority)) __obj.updateDynamic("priority")(priority.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[HookRegOptions]
  }
}

