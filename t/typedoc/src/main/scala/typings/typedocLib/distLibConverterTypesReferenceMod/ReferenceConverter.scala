package typings
package typedocLib.distLibConverterTypesReferenceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/converter/types/reference", "ReferenceConverter")
@js.native
class ReferenceConverter ()
  extends typedocLib.distLibConverterComponentsMod.TypeNodeConverter[
      typescriptLib.typescriptMod.tsNs.TypeReference, 
      typescriptLib.typescriptMod.tsNs.TypeReferenceNode
    ] {
  var convertLiteral: js.Any = js.native
  def convertType(
    context: typedocLib.distLibConverterContextMod.Context,
    `type`: typescriptLib.typescriptMod.tsNs.TypeReference
  ): js.UndefOr[typedocLib.distLibModelsTypesMod.Type] = js.native
  def supportsType(
    context: typedocLib.distLibConverterContextMod.Context,
    `type`: typescriptLib.typescriptMod.tsNs.TypeReference
  ): scala.Boolean = js.native
}

