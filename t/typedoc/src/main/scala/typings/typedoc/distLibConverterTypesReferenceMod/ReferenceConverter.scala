package typings.typedoc.distLibConverterTypesReferenceMod

import typings.typedoc.distLibConverterComponentsMod.TypeNodeConverter
import typings.typedoc.distLibConverterContextMod.Context
import typings.typedoc.distLibModelsTypesMod.Type
import typings.typescript.typescriptMod.TypeReference
import typings.typescript.typescriptMod.TypeReferenceNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/converter/types/reference", "ReferenceConverter")
@js.native
class ReferenceConverter () extends TypeNodeConverter[TypeReference, TypeReferenceNode] {
  var convertLiteral: js.Any = js.native
  def convertType(context: Context, `type`: TypeReference): js.UndefOr[Type] = js.native
  def supportsType(context: Context, `type`: TypeReference): Boolean = js.native
}

