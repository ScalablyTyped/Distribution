package typings
package webDashBluetoothLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Navigator extends js.Object {
  var bluetooth: Bluetooth
}

object Navigator {
  @scala.inline
  def apply(bluetooth: Bluetooth): Navigator = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("bluetooth")(bluetooth)
    __obj.asInstanceOf[Navigator]
  }
}

