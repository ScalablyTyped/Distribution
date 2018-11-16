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
  
  val cubic: cubic with java.lang.String = js.native
  val fant: fant with java.lang.String = js.native
  val linear: linear with java.lang.String = js.native
  val nearestNeighbor: nearestNeighbor with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtLib.WindowsNs.GraphicsNs.ImagingNs.BitmapInterpolationMode with java.lang.String
  ] = js.native
}

