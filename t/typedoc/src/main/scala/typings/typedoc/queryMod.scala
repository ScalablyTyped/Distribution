package typings.typedoc

import typings.typedoc.componentsMod.TypeNodeConverter
import typings.typedoc.contextMod.Context
import typings.typedoc.converterConverterMod.Converter
import typings.typescript.mod.Node
import typings.typescript.mod.Type
import typings.typescript.mod.TypeQueryNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object queryMod {
  
  @JSImport("typedoc/dist/lib/converter/types/query", "QueryConverter")
  @js.native
  class QueryConverter protected () extends TypeNodeConverter[Type, TypeQueryNode] {
    def this(owner: js.Symbol) = this()
    def this(owner: Converter) = this()
    
    def supportsNode(_context: Context, node: Node): Boolean = js.native
  }
}
