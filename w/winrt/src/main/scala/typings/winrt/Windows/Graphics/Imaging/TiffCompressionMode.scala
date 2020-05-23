package typings.winrt.Windows.Graphics.Imaging

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TiffCompressionMode extends js.Object

@JSGlobal("Windows.Graphics.Imaging.TiffCompressionMode")
@js.native
object TiffCompressionMode extends js.Object {
  @js.native
  sealed trait automatic extends TiffCompressionMode
  
  @js.native
  sealed trait ccitt3 extends TiffCompressionMode
  
  @js.native
  sealed trait ccitt4 extends TiffCompressionMode
  
  @js.native
  sealed trait lzw extends TiffCompressionMode
  
  @js.native
  sealed trait lzwhDifferencing extends TiffCompressionMode
  
  @js.native
  sealed trait none extends TiffCompressionMode
  
  @js.native
  sealed trait rle extends TiffCompressionMode
  
  @js.native
  sealed trait zip extends TiffCompressionMode
  
}

