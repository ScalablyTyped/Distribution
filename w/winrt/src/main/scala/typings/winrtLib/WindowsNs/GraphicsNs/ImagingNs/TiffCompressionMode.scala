package typings
package winrtLib.WindowsNs.GraphicsNs.ImagingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TiffCompressionMode extends js.Object

@JSGlobal("Windows.Graphics.Imaging.TiffCompressionMode")
@js.native
object TiffCompressionMode extends js.Object {
  @js.native
  sealed trait automatic
    extends winrtLib.WindowsNs.GraphicsNs.ImagingNs.TiffCompressionMode
  
  @js.native
  sealed trait ccitt3
    extends winrtLib.WindowsNs.GraphicsNs.ImagingNs.TiffCompressionMode
  
  @js.native
  sealed trait ccitt4
    extends winrtLib.WindowsNs.GraphicsNs.ImagingNs.TiffCompressionMode
  
  @js.native
  sealed trait lzw
    extends winrtLib.WindowsNs.GraphicsNs.ImagingNs.TiffCompressionMode
  
  @js.native
  sealed trait lzwhDifferencing
    extends winrtLib.WindowsNs.GraphicsNs.ImagingNs.TiffCompressionMode
  
  @js.native
  sealed trait none
    extends winrtLib.WindowsNs.GraphicsNs.ImagingNs.TiffCompressionMode
  
  @js.native
  sealed trait rle
    extends winrtLib.WindowsNs.GraphicsNs.ImagingNs.TiffCompressionMode
  
  @js.native
  sealed trait zip
    extends winrtLib.WindowsNs.GraphicsNs.ImagingNs.TiffCompressionMode
  
  /* 0 */ val automatic: automatic with scala.Double = js.native
  /* 2 */ val ccitt3: ccitt3 with scala.Double = js.native
  /* 3 */ val ccitt4: ccitt4 with scala.Double = js.native
  /* 4 */ val lzw: lzw with scala.Double = js.native
  /* 7 */ val lzwhDifferencing: lzwhDifferencing with scala.Double = js.native
  /* 1 */ val none: none with scala.Double = js.native
  /* 5 */ val rle: rle with scala.Double = js.native
  /* 6 */ val zip: zip with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtLib.WindowsNs.GraphicsNs.ImagingNs.TiffCompressionMode with scala.Double] = js.native
}

