package typings.victory.anon

import typings.victory.mod.AnimationStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Before extends js.Object {
  var before: js.UndefOr[js.Function1[/* datum */ js.Any, AnimationStyle]] = js.undefined
  var duration: js.UndefOr[Double] = js.undefined
}

object Before {
  @scala.inline
  def apply(before: /* datum */ js.Any => AnimationStyle = null, duration: js.UndefOr[Double] = js.undefined): Before = {
    val __obj = js.Dynamic.literal()
    if (before != null) __obj.updateDynamic("before")(js.Any.fromFunction1(before))
    if (!js.isUndefined(duration)) __obj.updateDynamic("duration")(duration.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Before]
  }
}

