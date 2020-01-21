package typings.vexflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBeatvalue extends js.Object {
  var beat_value: js.UndefOr[Double] = js.undefined
  var num_beats: js.UndefOr[Double] = js.undefined
  var resolution: js.UndefOr[Double] = js.undefined
}

object AnonBeatvalue {
  @scala.inline
  def apply(beat_value: Int | Double = null, num_beats: Int | Double = null, resolution: Int | Double = null): AnonBeatvalue = {
    val __obj = js.Dynamic.literal()
    if (beat_value != null) __obj.updateDynamic("beat_value")(beat_value.asInstanceOf[js.Any])
    if (num_beats != null) __obj.updateDynamic("num_beats")(num_beats.asInstanceOf[js.Any])
    if (resolution != null) __obj.updateDynamic("resolution")(resolution.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBeatvalue]
  }
}

