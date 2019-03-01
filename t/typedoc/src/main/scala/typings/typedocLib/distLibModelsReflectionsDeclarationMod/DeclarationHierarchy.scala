package typings
package typedocLib.distLibModelsReflectionsDeclarationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeclarationHierarchy extends js.Object {
  var isTarget: js.UndefOr[scala.Boolean] = js.undefined
  var next: js.UndefOr[DeclarationHierarchy] = js.undefined
  var types: js.Array[typedocLib.distLibModelsTypesMod.Type]
}

object DeclarationHierarchy {
  @scala.inline
  def apply(
    types: js.Array[typedocLib.distLibModelsTypesMod.Type],
    isTarget: js.UndefOr[scala.Boolean] = js.undefined,
    next: DeclarationHierarchy = null
  ): DeclarationHierarchy = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("types")(types)
    if (!js.isUndefined(isTarget)) __obj.updateDynamic("isTarget")(isTarget)
    if (next != null) __obj.updateDynamic("next")(next)
    __obj.asInstanceOf[DeclarationHierarchy]
  }
}

