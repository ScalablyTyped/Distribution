package typings.winrt.WindowsNs.StorageNs.StreamsNs

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
  
  /* 2 */ val utf16BE: typings.winrt.WindowsNs.StorageNs.StreamsNs.UnicodeEncoding.utf16BE with Double = js.native
  /* 1 */ val utf16LE: typings.winrt.WindowsNs.StorageNs.StreamsNs.UnicodeEncoding.utf16LE with Double = js.native
  /* 0 */ val utf8: typings.winrt.WindowsNs.StorageNs.StreamsNs.UnicodeEncoding.utf8 with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[UnicodeEncoding with Double] = js.native
}

