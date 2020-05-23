package typings.tedious.mod

import typings.tedious.tediousStrings.max
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParameterOptions extends js.Object {
  //  for VarChar, NVarChar, VarBinary
  var length: js.UndefOr[Double | max] = js.undefined
  // precision for Numeric, Decimal
  var precision: js.UndefOr[Double] = js.undefined
  // scale for Numeric, Decimal, Time, DateTime2, DateTimeOffset
  var scale: js.UndefOr[Double] = js.undefined
}

object ParameterOptions {
  @scala.inline
  def apply(
    length: Double | max = null,
    precision: js.UndefOr[Double] = js.undefined,
    scale: js.UndefOr[Double] = js.undefined
  ): ParameterOptions = {
    val __obj = js.Dynamic.literal()
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (!js.isUndefined(precision)) __obj.updateDynamic("precision")(precision.get.asInstanceOf[js.Any])
    if (!js.isUndefined(scale)) __obj.updateDynamic("scale")(scale.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParameterOptions]
  }
}

