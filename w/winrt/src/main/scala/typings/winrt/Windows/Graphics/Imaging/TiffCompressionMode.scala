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
  
  /* 0 */ val automatic: typings.winrt.Windows.Graphics.Imaging.TiffCompressionMode.automatic with Double = js.native
  /* 2 */ val ccitt3: typings.winrt.Windows.Graphics.Imaging.TiffCompressionMode.ccitt3 with Double = js.native
  /* 3 */ val ccitt4: typings.winrt.Windows.Graphics.Imaging.TiffCompressionMode.ccitt4 with Double = js.native
  /* 4 */ val lzw: typings.winrt.Windows.Graphics.Imaging.TiffCompressionMode.lzw with Double = js.native
  /* 7 */ val lzwhDifferencing: typings.winrt.Windows.Graphics.Imaging.TiffCompressionMode.lzwhDifferencing with Double = js.native
  /* 1 */ val none: typings.winrt.Windows.Graphics.Imaging.TiffCompressionMode.none with Double = js.native
  /* 5 */ val rle: typings.winrt.Windows.Graphics.Imaging.TiffCompressionMode.rle with Double = js.native
  /* 6 */ val zip: typings.winrt.Windows.Graphics.Imaging.TiffCompressionMode.zip with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TiffCompressionMode with Double] = js.native
}

