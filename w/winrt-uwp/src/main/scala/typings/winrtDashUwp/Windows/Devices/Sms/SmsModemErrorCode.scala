package typings.winrtDashUwp.Windows.Devices.Sms

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
  sealed trait deviceFailure extends SmsModemErrorCode
  
  /** The device was not ready to send SMS. */
  @js.native
  sealed trait deviceNotReady extends SmsModemErrorCode
  
  /** The device is restricted to a fixed dialing number list, and the number used was not in the list. */
  @js.native
  sealed trait fixedDialingNumberRestricted extends SmsModemErrorCode
  
  /** The SMSC address was not valid. */
  @js.native
  sealed trait invalidSmscAddress extends SmsModemErrorCode
  
  /** The message was not encoded properly. */
  @js.native
  sealed trait messageNotEncodedProperly extends SmsModemErrorCode
  
  /** The message was too large. */
  @js.native
  sealed trait messageTooLarge extends SmsModemErrorCode
  
  /** A network error. */
  @js.native
  sealed trait messagingNetworkError extends SmsModemErrorCode
  
  /** There was a network failure. */
  @js.native
  sealed trait networkFailure extends SmsModemErrorCode
  
  /** The network was not ready to send SMS. */
  @js.native
  sealed trait networkNotReady extends SmsModemErrorCode
  
  /** An unknown error. */
  @js.native
  sealed trait other extends SmsModemErrorCode
  
  /** SMS is not supported by the device. */
  @js.native
  sealed trait smsOperationNotSupportedByDevice extends SmsModemErrorCode
  
  /** SMS is not supported by the network. */
  @js.native
  sealed trait smsServiceNotSupportedByNetwork extends SmsModemErrorCode
  
  /* 4 */ val deviceFailure: typings.winrtDashUwp.Windows.Devices.Sms.SmsModemErrorCode.deviceFailure with Double = js.native
  /* 7 */ val deviceNotReady: typings.winrtDashUwp.Windows.Devices.Sms.SmsModemErrorCode.deviceNotReady with Double = js.native
  /* 11 */ val fixedDialingNumberRestricted: typings.winrtDashUwp.Windows.Devices.Sms.SmsModemErrorCode.fixedDialingNumberRestricted with Double = js.native
  /* 9 */ val invalidSmscAddress: typings.winrtDashUwp.Windows.Devices.Sms.SmsModemErrorCode.invalidSmscAddress with Double = js.native
  /* 5 */ val messageNotEncodedProperly: typings.winrtDashUwp.Windows.Devices.Sms.SmsModemErrorCode.messageNotEncodedProperly with Double = js.native
  /* 6 */ val messageTooLarge: typings.winrtDashUwp.Windows.Devices.Sms.SmsModemErrorCode.messageTooLarge with Double = js.native
  /* 1 */ val messagingNetworkError: typings.winrtDashUwp.Windows.Devices.Sms.SmsModemErrorCode.messagingNetworkError with Double = js.native
  /* 10 */ val networkFailure: typings.winrtDashUwp.Windows.Devices.Sms.SmsModemErrorCode.networkFailure with Double = js.native
  /* 8 */ val networkNotReady: typings.winrtDashUwp.Windows.Devices.Sms.SmsModemErrorCode.networkNotReady with Double = js.native
  /* 0 */ val other: typings.winrtDashUwp.Windows.Devices.Sms.SmsModemErrorCode.other with Double = js.native
  /* 2 */ val smsOperationNotSupportedByDevice: typings.winrtDashUwp.Windows.Devices.Sms.SmsModemErrorCode.smsOperationNotSupportedByDevice with Double = js.native
  /* 3 */ val smsServiceNotSupportedByNetwork: typings.winrtDashUwp.Windows.Devices.Sms.SmsModemErrorCode.smsServiceNotSupportedByNetwork with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SmsModemErrorCode with Double] = js.native
}

