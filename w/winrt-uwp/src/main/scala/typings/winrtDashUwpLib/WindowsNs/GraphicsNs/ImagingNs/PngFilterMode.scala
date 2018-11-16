package typings
package winrtDashUwpLib.WindowsNs.GraphicsNs.ImagingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PngFilterMode extends js.Object

/** Specifies the filter used to optimize the image prior to image compression in PNG images. */
@JSGlobal("Windows.Graphics.Imaging.PngFilterMode")
@js.native
object PngFilterMode extends js.Object {
  /** The Adaptive type filter is applied. */
  @js.native
  sealed trait adaptive
    extends winrtDashUwpLib.WindowsNs.GraphicsNs.ImagingNs.PngFilterMode
  
  /** The filter type will be chosen automatically. */
  @js.native
  sealed trait automatic
    extends winrtDashUwpLib.WindowsNs.GraphicsNs.ImagingNs.PngFilterMode
  
  /** The Average type filter is applied. */
  @js.native
  sealed trait average
    extends winrtDashUwpLib.WindowsNs.GraphicsNs.ImagingNs.PngFilterMode
  
  /** The image is unmodified. */
  @js.native
  sealed trait none
    extends winrtDashUwpLib.WindowsNs.GraphicsNs.ImagingNs.PngFilterMode
  
  /** The Paeth type filter is applied. */
  @js.native
  sealed trait paeth
    extends winrtDashUwpLib.WindowsNs.GraphicsNs.ImagingNs.PngFilterMode
  
  /** The Sub type filter is applied. */
  @js.native
  sealed trait sub
    extends winrtDashUwpLib.WindowsNs.GraphicsNs.ImagingNs.PngFilterMode
  
  /** The Up filter type is applied. */
  @js.native
  sealed trait up
    extends winrtDashUwpLib.WindowsNs.GraphicsNs.ImagingNs.PngFilterMode
  
  val adaptive: adaptive with java.lang.String = js.native
  val automatic: automatic with java.lang.String = js.native
  val average: average with java.lang.String = js.native
  val none: none with java.lang.String = js.native
  val paeth: paeth with java.lang.String = js.native
  val sub: sub with java.lang.String = js.native
  val up: up with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.GraphicsNs.ImagingNs.PngFilterMode with java.lang.String
  ] = js.native
}

