package typings.winrtDashUwp

import typings.winrtDashUwp.Windows.Devices.Enumeration.DeviceInformation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ItemsReturnValueDeviceInformation extends js.Object {
  /** The array of DeviceInformation objects starting at the index specified by startIndex. */ var items: DeviceInformation
  /** The number of DeviceInformation objects returned. */ var returnValue: Double
}

object Anon_ItemsReturnValueDeviceInformation {
  @scala.inline
  def apply(items: DeviceInformation, returnValue: Double): Anon_ItemsReturnValueDeviceInformation = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_ItemsReturnValueDeviceInformation]
  }
}

