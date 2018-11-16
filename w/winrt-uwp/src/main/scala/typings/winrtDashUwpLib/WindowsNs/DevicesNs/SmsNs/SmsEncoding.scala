package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.SmsNs

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
  sealed trait eightBit
    extends winrtDashUwpLib.WindowsNs.DevicesNs.SmsNs.SmsEncoding
  
  /** Standard 7-bit GSM encoding. */
  @js.native
  sealed trait gsmSevenBit
    extends winrtDashUwpLib.WindowsNs.DevicesNs.SmsNs.SmsEncoding
  
  /** IA5 encoding. */
  @js.native
  sealed trait ia5
    extends winrtDashUwpLib.WindowsNs.DevicesNs.SmsNs.SmsEncoding
  
  /** Korean encoding. */
  @js.native
  sealed trait korean
    extends winrtDashUwpLib.WindowsNs.DevicesNs.SmsNs.SmsEncoding
  
  /** Latin encoding. */
  @js.native
  sealed trait latin
    extends winrtDashUwpLib.WindowsNs.DevicesNs.SmsNs.SmsEncoding
  
  /** Latin Hebrew encoding. */
  @js.native
  sealed trait latinHebrew
    extends winrtDashUwpLib.WindowsNs.DevicesNs.SmsNs.SmsEncoding
  
  /** 7-bit encoding if all characters can be represented, otherwise 2-byte Universal Character Set (UCS-2) encoding. */
  @js.native
  sealed trait optimal
    extends winrtDashUwpLib.WindowsNs.DevicesNs.SmsNs.SmsEncoding
  
  /** Seven-bit ASCII encoding. */
  @js.native
  sealed trait sevenBitAscii
    extends winrtDashUwpLib.WindowsNs.DevicesNs.SmsNs.SmsEncoding
  
  /** Shift-JIS encoding for the Japanese language. */
  @js.native
  sealed trait shiftJis
    extends winrtDashUwpLib.WindowsNs.DevicesNs.SmsNs.SmsEncoding
  
  /** Unicode encoding. */
  @js.native
  sealed trait unicode
    extends winrtDashUwpLib.WindowsNs.DevicesNs.SmsNs.SmsEncoding
  
  /** The data encoding is unknown. */
  @js.native
  sealed trait unknown
    extends winrtDashUwpLib.WindowsNs.DevicesNs.SmsNs.SmsEncoding
  
  val eightBit: eightBit with java.lang.String = js.native
  val gsmSevenBit: gsmSevenBit with java.lang.String = js.native
  val ia5: ia5 with java.lang.String = js.native
  val korean: korean with java.lang.String = js.native
  val latin: latin with java.lang.String = js.native
  val latinHebrew: latinHebrew with java.lang.String = js.native
  val optimal: optimal with java.lang.String = js.native
  val sevenBitAscii: sevenBitAscii with java.lang.String = js.native
  val shiftJis: shiftJis with java.lang.String = js.native
  val unicode: unicode with java.lang.String = js.native
  val unknown: unknown with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[winrtDashUwpLib.WindowsNs.DevicesNs.SmsNs.SmsEncoding with java.lang.String] = js.native
}

