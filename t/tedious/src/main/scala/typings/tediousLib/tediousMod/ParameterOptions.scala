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

