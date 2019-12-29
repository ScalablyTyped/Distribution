package typings.winrtDashUwp.Windows.Devices.Sms

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SmsMessageType with Double] = js.native
  /* 3 */ @js.native
  object app extends TopLevel[app with Double]
  
  /* 0 */ @js.native
  object binary extends TopLevel[binary with Double]
  
  /* 4 */ @js.native
  object broadcast extends TopLevel[broadcast with Double]
  
  /* 6 */ @js.native
  object status extends TopLevel[status with Double]
  
  /* 1 */ @js.native
  object text extends TopLevel[text with Double]
  
  /* 5 */ @js.native
  object voicemail extends TopLevel[voicemail with Double]
  
  /* 2 */ @js.native
  object wap extends TopLevel[wap with Double]
  
}

