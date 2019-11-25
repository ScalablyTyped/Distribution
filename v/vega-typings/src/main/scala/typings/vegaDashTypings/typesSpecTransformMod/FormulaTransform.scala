package typings.vegaDashTypings.typesSpecTransformMod

import typings.vegaDashTypings.typesSpecSignalMod.SignalRef
import typings.vegaDashTypings.vegaDashTypingsStrings.formula
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormulaTransform extends _Transforms {
  var as: String | SignalRef
  var expr: ExprString
  var initonly: js.UndefOr[Boolean] = js.undefined
  var `type`: formula
}

object FormulaTransform {
  @scala.inline
  def apply(
    as: String | SignalRef,
    expr: ExprString,
    `type`: formula,
    initonly: js.UndefOr[Boolean] = js.undefined
  ): FormulaTransform = {
    val __obj = js.Dynamic.literal(as = as.asInstanceOf[js.Any], expr = expr.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(initonly)) __obj.updateDynamic("initonly")(initonly.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormulaTransform]
  }
}

