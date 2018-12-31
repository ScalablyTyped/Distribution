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

