package typings.winrtDashUwp.WindowsNs.GraphicsNs.ImagingNs

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
  sealed trait default extends JpegSubsamplingMode
  
  /** 4:2:0 (2x2) chroma subsampling will be used. */
  @js.native
  sealed trait y4Cb2Cr0 extends JpegSubsamplingMode
  
  /** 4:2:2 (2x1) chroma subsampling will be used. */
  @js.native
  sealed trait y4Cb2Cr2 extends JpegSubsamplingMode
  
  /** 4:4:4 (1x1) chroma subsampling will be used. */
  @js.native
  sealed trait y4Cb4Cr4 extends JpegSubsamplingMode
  
  /* 0 */ val default: typings.winrtDashUwp.WindowsNs.GraphicsNs.ImagingNs.JpegSubsamplingMode.default with Double = js.native
  /* 1 */ val y4Cb2Cr0: typings.winrtDashUwp.WindowsNs.GraphicsNs.ImagingNs.JpegSubsamplingMode.y4Cb2Cr0 with Double = js.native
  /* 2 */ val y4Cb2Cr2: typings.winrtDashUwp.WindowsNs.GraphicsNs.ImagingNs.JpegSubsamplingMode.y4Cb2Cr2 with Double = js.native
  /* 3 */ val y4Cb4Cr4: typings.winrtDashUwp.WindowsNs.GraphicsNs.ImagingNs.JpegSubsamplingMode.y4Cb4Cr4 with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[JpegSubsamplingMode with Double] = js.native
}

