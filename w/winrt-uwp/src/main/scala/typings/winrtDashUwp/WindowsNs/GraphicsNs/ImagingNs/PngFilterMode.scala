package typings.winrtDashUwp.WindowsNs.GraphicsNs.ImagingNs

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
  sealed trait adaptive extends PngFilterMode
  
  /** The filter type will be chosen automatically. */
  @js.native
  sealed trait automatic extends PngFilterMode
  
  /** The Average type filter is applied. */
  @js.native
  sealed trait average extends PngFilterMode
  
  /** The image is unmodified. */
  @js.native
  sealed trait none extends PngFilterMode
  
  /** The Paeth type filter is applied. */
  @js.native
  sealed trait paeth extends PngFilterMode
  
  /** The Sub type filter is applied. */
  @js.native
  sealed trait sub extends PngFilterMode
  
  /** The Up filter type is applied. */
  @js.native
  sealed trait up extends PngFilterMode
  
  /* 6 */ val adaptive: typings.winrtDashUwp.WindowsNs.GraphicsNs.ImagingNs.PngFilterMode.adaptive with Double = js.native
  /* 0 */ val automatic: typings.winrtDashUwp.WindowsNs.GraphicsNs.ImagingNs.PngFilterMode.automatic with Double = js.native
  /* 4 */ val average: typings.winrtDashUwp.WindowsNs.GraphicsNs.ImagingNs.PngFilterMode.average with Double = js.native
  /* 1 */ val none: typings.winrtDashUwp.WindowsNs.GraphicsNs.ImagingNs.PngFilterMode.none with Double = js.native
  /* 5 */ val paeth: typings.winrtDashUwp.WindowsNs.GraphicsNs.ImagingNs.PngFilterMode.paeth with Double = js.native
  /* 2 */ val sub: typings.winrtDashUwp.WindowsNs.GraphicsNs.ImagingNs.PngFilterMode.sub with Double = js.native
  /* 3 */ val up: typings.winrtDashUwp.WindowsNs.GraphicsNs.ImagingNs.PngFilterMode.up with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PngFilterMode with Double] = js.native
}

