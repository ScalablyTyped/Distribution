package typings
package vexflowLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Autostem extends js.Object {
  var auto_stem: js.UndefOr[scala.Boolean] = js.undefined
  var clef: js.UndefOr[java.lang.String] = js.undefined
  var dots: js.UndefOr[scala.Double] = js.undefined
  var duration: java.lang.String
  var keys: js.Array[java.lang.String]
  var octave_shift: js.UndefOr[scala.Double] = js.undefined
  var slash: js.UndefOr[scala.Boolean] = js.undefined
  var stem_direction: js.UndefOr[scala.Double] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Autostem {
  @scala.inline
  def apply(
    duration: java.lang.String,
    keys: js.Array[java.lang.String],
    auto_stem: js.UndefOr[scala.Boolean] = js.undefined,
    clef: java.lang.String = null,
    dots: scala.Int | scala.Double = null,
    octave_shift: scala.Int | scala.Double = null,
    slash: js.UndefOr[scala.Boolean] = js.undefined,
    stem_direction: scala.Int | scala.Double = null,
    `type`: java.lang.String = null
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

