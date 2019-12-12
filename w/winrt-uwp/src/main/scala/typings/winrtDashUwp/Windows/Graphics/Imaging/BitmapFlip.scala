package typings.winrtDashUwp.Windows.Graphics.Imaging

import org.scalablytyped.runtime.TopLevel
import typings.winrtDashUwp.Windows.Graphics.Imaging.BitmapFlip.horizontal
import typings.winrtDashUwp.Windows.Graphics.Imaging.BitmapFlip.none
import typings.winrtDashUwp.Windows.Graphics.Imaging.BitmapFlip.vertical
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
  sealed trait horizontal extends BitmapFlip
  
  /** No flip operation will be performed. */
  @js.native
  sealed trait none extends BitmapFlip
  
  /** Flip the bitmap around the x axis. */
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

