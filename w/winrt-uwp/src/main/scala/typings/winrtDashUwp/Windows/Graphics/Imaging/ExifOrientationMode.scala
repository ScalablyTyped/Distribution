package typings.winrtDashUwp.Windows.Graphics.Imaging

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ExifOrientationMode with Double] = js.native
  /* 0 */ @js.native
  object ignoreExifOrientation extends TopLevel[ignoreExifOrientation with Double]
  
  /* 1 */ @js.native
  object respectExifOrientation extends TopLevel[respectExifOrientation with Double]
  
}

