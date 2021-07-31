package typings.winrtUwp.Windows.Devices.Sms

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SmsEncoding extends StObject
/** This enumerated type is used to determine the encoding algorithm to send or calculate the length of an SmsTextMessage object. */
@JSGlobal("Windows.Devices.Sms.SmsEncoding")
@js.native
object SmsEncoding extends StObject {
  
  /** Standard eight bit encoding. */
  @js.native
  sealed trait eightBit
    extends StObject
       with SmsEncoding
  
  /** Standard 7-bit GSM encoding. */
  @js.native
  sealed trait gsmSevenBit
    extends StObject
       with SmsEncoding
  
  /** IA5 encoding. */
  @js.native
  sealed trait ia5
    extends StObject
       with SmsEncoding
  
  /** Korean encoding. */
  @js.native
  sealed trait korean
    extends StObject
       with SmsEncoding
  
  /** Latin encoding. */
  @js.native
  sealed trait latin
    extends StObject
       with SmsEncoding
  
  /** Latin Hebrew encoding. */
  @js.native
  sealed trait latinHebrew
    extends StObject
       with SmsEncoding
  
  /** 7-bit encoding if all characters can be represented, otherwise 2-byte Universal Character Set (UCS-2) encoding. */
  @js.native
  sealed trait optimal
    extends StObject
       with SmsEncoding
  
  /** Seven-bit ASCII encoding. */
  @js.native
  sealed trait sevenBitAscii
    extends StObject
       with SmsEncoding
  
  /** Shift-JIS encoding for the Japanese language. */
  @js.native
  sealed trait shiftJis
    extends StObject
       with SmsEncoding
  
  /** Unicode encoding. */
  @js.native
  sealed trait unicode
    extends StObject
       with SmsEncoding
  
  /** The data encoding is unknown. */
  @js.native
  sealed trait unknown
    extends StObject
       with SmsEncoding
}
