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

