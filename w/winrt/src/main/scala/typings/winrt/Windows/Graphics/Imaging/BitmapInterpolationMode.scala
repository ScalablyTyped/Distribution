package typings.winrt.Windows.Graphics.Imaging

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BitmapInterpolationMode with Double] = js.native
  /* 2 */ @js.native
  object cubic extends TopLevel[cubic with Double]
  
  /* 3 */ @js.native
  object fant extends TopLevel[fant with Double]
  
  /* 1 */ @js.native
  object linear extends TopLevel[linear with Double]
  
  /* 0 */ @js.native
  object nearestNeighbor extends TopLevel[nearestNeighbor with Double]
  
}

