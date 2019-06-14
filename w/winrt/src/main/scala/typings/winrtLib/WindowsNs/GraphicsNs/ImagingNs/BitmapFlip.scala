package typings
package winrtLib.WindowsNs.GraphicsNs.ImagingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BitmapFlip extends js.Object

@JSGlobal("Windows.Graphics.Imaging.BitmapFlip")
@js.native
object BitmapFlip extends js.Object {
  @js.native
  sealed trait horizontal
    extends winrtLib.WindowsNs.GraphicsNs.ImagingNs.BitmapFlip
  
  @js.native
  sealed trait none
    extends winrtLib.WindowsNs.GraphicsNs.ImagingNs.BitmapFlip
  
  @js.native
  sealed trait vertical
    extends winrtLib.WindowsNs.GraphicsNs.ImagingNs.BitmapFlip
  
  /* 1 */ val horizontal: horizontal with scala.Double = js.native
  /* 0 */ val none: none with scala.Double = js.native
  /* 2 */ val vertical: vertical with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtLib.WindowsNs.GraphicsNs.ImagingNs.BitmapFlip with scala.Double] = js.native
}

