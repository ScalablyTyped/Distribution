package typings.vis.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FocusOptions extends ViewPortOptions {
  /**
    * Locked denotes whether or not the view remains locked to
    * the node once the zoom-in animation is finished.
    * Default value is true.
    */
  var locked: js.UndefOr[Boolean] = js.undefined
}

object FocusOptions {
  @scala.inline
  def apply(
    animation: AnimationOptions | Boolean = null,
    locked: js.UndefOr[Boolean] = js.undefined,
    offset: Position = null,
    scale: js.UndefOr[Double] = js.undefined
  ): FocusOptions = {
    val __obj = js.Dynamic.literal()
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (!js.isUndefined(locked)) __obj.updateDynamic("locked")(locked.get.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (!js.isUndefined(scale)) __obj.updateDynamic("scale")(scale.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[FocusOptions]
  }
}

