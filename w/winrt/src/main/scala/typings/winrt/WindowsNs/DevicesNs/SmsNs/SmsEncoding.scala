package typings.winrt.WindowsNs.DevicesNs.SmsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SmsEncoding extends js.Object

@JSGlobal("Windows.Devices.Sms.SmsEncoding")
@js.native
object SmsEncoding extends js.Object {
  @js.native
  sealed trait gsmSevenBit extends SmsEncoding
  
  @js.native
  sealed trait optimal extends SmsEncoding
  
  @js.native
  sealed trait sevenBitAscii extends SmsEncoding
  
  @js.native
  sealed trait unicode extends SmsEncoding
  
  @js.native
  sealed trait unknown extends SmsEncoding
  
  /* 4 */ val gsmSevenBit: typings.winrt.WindowsNs.DevicesNs.SmsNs.SmsEncoding.gsmSevenBit with Double = js.native
  /* 1 */ val optimal: typings.winrt.WindowsNs.DevicesNs.SmsNs.SmsEncoding.optimal with Double = js.native
  /* 2 */ val sevenBitAscii: typings.winrt.WindowsNs.DevicesNs.SmsNs.SmsEncoding.sevenBitAscii with Double = js.native
  /* 3 */ val unicode: typings.winrt.WindowsNs.DevicesNs.SmsNs.SmsEncoding.unicode with Double = js.native
  /* 0 */ val unknown: typings.winrt.WindowsNs.DevicesNs.SmsNs.SmsEncoding.unknown with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SmsEncoding with Double] = js.native
}

