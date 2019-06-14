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
  
  /* 2 */ val clockwise180Degrees: clockwise180Degrees with scala.Double = js.native
  /* 3 */ val clockwise270Degrees: clockwise270Degrees with scala.Double = js.native
  /* 1 */ val clockwise90Degrees: clockwise90Degrees with scala.Double = js.native
  /* 0 */ val none: none with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtLib.WindowsNs.GraphicsNs.ImagingNs.BitmapRotation with scala.Double] = js.native
}

