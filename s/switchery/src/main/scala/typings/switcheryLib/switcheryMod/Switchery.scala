package typings
package switcheryLib.switcheryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Switchery extends js.Object {
  /**
    * Unbinding all event handlers attached to the switch element to prepare the object for garbage collection.
    * @returns {void}
    */
  def destroy(): scala.Unit
  /**
    * Disable switch by unbinding attached events and changing opacity to disabledOpacity value
    * @returns {void}
    */
  def disable(): scala.Unit
  /**
    * Enable disabled switch by re-adding event handlers and changing the opacity to 1.
    * @returns {void}
    */
  def enable(): scala.Unit
  /**
    * Check if switch is currently disabled by checking the readonly and disabled attributes on the checkbox and the disabled option set via JS.
    *  If any of those are present, the returned value is true.
    * @returns {boolean} whether it's disabled or not.
    */
  def isDisabled(): scala.Boolean
}

object Switchery {
  @scala.inline
  def apply(
    destroy: js.Function0[scala.Unit],
    disable: js.Function0[scala.Unit],
    enable: js.Function0[scala.Unit],
    isDisabled: js.Function0[scala.Boolean]
  ): Switchery = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("destroy")(destroy)
    __obj.updateDynamic("disable")(disable)
    __obj.updateDynamic("enable")(enable)
    __obj.updateDynamic("isDisabled")(isDisabled)
    __obj.asInstanceOf[Switchery]
  }
}

