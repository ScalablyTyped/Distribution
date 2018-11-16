package typings
package winrtDashUwpLib.WindowsNs.GraphicsNs.ImagingNs

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
  sealed trait automatic
    extends winrtDashUwpLib.WindowsNs.GraphicsNs.ImagingNs.TiffCompressionMode
  
  /** CCITT3 compression will be applied. */
  @js.native
  sealed trait ccitt3
    extends winrtDashUwpLib.WindowsNs.GraphicsNs.ImagingNs.TiffCompressionMode
  
  /** CCITT4compression will be applied. */
  @js.native
  sealed trait ccitt4
    extends winrtDashUwpLib.WindowsNs.GraphicsNs.ImagingNs.TiffCompressionMode
  
  /** LZW compression will be applied. */
  @js.native
  sealed trait lzw
    extends winrtDashUwpLib.WindowsNs.GraphicsNs.ImagingNs.TiffCompressionMode
  
  /** LZWH Differencing compression will be applied. */
  @js.native
  sealed trait lzwhDifferencing
    extends winrtDashUwpLib.WindowsNs.GraphicsNs.ImagingNs.TiffCompressionMode
  
  /** No compression will be applied. */
  @js.native
  sealed trait none
    extends winrtDashUwpLib.WindowsNs.GraphicsNs.ImagingNs.TiffCompressionMode
  
  /** RLE compression will be applied. */
  @js.native
  sealed trait rle
    extends winrtDashUwpLib.WindowsNs.GraphicsNs.ImagingNs.TiffCompressionMode
  
  /** ZIP compression will be applied. */
  @js.native
  sealed trait zip
    extends winrtDashUwpLib.WindowsNs.GraphicsNs.ImagingNs.TiffCompressionMode
  
  val automatic: automatic with java.lang.String = js.native
  val ccitt3: ccitt3 with java.lang.String = js.native
  val ccitt4: ccitt4 with java.lang.String = js.native
  val lzw: lzw with java.lang.String = js.native
  val lzwhDifferencing: lzwhDifferencing with java.lang.String = js.native
  val none: none with java.lang.String = js.native
  val rle: rle with java.lang.String = js.native
  val zip: zip with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.GraphicsNs.ImagingNs.TiffCompressionMode with java.lang.String
  ] = js.native
}

