package typings.atUirouterCore.libTransitionInterfaceMod

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
  def apply(bind: js.Any = null, invokeLimit: Int | Double = null, priority: Int | Double = null): HookRegOptions = {
    val __obj = js.Dynamic.literal()
    if (bind != null) __obj.updateDynamic("bind")(bind.asInstanceOf[js.Any])
    if (invokeLimit != null) __obj.updateDynamic("invokeLimit")(invokeLimit.asInstanceOf[js.Any])
    if (priority != null) __obj.updateDynamic("priority")(priority.asInstanceOf[js.Any])
    __obj.asInstanceOf[HookRegOptions]
  }
}

