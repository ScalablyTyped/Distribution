package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.SmsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SmsMessageType extends js.Object

/** This enumerated type defines the format of the SMS message. */
@JSGlobal("Windows.Devices.Sms.SmsMessageType")
@js.native
object SmsMessageType extends js.Object {
  /** An application-directed message (a visual voicemail message on a specific port, for example). */
  @js.native
  sealed trait app
    extends winrtDashUwpLib.WindowsNs.DevicesNs.SmsNs.SmsMessageType
  
  /** The SMS message is in binary format. */
  @js.native
  sealed trait binary
    extends winrtDashUwpLib.WindowsNs.DevicesNs.SmsNs.SmsMessageType
  
  /** A cell broadcast message. */
  @js.native
  sealed trait broadcast
    extends winrtDashUwpLib.WindowsNs.DevicesNs.SmsNs.SmsMessageType
  
  /** A send status message. */
  @js.native
  sealed trait status
    extends winrtDashUwpLib.WindowsNs.DevicesNs.SmsNs.SmsMessageType
  
  /** The SMS message is in text format. */
  @js.native
  sealed trait text
    extends winrtDashUwpLib.WindowsNs.DevicesNs.SmsNs.SmsMessageType
  
  /** A legacy voicemail message waiting indication message. */
  @js.native
  sealed trait voicemail
    extends winrtDashUwpLib.WindowsNs.DevicesNs.SmsNs.SmsMessageType
  
  /** A WAP Push message (an MMS message, for example). */
  @js.native
  sealed trait wap
    extends winrtDashUwpLib.WindowsNs.DevicesNs.SmsNs.SmsMessageType
  
  /* 3 */ val app: app with scala.Double = js.native
  /* 0 */ val binary: binary with scala.Double = js.native
  /* 4 */ val broadcast: broadcast with scala.Double = js.native
  /* 6 */ val status: status with scala.Double = js.native
  /* 1 */ val text: text with scala.Double = js.native
  /* 5 */ val voicemail: voicemail with scala.Double = js.native
  /* 2 */ val wap: wap with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtDashUwpLib.WindowsNs.DevicesNs.SmsNs.SmsMessageType with scala.Double] = js.native
}

