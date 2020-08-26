package typings.winrtUwp.Windows.Devices.Input

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Supports the ability to determine the touch capabilities of any connected touch digitizers. */
@js.native
trait TouchCapabilities extends js.Object {
  /** Gets the minimum number of contacts supported by all the digitizers. */
  var contacts: Double = js.native
  /** Gets a value that indicates whether a touch digitizer is detected. */
  var touchPresent: Double = js.native
}

object TouchCapabilities {
  @scala.inline
  def apply(contacts: Double, touchPresent: Double): TouchCapabilities = {
    val __obj = js.Dynamic.literal(contacts = contacts.asInstanceOf[js.Any], touchPresent = touchPresent.asInstanceOf[js.Any])
    __obj.asInstanceOf[TouchCapabilities]
  }
  @scala.inline
  implicit class TouchCapabilitiesOps[Self <: TouchCapabilities] (val x: Self) extends AnyVal {
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
    def setContacts(value: Double): Self = this.set("contacts", value.asInstanceOf[js.Any])
    @scala.inline
    def setTouchPresent(value: Double): Self = this.set("touchPresent", value.asInstanceOf[js.Any])
  }
  
}

