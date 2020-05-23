package typings.vexflow.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Positions extends js.Object {
  var dots: js.UndefOr[Double] = js.undefined
  var duration: String
  var positions: js.Array[Fret]
  var stem_direction: js.UndefOr[Double] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object Positions {
  @scala.inline
  def apply(
    duration: String,
    positions: js.Array[Fret],
    dots: js.UndefOr[Double] = js.undefined,
    stem_direction: js.UndefOr[Double] = js.undefined,
    `type`: String = null
  ): Positions = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], positions = positions.asInstanceOf[js.Any])
    if (!js.isUndefined(dots)) __obj.updateDynamic("dots")(dots.get.asInstanceOf[js.Any])
    if (!js.isUndefined(stem_direction)) __obj.updateDynamic("stem_direction")(stem_direction.get.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Positions]
  }
}

