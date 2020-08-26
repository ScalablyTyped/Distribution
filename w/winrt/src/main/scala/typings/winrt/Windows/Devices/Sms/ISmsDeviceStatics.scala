package typings.winrt.Windows.Devices.Sms

import typings.winrt.Windows.Foundation.IAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISmsDeviceStatics extends js.Object {
  def fromIdAsync(deviceInstanceId: String): IAsyncOperation[SmsDevice] = js.native
  def getDefaultAsync(): IAsyncOperation[SmsDevice] = js.native
  def getDeviceSelector(): String = js.native
}

object ISmsDeviceStatics {
  @scala.inline
  def apply(
    fromIdAsync: String => IAsyncOperation[SmsDevice],
    getDefaultAsync: () => IAsyncOperation[SmsDevice],
    getDeviceSelector: () => String
  ): ISmsDeviceStatics = {
    val __obj = js.Dynamic.literal(fromIdAsync = js.Any.fromFunction1(fromIdAsync), getDefaultAsync = js.Any.fromFunction0(getDefaultAsync), getDeviceSelector = js.Any.fromFunction0(getDeviceSelector))
    __obj.asInstanceOf[ISmsDeviceStatics]
  }
  @scala.inline
  implicit class ISmsDeviceStaticsOps[Self <: ISmsDeviceStatics] (val x: Self) extends AnyVal {
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
    def setFromIdAsync(value: String => IAsyncOperation[SmsDevice]): Self = this.set("fromIdAsync", js.Any.fromFunction1(value))
    @scala.inline
    def setGetDefaultAsync(value: () => IAsyncOperation[SmsDevice]): Self = this.set("getDefaultAsync", js.Any.fromFunction0(value))
    @scala.inline
    def setGetDeviceSelector(value: () => String): Self = this.set("getDeviceSelector", js.Any.fromFunction0(value))
  }
  
}

