package typings.winrt.Windows.Devices.Portable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IServiceDeviceStatics extends js.Object {
  def getDeviceSelector(serviceType: ServiceDeviceType): String = js.native
  def getDeviceSelectorFromServiceId(serviceId: String): String = js.native
}

object IServiceDeviceStatics {
  @scala.inline
  def apply(getDeviceSelector: ServiceDeviceType => String, getDeviceSelectorFromServiceId: String => String): IServiceDeviceStatics = {
    val __obj = js.Dynamic.literal(getDeviceSelector = js.Any.fromFunction1(getDeviceSelector), getDeviceSelectorFromServiceId = js.Any.fromFunction1(getDeviceSelectorFromServiceId))
    __obj.asInstanceOf[IServiceDeviceStatics]
  }
  @scala.inline
  implicit class IServiceDeviceStaticsOps[Self <: IServiceDeviceStatics] (val x: Self) extends AnyVal {
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
    def setGetDeviceSelector(value: ServiceDeviceType => String): Self = this.set("getDeviceSelector", js.Any.fromFunction1(value))
    @scala.inline
    def setGetDeviceSelectorFromServiceId(value: String => String): Self = this.set("getDeviceSelectorFromServiceId", js.Any.fromFunction1(value))
  }
  
}

