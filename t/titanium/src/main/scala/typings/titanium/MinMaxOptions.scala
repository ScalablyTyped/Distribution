package typings.titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An object for setting `min`/`max` value pairs.
  */
trait MinMaxOptions extends js.Object {
  /**
  	 * Maximum value
  	 */
  var max: js.UndefOr[Double] = js.undefined
  /**
  	 * Minimum value
  	 */
  var min: js.UndefOr[Double] = js.undefined
}

object MinMaxOptions {
  @scala.inline
  def apply(max: Int | Double = null, min: Int | Double = null): MinMaxOptions = {
    val __obj = js.Dynamic.literal()
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    __obj.asInstanceOf[MinMaxOptions]
  }
}

