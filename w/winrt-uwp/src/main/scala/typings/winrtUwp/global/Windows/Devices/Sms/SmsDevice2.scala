package typings.winrtUwp.global.Windows.Devices.Sms

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Extends the SmsDevice class, and supports the operation of a mobile broadband SMS device. */
@JSGlobal("Windows.Devices.Sms.SmsDevice2")
@js.native
abstract class SmsDevice2 ()
  extends typings.winrtUwp.Windows.Devices.Sms.SmsDevice2

/* static members */
@JSGlobal("Windows.Devices.Sms.SmsDevice2")
@js.native
object SmsDevice2 extends js.Object {
  /**
    * Creates an instance of SmsDevice2 for a device that received an SMS message.
    * @param deviceId A string representation of the device ID of the device that received an SMS message.
    * @return An instance of SmsDevice2 initialized for the device with the given ID.
    */
  def fromId(deviceId: String): typings.winrtUwp.Windows.Devices.Sms.SmsDevice2 = js.native
  /**
    * Creates an instance of SmsDevice2 for a device, given the device ID of the parent device.
    * @param parentDeviceId The device ID of the parent device.
    * @return An instance of SmsDevice2 initialized for the device with the given parent ID.
    */
  def fromParentId(parentDeviceId: String): typings.winrtUwp.Windows.Devices.Sms.SmsDevice2 = js.native
  /**
    * Creates an instance of SmsDevice2 associated with the default SMS device.
    * @return An instance of SmsDevice2 initialized for the default SMS device.
    */
  def getDefault(): typings.winrtUwp.Windows.Devices.Sms.SmsDevice2 = js.native
  /**
    * Retrieves the class selection string that can be used to enumerate SMS devices.
    * @return A reference to an Advanced Query Syntax (AQS) string that identifies an SMS device.
    */
  def getDeviceSelector(): String = js.native
}

