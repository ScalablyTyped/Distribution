package typings
package winrtLib.WindowsNs.GraphicsNs.ImagingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ExifOrientationMode extends js.Object

@JSGlobal("Windows.Graphics.Imaging.ExifOrientationMode")
@js.native
object ExifOrientationMode extends js.Object {
  @js.native
  sealed trait ignoreExifOrientation
    extends winrtLib.WindowsNs.GraphicsNs.ImagingNs.ExifOrientationMode
  
  @js.native
  sealed trait respectExifOrientation
    extends winrtLib.WindowsNs.GraphicsNs.ImagingNs.ExifOrientationMode
  
  /* 0 */ val ignoreExifOrientation: ignoreExifOrientation with scala.Double = js.native
  /* 1 */ val respectExifOrientation: respectExifOrientation with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtLib.WindowsNs.GraphicsNs.ImagingNs.ExifOrientationMode with scala.Double] = js.native
}

