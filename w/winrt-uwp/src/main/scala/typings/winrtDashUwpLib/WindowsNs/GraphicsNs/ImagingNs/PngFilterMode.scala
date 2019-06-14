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
  
  /* 6 */ val adaptive: adaptive with scala.Double = js.native
  /* 0 */ val automatic: automatic with scala.Double = js.native
  /* 4 */ val average: average with scala.Double = js.native
  /* 1 */ val none: none with scala.Double = js.native
  /* 5 */ val paeth: paeth with scala.Double = js.native
  /* 2 */ val sub: sub with scala.Double = js.native
  /* 3 */ val up: up with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtDashUwpLib.WindowsNs.GraphicsNs.ImagingNs.PngFilterMode with scala.Double] = js.native
}

