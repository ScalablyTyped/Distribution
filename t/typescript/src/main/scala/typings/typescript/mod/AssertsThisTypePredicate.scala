package typings.typescript.mod

import typings.typescript.mod.TypePredicateKind.AssertsThis
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
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
    if (!js.isUndefined(parameterIndex)) __obj.updateDynamic("parameterIndex")(parameterIndex.asInstanceOf[js.Any])
    if (!js.isUndefined(parameterName)) __obj.updateDynamic("parameterName")(parameterName.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssertsThisTypePredicate]
  }
}

