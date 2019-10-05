package typings.winrtDashUwp.Windows.Devices.Sms

import typings.winrtDashUwp.Windows.Foundation.EventHandler
import typings.winrtDashUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtDashUwp.Windows.Foundation.TypedEventHandler
import typings.winrtDashUwp.Windows.WinRTEvent
import typings.winrtDashUwp.winrtDashUwpStrings.devicestatuschanged
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Extends the SmsDevice class, and supports the operation of a mobile broadband SMS device. */
@JSGlobal("Windows.Devices.Sms.SmsDevice2")
@js.native
abstract class SmsDevice2 () extends js.Object {
  /** Gets the phone number associated with the SMS device. The phone number can be used to associate incoming messages with the account and possibly an external storage mechanism such as an account inbox. */
  var accountPhoneNumber: String = js.native
  /** Returns the cellular class of the SMS device. The class can be used to determine which encodings are appropriate or which device limitations are in effect. */
  var cellularClass: CellularClass = js.native
  /** The device ID of the device represented by this instance. */
  var deviceId: String = js.native
  /** Returns the SMS device's status, which indicates whether the device is ready, or not. It also indicates what type of problem exists if the device is not ready. */
  var deviceStatus: SmsDeviceStatus = js.native
  /** Sets an event handler to be called when the status of the SMS device changes. */
  @JSName("ondevicestatuschanged")
  var ondevicestatuschanged_Original: TypedEventHandler[SmsDevice2, _] = js.native
  /** The parent device ID of this device. */
  var parentDeviceId: String = js.native
  /** Gets or sets the SMSC address of this device. */
  var smscAddress: String = js.native
  def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_devicestatuschanged(`type`: devicestatuschanged, listener: TypedEventHandler[SmsDevice2, _]): Unit = js.native
  /**
    * Estimates the transmitted message length of the specified text message. The estimate can be useful to clients that want to give an indication of how many messages will be sent on the network to carry the text of the full message.
    * @param message A reference to the SMS text message to measure.
    * @return A reference to an SmsEncodedLength structure that is populated with the length information.
    */
  def calculateLength(message: ISmsMessageBase): SmsEncodedLength = js.native
  /** Sets an event handler to be called when the status of the SMS device changes. */
  def ondevicestatuschanged(ev: js.Any with WinRTEvent[SmsDevice2]): Unit = js.native
  def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_devicestatuschanged(`type`: devicestatuschanged, listener: TypedEventHandler[SmsDevice2, _]): Unit = js.native
  /**
    * Asynchronously sends a message using the SMS device. The method is asynchronous because the send operation might not occur instantaneously. The message operation object is returned immediately.
    * @param message A reference to an object that implements the ISmsMessageBase interface. The message can be in text or binary format.
    * @return The message operation object.
    */
  def sendMessageAndGetResultAsync(message: ISmsMessageBase): IPromiseWithIAsyncOperation[SmsSendMessageResult] = js.native
}

/* static members */
@JSGlobal("Windows.Devices.Sms.SmsDevice2")
@js.native
object SmsDevice2 extends js.Object {
  /**
    * Creates an instance of SmsDevice2 for a device that received an SMS message.
    * @param deviceId A string representation of the device ID of the device that received an SMS message.
    * @return An instance of SmsDevice2 initialized for the device with the given ID.
    */
  def fromId(deviceId: String): SmsDevice2 = js.native
  /**
    * Creates an instance of SmsDevice2 for a device, given the device ID of the parent device.
    * @param parentDeviceId The device ID of the parent device.
    * @return An instance of SmsDevice2 initialized for the device with the given parent ID.
    */
  def fromParentId(parentDeviceId: String): SmsDevice2 = js.native
  /**
    * Creates an instance of SmsDevice2 associated with the default SMS device.
    * @return An instance of SmsDevice2 initialized for the default SMS device.
    */
  def getDefault(): SmsDevice2 = js.native
  /**
    * Retrieves the class selection string that can be used to enumerate SMS devices.
    * @return A reference to an Advanced Query Syntax (AQS) string that identifies an SMS device.
    */
  def getDeviceSelector(): String = js.native
}

