package typings
package winrtDashUwpLib.WindowsNs.GraphicsNs.ImagingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait JpegSubsamplingMode extends js.Object

/** Specifies which chroma subsampling mode will be used for image compression in JPEG images. */
@JSGlobal("Windows.Graphics.Imaging.JpegSubsamplingMode")
@js.native
object JpegSubsamplingMode extends js.Object {
  /** The default mode will be used. */
  @js.native
  sealed trait default
    extends winrtDashUwpLib.WindowsNs.GraphicsNs.ImagingNs.JpegSubsamplingMode
  
  /** 4:2:0 (2x2) chroma subsampling will be used. */
  @js.native
  sealed trait y4Cb2Cr0
    extends winrtDashUwpLib.WindowsNs.GraphicsNs.ImagingNs.JpegSubsamplingMode
  
  /** 4:2:2 (2x1) chroma subsampling will be used. */
  @js.native
  sealed trait y4Cb2Cr2
    extends winrtDashUwpLib.WindowsNs.GraphicsNs.ImagingNs.JpegSubsamplingMode
  
  /** 4:4:4 (1x1) chroma subsampling will be used. */
  @js.native
  sealed trait y4Cb4Cr4
    extends winrtDashUwpLib.WindowsNs.GraphicsNs.ImagingNs.JpegSubsamplingMode
  
  /* 0 */ val default: default with scala.Double = js.native
  /* 1 */ val y4Cb2Cr0: y4Cb2Cr0 with scala.Double = js.native
  /* 2 */ val y4Cb2Cr2: y4Cb2Cr2 with scala.Double = js.native
  /* 3 */ val y4Cb4Cr4: y4Cb4Cr4 with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.GraphicsNs.ImagingNs.JpegSubsamplingMode with scala.Double
  ] = js.native
}

