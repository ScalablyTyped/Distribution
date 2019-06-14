package typings
package winrtLib.WindowsNs.DevicesNs.SmsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SmsEncoding extends js.Object

@JSGlobal("Windows.Devices.Sms.SmsEncoding")
@js.native
object SmsEncoding extends js.Object {
  @js.native
  sealed trait gsmSevenBit
    extends winrtLib.WindowsNs.DevicesNs.SmsNs.SmsEncoding
  
  @js.native
  sealed trait optimal
    extends winrtLib.WindowsNs.DevicesNs.SmsNs.SmsEncoding
  
  @js.native
  sealed trait sevenBitAscii
    extends winrtLib.WindowsNs.DevicesNs.SmsNs.SmsEncoding
  
  @js.native
  sealed trait unicode
    extends winrtLib.WindowsNs.DevicesNs.SmsNs.SmsEncoding
  
  @js.native
  sealed trait unknown
    extends winrtLib.WindowsNs.DevicesNs.SmsNs.SmsEncoding
  
  /* 4 */ val gsmSevenBit: gsmSevenBit with scala.Double = js.native
  /* 1 */ val optimal: optimal with scala.Double = js.native
  /* 2 */ val sevenBitAscii: sevenBitAscii with scala.Double = js.native
  /* 3 */ val unicode: unicode with scala.Double = js.native
  /* 0 */ val unknown: unknown with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtLib.WindowsNs.DevicesNs.SmsNs.SmsEncoding with scala.Double] = js.native
}

