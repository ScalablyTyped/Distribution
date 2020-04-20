package typings.switchery.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Switchery_ extends js.Object {
  /**
    * Unbinding all event handlers attached to the switch element to prepare the object for garbage collection.
    * @returns {void}
    */
  def destroy(): Unit
  /**
    * Disable switch by unbinding attached events and changing opacity to disabledOpacity value
    * @returns {void}
    */
  def disable(): Unit
  /**
    * Enable disabled switch by re-adding event handlers and changing the opacity to 1.
    * @returns {void}
    */
  def enable(): Unit
  /**
    * Check if switch is currently disabled by checking the readonly and disabled attributes on the checkbox and the disabled option set via JS.
    *  If any of those are present, the returned value is true.
    * @returns {boolean} whether it's disabled or not.
    */
  def isDisabled(): Boolean
}

object Switchery_ {
  @scala.inline
  def apply(destroy: () => Unit, disable: () => Unit, enable: () => Unit, isDisabled: () => Boolean): Switchery_ = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), disable = js.Any.fromFunction0(disable), enable = js.Any.fromFunction0(enable), isDisabled = js.Any.fromFunction0(isDisabled))
    __obj.asInstanceOf[Switchery_]
  }
}

