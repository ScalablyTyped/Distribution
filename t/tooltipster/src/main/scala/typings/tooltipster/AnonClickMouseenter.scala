package typings.tooltipster

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonClickMouseenter extends js.Object {
  /**
  			 * When the origin is clicked by a mouse.
  			 */
  var click: js.UndefOr[Boolean] = js.undefined
  /**
  			 * When a mouse comes over the origin. The delay option is taken into account as the delay before 
  			 * opening.
  			 */
  var mouseenter: js.UndefOr[Boolean] = js.undefined
  /**
  			 * When the origin is tapped (ie pressed and then released) on a touch screen.
  			 */
  var tap: js.UndefOr[Boolean] = js.undefined
  /**
  			 * When the origin is pressed on a touch screen. The delayTouch option is taken into account as the 
  			 * delay before opening.
  			 */
  var touchstart: js.UndefOr[Boolean] = js.undefined
}

object AnonClickMouseenter {
  @scala.inline
  def apply(
    click: js.UndefOr[Boolean] = js.undefined,
    mouseenter: js.UndefOr[Boolean] = js.undefined,
    tap: js.UndefOr[Boolean] = js.undefined,
    touchstart: js.UndefOr[Boolean] = js.undefined
  ): AnonClickMouseenter = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(click)) __obj.updateDynamic("click")(click.asInstanceOf[js.Any])
    if (!js.isUndefined(mouseenter)) __obj.updateDynamic("mouseenter")(mouseenter.asInstanceOf[js.Any])
    if (!js.isUndefined(tap)) __obj.updateDynamic("tap")(tap.asInstanceOf[js.Any])
    if (!js.isUndefined(touchstart)) __obj.updateDynamic("touchstart")(touchstart.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonClickMouseenter]
  }
}

