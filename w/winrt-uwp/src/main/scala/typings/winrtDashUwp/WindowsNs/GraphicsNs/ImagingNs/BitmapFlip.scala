package typings.winrtDashUwp.WindowsNs.GraphicsNs.ImagingNs

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
  
  /* 1 */ val horizontal: typings.winrtDashUwp.WindowsNs.GraphicsNs.ImagingNs.BitmapFlip.horizontal with Double = js.native
  /* 0 */ val none: typings.winrtDashUwp.WindowsNs.GraphicsNs.ImagingNs.BitmapFlip.none with Double = js.native
  /* 2 */ val vertical: typings.winrtDashUwp.WindowsNs.GraphicsNs.ImagingNs.BitmapFlip.vertical with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BitmapFlip with Double] = js.native
}

