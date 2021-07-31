package typings.winrtUwp.Windows.Devices.Sms

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SmsMessageType extends StObject
/** This enumerated type defines the format of the SMS message. */
@JSGlobal("Windows.Devices.Sms.SmsMessageType")
@js.native
object SmsMessageType extends StObject {
  
  /** An application-directed message (a visual voicemail message on a specific port, for example). */
  @js.native
  sealed trait app
    extends StObject
       with SmsMessageType
  
  /** The SMS message is in binary format. */
  @js.native
  sealed trait binary
    extends StObject
       with SmsMessageType
  
  /** A cell broadcast message. */
  @js.native
  sealed trait broadcast
    extends StObject
       with SmsMessageType
  
  /** A send status message. */
  @js.native
  sealed trait status
    extends StObject
       with SmsMessageType
  
  /** The SMS message is in text format. */
  @js.native
  sealed trait text
    extends StObject
       with SmsMessageType
  
  /** A legacy voicemail message waiting indication message. */
  @js.native
  sealed trait voicemail
    extends StObject
       with SmsMessageType
  
  /** A WAP Push message (an MMS message, for example). */
  @js.native
  sealed trait wap
    extends StObject
       with SmsMessageType
}
