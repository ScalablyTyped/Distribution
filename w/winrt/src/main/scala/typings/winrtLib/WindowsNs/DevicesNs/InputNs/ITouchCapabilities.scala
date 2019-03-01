package typings
package winrtLib.WindowsNs.DevicesNs.InputNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITouchCapabilities extends js.Object {
  var contacts: scala.Double
  var touchPresent: scala.Double
}

object ITouchCapabilities {
  @scala.inline
  def apply(contacts: scala.Double, touchPresent: scala.Double): ITouchCapabilities = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("contacts")(contacts)
    __obj.updateDynamic("touchPresent")(touchPresent)
    __obj.asInstanceOf[ITouchCapabilities]
  }
}

