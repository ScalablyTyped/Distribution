package typings.winrtUwp.Windows.Devices.Sms

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
  
}

