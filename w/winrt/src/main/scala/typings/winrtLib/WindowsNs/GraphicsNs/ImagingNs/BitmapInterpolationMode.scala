package typings
package winrtLib.WindowsNs.GraphicsNs.ImagingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BitmapInterpolationMode extends js.Object

@JSGlobal("Windows.Graphics.Imaging.BitmapInterpolationMode")
@js.native
object BitmapInterpolationMode extends js.Object {
  @js.native
  sealed trait cubic
    extends winrtLib.WindowsNs.GraphicsNs.ImagingNs.BitmapInterpolationMode
  
  @js.native
  sealed trait fant
    extends winrtLib.WindowsNs.GraphicsNs.ImagingNs.BitmapInterpolationMode
  
  @js.native
  sealed trait linear
    extends winrtLib.WindowsNs.GraphicsNs.ImagingNs.BitmapInterpolationMode
  
  @js.native
  sealed trait nearestNeighbor
    extends winrtLib.WindowsNs.GraphicsNs.ImagingNs.BitmapInterpolationMode
  
  /* 2 */ val cubic: cubic with scala.Double = js.native
  /* 3 */ val fant: fant with scala.Double = js.native
  /* 1 */ val linear: linear with scala.Double = js.native
  /* 0 */ val nearestNeighbor: nearestNeighbor with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtLib.WindowsNs.GraphicsNs.ImagingNs.BitmapInterpolationMode with scala.Double
  ] = js.native
}

