package typings
package w3cDashWebDashUsbLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait USBDeviceRequestOptions extends js.Object {
  var filters: js.Array[USBDeviceFilter]
}

object USBDeviceRequestOptions {
  @scala.inline
  def apply(filters: js.Array[USBDeviceFilter]): USBDeviceRequestOptions = {
    val __obj = js.Dynamic.literal(filters = filters)
  
    __obj.asInstanceOf[USBDeviceRequestOptions]
  }
}

