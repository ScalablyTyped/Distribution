package typings.winrtUwp.Windows.Storage.Streams

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait UnicodeEncoding extends js.Object

/** Specifies the type of character encoding for a stream. */
@JSGlobal("Windows.Storage.Streams.UnicodeEncoding")
@js.native
object UnicodeEncoding extends js.Object {
  /** The encoding is UTF-16, with the most significant byte first in the two eight-bit bytes. */
  @js.native
  sealed trait utf16BE extends UnicodeEncoding
  
  /** The encoding is UTF-16, with the least significant byte first in the two eight-bit bytes. */
  @js.native
  sealed trait utf16LE extends UnicodeEncoding
  
  /** The encoding is UTF-8. */
  @js.native
  sealed trait utf8 extends UnicodeEncoding
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[UnicodeEncoding with Double] = js.native
  /* 2 */ @js.native
  object utf16BE extends TopLevel[utf16BE with Double]
  
  /* 1 */ @js.native
  object utf16LE extends TopLevel[utf16LE with Double]
  
  /* 0 */ @js.native
  object utf8 extends TopLevel[utf8 with Double]
  
}

