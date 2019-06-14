package typings
package winrtLib.WindowsNs.DevicesNs.SmsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SmsDataFormat extends js.Object

@JSGlobal("Windows.Devices.Sms.SmsDataFormat")
@js.native
object SmsDataFormat extends js.Object {
  @js.native
  sealed trait cdmaDeliver
    extends winrtLib.WindowsNs.DevicesNs.SmsNs.SmsDataFormat
  
  @js.native
  sealed trait cdmaSubmit
    extends winrtLib.WindowsNs.DevicesNs.SmsNs.SmsDataFormat
  
  @js.native
  sealed trait gsmDeliver
    extends winrtLib.WindowsNs.DevicesNs.SmsNs.SmsDataFormat
  
  @js.native
  sealed trait gsmSubmit
    extends winrtLib.WindowsNs.DevicesNs.SmsNs.SmsDataFormat
  
  @js.native
  sealed trait unknown
    extends winrtLib.WindowsNs.DevicesNs.SmsNs.SmsDataFormat
  
  /* 3 */ val cdmaDeliver: cdmaDeliver with scala.Double = js.native
  /* 1 */ val cdmaSubmit: cdmaSubmit with scala.Double = js.native
  /* 4 */ val gsmDeliver: gsmDeliver with scala.Double = js.native
  /* 2 */ val gsmSubmit: gsmSubmit with scala.Double = js.native
  /* 0 */ val unknown: unknown with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtLib.WindowsNs.DevicesNs.SmsNs.SmsDataFormat with scala.Double] = js.native
}

