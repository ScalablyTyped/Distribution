package typings
package winrtLib.WindowsNs.SecurityNs.CryptographyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BinaryStringEncoding extends js.Object

@JSGlobal("Windows.Security.Cryptography.BinaryStringEncoding")
@js.native
object BinaryStringEncoding extends js.Object {
  @js.native
  sealed trait utf16BE
    extends winrtLib.WindowsNs.SecurityNs.CryptographyNs.BinaryStringEncoding
  
  @js.native
  sealed trait utf16LE
    extends winrtLib.WindowsNs.SecurityNs.CryptographyNs.BinaryStringEncoding
  
  @js.native
  sealed trait utf8
    extends winrtLib.WindowsNs.SecurityNs.CryptographyNs.BinaryStringEncoding
  
  /* 2 */ val utf16BE: utf16BE with scala.Double = js.native
  /* 1 */ val utf16LE: utf16LE with scala.Double = js.native
  /* 0 */ val utf8: utf8 with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtLib.WindowsNs.SecurityNs.CryptographyNs.BinaryStringEncoding with scala.Double
  ] = js.native
}

