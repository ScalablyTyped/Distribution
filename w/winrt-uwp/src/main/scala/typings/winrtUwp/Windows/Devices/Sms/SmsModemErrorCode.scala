package typings.winrtUwp.Windows.Devices.Sms

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SmsModemErrorCode extends StObject
/** Values that describe error codes from the SMS modem in an SmsSendMessageResult. */
@JSGlobal("Windows.Devices.Sms.SmsModemErrorCode")
@js.native
object SmsModemErrorCode extends StObject {
  
  /** The device failed. */
  @js.native
  sealed trait deviceFailure
    extends StObject
       with SmsModemErrorCode
  
  /** The device was not ready to send SMS. */
  @js.native
  sealed trait deviceNotReady
    extends StObject
       with SmsModemErrorCode
  
  /** The device is restricted to a fixed dialing number list, and the number used was not in the list. */
  @js.native
  sealed trait fixedDialingNumberRestricted
    extends StObject
       with SmsModemErrorCode
  
  /** The SMSC address was not valid. */
  @js.native
  sealed trait invalidSmscAddress
    extends StObject
       with SmsModemErrorCode
  
  /** The message was not encoded properly. */
  @js.native
  sealed trait messageNotEncodedProperly
    extends StObject
       with SmsModemErrorCode
  
  /** The message was too large. */
  @js.native
  sealed trait messageTooLarge
    extends StObject
       with SmsModemErrorCode
  
  /** A network error. */
  @js.native
  sealed trait messagingNetworkError
    extends StObject
       with SmsModemErrorCode
  
  /** There was a network failure. */
  @js.native
  sealed trait networkFailure
    extends StObject
       with SmsModemErrorCode
  
  /** The network was not ready to send SMS. */
  @js.native
  sealed trait networkNotReady
    extends StObject
       with SmsModemErrorCode
  
  /** An unknown error. */
  @js.native
  sealed trait other
    extends StObject
       with SmsModemErrorCode
  
  /** SMS is not supported by the device. */
  @js.native
  sealed trait smsOperationNotSupportedByDevice
    extends StObject
       with SmsModemErrorCode
  
  /** SMS is not supported by the network. */
  @js.native
  sealed trait smsServiceNotSupportedByNetwork
    extends StObject
       with SmsModemErrorCode
}
