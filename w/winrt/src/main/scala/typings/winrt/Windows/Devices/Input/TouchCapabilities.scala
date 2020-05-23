package typings.winrt.Windows.Devices.Input

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TouchCapabilities extends ITouchCapabilities

object TouchCapabilities {
  @scala.inline
  def apply(contacts: Double, touchPresent: Double): TouchCapabilities = {
    val __obj = js.Dynamic.literal(contacts = contacts.asInstanceOf[js.Any], touchPresent = touchPresent.asInstanceOf[js.Any])
    __obj.asInstanceOf[TouchCapabilities]
  }
}

