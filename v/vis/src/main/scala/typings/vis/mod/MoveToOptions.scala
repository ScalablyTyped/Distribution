package typings.vis.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MoveToOptions extends ViewPortOptions {
  /**
    * The position (in canvas units!) is the position of the central focus point of the camera.
    */
  var position: js.UndefOr[Position] = js.undefined
}

object MoveToOptions {
  @scala.inline
  def apply(
    animation: AnimationOptions | Boolean = null,
    offset: Position = null,
    position: Position = null,
    scale: Int | Double = null
  ): MoveToOptions = {
    val __obj = js.Dynamic.literal()
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    __obj.asInstanceOf[MoveToOptions]
  }
}

