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
  
  val gsmSevenBit: gsmSevenBit with java.lang.String = js.native
  val optimal: optimal with java.lang.String = js.native
  val sevenBitAscii: sevenBitAscii with java.lang.String = js.native
  val unicode: unicode with java.lang.String = js.native
  val unknown: unknown with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[winrtLib.WindowsNs.DevicesNs.SmsNs.SmsEncoding with java.lang.String] = js.native
}

