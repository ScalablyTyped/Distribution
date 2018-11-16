package typings
package typedocLib.distLibConverterTypesTypeDashParameterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/converter/types/type-parameter", "TypeParameterConverter")
@js.native
class TypeParameterConverter ()
  extends typedocLib.distLibConverterComponentsMod.TypeNodeConverter[
      typescriptLib.typescriptMod.tsNs.Type, 
      typescriptLib.typescriptMod.tsNs.TypeReferenceNode
    ] {
  def convertNode(
    context: typedocLib.distLibConverterContextMod.Context,
    node: typescriptLib.typescriptMod.tsNs.TypeReferenceNode
  ): typedocLib.distLibModelsTypesMod.Type = js.native
}

