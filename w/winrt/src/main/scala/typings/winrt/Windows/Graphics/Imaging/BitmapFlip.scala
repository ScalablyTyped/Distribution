package typings.winrt.Windows.Graphics.Imaging

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BitmapFlip with Double] = js.native
  /* 1 */ @js.native
  object horizontal extends TopLevel[horizontal with Double]
  
  /* 0 */ @js.native
  object none extends TopLevel[none with Double]
  
  /* 2 */ @js.native
  object vertical extends TopLevel[vertical with Double]
  
}

