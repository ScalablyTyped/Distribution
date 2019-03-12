package typings
package winrtLib.WindowsNs.DevicesNs.SmsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISmsDeviceStatics extends js.Object {
  def fromIdAsync(deviceInstanceId: java.lang.String): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[SmsDevice]
  def getDefaultAsync(): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[SmsDevice]
  def getDeviceSelector(): java.lang.String
}

object ISmsDeviceStatics {
  @scala.inline
  def apply(
    fromIdAsync: java.lang.String => winrtLib.WindowsNs.FoundationNs.IAsyncOperation[SmsDevice],
    getDefaultAsync: () => winrtLib.WindowsNs.FoundationNs.IAsyncOperation[SmsDevice],
    getDeviceSelector: () => java.lang.String
  ): ISmsDeviceStatics = {
    val __obj = js.Dynamic.literal(fromIdAsync = js.Any.fromFunction1(fromIdAsync), getDefaultAsync = js.Any.fromFunction0(getDefaultAsync), getDeviceSelector = js.Any.fromFunction0(getDeviceSelector))
  
    __obj.asInstanceOf[ISmsDeviceStatics]
  }
}

