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
    fromIdAsync: js.Function1[java.lang.String, winrtLib.WindowsNs.FoundationNs.IAsyncOperation[SmsDevice]],
    getDefaultAsync: js.Function0[winrtLib.WindowsNs.FoundationNs.IAsyncOperation[SmsDevice]],
    getDeviceSelector: js.Function0[java.lang.String]
  ): ISmsDeviceStatics = {
    val __obj = js.Dynamic.literal(fromIdAsync = fromIdAsync, getDefaultAsync = getDefaultAsync, getDeviceSelector = getDeviceSelector)
  
    __obj.asInstanceOf[ISmsDeviceStatics]
  }
}

