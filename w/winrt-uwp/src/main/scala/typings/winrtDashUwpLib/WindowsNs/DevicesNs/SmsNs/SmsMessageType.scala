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
  
  val app: app with java.lang.String = js.native
  val binary: binary with java.lang.String = js.native
  val broadcast: broadcast with java.lang.String = js.native
  val status: status with java.lang.String = js.native
  val text: text with java.lang.String = js.native
  val voicemail: voicemail with java.lang.String = js.native
  val wap: wap with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[winrtDashUwpLib.WindowsNs.DevicesNs.SmsNs.SmsMessageType with java.lang.String] = js.native
}

