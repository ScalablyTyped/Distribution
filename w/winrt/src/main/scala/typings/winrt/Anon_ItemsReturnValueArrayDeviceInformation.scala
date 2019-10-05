package typings.winrt

import typings.winrt.Windows.Devices.Enumeration.DeviceInformation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ItemsReturnValueArrayDeviceInformation extends js.Object {
  var items: js.Array[DeviceInformation]
  var returnValue: Double
}

object Anon_ItemsReturnValueArrayDeviceInformation {
  @scala.inline
  def apply(items: js.Array[DeviceInformation], returnValue: Double): Anon_ItemsReturnValueArrayDeviceInformation = {
    val __obj = js.Dynamic.literal(items = items, returnValue = returnValue)
  
    __obj.asInstanceOf[Anon_ItemsReturnValueArrayDeviceInformation]
  }
}

