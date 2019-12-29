package typings.typedoc

import typings.typedoc.distLibConverterComponentsMod.TypeNodeConverter
import typings.typedoc.distLibConverterContextMod.Context
import typings.typescript.typescriptMod.InferTypeNode
import typings.typescript.typescriptMod.Type
import typings.typescript.typescriptMod.TypeNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/converter/types/inferred", JSImport.Namespace)
@js.native
object distLibConverterTypesInferredMod extends js.Object {
  @js.native
  class InferredConverter () extends TypeNodeConverter[Type, InferTypeNode] {
    def supportsNode(_context: Context, node: TypeNode): Boolean = js.native
  }
  
}

