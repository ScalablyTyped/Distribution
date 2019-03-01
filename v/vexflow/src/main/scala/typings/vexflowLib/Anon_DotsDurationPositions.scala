package typings
package vexflowLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DotsDurationPositions extends js.Object {
  var dots: js.UndefOr[scala.Double] = js.undefined
  var duration: java.lang.String
  var positions: js.Array[Anon_Fret]
  var stem_direction: js.UndefOr[scala.Double] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_DotsDurationPositions {
  @scala.inline
  def apply(
    duration: java.lang.String,
    positions: js.Array[Anon_Fret],
    dots: scala.Int | scala.Double = null,
    stem_direction: scala.Int | scala.Double = null,
    `type`: java.lang.String = null
  ): Anon_DotsDurationPositions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("duration")(duration)
    __obj.updateDynamic("positions")(positions)
    if (dots != null) __obj.updateDynamic("dots")(dots.asInstanceOf[js.Any])
    if (stem_direction != null) __obj.updateDynamic("stem_direction")(stem_direction.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_DotsDurationPositions]
  }
}

