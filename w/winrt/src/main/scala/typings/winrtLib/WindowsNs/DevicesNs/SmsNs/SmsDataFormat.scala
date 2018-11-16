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
  
  val cdmaDeliver: cdmaDeliver with java.lang.String = js.native
  val cdmaSubmit: cdmaSubmit with java.lang.String = js.native
  val gsmDeliver: gsmDeliver with java.lang.String = js.native
  val gsmSubmit: gsmSubmit with java.lang.String = js.native
  val unknown: unknown with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[winrtLib.WindowsNs.DevicesNs.SmsNs.SmsDataFormat with java.lang.String] = js.native
}

