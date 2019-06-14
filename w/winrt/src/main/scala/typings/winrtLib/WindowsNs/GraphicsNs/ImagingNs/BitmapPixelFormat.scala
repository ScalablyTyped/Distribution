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
  
  /* 3 */ val bgra8: bgra8 with scala.Double = js.native
  /* 1 */ val rgba16: rgba16 with scala.Double = js.native
  /* 2 */ val rgba8: rgba8 with scala.Double = js.native
  /* 0 */ val unknown: unknown with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtLib.WindowsNs.GraphicsNs.ImagingNs.BitmapPixelFormat with scala.Double] = js.native
}

