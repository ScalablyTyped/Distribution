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
  def apply(max: js.UndefOr[Double] = js.undefined, min: js.UndefOr[Double] = js.undefined): MinMaxOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(max)) __obj.updateDynamic("max")(max.get.asInstanceOf[js.Any])
    if (!js.isUndefined(min)) __obj.updateDynamic("min")(min.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[MinMaxOptions]
  }
}

