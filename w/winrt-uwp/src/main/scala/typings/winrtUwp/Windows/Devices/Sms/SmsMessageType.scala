package typings.winrtUwp.Windows.Devices.Sms

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SmsMessageType extends js.Object
/** This enumerated type defines the format of the SMS message. */
@JSGlobal("Windows.Devices.Sms.SmsMessageType")
@js.native
object SmsMessageType extends js.Object {
  
  /** An application-directed message (a visual voicemail message on a specific port, for example). */
  @js.native
  sealed trait app extends SmsMessageType
  
  /** The SMS message is in binary format. */
  @js.native
  sealed trait binary extends SmsMessageType
  
  /** A cell broadcast message. */
  @js.native
  sealed trait broadcast extends SmsMessageType
  
  /** A send status message. */
  @js.native
  sealed trait status extends SmsMessageType
  
  /** The SMS message is in text format. */
  @js.native
  sealed trait text extends SmsMessageType
  
  /** A legacy voicemail message waiting indication message. */
  @js.native
  sealed trait voicemail extends SmsMessageType
  
  /** A WAP Push message (an MMS message, for example). */
  @js.native
  sealed trait wap extends SmsMessageType
}
