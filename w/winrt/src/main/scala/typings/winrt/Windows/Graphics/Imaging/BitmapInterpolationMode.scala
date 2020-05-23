package typings.winrt.Windows.Graphics.Imaging

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BitmapInterpolationMode extends js.Object

@JSGlobal("Windows.Graphics.Imaging.BitmapInterpolationMode")
@js.native
object BitmapInterpolationMode extends js.Object {
  @js.native
  sealed trait cubic extends BitmapInterpolationMode
  
  @js.native
  sealed trait fant extends BitmapInterpolationMode
  
  @js.native
  sealed trait linear extends BitmapInterpolationMode
  
  @js.native
  sealed trait nearestNeighbor extends BitmapInterpolationMode
  
}

