package typings.typedoc

import typings.typedoc.componentsMod.TypeNodeConverter
import typings.typedoc.contextMod.Context
import typings.typescript.mod.Node
import typings.typescript.mod.Type
import typings.typescript.mod.TypeQueryNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc/dist/lib/converter/types/query", JSImport.Namespace)
@js.native
object queryMod extends js.Object {
  
  @js.native
  class QueryConverter () extends TypeNodeConverter[Type, TypeQueryNode] {
    
    def supportsNode(_context: Context, node: Node): Boolean = js.native
  }
}
