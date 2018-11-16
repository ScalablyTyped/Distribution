package typings
package winrtDashUwpLib.WindowsNs.GraphicsNs.ImagingNs

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
  sealed trait ignoreExifOrientation
    extends winrtDashUwpLib.WindowsNs.GraphicsNs.ImagingNs.ExifOrientationMode
  
  /** If the image frame contains a valid EXIF orientation flag, the specified rotation and/or flip operations are performed on the pixel data. */
  @js.native
  sealed trait respectExifOrientation
    extends winrtDashUwpLib.WindowsNs.GraphicsNs.ImagingNs.ExifOrientationMode
  
  val ignoreExifOrientation: ignoreExifOrientation with java.lang.String = js.native
  val respectExifOrientation: respectExifOrientation with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.GraphicsNs.ImagingNs.ExifOrientationMode with java.lang.String
  ] = js.native
}

