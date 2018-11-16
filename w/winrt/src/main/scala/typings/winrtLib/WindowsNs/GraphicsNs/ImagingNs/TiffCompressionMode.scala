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
    winrtLib.WindowsNs.GraphicsNs.ImagingNs.TiffCompressionMode with java.lang.String
  ] = js.native
}

