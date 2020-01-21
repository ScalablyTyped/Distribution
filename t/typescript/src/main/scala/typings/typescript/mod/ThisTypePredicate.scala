package typings.typescript.mod

import typings.typescript.mod.TypePredicateKind.This
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThisTypePredicate
  extends TypePredicateBase
     with TypePredicate {
  @JSName("kind")
  var kind_ThisTypePredicate: This
  var parameterIndex: js.UndefOr[scala.Nothing] = js.undefined
  var parameterName: js.UndefOr[scala.Nothing] = js.undefined
  @JSName("type")
  var type_ThisTypePredicate: Type
}

object ThisTypePredicate {
  @scala.inline
  def apply(
    kind: This,
    `type`: Type,
    parameterIndex: js.UndefOr[scala.Nothing] = js.undefined,
    parameterName: js.UndefOr[scala.Nothing] = js.undefined
  ): ThisTypePredicate = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(parameterIndex)) __obj.updateDynamic("parameterIndex")(parameterIndex.asInstanceOf[js.Any])
    if (!js.isUndefined(parameterName)) __obj.updateDynamic("parameterName")(parameterName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThisTypePredicate]
  }
}

