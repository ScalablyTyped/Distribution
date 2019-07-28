package typings.vis.visMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimelineAnimationOptions extends js.Object {
  var animation: js.UndefOr[TimelineAnimationType] = js.undefined
}

object TimelineAnimationOptions {
  @scala.inline
  def apply(animation: TimelineAnimationType = null): TimelineAnimationOptions = {
    val __obj = js.Dynamic.literal()
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimelineAnimationOptions]
  }
}

