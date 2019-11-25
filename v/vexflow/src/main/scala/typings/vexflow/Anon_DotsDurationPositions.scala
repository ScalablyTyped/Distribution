package typings.vexflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DotsDurationPositions extends js.Object {
  var dots: js.UndefOr[Double] = js.undefined
  var duration: String
  var positions: js.Array[Anon_Fret]
  var stem_direction: js.UndefOr[Double] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object Anon_DotsDurationPositions {
  @scala.inline
  def apply(
    duration: String,
    positions: js.Array[Anon_Fret],
    dots: Int | Double = null,
    stem_direction: Int | Double = null,
    `type`: String = null
  ): Anon_DotsDurationPositions = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], positions = positions.asInstanceOf[js.Any])
    if (dots != null) __obj.updateDynamic("dots")(dots.asInstanceOf[js.Any])
    if (stem_direction != null) __obj.updateDynamic("stem_direction")(stem_direction.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DotsDurationPositions]
  }
}

