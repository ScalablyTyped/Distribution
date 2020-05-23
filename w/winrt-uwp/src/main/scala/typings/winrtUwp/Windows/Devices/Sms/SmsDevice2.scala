package typings.winrtUwp.Windows.Devices.Sms

import typings.winrtUwp.Windows.Foundation.EventHandler
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Foundation.TypedEventHandler
import typings.winrtUwp.Windows.WinRTEvent
import typings.winrtUwp.winrtUwpStrings.devicestatuschanged
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Extends the SmsDevice class, and supports the operation of a mobile broadband SMS device. */
@js.native
trait SmsDevice2 extends js.Object {
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

