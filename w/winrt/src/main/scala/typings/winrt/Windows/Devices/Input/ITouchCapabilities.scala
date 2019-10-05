package typings.winrt.Windows.Devices.Input

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITouchCapabilities extends js.Object {
  var contacts: Double
  var touchPresent: Double
}

object ITouchCapabilities {
  @scala.inline
  def apply(contacts: Double, touchPresent: Double): ITouchCapabilities = {
    val __obj = js.Dynamic.literal(contacts = contacts, touchPresent = touchPresent)
  
    __obj.asInstanceOf[ITouchCapabilities]
  }
}

