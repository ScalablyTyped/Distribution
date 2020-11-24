package typings.typedoc

import typings.typedoc.componentsMod.TypeNodeConverter
import typings.typedoc.contextMod.Context
import typings.typescript.mod.ParenthesizedTypeNode
import typings.typescript.mod.Type
import typings.typescript.mod.TypeNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc/dist/lib/converter/types/parens", JSImport.Namespace)
@js.native
object parensMod extends js.Object {
  
  @js.native
  class ParensConverter () extends TypeNodeConverter[Type, ParenthesizedTypeNode] {
    
    def supportsNode(_context: Context, node: TypeNode): Boolean = js.native
  }
}
