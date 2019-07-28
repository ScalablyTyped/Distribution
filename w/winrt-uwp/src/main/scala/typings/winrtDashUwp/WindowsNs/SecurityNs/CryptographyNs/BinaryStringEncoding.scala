package typings.winrtDashUwp.WindowsNs.SecurityNs.CryptographyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BinaryStringEncoding extends js.Object

/** Contains encoding formats that can be used in the ConvertStringToBinary and ConvertBinaryToString methods. */
@JSGlobal("Windows.Security.Cryptography.BinaryStringEncoding")
@js.native
object BinaryStringEncoding extends js.Object {
  /** Sixteen bit Unicode Transformation Format in big-endian byte order. */
  @js.native
  sealed trait utf16BE extends BinaryStringEncoding
  
  /** Sixteen bit Unicode Transformation Format in little-endian byte order. The encoding process creates a variable length result of one or two 8-bit bytes per Unicode code point. */
  @js.native
  sealed trait utf16LE extends BinaryStringEncoding
  
  /** Eight bit Unicode Transformation Format. The process encodes each Unicode code point into one to four 8-bit bytes. Code points represented by lower numerical values are encoded using fewer bytes. In particular, the first 128 characters correspond exactly to the ASCII character set and are encoded by using a single octet. */
  @js.native
  sealed trait utf8 extends BinaryStringEncoding
  
  /* 2 */ val utf16BE: typings.winrtDashUwp.WindowsNs.SecurityNs.CryptographyNs.BinaryStringEncoding.utf16BE with Double = js.native
  /* 1 */ val utf16LE: typings.winrtDashUwp.WindowsNs.SecurityNs.CryptographyNs.BinaryStringEncoding.utf16LE with Double = js.native
  /* 0 */ val utf8: typings.winrtDashUwp.WindowsNs.SecurityNs.CryptographyNs.BinaryStringEncoding.utf8 with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BinaryStringEncoding with Double] = js.native
}

