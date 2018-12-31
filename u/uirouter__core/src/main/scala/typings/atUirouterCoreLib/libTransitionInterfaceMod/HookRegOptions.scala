package typings
package atUirouterCoreLib.libTransitionInterfaceMod

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
  var invokeLimit: js.UndefOr[scala.Double] = js.undefined
  /**
    * Sets the priority of the registered hook
    *
    * Hooks of the same type (onBefore, onStart, etc) are invoked in priority order.  A hook with a higher priority
    * is invoked before a hook with a lower priority.
    *
    * The default hook priority is 0
    */
  var priority: js.UndefOr[scala.Double] = js.undefined
}

