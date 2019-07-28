package typings.winrtDashUwp.WindowsNs.GraphicsNs.ImagingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ExifOrientationMode extends js.Object

/** Specifies the EXIF orientation flag behavior when obtaining pixel data. */
@JSGlobal("Windows.Graphics.Imaging.ExifOrientationMode")
@js.native
object ExifOrientationMode extends js.Object {
  /** The EXIF orientation flag is ignored. No rotation or flip operations are performed. */
  @js.native
  sealed trait ignoreExifOrientation extends ExifOrientationMode
  
  /** If the image frame contains a valid EXIF orientation flag, the specified rotation and/or flip operations are performed on the pixel data. */
  @js.native
  sealed trait respectExifOrientation extends ExifOrientationMode
  
  /* 0 */ val ignoreExifOrientation: typings.winrtDashUwp.WindowsNs.GraphicsNs.ImagingNs.ExifOrientationMode.ignoreExifOrientation with Double = js.native
  /* 1 */ val respectExifOrientation: typings.winrtDashUwp.WindowsNs.GraphicsNs.ImagingNs.ExifOrientationMode.respectExifOrientation with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ExifOrientationMode with Double] = js.native
}

