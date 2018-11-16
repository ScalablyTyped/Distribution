package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.SmsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SmsModemErrorCode extends js.Object

/** Values that describe error codes from the SMS modem in an SmsSendMessageResult. */
@JSGlobal("Windows.Devices.Sms.SmsModemErrorCode")
@js.native
object SmsModemErrorCode extends js.Object {
  /** The device failed. */
  @js.native
  sealed trait deviceFailure
    extends winrtDashUwpLib.WindowsNs.DevicesNs.SmsNs.SmsModemErrorCode
  
  /** The device was not ready to send SMS. */
  @js.native
  sealed trait deviceNotReady
    extends winrtDashUwpLib.WindowsNs.DevicesNs.SmsNs.SmsModemErrorCode
  
  /** The device is restricted to a fixed dialing number list, and the number used was not in the list. */
  @js.native
  sealed trait fixedDialingNumberRestricted
    extends winrtDashUwpLib.WindowsNs.DevicesNs.SmsNs.SmsModemErrorCode
  
  /** The SMSC address was not valid. */
  @js.native
  sealed trait invalidSmscAddress
    extends winrtDashUwpLib.WindowsNs.DevicesNs.SmsNs.SmsModemErrorCode
  
  /** The message was not encoded properly. */
  @js.native
  sealed trait messageNotEncodedProperly
    extends winrtDashUwpLib.WindowsNs.DevicesNs.SmsNs.SmsModemErrorCode
  
  /** The message was too large. */
  @js.native
  sealed trait messageTooLarge
    extends winrtDashUwpLib.WindowsNs.DevicesNs.SmsNs.SmsModemErrorCode
  
  /** A network error. */
  @js.native
  sealed trait messagingNetworkError
    extends winrtDashUwpLib.WindowsNs.DevicesNs.SmsNs.SmsModemErrorCode
  
  /** There was a network failure. */
  @js.native
  sealed trait networkFailure
    extends winrtDashUwpLib.WindowsNs.DevicesNs.SmsNs.SmsModemErrorCode
  
  /** The network was not ready to send SMS. */
  @js.native
  sealed trait networkNotReady
    extends winrtDashUwpLib.WindowsNs.DevicesNs.SmsNs.SmsModemErrorCode
  
  /** An unknown error. */
  @js.native
  sealed trait other
    extends winrtDashUwpLib.WindowsNs.DevicesNs.SmsNs.SmsModemErrorCode
  
  /** SMS is not supported by the device. */
  @js.native
  sealed trait smsOperationNotSupportedByDevice
    extends winrtDashUwpLib.WindowsNs.DevicesNs.SmsNs.SmsModemErrorCode
  
  /** SMS is not supported by the network. */
  @js.native
  sealed trait smsServiceNotSupportedByNetwork
    extends winrtDashUwpLib.WindowsNs.DevicesNs.SmsNs.SmsModemErrorCode
  
  val deviceFailure: deviceFailure with java.lang.String = js.native
  val deviceNotReady: deviceNotReady with java.lang.String = js.native
  val fixedDialingNumberRestricted: fixedDialingNumberRestricted with java.lang.String = js.native
  val invalidSmscAddress: invalidSmscAddress with java.lang.String = js.native
  val messageNotEncodedProperly: messageNotEncodedProperly with java.lang.String = js.native
  val messageTooLarge: messageTooLarge with java.lang.String = js.native
  val messagingNetworkError: messagingNetworkError with java.lang.String = js.native
  val networkFailure: networkFailure with java.lang.String = js.native
  val networkNotReady: networkNotReady with java.lang.String = js.native
  val other: other with java.lang.String = js.native
  val smsOperationNotSupportedByDevice: smsOperationNotSupportedByDevice with java.lang.String = js.native
  val smsServiceNotSupportedByNetwork: smsServiceNotSupportedByNetwork with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.DevicesNs.SmsNs.SmsModemErrorCode with java.lang.String
  ] = js.native
}

