package typings.vexflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAutostemClef extends js.Object {
  var auto_stem: js.UndefOr[Boolean] = js.undefined
  var clef: js.UndefOr[String] = js.undefined
  var dots: js.UndefOr[Double] = js.undefined
  var duration: String
  var keys: js.Array[String]
  var octave_shift: js.UndefOr[Double] = js.undefined
  var stem_direction: js.UndefOr[Double] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object AnonAutostemClef {
  @scala.inline
  def apply(
    duration: String,
    keys: js.Array[String],
    auto_stem: js.UndefOr[Boolean] = js.undefined,
    clef: String = null,
    dots: Int | Double = null,
    octave_shift: Int | Double = null,
    stem_direction: Int | Double = null,
    `type`: String = null
  ): AnonAutostemClef = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], keys = keys.asInstanceOf[js.Any])
    if (!js.isUndefined(auto_stem)) __obj.updateDynamic("auto_stem")(auto_stem.asInstanceOf[js.Any])
    if (clef != null) __obj.updateDynamic("clef")(clef.asInstanceOf[js.Any])
    if (dots != null) __obj.updateDynamic("dots")(dots.asInstanceOf[js.Any])
    if (octave_shift != null) __obj.updateDynamic("octave_shift")(octave_shift.asInstanceOf[js.Any])
    if (stem_direction != null) __obj.updateDynamic("stem_direction")(stem_direction.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAutostemClef]
  }
}

