package typings
package victoryLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Before extends js.Object {
  var before: js.UndefOr[js.Function1[/* datum */ js.Any, victoryLib.victoryMod.AnimationStyle]] = js.undefined
  var duration: js.UndefOr[scala.Double] = js.undefined
}

object Anon_Before {
  @scala.inline
  def apply(
    before: js.Function1[/* datum */ js.Any, victoryLib.victoryMod.AnimationStyle] = null,
    duration: scala.Int | scala.Double = null
  ): Anon_Before = {
    val __obj = js.Dynamic.literal()
    if (before != null) __obj.updateDynamic("before")(before)
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Before]
  }
}

