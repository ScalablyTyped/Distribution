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
  
  val default: default with java.lang.String = js.native
  val y4Cb2Cr0: y4Cb2Cr0 with java.lang.String = js.native
  val y4Cb2Cr2: y4Cb2Cr2 with java.lang.String = js.native
  val y4Cb4Cr4: y4Cb4Cr4 with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtLib.WindowsNs.GraphicsNs.ImagingNs.JpegSubsamplingMode with java.lang.String
  ] = js.native
}

