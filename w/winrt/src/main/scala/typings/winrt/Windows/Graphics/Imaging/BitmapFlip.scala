package typings.winrt.Windows.Graphics.Imaging

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BitmapFlip extends js.Object

@JSGlobal("Windows.Graphics.Imaging.BitmapFlip")
@js.native
object BitmapFlip extends js.Object {
  @js.native
  sealed trait horizontal extends BitmapFlip
  
  @js.native
  sealed trait none extends BitmapFlip
  
  @js.native
  sealed trait vertical extends BitmapFlip
  
  /* 1 */ val horizontal: typings.winrt.Windows.Graphics.Imaging.BitmapFlip.horizontal with Double = js.native
  /* 0 */ val none: typings.winrt.Windows.Graphics.Imaging.BitmapFlip.none with Double = js.native
  /* 2 */ val vertical: typings.winrt.Windows.Graphics.Imaging.BitmapFlip.vertical with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BitmapFlip with Double] = js.native
}

