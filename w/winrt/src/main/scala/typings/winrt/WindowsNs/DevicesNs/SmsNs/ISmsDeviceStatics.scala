package typings.winrt.WindowsNs.DevicesNs.SmsNs

import typings.winrt.WindowsNs.FoundationNs.IAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISmsDeviceStatics extends js.Object {
  def fromIdAsync(deviceInstanceId: String): IAsyncOperation[SmsDevice]
  def getDefaultAsync(): IAsyncOperation[SmsDevice]
  def getDeviceSelector(): String
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
}

