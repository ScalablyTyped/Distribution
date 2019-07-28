package typings.winrt.WindowsNs.GraphicsNs.ImagingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ExifOrientationMode extends js.Object

@JSGlobal("Windows.Graphics.Imaging.ExifOrientationMode")
@js.native
object ExifOrientationMode extends js.Object {
  @js.native
  sealed trait ignoreExifOrientation extends ExifOrientationMode
  
  @js.native
  sealed trait respectExifOrientation extends ExifOrientationMode
  
  /* 0 */ val ignoreExifOrientation: typings.winrt.WindowsNs.GraphicsNs.ImagingNs.ExifOrientationMode.ignoreExifOrientation with Double = js.native
  /* 1 */ val respectExifOrientation: typings.winrt.WindowsNs.GraphicsNs.ImagingNs.ExifOrientationMode.respectExifOrientation with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ExifOrientationMode with Double] = js.native
}

