package typings.winrt.Windows.Graphics.Imaging

import org.scalablytyped.runtime.TopLevel
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

