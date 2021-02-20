package typings.typedoc

import typings.typedoc.componentsMod.TypeNodeConverter
import typings.typedoc.contextMod.Context
import typings.typedoc.converterConverterMod.Converter
import typings.typescript.mod.InferTypeNode
import typings.typescript.mod.Type
import typings.typescript.mod.TypeNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object inferredMod {
  
  @JSImport("typedoc/dist/lib/converter/types/inferred", "InferredConverter")
  @js.native
  class InferredConverter protected () extends TypeNodeConverter[Type, InferTypeNode] {
    def this(owner: js.Symbol) = this()
    def this(owner: Converter) = this()
    
    def supportsNode(_context: Context, node: TypeNode): Boolean = js.native
  }
}
