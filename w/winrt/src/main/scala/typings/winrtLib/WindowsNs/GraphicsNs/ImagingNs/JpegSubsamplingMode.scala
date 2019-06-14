package typings
package winrtLib.WindowsNs.GraphicsNs.ImagingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait JpegSubsamplingMode extends js.Object

@JSGlobal("Windows.Graphics.Imaging.JpegSubsamplingMode")
@js.native
object JpegSubsamplingMode extends js.Object {
  @js.native
  sealed trait default
    extends winrtLib.WindowsNs.GraphicsNs.ImagingNs.JpegSubsamplingMode
  
  @js.native
  sealed trait y4Cb2Cr0
    extends winrtLib.WindowsNs.GraphicsNs.ImagingNs.JpegSubsamplingMode
  
  @js.native
  sealed trait y4Cb2Cr2
    extends winrtLib.WindowsNs.GraphicsNs.ImagingNs.JpegSubsamplingMode
  
  @js.native
  sealed trait y4Cb4Cr4
    extends winrtLib.WindowsNs.GraphicsNs.ImagingNs.JpegSubsamplingMode
  
  /* 0 */ val default: default with scala.Double = js.native
  /* 1 */ val y4Cb2Cr0: y4Cb2Cr0 with scala.Double = js.native
  /* 2 */ val y4Cb2Cr2: y4Cb2Cr2 with scala.Double = js.native
  /* 3 */ val y4Cb4Cr4: y4Cb4Cr4 with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtLib.WindowsNs.GraphicsNs.ImagingNs.JpegSubsamplingMode with scala.Double] = js.native
}

