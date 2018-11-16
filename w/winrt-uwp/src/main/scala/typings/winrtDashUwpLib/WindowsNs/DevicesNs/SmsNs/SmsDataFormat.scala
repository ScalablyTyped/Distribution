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
  
  val cdmaDeliver: cdmaDeliver with java.lang.String = js.native
  val cdmaSubmit: cdmaSubmit with java.lang.String = js.native
  val gsmDeliver: gsmDeliver with java.lang.String = js.native
  val gsmSubmit: gsmSubmit with java.lang.String = js.native
  val unknown: unknown with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[winrtDashUwpLib.WindowsNs.DevicesNs.SmsNs.SmsDataFormat with java.lang.String] = js.native
}

