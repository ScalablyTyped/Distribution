package typings.winrt.Windows.Storage.Streams

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait UnicodeEncoding extends js.Object

@JSGlobal("Windows.Storage.Streams.UnicodeEncoding")
@js.native
object UnicodeEncoding extends js.Object {
  @js.native
  sealed trait utf16BE extends UnicodeEncoding
  
  @js.native
  sealed trait utf16LE extends UnicodeEncoding
  
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

