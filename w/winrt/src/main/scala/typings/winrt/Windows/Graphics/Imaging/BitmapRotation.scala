package typings.winrt.Windows.Graphics.Imaging

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
  
}

