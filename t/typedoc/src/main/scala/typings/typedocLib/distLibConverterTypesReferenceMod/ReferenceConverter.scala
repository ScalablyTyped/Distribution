package typings
package typedocLib.distLibConverterTypesReferenceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/converter/types/reference", "ReferenceConverter")
@js.native
class ReferenceConverter ()
  extends typedocLib.distLibConverterComponentsMod.TypeNodeConverter[
      typescriptLib.typescriptMod.TypeReference, 
      typescriptLib.typescriptMod.TypeReferenceNode
    ] {
  var convertLiteral: js.Any = js.native
  def convertType(
    context: typedocLib.distLibConverterContextMod.Context,
    `type`: typescriptLib.typescriptMod.TypeReference
  ): js.UndefOr[typedocLib.distLibModelsTypesMod.Type] = js.native
  def supportsType(
    context: typedocLib.distLibConverterContextMod.Context,
    `type`: typescriptLib.typescriptMod.TypeReference
  ): scala.Boolean = js.native
}

