package typings.winrt.Windows.Security.Cryptography

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BinaryStringEncoding extends js.Object

@JSGlobal("Windows.Security.Cryptography.BinaryStringEncoding")
@js.native
object BinaryStringEncoding extends js.Object {
  @js.native
  sealed trait utf16BE extends BinaryStringEncoding
  
  @js.native
  sealed trait utf16LE extends BinaryStringEncoding
  
  @js.native
  sealed trait utf8 extends BinaryStringEncoding
  
  /* 2 */ val utf16BE: typings.winrt.Windows.Security.Cryptography.BinaryStringEncoding.utf16BE with Double = js.native
  /* 1 */ val utf16LE: typings.winrt.Windows.Security.Cryptography.BinaryStringEncoding.utf16LE with Double = js.native
  /* 0 */ val utf8: typings.winrt.Windows.Security.Cryptography.BinaryStringEncoding.utf8 with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BinaryStringEncoding with Double] = js.native
}

