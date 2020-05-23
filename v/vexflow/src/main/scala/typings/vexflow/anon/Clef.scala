package typings.vexflow.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Clef extends js.Object {
  var auto_stem: js.UndefOr[Boolean] = js.undefined
  var clef: js.UndefOr[String] = js.undefined
  var dots: js.UndefOr[Double] = js.undefined
  var duration: String
  var keys: js.Array[String]
  var octave_shift: js.UndefOr[Double] = js.undefined
  var stem_direction: js.UndefOr[Double] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object Clef {
  @scala.inline
  def apply(
    duration: String,
    keys: js.Array[String],
    auto_stem: js.UndefOr[Boolean] = js.undefined,
    clef: String = null,
    dots: js.UndefOr[Double] = js.undefined,
    octave_shift: js.UndefOr[Double] = js.undefined,
    stem_direction: js.UndefOr[Double] = js.undefined,
    `type`: String = null
  ): Clef = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], keys = keys.asInstanceOf[js.Any])
    if (!js.isUndefined(auto_stem)) __obj.updateDynamic("auto_stem")(auto_stem.get.asInstanceOf[js.Any])
    if (clef != null) __obj.updateDynamic("clef")(clef.asInstanceOf[js.Any])
    if (!js.isUndefined(dots)) __obj.updateDynamic("dots")(dots.get.asInstanceOf[js.Any])
    if (!js.isUndefined(octave_shift)) __obj.updateDynamic("octave_shift")(octave_shift.get.asInstanceOf[js.Any])
    if (!js.isUndefined(stem_direction)) __obj.updateDynamic("stem_direction")(stem_direction.get.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Clef]
  }
}

