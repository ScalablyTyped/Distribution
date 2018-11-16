package typings
package winrtLib.WindowsNs.GraphicsNs.ImagingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BitmapPixelFormat extends js.Object

@JSGlobal("Windows.Graphics.Imaging.BitmapPixelFormat")
@js.native
object BitmapPixelFormat extends js.Object {
  @js.native
  sealed trait bgra8
    extends winrtLib.WindowsNs.GraphicsNs.ImagingNs.BitmapPixelFormat
  
  @js.native
  sealed trait rgba16
    extends winrtLib.WindowsNs.GraphicsNs.ImagingNs.BitmapPixelFormat
  
  @js.native
  sealed trait rgba8
    extends winrtLib.WindowsNs.GraphicsNs.ImagingNs.BitmapPixelFormat
  
  @js.native
  sealed trait unknown
    extends winrtLib.WindowsNs.GraphicsNs.ImagingNs.BitmapPixelFormat
  
  val bgra8: bgra8 with java.lang.String = js.native
  val rgba16: rgba16 with java.lang.String = js.native
  val rgba8: rgba8 with java.lang.String = js.native
  val unknown: unknown with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[winrtLib.WindowsNs.GraphicsNs.ImagingNs.BitmapPixelFormat with java.lang.String] = js.native
}

