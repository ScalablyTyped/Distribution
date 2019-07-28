package typings.winrt.WindowsNs.GraphicsNs.ImagingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BitmapRotation extends js.Object

@JSGlobal("Windows.Graphics.Imaging.BitmapRotation")
@js.native
object BitmapRotation extends js.Object {
  @js.native
  sealed trait clockwise180Degrees extends BitmapRotation
  
  @js.native
  sealed trait clockwise270Degrees extends BitmapRotation
  
  @js.native
  sealed trait clockwise90Degrees extends BitmapRotation
  
  @js.native
  sealed trait none extends BitmapRotation
  
  /* 2 */ val clockwise180Degrees: typings.winrt.WindowsNs.GraphicsNs.ImagingNs.BitmapRotation.clockwise180Degrees with Double = js.native
  /* 3 */ val clockwise270Degrees: typings.winrt.WindowsNs.GraphicsNs.ImagingNs.BitmapRotation.clockwise270Degrees with Double = js.native
  /* 1 */ val clockwise90Degrees: typings.winrt.WindowsNs.GraphicsNs.ImagingNs.BitmapRotation.clockwise90Degrees with Double = js.native
  /* 0 */ val none: typings.winrt.WindowsNs.GraphicsNs.ImagingNs.BitmapRotation.none with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BitmapRotation with Double] = js.native
}

