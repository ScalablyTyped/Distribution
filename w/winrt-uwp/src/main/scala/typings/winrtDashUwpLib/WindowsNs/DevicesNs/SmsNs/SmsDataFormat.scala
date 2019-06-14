package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.SmsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SmsDataFormat extends js.Object

/** This enumerated type identifies the format of a given protocol description unit (PDU) buffer. */
@JSGlobal("Windows.Devices.Sms.SmsDataFormat")
@js.native
object SmsDataFormat extends js.Object {
  /** The data format is CDMA WMT format of type deliver. */
  @js.native
  sealed trait cdmaDeliver
    extends winrtDashUwpLib.WindowsNs.DevicesNs.SmsNs.SmsDataFormat
  
  /** The data format is CDMA WMT format of type submit. */
  @js.native
  sealed trait cdmaSubmit
    extends winrtDashUwpLib.WindowsNs.DevicesNs.SmsNs.SmsDataFormat
  
  /** The data format is GSM of type deliver. */
  @js.native
  sealed trait gsmDeliver
    extends winrtDashUwpLib.WindowsNs.DevicesNs.SmsNs.SmsDataFormat
  
  /** The data format is GSM of type submit. */
  @js.native
  sealed trait gsmSubmit
    extends winrtDashUwpLib.WindowsNs.DevicesNs.SmsNs.SmsDataFormat
  
  /** The data format is unknown. */
  @js.native
  sealed trait unknown
    extends winrtDashUwpLib.WindowsNs.DevicesNs.SmsNs.SmsDataFormat
  
  /* 3 */ val cdmaDeliver: cdmaDeliver with scala.Double = js.native
  /* 1 */ val cdmaSubmit: cdmaSubmit with scala.Double = js.native
  /* 4 */ val gsmDeliver: gsmDeliver with scala.Double = js.native
  /* 2 */ val gsmSubmit: gsmSubmit with scala.Double = js.native
  /* 0 */ val unknown: unknown with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtDashUwpLib.WindowsNs.DevicesNs.SmsNs.SmsDataFormat with scala.Double] = js.native
}

