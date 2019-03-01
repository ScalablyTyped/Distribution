package typings
package winrtLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ItemsReturnValueArrayDeviceInformation extends js.Object {
  var items: js.Array[winrtLib.WindowsNs.DevicesNs.EnumerationNs.DeviceInformation]
  var returnValue: scala.Double
}

object Anon_ItemsReturnValueArrayDeviceInformation {
  @scala.inline
  def apply(
    items: js.Array[winrtLib.WindowsNs.DevicesNs.EnumerationNs.DeviceInformation],
    returnValue: scala.Double
  ): Anon_ItemsReturnValueArrayDeviceInformation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("items")(items)
    __obj.updateDynamic("returnValue")(returnValue)
    __obj.asInstanceOf[Anon_ItemsReturnValueArrayDeviceInformation]
  }
}

