package typings
package typescriptLib.typescriptMod.tsNs

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
  var isDistributive: scala.Boolean
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
    isDistributive: scala.Boolean,
    node: ConditionalTypeNode,
    trueType: Type,
    aliasSymbol: Symbol = null,
    aliasTypeArguments: js.Array[Type] = null,
    inferTypeParameters: js.Array[TypeParameter] = null,
    instantiations: Map[Type] = null,
    outerTypeParameters: js.Array[TypeParameter] = null
  ): ConditionalRoot = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("checkType")(checkType)
    __obj.updateDynamic("extendsType")(extendsType)
    __obj.updateDynamic("falseType")(falseType)
    __obj.updateDynamic("isDistributive")(isDistributive)
    __obj.updateDynamic("node")(node)
    __obj.updateDynamic("trueType")(trueType)
    if (aliasSymbol != null) __obj.updateDynamic("aliasSymbol")(aliasSymbol)
    if (aliasTypeArguments != null) __obj.updateDynamic("aliasTypeArguments")(aliasTypeArguments)
    if (inferTypeParameters != null) __obj.updateDynamic("inferTypeParameters")(inferTypeParameters)
    if (instantiations != null) __obj.updateDynamic("instantiations")(instantiations)
    if (outerTypeParameters != null) __obj.updateDynamic("outerTypeParameters")(outerTypeParameters)
    __obj.asInstanceOf[ConditionalRoot]
  }
}

