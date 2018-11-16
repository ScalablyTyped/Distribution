package typings
package winrtLib.WindowsNs.StorageNs.StreamsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait UnicodeEncoding extends js.Object

@JSGlobal("Windows.Storage.Streams.UnicodeEncoding")
@js.native
object UnicodeEncoding extends js.Object {
  @js.native
  sealed trait utf16BE
    extends winrtLib.WindowsNs.StorageNs.StreamsNs.UnicodeEncoding
  
  @js.native
  sealed trait utf16LE
    extends winrtLib.WindowsNs.StorageNs.StreamsNs.UnicodeEncoding
  
  @js.native
  sealed trait utf8
    extends winrtLib.WindowsNs.StorageNs.StreamsNs.UnicodeEncoding
  
  val utf16BE: utf16BE with java.lang.String = js.native
  val utf16LE: utf16LE with java.lang.String = js.native
  val utf8: utf8 with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[winrtLib.WindowsNs.StorageNs.StreamsNs.UnicodeEncoding with java.lang.String] = js.native
}

