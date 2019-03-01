package typings
package tooltipsterLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Click extends js.Object {
  /**
  			 * When a mouse click happens anywhere in the page. However, if the interactive option is set to true, 
  			 * a click happening inside the tooltip will not close it.
  			 */
  var click: js.UndefOr[scala.Boolean] = js.undefined
  /**
  			 * When the mouse goes away from the origin. The delay option is taken into account as the delay before 
  			 * closing.
  			 */
  var mouseleave: js.UndefOr[scala.Boolean] = js.undefined
  /**
  			 * When the origin is clicked by a mouse. This mimics a behavior that browsers usually have and is meant 
  			 * to be used with the mouseenter open trigger.
  			 */
  var originClick: js.UndefOr[scala.Boolean] = js.undefined
  /**
  			 * When scrolling happens in the window or in a scrollable area which is a parent of the origin.
  			 */
  var scroll: js.UndefOr[scala.Boolean] = js.undefined
  /**
  			 * When the finger taps (ie presses and releases) anywhere in the touch screen.
  			 */
  var tap: js.UndefOr[scala.Boolean] = js.undefined
  /**
  			 * When the finger is removed from the touch screen or if the interaction was stopped by the device. The 
  			 * delayTouch option is taken into account as the delay before closing.
  			 */
  var touchleave: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_Click {
  @scala.inline
  def apply(
    click: js.UndefOr[scala.Boolean] = js.undefined,
    mouseleave: js.UndefOr[scala.Boolean] = js.undefined,
    originClick: js.UndefOr[scala.Boolean] = js.undefined,
    scroll: js.UndefOr[scala.Boolean] = js.undefined,
    tap: js.UndefOr[scala.Boolean] = js.undefined,
    touchleave: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_Click = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(click)) __obj.updateDynamic("click")(click)
    if (!js.isUndefined(mouseleave)) __obj.updateDynamic("mouseleave")(mouseleave)
    if (!js.isUndefined(originClick)) __obj.updateDynamic("originClick")(originClick)
    if (!js.isUndefined(scroll)) __obj.updateDynamic("scroll")(scroll)
    if (!js.isUndefined(tap)) __obj.updateDynamic("tap")(tap)
    if (!js.isUndefined(touchleave)) __obj.updateDynamic("touchleave")(touchleave)
    __obj.asInstanceOf[Anon_Click]
  }
}

