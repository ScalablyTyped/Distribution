package typings.winrtDashUwp.WindowsNs.GraphicsNs.ImagingNs

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
  sealed trait bgra8 extends BitmapPixelFormat
  
  /** The pixel format is 16 bpp grayscale. */
  @js.native
  sealed trait gray16 extends BitmapPixelFormat
  
  /** The pixel format is 8 bpp grayscale. */
  @js.native
  sealed trait gray8 extends BitmapPixelFormat
  
  /** The pixel format is NV12. */
  @js.native
  sealed trait nv12 extends BitmapPixelFormat
  
  /** The pixel format is R16B16G16A16 unsigned integer. */
  @js.native
  sealed trait rgba16 extends BitmapPixelFormat
  
  /** The pixel format is R8G8B8A8 unsigned integer. */
  @js.native
  sealed trait rgba8 extends BitmapPixelFormat
  
  /** The pixel format is unknown. */
  @js.native
  sealed trait unknown extends BitmapPixelFormat
  
  /** The pixel format is YUY2. */
  @js.native
  sealed trait yuy2 extends BitmapPixelFormat
  
  /* 5 */ val bgra8: typings.winrtDashUwp.WindowsNs.GraphicsNs.ImagingNs.BitmapPixelFormat.bgra8 with Double = js.native
  /* 3 */ val gray16: typings.winrtDashUwp.WindowsNs.GraphicsNs.ImagingNs.BitmapPixelFormat.gray16 with Double = js.native
  /* 4 */ val gray8: typings.winrtDashUwp.WindowsNs.GraphicsNs.ImagingNs.BitmapPixelFormat.gray8 with Double = js.native
  /* 6 */ val nv12: typings.winrtDashUwp.WindowsNs.GraphicsNs.ImagingNs.BitmapPixelFormat.nv12 with Double = js.native
  /* 1 */ val rgba16: typings.winrtDashUwp.WindowsNs.GraphicsNs.ImagingNs.BitmapPixelFormat.rgba16 with Double = js.native
  /* 2 */ val rgba8: typings.winrtDashUwp.WindowsNs.GraphicsNs.ImagingNs.BitmapPixelFormat.rgba8 with Double = js.native
  /* 0 */ val unknown: typings.winrtDashUwp.WindowsNs.GraphicsNs.ImagingNs.BitmapPixelFormat.unknown with Double = js.native
  /* 7 */ val yuy2: typings.winrtDashUwp.WindowsNs.GraphicsNs.ImagingNs.BitmapPixelFormat.yuy2 with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BitmapPixelFormat with Double] = js.native
}

