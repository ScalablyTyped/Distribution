package typings.vegaDashLite.buildSrcVegaDotSchemaMod

import typings.vegaDashLite.vegaDashLiteStrings.formula
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VgFormulaTransform extends VgTransform {
  var as: String
  var expr: String
  var `type`: formula
}

object VgFormulaTransform {
  @scala.inline
  def apply(as: String, expr: String, `type`: formula): VgFormulaTransform = {
    val __obj = js.Dynamic.literal(as = as, expr = expr)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[VgFormulaTransform]
  }
}

