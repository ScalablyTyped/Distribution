package typings.w3cCssTypedObjectModelLevel1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CSSVariableReferenceValue extends js.Object {
  val fallback: js.UndefOr[CSSUnparsedValue] = js.undefined
  var variable: String
}

object CSSVariableReferenceValue {
  @scala.inline
  def apply(variable: String, fallback: CSSUnparsedValue = null): CSSVariableReferenceValue = {
    val __obj = js.Dynamic.literal(variable = variable.asInstanceOf[js.Any])
    if (fallback != null) __obj.updateDynamic("fallback")(fallback.asInstanceOf[js.Any])
    __obj.asInstanceOf[CSSVariableReferenceValue]
  }
}

