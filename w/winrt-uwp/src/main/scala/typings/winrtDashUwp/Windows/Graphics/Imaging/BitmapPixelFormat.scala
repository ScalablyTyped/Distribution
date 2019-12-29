package typings.winrtDashUwp.Windows.Graphics.Imaging

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BitmapPixelFormat with Double] = js.native
  /* 5 */ @js.native
  object bgra8 extends TopLevel[bgra8 with Double]
  
  /* 3 */ @js.native
  object gray16 extends TopLevel[gray16 with Double]
  
  /* 4 */ @js.native
  object gray8 extends TopLevel[gray8 with Double]
  
  /* 6 */ @js.native
  object nv12 extends TopLevel[nv12 with Double]
  
  /* 1 */ @js.native
  object rgba16 extends TopLevel[rgba16 with Double]
  
  /* 2 */ @js.native
  object rgba8 extends TopLevel[rgba8 with Double]
  
  /* 0 */ @js.native
  object unknown extends TopLevel[unknown with Double]
  
  /* 7 */ @js.native
  object yuy2 extends TopLevel[yuy2 with Double]
  
}

