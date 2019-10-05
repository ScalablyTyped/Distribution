package typings.winrt.Windows.Graphics.Imaging

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait JpegSubsamplingMode extends js.Object

@JSGlobal("Windows.Graphics.Imaging.JpegSubsamplingMode")
@js.native
object JpegSubsamplingMode extends js.Object {
  @js.native
  sealed trait default extends JpegSubsamplingMode
  
  @js.native
  sealed trait y4Cb2Cr0 extends JpegSubsamplingMode
  
  @js.native
  sealed trait y4Cb2Cr2 extends JpegSubsamplingMode
  
  @js.native
  sealed trait y4Cb4Cr4 extends JpegSubsamplingMode
  
  /* 0 */ val default: typings.winrt.Windows.Graphics.Imaging.JpegSubsamplingMode.default with Double = js.native
  /* 1 */ val y4Cb2Cr0: typings.winrt.Windows.Graphics.Imaging.JpegSubsamplingMode.y4Cb2Cr0 with Double = js.native
  /* 2 */ val y4Cb2Cr2: typings.winrt.Windows.Graphics.Imaging.JpegSubsamplingMode.y4Cb2Cr2 with Double = js.native
  /* 3 */ val y4Cb4Cr4: typings.winrt.Windows.Graphics.Imaging.JpegSubsamplingMode.y4Cb4Cr4 with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[JpegSubsamplingMode with Double] = js.native
}

