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
  
}

