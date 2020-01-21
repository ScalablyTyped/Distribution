package typings.typedoc

import typings.typedoc.componentsMod.TypeNodeConverter
import typings.typedoc.contextMod.Context
import typings.typescript.mod.InferTypeNode
import typings.typescript.mod.Type
import typings.typescript.mod.TypeNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/converter/types/inferred", JSImport.Namespace)
@js.native
object inferredMod extends js.Object {
  @js.native
  class InferredConverter () extends TypeNodeConverter[Type, InferTypeNode] {
    def supportsNode(_context: Context, node: TypeNode): Boolean = js.native
  }
  
}

