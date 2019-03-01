package typings
package winrtDashUwpLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ItemsReturnValueDeviceInformation extends js.Object {
  /** The array of DeviceInformation objects starting at the index specified by startIndex. */ var items: winrtDashUwpLib.WindowsNs.DevicesNs.EnumerationNs.DeviceInformation
  /** The number of DeviceInformation objects returned. */ var returnValue: scala.Double
}

object Anon_ItemsReturnValueDeviceInformation {
  @scala.inline
  def apply(
    items: winrtDashUwpLib.WindowsNs.DevicesNs.EnumerationNs.DeviceInformation,
    returnValue: scala.Double
  ): Anon_ItemsReturnValueDeviceInformation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("items")(items)
    __obj.updateDynamic("returnValue")(returnValue)
    __obj.asInstanceOf[Anon_ItemsReturnValueDeviceInformation]
  }
}

