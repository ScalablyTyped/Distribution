package typings
package winrtDashUwpLib.WindowsNs.GraphicsNs.ImagingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BitmapPixelFormat extends js.Object

/** Specifies the pixel format of pixel data. Each enumeration value defines a channel ordering, bit depth, and data type. */
@JSGlobal("Windows.Graphics.Imaging.BitmapPixelFormat")
@js.native
object BitmapPixelFormat extends js.Object {
  /** The pixel format is B8G8R8A8 unsigned integer. */
  @js.native
  sealed trait bgra8
    extends winrtDashUwpLib.WindowsNs.GraphicsNs.ImagingNs.BitmapPixelFormat
  
  /** The pixel format is 16 bpp grayscale. */
  @js.native
  sealed trait gray16
    extends winrtDashUwpLib.WindowsNs.GraphicsNs.ImagingNs.BitmapPixelFormat
  
  /** The pixel format is 8 bpp grayscale. */
  @js.native
  sealed trait gray8
    extends winrtDashUwpLib.WindowsNs.GraphicsNs.ImagingNs.BitmapPixelFormat
  
  /** The pixel format is NV12. */
  @js.native
  sealed trait nv12
    extends winrtDashUwpLib.WindowsNs.GraphicsNs.ImagingNs.BitmapPixelFormat
  
  /** The pixel format is R16B16G16A16 unsigned integer. */
  @js.native
  sealed trait rgba16
    extends winrtDashUwpLib.WindowsNs.GraphicsNs.ImagingNs.BitmapPixelFormat
  
  /** The pixel format is R8G8B8A8 unsigned integer. */
  @js.native
  sealed trait rgba8
    extends winrtDashUwpLib.WindowsNs.GraphicsNs.ImagingNs.BitmapPixelFormat
  
  /** The pixel format is unknown. */
  @js.native
  sealed trait unknown
    extends winrtDashUwpLib.WindowsNs.GraphicsNs.ImagingNs.BitmapPixelFormat
  
  /** The pixel format is YUY2. */
  @js.native
  sealed trait yuy2
    extends winrtDashUwpLib.WindowsNs.GraphicsNs.ImagingNs.BitmapPixelFormat
  
  /* 5 */ val bgra8: bgra8 with scala.Double = js.native
  /* 3 */ val gray16: gray16 with scala.Double = js.native
  /* 4 */ val gray8: gray8 with scala.Double = js.native
  /* 6 */ val nv12: nv12 with scala.Double = js.native
  /* 1 */ val rgba16: rgba16 with scala.Double = js.native
  /* 2 */ val rgba8: rgba8 with scala.Double = js.native
  /* 0 */ val unknown: unknown with scala.Double = js.native
  /* 7 */ val yuy2: yuy2 with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.GraphicsNs.ImagingNs.BitmapPixelFormat with scala.Double
  ] = js.native
}

