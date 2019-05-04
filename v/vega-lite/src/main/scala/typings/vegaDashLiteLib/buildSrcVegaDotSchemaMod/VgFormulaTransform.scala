package typings
package vegaDashLiteLib.buildSrcVegaDotSchemaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VgFormulaTransform extends VgTransform {
  var as: java.lang.String
  var expr: java.lang.String
  var `type`: vegaDashLiteLib.vegaDashLiteLibStrings.formula
}

object VgFormulaTransform {
  @scala.inline
  def apply(
    as: java.lang.String,
    expr: java.lang.String,
    `type`: vegaDashLiteLib.vegaDashLiteLibStrings.formula
  ): VgFormulaTransform = {
    val __obj = js.Dynamic.literal(as = as, expr = expr)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[VgFormulaTransform]
  }
}

