package typings
package winrtLib.WindowsNs.GraphicsNs.ImagingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BitmapRotation extends js.Object

@JSGlobal("Windows.Graphics.Imaging.BitmapRotation")
@js.native
object BitmapRotation extends js.Object {
  @js.native
  sealed trait clockwise180Degrees
    extends winrtLib.WindowsNs.GraphicsNs.ImagingNs.BitmapRotation
  
  @js.native
  sealed trait clockwise270Degrees
    extends winrtLib.WindowsNs.GraphicsNs.ImagingNs.BitmapRotation
  
  @js.native
  sealed trait clockwise90Degrees
    extends winrtLib.WindowsNs.GraphicsNs.ImagingNs.BitmapRotation
  
  @js.native
  sealed trait none
    extends winrtLib.WindowsNs.GraphicsNs.ImagingNs.BitmapRotation
  
  val clockwise180Degrees: clockwise180Degrees with java.lang.String = js.native
  val clockwise270Degrees: clockwise270Degrees with java.lang.String = js.native
  val clockwise90Degrees: clockwise90Degrees with java.lang.String = js.native
  val none: none with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[winrtLib.WindowsNs.GraphicsNs.ImagingNs.BitmapRotation with java.lang.String] = js.native
}

