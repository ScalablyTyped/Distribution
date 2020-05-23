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
  
}

