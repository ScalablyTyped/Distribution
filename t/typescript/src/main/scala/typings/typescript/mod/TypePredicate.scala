package typings.typescript.mod

import typings.typescript.mod.TypePredicateKind.AssertsIdentifier
import typings.typescript.mod.TypePredicateKind.AssertsThis
import typings.typescript.mod.TypePredicateKind.This
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.typescript.mod.ThisTypePredicate
  - typings.typescript.mod.IdentifierTypePredicate
  - typings.typescript.mod.AssertsThisTypePredicate
  - typings.typescript.mod.AssertsIdentifierTypePredicate
*/
trait TypePredicate extends js.Object

object TypePredicate {
  @scala.inline
  def ThisTypePredicate(
    kind: This,
    `type`: Type,
    parameterIndex: js.UndefOr[scala.Nothing] = js.undefined,
    parameterName: js.UndefOr[scala.Nothing] = js.undefined
  ): TypePredicate = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(parameterIndex)) __obj.updateDynamic("parameterIndex")(parameterIndex.asInstanceOf[js.Any])
    if (!js.isUndefined(parameterName)) __obj.updateDynamic("parameterName")(parameterName.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypePredicate]
  }
  @scala.inline
  def IdentifierTypePredicate(
    kind: typings.typescript.mod.TypePredicateKind.Identifier,
    parameterIndex: Double,
    parameterName: java.lang.String,
    `type`: Type
  ): TypePredicate = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], parameterIndex = parameterIndex.asInstanceOf[js.Any], parameterName = parameterName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypePredicate]
  }
  @scala.inline
  def AssertsThisTypePredicate(
    kind: AssertsThis,
    parameterIndex: js.UndefOr[scala.Nothing] = js.undefined,
    parameterName: js.UndefOr[scala.Nothing] = js.undefined,
    `type`: Type = null
  ): TypePredicate = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
    if (!js.isUndefined(parameterIndex)) __obj.updateDynamic("parameterIndex")(parameterIndex.asInstanceOf[js.Any])
    if (!js.isUndefined(parameterName)) __obj.updateDynamic("parameterName")(parameterName.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypePredicate]
  }
  @scala.inline
  def AssertsIdentifierTypePredicate(
    kind: AssertsIdentifier,
    parameterIndex: Double,
    parameterName: java.lang.String,
    `type`: Type = null
  ): TypePredicate = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], parameterIndex = parameterIndex.asInstanceOf[js.Any], parameterName = parameterName.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypePredicate]
  }
}

