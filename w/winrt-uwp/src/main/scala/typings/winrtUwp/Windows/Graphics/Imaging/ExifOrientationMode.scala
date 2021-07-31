package typings.winrtUwp.Windows.Graphics.Imaging

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ExifOrientationMode extends StObject
/** Specifies the EXIF orientation flag behavior when obtaining pixel data. */
@JSGlobal("Windows.Graphics.Imaging.ExifOrientationMode")
@js.native
object ExifOrientationMode extends StObject {
  
  /** The EXIF orientation flag is ignored. No rotation or flip operations are performed. */
  @js.native
  sealed trait ignoreExifOrientation
    extends StObject
       with ExifOrientationMode
  
  /** If the image frame contains a valid EXIF orientation flag, the specified rotation and/or flip operations are performed on the pixel data. */
  @js.native
  sealed trait respectExifOrientation
    extends StObject
       with ExifOrientationMode
}
