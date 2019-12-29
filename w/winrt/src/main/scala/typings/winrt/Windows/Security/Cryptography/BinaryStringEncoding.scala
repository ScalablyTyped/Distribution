package typings.winrt.Windows.Security.Cryptography

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BinaryStringEncoding with Double] = js.native
  /* 2 */ @js.native
  object utf16BE extends TopLevel[utf16BE with Double]
  
  /* 1 */ @js.native
  object utf16LE extends TopLevel[utf16LE with Double]
  
  /* 0 */ @js.native
  object utf8 extends TopLevel[utf8 with Double]
  
}

