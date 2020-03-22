package typings.winrtUwp

import typings.winrtUwp.Windows.Devices.Enumeration.DeviceInformation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonItemsDeviceInformation extends js.Object {
  /** The array of DeviceInformation objects starting at the index specified by startIndex. */ var items: DeviceInformation
  /** The number of DeviceInformation objects returned. */ var returnValue: Double
}

object AnonItemsDeviceInformation {
  @scala.inline
  def apply(items: DeviceInformation, returnValue: Double): AnonItemsDeviceInformation = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonItemsDeviceInformation]
  }
}

