package typings.winrt.Windows.Devices.Sms

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SmsEncoding with Double] = js.native
  /* 4 */ @js.native
  object gsmSevenBit extends TopLevel[gsmSevenBit with Double]
  
  /* 1 */ @js.native
  object optimal extends TopLevel[optimal with Double]
  
  /* 2 */ @js.native
  object sevenBitAscii extends TopLevel[sevenBitAscii with Double]
  
  /* 3 */ @js.native
  object unicode extends TopLevel[unicode with Double]
  
  /* 0 */ @js.native
  object unknown extends TopLevel[unknown with Double]
  
}

