package typings.vexflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Autostem extends js.Object {
  var auto_stem: js.UndefOr[Boolean] = js.undefined
  var clef: js.UndefOr[String] = js.undefined
  var dots: js.UndefOr[Double] = js.undefined
  var duration: String
  var keys: js.Array[String]
  var octave_shift: js.UndefOr[Double] = js.undefined
  var slash: js.UndefOr[Boolean] = js.undefined
  var stem_direction: js.UndefOr[Double] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object Anon_Autostem {
  @scala.inline
  def apply(
    duration: String,
    keys: js.Array[String],
    auto_stem: js.UndefOr[Boolean] = js.undefined,
    clef: String = null,
    dots: Int | Double = null,
    octave_shift: Int | Double = null,
    slash: js.UndefOr[Boolean] = js.undefined,
    stem_direction: Int | Double = null,
    `type`: String = null
  ): Anon_Autostem = {
    val __obj = js.Dynamic.literal(duration = duration, keys = keys)
    if (!js.isUndefined(auto_stem)) __obj.updateDynamic("auto_stem")(auto_stem)
    if (clef != null) __obj.updateDynamic("clef")(clef)
    if (dots != null) __obj.updateDynamic("dots")(dots.asInstanceOf[js.Any])
    if (octave_shift != null) __obj.updateDynamic("octave_shift")(octave_shift.asInstanceOf[js.Any])
    if (!js.isUndefined(slash)) __obj.updateDynamic("slash")(slash)
    if (stem_direction != null) __obj.updateDynamic("stem_direction")(stem_direction.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_Autostem]
  }
}

