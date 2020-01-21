package typings.winrtUwp.Windows.Devices.Sms

import typings.winrtUwp.Windows.Foundation.EventHandler
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Foundation.IPromiseWithOperation
import typings.winrtUwp.Windows.WinRTEvent
import typings.winrtUwp.winrtUwpStrings.smsdevicestatuschanged
import typings.winrtUwp.winrtUwpStrings.smsmessagereceived
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Supports the operation of a mobile broadband SMS device. */
@JSGlobal("Windows.Devices.Sms.SmsDevice")
@js.native
abstract class SmsDevice () extends js.Object {
  /** Returns the phone number associated with the SMS device. The phone number can be used to associate incoming messages with the account and possibly an external storage mechanism such as an account inbox. */
  var accountPhoneNumber: String = js.native
  /** Returns the cellular class of the SMS device. The class can be used to determine which encodings are appropriate or which device limitations are in effect. */
  var cellularClass: CellularClass = js.native
  /** Returns the SMS device's status, which indicates whether the device is ready, or not. It also indicates what type of problem exists if the device is not ready. */
  var deviceStatus: SmsDeviceStatus = js.native
  /** Accesses the on-device message store. The store holds messages until a client can retrieve them. On some devices, for example, the store may correspond to the SIM storage for SMS messages. */
  var messageStore: SmsDeviceMessageStore = js.native
  /** Sets an event handler to be called when the status of the SMS device changes. */
  @JSName("onsmsdevicestatuschanged")
  var onsmsdevicestatuschanged_Original: SmsDeviceStatusChangedEventHandler = js.native
  /** Sets an event handler to be called when the device receives a new text message. */
  @JSName("onsmsmessagereceived")
  var onsmsmessagereceived_Original: SmsMessageReceivedEventHandler = js.native
  def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_smsdevicestatuschanged(`type`: smsdevicestatuschanged, listener: SmsDeviceStatusChangedEventHandler): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_smsmessagereceived(`type`: smsmessagereceived, listener: SmsMessageReceivedEventHandler): Unit = js.native
  /**
    * Estimates the transmitted message length of the specified text message. The estimate can be useful to clients who want to give an indication of how many messages will be sent on the network to carry the text of the full message.
    * @param message A reference to the SMS text message to measure.
    * @return A reference to an SmsEncodedLength structure that is populated with the length information.
    */
  def calculateLength(message: SmsTextMessage): SmsEncodedLength = js.native
  /** Sets an event handler to be called when the status of the SMS device changes. */
  def onsmsdevicestatuschanged(ev: WinRTEvent[SmsDevice]): Unit = js.native
  /** Sets an event handler to be called when the device receives a new text message. */
  def onsmsmessagereceived(ev: SmsMessageReceivedEventArgs with WinRTEvent[SmsDevice]): Unit = js.native
  def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_smsdevicestatuschanged(`type`: smsdevicestatuschanged, listener: SmsDeviceStatusChangedEventHandler): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_smsmessagereceived(`type`: smsmessagereceived, listener: SmsMessageReceivedEventHandler): Unit = js.native
  /**
    * Asynchronously sends a message using the SMS device. The method is asynchronous because the send operation might not occur instantaneously. The message operation object is returned immediately.
    * @param message A reference to an ISmsMessage object. The message can be in text or binary format.
    * @return The message operation object.
    */
  def sendMessageAsync(message: ISmsMessage): IPromiseWithOperation[_, SendSmsMessageOperation] = js.native
}

/* static members */
@JSGlobal("Windows.Devices.Sms.SmsDevice")
@js.native
object SmsDevice extends js.Object {
  /**
    * Creates an instance of SmsDevice for the device that received the SMS message.
    * @param deviceId A string representation of the DeviceInformation ID of the SMS device that received the SMS message.
    * @return The SMS device operation object.
    */
  def fromIdAsync(deviceId: String): IPromiseWithIAsyncOperation[SmsDevice] = js.native
  /**
    * Creates an instance of SmsDevice for the specified Mobile Broadband network account ID.
    * @param networkAccountId The Mobile Broadband network account ID to use to select the corresponding mobile broadband device to use for the SMS device
    * @return When this method completes, it returns the SmsDevice for the specified Mobile Broadband network account ID.
    */
  def fromNetworkAccountIdAsync(networkAccountId: String): IPromiseWithIAsyncOperation[SmsDevice] = js.native
  /**
    * Creates an instance of an SmsDevice object associated with the default SMS device. Because the device might be busy, the operation executes asynchronously. The asynchronous operation object returns immediately.
    * @return A reference to an IAsyncOperation(SmsDevice) object that supports asynchronous SmsDevice object retrieval.
    */
  def getDefaultAsync(): IPromiseWithIAsyncOperation[SmsDevice] = js.native
  /**
    * Retrieves the class selection string that can be used to enumerate SMS devices.
    * @return A reference to an Advanced Query Syntax (AQS) string that identifies an SMS device.
    */
  def getDeviceSelector(): String = js.native
}

