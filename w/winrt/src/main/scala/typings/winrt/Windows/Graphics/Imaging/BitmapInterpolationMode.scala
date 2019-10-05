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
  
  /* 2 */ val cubic: typings.winrt.Windows.Graphics.Imaging.BitmapInterpolationMode.cubic with Double = js.native
  /* 3 */ val fant: typings.winrt.Windows.Graphics.Imaging.BitmapInterpolationMode.fant with Double = js.native
  /* 1 */ val linear: typings.winrt.Windows.Graphics.Imaging.BitmapInterpolationMode.linear with Double = js.native
  /* 0 */ val nearestNeighbor: typings.winrt.Windows.Graphics.Imaging.BitmapInterpolationMode.nearestNeighbor with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BitmapInterpolationMode with Double] = js.native
}

