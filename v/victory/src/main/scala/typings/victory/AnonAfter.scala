package typings.victory

import typings.victory.mod.AnimationStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAfter extends js.Object {
  var after: js.UndefOr[js.Function1[/* datum */ js.Any, AnimationStyle]] = js.undefined
  var before: js.UndefOr[js.Function1[/* datum */ js.Any, AnimationStyle]] = js.undefined
  var duration: js.UndefOr[Double] = js.undefined
}

object AnonAfter {
  @scala.inline
  def apply(
    after: /* datum */ js.Any => AnimationStyle = null,
    before: /* datum */ js.Any => AnimationStyle = null,
    duration: Int | Double = null
  ): AnonAfter = {
    val __obj = js.Dynamic.literal()
    if (after != null) __obj.updateDynamic("after")(js.Any.fromFunction1(after))
    if (before != null) __obj.updateDynamic("before")(js.Any.fromFunction1(before))
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAfter]
  }
}

