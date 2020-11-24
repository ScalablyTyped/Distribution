package typings.typedoc

import typings.typedoc.componentsMod.TypeNodeConverter
import typings.typedoc.contextMod.Context
import typings.typescript.mod.IndexedAccessTypeNode
import typings.typescript.mod.Type
import typings.typescript.mod.TypeNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc/dist/lib/converter/types/indexed-access", JSImport.Namespace)
@js.native
object indexedAccessMod extends js.Object {
  
  @js.native
  class IndexedAccessConverter () extends TypeNodeConverter[Type, IndexedAccessTypeNode] {
    
    def supportsNode(context: Context, node: TypeNode): Boolean = js.native
  }
}
