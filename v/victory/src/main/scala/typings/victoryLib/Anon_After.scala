package typings
package victoryLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_After extends js.Object {
  var after: js.UndefOr[js.Function1[/* datum */ js.Any, victoryLib.victoryMod.AnimationStyle]] = js.undefined
  var before: js.UndefOr[js.Function1[/* datum */ js.Any, victoryLib.victoryMod.AnimationStyle]] = js.undefined
  var duration: js.UndefOr[scala.Double] = js.undefined
}

object Anon_After {
  @scala.inline
  def apply(
    after: /* datum */ js.Any => victoryLib.victoryMod.AnimationStyle = null,
    before: /* datum */ js.Any => victoryLib.victoryMod.AnimationStyle = null,
    duration: scala.Int | scala.Double = null
  ): Anon_After = {
    val __obj = js.Dynamic.literal()
    if (after != null) __obj.updateDynamic("after")(js.Any.fromFunction1(after))
    if (before != null) __obj.updateDynamic("before")(js.Any.fromFunction1(before))
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_After]
  }
}

