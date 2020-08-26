package typings.winrtUwp.anon

import typings.winrtUwp.Windows.Devices.Enumeration.DeviceInformation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ItemsDeviceInformation extends js.Object {
  /** The array of DeviceInformation objects starting at the index specified by startIndex. */ var items: DeviceInformation = js.native
  /** The number of DeviceInformation objects returned. */ var returnValue: Double = js.native
}

object ItemsDeviceInformation {
  @scala.inline
  def apply(items: DeviceInformation, returnValue: Double): ItemsDeviceInformation = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemsDeviceInformation]
  }
  @scala.inline
  implicit class ItemsDeviceInformationOps[Self <: ItemsDeviceInformation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setItems(value: DeviceInformation): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def setReturnValue(value: Double): Self = this.set("returnValue", value.asInstanceOf[js.Any])
  }
  
}

