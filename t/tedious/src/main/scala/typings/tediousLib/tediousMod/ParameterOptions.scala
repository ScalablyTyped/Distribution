package typings
package tediousLib.tediousMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParameterOptions extends js.Object {
  //  for VarChar, NVarChar, VarBinary
  var length: js.UndefOr[scala.Double | tediousLib.tediousLibStrings.max] = js.undefined
  // precision for Numeric, Decimal
  var precision: js.UndefOr[scala.Double] = js.undefined
  // scale for Numeric, Decimal, Time, DateTime2, DateTimeOffset
  var scale: js.UndefOr[scala.Double] = js.undefined
}

object ParameterOptions {
  @scala.inline
  def apply(
    length: scala.Double | tediousLib.tediousLibStrings.max = null,
    precision: scala.Int | scala.Double = null,
    scale: scala.Int | scala.Double = null
  ): ParameterOptions = {
    val __obj = js.Dynamic.literal()
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (precision != null) __obj.updateDynamic("precision")(precision.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParameterOptions]
  }
}

