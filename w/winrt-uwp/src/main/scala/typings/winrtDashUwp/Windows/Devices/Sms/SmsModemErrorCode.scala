package typings.winrtDashUwp.Windows.Devices.Sms

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SmsModemErrorCode with Double] = js.native
  /* 4 */ @js.native
  object deviceFailure extends TopLevel[deviceFailure with Double]
  
  /* 7 */ @js.native
  object deviceNotReady extends TopLevel[deviceNotReady with Double]
  
  /* 11 */ @js.native
  object fixedDialingNumberRestricted extends TopLevel[fixedDialingNumberRestricted with Double]
  
  /* 9 */ @js.native
  object invalidSmscAddress extends TopLevel[invalidSmscAddress with Double]
  
  /* 5 */ @js.native
  object messageNotEncodedProperly extends TopLevel[messageNotEncodedProperly with Double]
  
  /* 6 */ @js.native
  object messageTooLarge extends TopLevel[messageTooLarge with Double]
  
  /* 1 */ @js.native
  object messagingNetworkError extends TopLevel[messagingNetworkError with Double]
  
  /* 10 */ @js.native
  object networkFailure extends TopLevel[networkFailure with Double]
  
  /* 8 */ @js.native
  object networkNotReady extends TopLevel[networkNotReady with Double]
  
  /* 0 */ @js.native
  object other extends TopLevel[other with Double]
  
  /* 2 */ @js.native
  object smsOperationNotSupportedByDevice extends TopLevel[smsOperationNotSupportedByDevice with Double]
  
  /* 3 */ @js.native
  object smsServiceNotSupportedByNetwork extends TopLevel[smsServiceNotSupportedByNetwork with Double]
  
}

