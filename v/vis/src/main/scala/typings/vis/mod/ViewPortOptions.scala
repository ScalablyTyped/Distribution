package typings.vis.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ViewPortOptions extends js.Object {
  /**
    * For animation you can either use a Boolean to use it with the default options or
    * disable it or you can define the duration (in milliseconds) and easing function manually.
    */
  var animation: js.UndefOr[AnimationOptions | Boolean] = js.undefined
  /**
    * The offset (in DOM units) is how many pixels from the center the view is focussed.
    * Default value is {x:0,y:0}
    */
  var offset: js.UndefOr[Position] = js.undefined
  /**
    * The scale is the target zoomlevel.
    * Default value is 1.0.
    */
  var scale: js.UndefOr[Double] = js.undefined
}

object ViewPortOptions {
  @scala.inline
  def apply(
    animation: AnimationOptions | Boolean = null,
    offset: Position = null,
    scale: js.UndefOr[Double] = js.undefined
  ): ViewPortOptions = {
    val __obj = js.Dynamic.literal()
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (!js.isUndefined(scale)) __obj.updateDynamic("scale")(scale.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewPortOptions]
  }
}

