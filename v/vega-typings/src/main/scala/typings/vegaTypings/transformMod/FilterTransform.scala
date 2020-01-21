package typings.vegaTypings.transformMod

import typings.vegaTypings.vegaTypingsStrings.filter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilterTransform extends _Transforms {
  var expr: ExprString
  var `type`: filter
}

object FilterTransform {
  @scala.inline
  def apply(expr: ExprString, `type`: filter): FilterTransform = {
    val __obj = js.Dynamic.literal(expr = expr.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterTransform]
  }
}

