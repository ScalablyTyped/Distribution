package typings.winrtDashUwp.Windows.Devices.Sms

import org.scalablytyped.runtime.TopLevel
import typings.winrtDashUwp.Windows.Devices.Sms.SmsEncoding.eightBit
import typings.winrtDashUwp.Windows.Devices.Sms.SmsEncoding.gsmSevenBit
import typings.winrtDashUwp.Windows.Devices.Sms.SmsEncoding.ia5
import typings.winrtDashUwp.Windows.Devices.Sms.SmsEncoding.korean
import typings.winrtDashUwp.Windows.Devices.Sms.SmsEncoding.latin
import typings.winrtDashUwp.Windows.Devices.Sms.SmsEncoding.latinHebrew
import typings.winrtDashUwp.Windows.Devices.Sms.SmsEncoding.optimal
import typings.winrtDashUwp.Windows.Devices.Sms.SmsEncoding.sevenBitAscii
import typings.winrtDashUwp.Windows.Devices.Sms.SmsEncoding.shiftJis
import typings.winrtDashUwp.Windows.Devices.Sms.SmsEncoding.unicode
import typings.winrtDashUwp.Windows.Devices.Sms.SmsEncoding.unknown
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SmsEncoding extends js.Object

/** This enumerated type is used to determine the encoding algorithm to send or calculate the length of an SmsTextMessage object. */
@JSGlobal("Windows.Devices.Sms.SmsEncoding")
@js.native
object SmsEncoding extends js.Object {
  /** Standard eight bit encoding. */
  @js.native
  sealed trait eightBit extends SmsEncoding
  
  /** Standard 7-bit GSM encoding. */
  @js.native
  sealed trait gsmSevenBit extends SmsEncoding
  
  /** IA5 encoding. */
  @js.native
  sealed trait ia5 extends SmsEncoding
  
  /** Korean encoding. */
  @js.native
  sealed trait korean extends SmsEncoding
  
  /** Latin encoding. */
  @js.native
  sealed trait latin extends SmsEncoding
  
  /** Latin Hebrew encoding. */
  @js.native
  sealed trait latinHebrew extends SmsEncoding
  
  /** 7-bit encoding if all characters can be represented, otherwise 2-byte Universal Character Set (UCS-2) encoding. */
  @js.native
  sealed trait optimal extends SmsEncoding
  
  /** Seven-bit ASCII encoding. */
  @js.native
  sealed trait sevenBitAscii extends SmsEncoding
  
  /** Shift-JIS encoding for the Japanese language. */
  @js.native
  sealed trait shiftJis extends SmsEncoding
  
  /** Unicode encoding. */
  @js.native
  sealed trait unicode extends SmsEncoding
  
  /** The data encoding is unknown. */
  @js.native
  sealed trait unknown extends SmsEncoding
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SmsEncoding with Double] = js.native
  /* 5 */ @js.native
  object eightBit extends TopLevel[eightBit with Double]
  
  /* 4 */ @js.native
  object gsmSevenBit extends TopLevel[gsmSevenBit with Double]
  
  /* 8 */ @js.native
  object ia5 extends TopLevel[ia5 with Double]
  
  /* 7 */ @js.native
  object korean extends TopLevel[korean with Double]
  
  /* 6 */ @js.native
  object latin extends TopLevel[latin with Double]
  
  /* 10 */ @js.native
  object latinHebrew extends TopLevel[latinHebrew with Double]
  
  /* 1 */ @js.native
  object optimal extends TopLevel[optimal with Double]
  
  /* 2 */ @js.native
  object sevenBitAscii extends TopLevel[sevenBitAscii with Double]
  
  /* 9 */ @js.native
  object shiftJis extends TopLevel[shiftJis with Double]
  
  /* 3 */ @js.native
  object unicode extends TopLevel[unicode with Double]
  
  /* 0 */ @js.native
  object unknown extends TopLevel[unknown with Double]
  
}

