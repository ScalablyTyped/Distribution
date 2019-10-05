package typings.winrt.Windows.Storage.Streams

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
  
  /* 2 */ val utf16BE: typings.winrt.Windows.Storage.Streams.UnicodeEncoding.utf16BE with Double = js.native
  /* 1 */ val utf16LE: typings.winrt.Windows.Storage.Streams.UnicodeEncoding.utf16LE with Double = js.native
  /* 0 */ val utf8: typings.winrt.Windows.Storage.Streams.UnicodeEncoding.utf8 with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[UnicodeEncoding with Double] = js.native
}

