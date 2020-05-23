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
  
}

