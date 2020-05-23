package typings.victory.anon

import typings.victory.mod.AnimationStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait After extends js.Object {
  var after: js.UndefOr[js.Function1[/* datum */ js.Any, AnimationStyle]] = js.undefined
  var before: js.UndefOr[js.Function1[/* datum */ js.Any, AnimationStyle]] = js.undefined
  var duration: js.UndefOr[Double] = js.undefined
}

object After {
  @scala.inline
  def apply(
    after: /* datum */ js.Any => AnimationStyle = null,
    before: /* datum */ js.Any => AnimationStyle = null,
    duration: js.UndefOr[Double] = js.undefined
  ): After = {
    val __obj = js.Dynamic.literal()
    if (after != null) __obj.updateDynamic("after")(js.Any.fromFunction1(after))
    if (before != null) __obj.updateDynamic("before")(js.Any.fromFunction1(before))
    if (!js.isUndefined(duration)) __obj.updateDynamic("duration")(duration.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[After]
  }
}

