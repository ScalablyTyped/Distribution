package typings
package winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs

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
  sealed trait utf16BE
    extends winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.UnicodeEncoding
  
  /** The encoding is UTF-16, with the least significant byte first in the two eight-bit bytes. */
  @js.native
  sealed trait utf16LE
    extends winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.UnicodeEncoding
  
  /** The encoding is UTF-8. */
  @js.native
  sealed trait utf8
    extends winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.UnicodeEncoding
  
  val utf16BE: utf16BE with java.lang.String = js.native
  val utf16LE: utf16LE with java.lang.String = js.native
  val utf8: utf8 with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.UnicodeEncoding with java.lang.String
  ] = js.native
}

