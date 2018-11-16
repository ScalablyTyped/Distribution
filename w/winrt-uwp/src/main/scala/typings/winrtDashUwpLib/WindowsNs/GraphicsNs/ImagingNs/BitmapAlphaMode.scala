package typings
package winrtDashUwpLib.WindowsNs.GraphicsNs.ImagingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BitmapAlphaMode extends js.Object

/** Specifies the alpha mode of pixel data. */
@JSGlobal("Windows.Graphics.Imaging.BitmapAlphaMode")
@js.native
object BitmapAlphaMode extends js.Object {
  /** The alpha value is ignored. */
  @js.native
  sealed trait ignore
    extends winrtDashUwpLib.WindowsNs.GraphicsNs.ImagingNs.BitmapAlphaMode
  
  /** The alpha value has been premultiplied. Each color is first scaled by the alpha value. */
  @js.native
  sealed trait premultiplied
    extends winrtDashUwpLib.WindowsNs.GraphicsNs.ImagingNs.BitmapAlphaMode
  
  /** The alpha value has not been premultiplied. The alpha channel indicates the transparency of the color. */
  @js.native
  sealed trait straight
    extends winrtDashUwpLib.WindowsNs.GraphicsNs.ImagingNs.BitmapAlphaMode
  
  val ignore: ignore with java.lang.String = js.native
  val premultiplied: premultiplied with java.lang.String = js.native
  val straight: straight with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.GraphicsNs.ImagingNs.BitmapAlphaMode with java.lang.String
  ] = js.native
}

