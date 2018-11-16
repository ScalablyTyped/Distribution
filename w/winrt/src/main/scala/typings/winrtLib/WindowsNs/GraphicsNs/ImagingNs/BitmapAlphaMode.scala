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
  
  val ignore: ignore with java.lang.String = js.native
  val premultiplied: premultiplied with java.lang.String = js.native
  val straight: straight with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[winrtLib.WindowsNs.GraphicsNs.ImagingNs.BitmapAlphaMode with java.lang.String] = js.native
}

