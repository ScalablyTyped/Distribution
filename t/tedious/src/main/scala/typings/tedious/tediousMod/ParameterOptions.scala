package typings.tedious.tediousMod

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
  def apply(length: Double | max = null, precision: Int | Double = null, scale: Int | Double = null): ParameterOptions = {
    val __obj = js.Dynamic.literal()
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (precision != null) __obj.updateDynamic("precision")(precision.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParameterOptions]
  }
}

