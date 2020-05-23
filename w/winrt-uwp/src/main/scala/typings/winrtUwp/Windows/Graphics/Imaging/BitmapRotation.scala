package typings.winrtUwp.Windows.Graphics.Imaging

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BitmapRotation extends js.Object

/** Specifies the rotation operation to be performed on pixel data. */
@JSGlobal("Windows.Graphics.Imaging.BitmapRotation")
@js.native
object BitmapRotation extends js.Object {
  /** Perform a clockwise rotation of 180 degrees. */
  @js.native
  sealed trait clockwise180Degrees extends BitmapRotation
  
  /** Perform a clockwise rotation of 270 degrees. */
  @js.native
  sealed trait clockwise270Degrees extends BitmapRotation
  
  /** Perform a clockwise rotation of 90 degrees. */
  @js.native
  sealed trait clockwise90Degrees extends BitmapRotation
  
  /** No rotation operation is performed. */
  @js.native
  sealed trait none extends BitmapRotation
  
}

