package typings.winrtUwp.Windows.Graphics.Imaging

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TiffCompressionMode extends js.Object

/** Specifies the compression mode used for TIFF images. */
@JSGlobal("Windows.Graphics.Imaging.TiffCompressionMode")
@js.native
object TiffCompressionMode extends js.Object {
  /** The compression will be automatically selected. */
  @js.native
  sealed trait automatic extends TiffCompressionMode
  
  /** CCITT3 compression will be applied. */
  @js.native
  sealed trait ccitt3 extends TiffCompressionMode
  
  /** CCITT4compression will be applied. */
  @js.native
  sealed trait ccitt4 extends TiffCompressionMode
  
  /** LZW compression will be applied. */
  @js.native
  sealed trait lzw extends TiffCompressionMode
  
  /** LZWH Differencing compression will be applied. */
  @js.native
  sealed trait lzwhDifferencing extends TiffCompressionMode
  
  /** No compression will be applied. */
  @js.native
  sealed trait none extends TiffCompressionMode
  
  /** RLE compression will be applied. */
  @js.native
  sealed trait rle extends TiffCompressionMode
  
  /** ZIP compression will be applied. */
  @js.native
  sealed trait zip extends TiffCompressionMode
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TiffCompressionMode with Double] = js.native
  /* 0 */ @js.native
  object automatic extends TopLevel[automatic with Double]
  
  /* 2 */ @js.native
  object ccitt3 extends TopLevel[ccitt3 with Double]
  
  /* 3 */ @js.native
  object ccitt4 extends TopLevel[ccitt4 with Double]
  
  /* 4 */ @js.native
  object lzw extends TopLevel[lzw with Double]
  
  /* 7 */ @js.native
  object lzwhDifferencing extends TopLevel[lzwhDifferencing with Double]
  
  /* 1 */ @js.native
  object none extends TopLevel[none with Double]
  
  /* 5 */ @js.native
  object rle extends TopLevel[rle with Double]
  
  /* 6 */ @js.native
  object zip extends TopLevel[zip with Double]
  
}

