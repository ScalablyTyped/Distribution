package typings.winrt.WindowsNs.GraphicsNs.ImagingNs

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
  
  /* 0 */ val automatic: typings.winrt.WindowsNs.GraphicsNs.ImagingNs.TiffCompressionMode.automatic with Double = js.native
  /* 2 */ val ccitt3: typings.winrt.WindowsNs.GraphicsNs.ImagingNs.TiffCompressionMode.ccitt3 with Double = js.native
  /* 3 */ val ccitt4: typings.winrt.WindowsNs.GraphicsNs.ImagingNs.TiffCompressionMode.ccitt4 with Double = js.native
  /* 4 */ val lzw: typings.winrt.WindowsNs.GraphicsNs.ImagingNs.TiffCompressionMode.lzw with Double = js.native
  /* 7 */ val lzwhDifferencing: typings.winrt.WindowsNs.GraphicsNs.ImagingNs.TiffCompressionMode.lzwhDifferencing with Double = js.native
  /* 1 */ val none: typings.winrt.WindowsNs.GraphicsNs.ImagingNs.TiffCompressionMode.none with Double = js.native
  /* 5 */ val rle: typings.winrt.WindowsNs.GraphicsNs.ImagingNs.TiffCompressionMode.rle with Double = js.native
  /* 6 */ val zip: typings.winrt.WindowsNs.GraphicsNs.ImagingNs.TiffCompressionMode.zip with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TiffCompressionMode with Double] = js.native
}

