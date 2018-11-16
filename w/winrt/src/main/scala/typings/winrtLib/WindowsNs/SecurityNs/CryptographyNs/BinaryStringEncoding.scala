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
  
  val utf16BE: utf16BE with java.lang.String = js.native
  val utf16LE: utf16LE with java.lang.String = js.native
  val utf8: utf8 with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtLib.WindowsNs.SecurityNs.CryptographyNs.BinaryStringEncoding with java.lang.String
  ] = js.native
}

