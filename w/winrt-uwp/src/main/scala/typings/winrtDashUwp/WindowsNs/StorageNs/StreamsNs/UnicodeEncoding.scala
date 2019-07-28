package typings.winrtDashUwp.WindowsNs.StorageNs.StreamsNs

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
  
  /* 2 */ val utf16BE: typings.winrtDashUwp.WindowsNs.StorageNs.StreamsNs.UnicodeEncoding.utf16BE with Double = js.native
  /* 1 */ val utf16LE: typings.winrtDashUwp.WindowsNs.StorageNs.StreamsNs.UnicodeEncoding.utf16LE with Double = js.native
  /* 0 */ val utf8: typings.winrtDashUwp.WindowsNs.StorageNs.StreamsNs.UnicodeEncoding.utf8 with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[UnicodeEncoding with Double] = js.native
}

