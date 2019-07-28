package typings.webrtc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConstrainNumberRange extends NumberRange {
  var exact: js.UndefOr[Double] = js.undefined
  var ideal: js.UndefOr[Double] = js.undefined
}

object ConstrainNumberRange {
  @scala.inline
  def apply(
    exact: Int | Double = null,
    ideal: Int | Double = null,
    max: Int | Double = null,
    min: Int | Double = null
  ): ConstrainNumberRange = {
    val __obj = js.Dynamic.literal()
    if (exact != null) __obj.updateDynamic("exact")(exact.asInstanceOf[js.Any])
    if (ideal != null) __obj.updateDynamic("ideal")(ideal.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConstrainNumberRange]
  }
}

