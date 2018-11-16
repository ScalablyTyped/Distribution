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
  
  val ignoreExifOrientation: ignoreExifOrientation with java.lang.String = js.native
  val respectExifOrientation: respectExifOrientation with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtLib.WindowsNs.GraphicsNs.ImagingNs.ExifOrientationMode with java.lang.String
  ] = js.native
}

