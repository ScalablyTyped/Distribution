package typings
package webrtcLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConstrainNumberRange extends NumberRange {
  var exact: js.UndefOr[scala.Double] = js.undefined
  var ideal: js.UndefOr[scala.Double] = js.undefined
}

object ConstrainNumberRange {
  @scala.inline
  def apply(
    exact: scala.Int | scala.Double = null,
    ideal: scala.Int | scala.Double = null,
    max: scala.Int | scala.Double = null,
    min: scala.Int | scala.Double = null
  ): ConstrainNumberRange = {
    val __obj = js.Dynamic.literal()
    if (exact != null) __obj.updateDynamic("exact")(exact.asInstanceOf[js.Any])
    if (ideal != null) __obj.updateDynamic("ideal")(ideal.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConstrainNumberRange]
  }
}

