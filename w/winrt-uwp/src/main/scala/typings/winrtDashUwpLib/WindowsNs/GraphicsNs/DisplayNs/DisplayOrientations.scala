package typings
package winrtDashUwpLib.WindowsNs.GraphicsNs.DisplayNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DisplayOrientations extends js.Object

/** Describes the orientation of a rectangular monitor. */
@JSGlobal("Windows.Graphics.Display.DisplayOrientations")
@js.native
object DisplayOrientations extends js.Object {
  /** Specifies that the monitor is oriented in landscape mode where the width of the display viewing area is greater than the height. */
  @js.native
  sealed trait landscape
    extends winrtDashUwpLib.WindowsNs.GraphicsNs.DisplayNs.DisplayOrientations
  
  /** Specifies that the monitor rotated another 90 degrees in the clockwise direction (to equal 180 degrees) to orient the display in landscape mode where the width of the display viewing area is greater than the height. This landscape mode is flipped 180 degrees from the Landscape mode. */
  @js.native
  sealed trait landscapeFlipped
    extends winrtDashUwpLib.WindowsNs.GraphicsNs.DisplayNs.DisplayOrientations
  
  /** No display orientation is specified. */
  @js.native
  sealed trait none
    extends winrtDashUwpLib.WindowsNs.GraphicsNs.DisplayNs.DisplayOrientations
  
  /** Specifies that the monitor rotated 90 degrees in the clockwise direction to orient the display in portrait mode where the height of the display viewing area is greater than the width. */
  @js.native
  sealed trait portrait
    extends winrtDashUwpLib.WindowsNs.GraphicsNs.DisplayNs.DisplayOrientations
  
  /** Specifies that the monitor rotated another 90 degrees in the clockwise direction (to equal 270 degrees) to orient the display in portrait mode where the height of the display viewing area is greater than the width. This portrait mode is flipped 180 degrees from the Portrait mode. */
  @js.native
  sealed trait portraitFlipped
    extends winrtDashUwpLib.WindowsNs.GraphicsNs.DisplayNs.DisplayOrientations
  
  /* 1 */ val landscape: landscape with scala.Double = js.native
  /* 3 */ val landscapeFlipped: landscapeFlipped with scala.Double = js.native
  /* 0 */ val none: none with scala.Double = js.native
  /* 2 */ val portrait: portrait with scala.Double = js.native
  /* 4 */ val portraitFlipped: portraitFlipped with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.GraphicsNs.DisplayNs.DisplayOrientations with scala.Double
  ] = js.native
}

