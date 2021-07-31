package typings.typedoc

import typings.typedoc.componentsMod.TypeNodeConverter
import typings.typedoc.contextMod.Context
import typings.typedoc.converterConverterMod.Converter
import typings.typescript.mod.IndexedAccessTypeNode
import typings.typescript.mod.Type
import typings.typescript.mod.TypeNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object indexedAccessMod {
  
  @JSImport("typedoc/dist/lib/converter/types/indexed-access", "IndexedAccessConverter")
  @js.native
  class IndexedAccessConverter protected () extends TypeNodeConverter[Type, IndexedAccessTypeNode] {
    def this(owner: js.Symbol) = this()
    def this(owner: Converter) = this()
    
    def supportsNode(context: Context, node: TypeNode): Boolean = js.native
  }
}
