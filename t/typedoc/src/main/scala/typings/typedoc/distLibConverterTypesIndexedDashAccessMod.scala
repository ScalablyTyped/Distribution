package typings.typedoc

import typings.typedoc.distLibConverterComponentsMod.TypeNodeConverter
import typings.typedoc.distLibConverterContextMod.Context
import typings.typescript.typescriptMod.IndexedAccessTypeNode
import typings.typescript.typescriptMod.Type
import typings.typescript.typescriptMod.TypeNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/converter/types/indexed-access", JSImport.Namespace)
@js.native
object distLibConverterTypesIndexedDashAccessMod extends js.Object {
  @js.native
  class IndexedAccessConverter () extends TypeNodeConverter[Type, IndexedAccessTypeNode] {
    def supportsNode(context: Context, node: TypeNode): Boolean = js.native
  }
  
}

