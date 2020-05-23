package typings.winrtUwp.Windows.Devices.Input

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Supports the ability to determine the touch capabilities of any connected touch digitizers. */
trait TouchCapabilities extends js.Object {
  /** Gets the minimum number of contacts supported by all the digitizers. */
  var contacts: Double
  /** Gets a value that indicates whether a touch digitizer is detected. */
  var touchPresent: Double
}

object TouchCapabilities {
  @scala.inline
  def apply(contacts: Double, touchPresent: Double): TouchCapabilities = {
    val __obj = js.Dynamic.literal(contacts = contacts.asInstanceOf[js.Any], touchPresent = touchPresent.asInstanceOf[js.Any])
    __obj.asInstanceOf[TouchCapabilities]
  }
}

