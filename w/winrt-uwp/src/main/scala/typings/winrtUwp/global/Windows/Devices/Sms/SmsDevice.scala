package typings.winrtUwp.global.Windows.Devices.Sms

import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Supports the operation of a mobile broadband SMS device. */
@JSGlobal("Windows.Devices.Sms.SmsDevice")
@js.native
abstract class SmsDevice ()
  extends typings.winrtUwp.Windows.Devices.Sms.SmsDevice

/* static members */
@JSGlobal("Windows.Devices.Sms.SmsDevice")
@js.native
object SmsDevice extends js.Object {
  /**
    * Creates an instance of SmsDevice for the device that received the SMS message.
    * @param deviceId A string representation of the DeviceInformation ID of the SMS device that received the SMS message.
    * @return The SMS device operation object.
    */
  def fromIdAsync(deviceId: String): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Devices.Sms.SmsDevice] = js.native
  /**
    * Creates an instance of SmsDevice for the specified Mobile Broadband network account ID.
    * @param networkAccountId The Mobile Broadband network account ID to use to select the corresponding mobile broadband device to use for the SMS device
    * @return When this method completes, it returns the SmsDevice for the specified Mobile Broadband network account ID.
    */
  def fromNetworkAccountIdAsync(networkAccountId: String): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Devices.Sms.SmsDevice] = js.native
  /**
    * Creates an instance of an SmsDevice object associated with the default SMS device. Because the device might be busy, the operation executes asynchronously. The asynchronous operation object returns immediately.
    * @return A reference to an IAsyncOperation(SmsDevice) object that supports asynchronous SmsDevice object retrieval.
    */
  def getDefaultAsync(): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Devices.Sms.SmsDevice] = js.native
  /**
    * Retrieves the class selection string that can be used to enumerate SMS devices.
    * @return A reference to an Advanced Query Syntax (AQS) string that identifies an SMS device.
    */
  def getDeviceSelector(): String = js.native
}

