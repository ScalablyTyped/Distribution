package typings.w3cDashWebDashUsb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Navigator extends js.Object {
  val usb: USB
}

object Navigator {
  @scala.inline
  def apply(usb: USB): Navigator = {
    val __obj = js.Dynamic.literal(usb = usb.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Navigator]
  }
}

