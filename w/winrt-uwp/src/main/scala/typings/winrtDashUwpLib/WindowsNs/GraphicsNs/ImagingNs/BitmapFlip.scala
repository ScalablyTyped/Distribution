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
  
  val horizontal: horizontal with java.lang.String = js.native
  val none: none with java.lang.String = js.native
  val vertical: vertical with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[winrtDashUwpLib.WindowsNs.GraphicsNs.ImagingNs.BitmapFlip with java.lang.String] = js.native
}

