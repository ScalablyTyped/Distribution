package typings.webBluetooth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Navigator extends js.Object {
  var bluetooth: Bluetooth
}

object Navigator {
  @scala.inline
  def apply(bluetooth: Bluetooth): Navigator = {
    val __obj = js.Dynamic.literal(bluetooth = bluetooth.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Navigator]
  }
}

