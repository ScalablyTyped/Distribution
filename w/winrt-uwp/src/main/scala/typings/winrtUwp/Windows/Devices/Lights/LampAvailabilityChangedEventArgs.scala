package typings.winrtUwp.Windows.Devices.Lights

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the AvailabilityChanged event. */
trait LampAvailabilityChangedEventArgs extends js.Object {
  /** Gets a value indicating whether the lamp device that triggered the event is available. */
  var isAvailable: Boolean
}

object LampAvailabilityChangedEventArgs {
  @scala.inline
  def apply(isAvailable: Boolean): LampAvailabilityChangedEventArgs = {
    val __obj = js.Dynamic.literal(isAvailable = isAvailable.asInstanceOf[js.Any])
    __obj.asInstanceOf[LampAvailabilityChangedEventArgs]
  }
}

