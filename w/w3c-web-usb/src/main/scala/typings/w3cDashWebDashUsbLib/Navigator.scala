package typings
package w3cDashWebDashUsbLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Navigator extends js.Object {
  val usb: USB
}

object Navigator {
  @scala.inline
  def apply(usb: USB): Navigator = {
    val __obj = js.Dynamic.literal(usb = usb)
  
    __obj.asInstanceOf[Navigator]
  }
}

