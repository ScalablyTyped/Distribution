package typings
package winrtDashUwpLib.WindowsNs.GraphicsNs.ImagingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BitmapFlip extends js.Object

/** Specifies the flip operation to be performed on pixel data. */
@JSGlobal("Windows.Graphics.Imaging.BitmapFlip")
@js.native
object BitmapFlip extends js.Object {
  /** Flip the bitmap around the y axis. */
  @js.native
  sealed trait horizontal
    extends winrtDashUwpLib.WindowsNs.GraphicsNs.ImagingNs.BitmapFlip
  
  /** No flip operation will be performed. */
  @js.native
  sealed trait none
    extends winrtDashUwpLib.WindowsNs.GraphicsNs.ImagingNs.BitmapFlip
  
  /** Flip the bitmap around the x axis. */
  @js.native
  sealed trait vertical
    extends winrtDashUwpLib.WindowsNs.GraphicsNs.ImagingNs.BitmapFlip
  
  /* 1 */ val horizontal: horizontal with scala.Double = js.native
  /* 0 */ val none: none with scala.Double = js.native
  /* 2 */ val vertical: vertical with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtDashUwpLib.WindowsNs.GraphicsNs.ImagingNs.BitmapFlip with scala.Double] = js.native
}

