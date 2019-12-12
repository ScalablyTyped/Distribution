package typings.winrt.Windows.Graphics.Imaging

import org.scalablytyped.runtime.TopLevel
import typings.winrt.Windows.Graphics.Imaging.TiffCompressionMode.automatic
import typings.winrt.Windows.Graphics.Imaging.TiffCompressionMode.ccitt3
import typings.winrt.Windows.Graphics.Imaging.TiffCompressionMode.ccitt4
import typings.winrt.Windows.Graphics.Imaging.TiffCompressionMode.lzw
import typings.winrt.Windows.Graphics.Imaging.TiffCompressionMode.lzwhDifferencing
import typings.winrt.Windows.Graphics.Imaging.TiffCompressionMode.none
import typings.winrt.Windows.Graphics.Imaging.TiffCompressionMode.rle
import typings.winrt.Windows.Graphics.Imaging.TiffCompressionMode.zip
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

