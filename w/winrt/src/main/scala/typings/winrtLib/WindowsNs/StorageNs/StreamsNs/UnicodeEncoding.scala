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
  
  /* 2 */ val utf16BE: utf16BE with scala.Double = js.native
  /* 1 */ val utf16LE: utf16LE with scala.Double = js.native
  /* 0 */ val utf8: utf8 with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtLib.WindowsNs.StorageNs.StreamsNs.UnicodeEncoding with scala.Double] = js.native
}

