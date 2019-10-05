package typings.winrt.Windows.Devices.Sms

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
  
  /* 4 */ val gsmSevenBit: typings.winrt.Windows.Devices.Sms.SmsEncoding.gsmSevenBit with Double = js.native
  /* 1 */ val optimal: typings.winrt.Windows.Devices.Sms.SmsEncoding.optimal with Double = js.native
  /* 2 */ val sevenBitAscii: typings.winrt.Windows.Devices.Sms.SmsEncoding.sevenBitAscii with Double = js.native
  /* 3 */ val unicode: typings.winrt.Windows.Devices.Sms.SmsEncoding.unicode with Double = js.native
  /* 0 */ val unknown: typings.winrt.Windows.Devices.Sms.SmsEncoding.unknown with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SmsEncoding with Double] = js.native
}

