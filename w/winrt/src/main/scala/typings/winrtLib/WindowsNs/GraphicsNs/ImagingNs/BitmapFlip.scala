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
  
  val horizontal: horizontal with java.lang.String = js.native
  val none: none with java.lang.String = js.native
  val vertical: vertical with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[winrtLib.WindowsNs.GraphicsNs.ImagingNs.BitmapFlip with java.lang.String] = js.native
}

