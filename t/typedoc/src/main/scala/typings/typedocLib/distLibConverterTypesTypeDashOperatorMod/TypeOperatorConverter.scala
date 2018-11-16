package typings
package typedocLib.distLibConverterTypesTypeDashOperatorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/converter/types/type-operator", "TypeOperatorConverter")
@js.native
class TypeOperatorConverter ()
  extends typedocLib.distLibConverterComponentsMod.TypeNodeConverter[
      typescriptLib.typescriptMod.tsNs.Type, 
      typescriptLib.typescriptMod.tsNs.TypeOperatorNode
    ] {
  def convertNode(
    context: typedocLib.distLibConverterContextMod.Context,
    node: typescriptLib.typescriptMod.tsNs.TypeOperatorNode
  ): typedocLib.distLibModelsTypesMod.TypeOperatorType = js.native
}

