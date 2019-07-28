package typings.vegaDashTypings.typesSpecTransformMod

import typings.vegaDashTypings.vegaDashTypingsStrings.formula
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormulaTransform extends _Transforms {
  var as: String
  var expr: String
  var initonly: js.UndefOr[Boolean] = js.undefined
  var `type`: formula
}

object FormulaTransform {
  @scala.inline
  def apply(as: String, expr: String, `type`: formula, initonly: js.UndefOr[Boolean] = js.undefined): FormulaTransform = {
    val __obj = js.Dynamic.literal(as = as, expr = expr)
    __obj.updateDynamic("type")(`type`)
    if (!js.isUndefined(initonly)) __obj.updateDynamic("initonly")(initonly)
    __obj.asInstanceOf[FormulaTransform]
  }
}

