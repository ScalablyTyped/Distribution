package typings.winrtDashUwp.WindowsNs.DevicesNs.SmsNs

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
  
  /* 3 */ val app: typings.winrtDashUwp.WindowsNs.DevicesNs.SmsNs.SmsMessageType.app with Double = js.native
  /* 0 */ val binary: typings.winrtDashUwp.WindowsNs.DevicesNs.SmsNs.SmsMessageType.binary with Double = js.native
  /* 4 */ val broadcast: typings.winrtDashUwp.WindowsNs.DevicesNs.SmsNs.SmsMessageType.broadcast with Double = js.native
  /* 6 */ val status: typings.winrtDashUwp.WindowsNs.DevicesNs.SmsNs.SmsMessageType.status with Double = js.native
  /* 1 */ val text: typings.winrtDashUwp.WindowsNs.DevicesNs.SmsNs.SmsMessageType.text with Double = js.native
  /* 5 */ val voicemail: typings.winrtDashUwp.WindowsNs.DevicesNs.SmsNs.SmsMessageType.voicemail with Double = js.native
  /* 2 */ val wap: typings.winrtDashUwp.WindowsNs.DevicesNs.SmsNs.SmsMessageType.wap with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SmsMessageType with Double] = js.native
}

