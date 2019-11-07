package typings.typescript.typescriptMod

import typings.typescript.typescriptMod.TypePredicateKind.AssertsThis
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssertsThisTypePredicate
  extends TypePredicateBase
     with TypePredicate {
  @JSName("kind")
  var kind_AssertsThisTypePredicate: AssertsThis
  var parameterIndex: js.UndefOr[scala.Nothing] = js.undefined
  var parameterName: js.UndefOr[scala.Nothing] = js.undefined
}

object AssertsThisTypePredicate {
  @scala.inline
  def apply(
    kind: AssertsThis,
    parameterIndex: js.UndefOr[scala.Nothing] = js.undefined,
    parameterName: js.UndefOr[scala.Nothing] = js.undefined,
    `type`: Type = null
  ): AssertsThisTypePredicate = {
    val __obj = js.Dynamic.literal(kind = kind)
    if (!js.isUndefined(parameterIndex)) __obj.updateDynamic("parameterIndex")(parameterIndex)
    if (!js.isUndefined(parameterName)) __obj.updateDynamic("parameterName")(parameterName)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[AssertsThisTypePredicate]
  }
}

