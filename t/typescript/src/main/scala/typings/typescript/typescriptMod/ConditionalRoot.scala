package typings.typescript.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConditionalRoot extends js.Object {
  var aliasSymbol: js.UndefOr[Symbol] = js.undefined
  var aliasTypeArguments: js.UndefOr[js.Array[Type]] = js.undefined
  var checkType: Type
  var extendsType: Type
  var falseType: Type
  var inferTypeParameters: js.UndefOr[js.Array[TypeParameter]] = js.undefined
  var instantiations: js.UndefOr[Map[Type]] = js.undefined
  var isDistributive: Boolean
  var node: ConditionalTypeNode
  var outerTypeParameters: js.UndefOr[js.Array[TypeParameter]] = js.undefined
  var trueType: Type
}

object ConditionalRoot {
  @scala.inline
  def apply(
    checkType: Type,
    extendsType: Type,
    falseType: Type,
    isDistributive: Boolean,
    node: ConditionalTypeNode,
    trueType: Type,
    aliasSymbol: Symbol = null,
    aliasTypeArguments: js.Array[Type] = null,
    inferTypeParameters: js.Array[TypeParameter] = null,
    instantiations: Map[Type] = null,
    outerTypeParameters: js.Array[TypeParameter] = null
  ): ConditionalRoot = {
    val __obj = js.Dynamic.literal(checkType = checkType.asInstanceOf[js.Any], extendsType = extendsType.asInstanceOf[js.Any], falseType = falseType.asInstanceOf[js.Any], isDistributive = isDistributive.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], trueType = trueType.asInstanceOf[js.Any])
    if (aliasSymbol != null) __obj.updateDynamic("aliasSymbol")(aliasSymbol.asInstanceOf[js.Any])
    if (aliasTypeArguments != null) __obj.updateDynamic("aliasTypeArguments")(aliasTypeArguments.asInstanceOf[js.Any])
    if (inferTypeParameters != null) __obj.updateDynamic("inferTypeParameters")(inferTypeParameters.asInstanceOf[js.Any])
    if (instantiations != null) __obj.updateDynamic("instantiations")(instantiations.asInstanceOf[js.Any])
    if (outerTypeParameters != null) __obj.updateDynamic("outerTypeParameters")(outerTypeParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConditionalRoot]
  }
}

