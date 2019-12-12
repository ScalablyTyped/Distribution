package typings.winrtDashUwp.Windows.Graphics.Imaging

import org.scalablytyped.runtime.TopLevel
import typings.winrtDashUwp.Windows.Graphics.Imaging.JpegSubsamplingMode.default
import typings.winrtDashUwp.Windows.Graphics.Imaging.JpegSubsamplingMode.y4Cb2Cr0
import typings.winrtDashUwp.Windows.Graphics.Imaging.JpegSubsamplingMode.y4Cb2Cr2
import typings.winrtDashUwp.Windows.Graphics.Imaging.JpegSubsamplingMode.y4Cb4Cr4
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[JpegSubsamplingMode with Double] = js.native
  /* 0 */ @js.native
  object default extends TopLevel[default with Double]
  
  /* 1 */ @js.native
  object y4Cb2Cr0 extends TopLevel[y4Cb2Cr0 with Double]
  
  /* 2 */ @js.native
  object y4Cb2Cr2 extends TopLevel[y4Cb2Cr2 with Double]
  
  /* 3 */ @js.native
  object y4Cb4Cr4 extends TopLevel[y4Cb4Cr4 with Double]
  
}

