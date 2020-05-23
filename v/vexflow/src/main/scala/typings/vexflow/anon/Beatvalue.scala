package typings.vexflow.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Beatvalue extends js.Object {
  var beat_value: js.UndefOr[Double] = js.undefined
  var num_beats: js.UndefOr[Double] = js.undefined
  var resolution: js.UndefOr[Double] = js.undefined
}

object Beatvalue {
  @scala.inline
  def apply(
    beat_value: js.UndefOr[Double] = js.undefined,
    num_beats: js.UndefOr[Double] = js.undefined,
    resolution: js.UndefOr[Double] = js.undefined
  ): Beatvalue = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(beat_value)) __obj.updateDynamic("beat_value")(beat_value.get.asInstanceOf[js.Any])
    if (!js.isUndefined(num_beats)) __obj.updateDynamic("num_beats")(num_beats.get.asInstanceOf[js.Any])
    if (!js.isUndefined(resolution)) __obj.updateDynamic("resolution")(resolution.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Beatvalue]
  }
}

