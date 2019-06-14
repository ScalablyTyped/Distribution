package typings
package winrtLib.WindowsNs.GraphicsNs.ImagingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BitmapAlphaMode extends js.Object

@JSGlobal("Windows.Graphics.Imaging.BitmapAlphaMode")
@js.native
object BitmapAlphaMode extends js.Object {
  @js.native
  sealed trait ignore
    extends winrtLib.WindowsNs.GraphicsNs.ImagingNs.BitmapAlphaMode
  
  @js.native
  sealed trait premultiplied
    extends winrtLib.WindowsNs.GraphicsNs.ImagingNs.BitmapAlphaMode
  
  @js.native
  sealed trait straight
    extends winrtLib.WindowsNs.GraphicsNs.ImagingNs.BitmapAlphaMode
  
  /* 2 */ val ignore: ignore with scala.Double = js.native
  /* 0 */ val premultiplied: premultiplied with scala.Double = js.native
  /* 1 */ val straight: straight with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtLib.WindowsNs.GraphicsNs.ImagingNs.BitmapAlphaMode with scala.Double] = js.native
}

