package typings.winrtUwp.Windows.Graphics.Imaging

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BitmapInterpolationMode extends js.Object

/** Specifies the interpolation mode used for scaling pixel data. */
@JSGlobal("Windows.Graphics.Imaging.BitmapInterpolationMode")
@js.native
object BitmapInterpolationMode extends js.Object {
  /** A bicubic interpolation algorithm. Destination pixel values are computed as a weighted average of the nearest sixteen pixels in a 4x4 grid. */
  @js.native
  sealed trait cubic extends BitmapInterpolationMode
  
  /** A Fant resampling algorithm. Destination pixel values are computed as a weighted average of the all the pixels that map to the new pixel in a box shaped kernel. */
  @js.native
  sealed trait fant extends BitmapInterpolationMode
  
  /** A bilinear interpolation algorithm. The output pixel values are computed as a weighted average of the nearest four pixels in a 2x2 grid. */
  @js.native
  sealed trait linear extends BitmapInterpolationMode
  
  /** A nearest neighbor interpolation algorithm. Also known as nearest pixel or point interpolation. The output pixel is assigned the value of the pixel that the point falls within. No other pixels are considered. */
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

