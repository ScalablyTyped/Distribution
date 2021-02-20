package typings.typedoc

import typings.typedoc.componentsMod.TypeConverter
import typings.typedoc.componentsMod.TypeNodeConverter
import typings.typedoc.contextMod.Context
import typings.typedoc.converterConverterMod.Converter
import typings.typescript.mod.NamedTupleMember
import typings.typescript.mod.Node
import typings.typescript.mod.TupleTypeNode
import typings.typescript.mod.Type
import typings.typescript.mod.TypeReference
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tupleMod {
  
  @JSImport("typedoc/dist/lib/converter/types/tuple", "NamedTupleMemberConverter")
  @js.native
  class NamedTupleMemberConverter protected () extends TypeNodeConverter[Type, NamedTupleMember] {
    def this(owner: js.Symbol) = this()
    def this(owner: Converter) = this()
    
    def supportsNode(_context: Context, node: Node): Boolean = js.native
  }
  
  @JSImport("typedoc/dist/lib/converter/types/tuple", "TupleConverter")
  @js.native
  class TupleConverter protected () extends TypeConverter[TypeReference, TupleTypeNode] {
    def this(owner: js.Symbol) = this()
    def this(owner: Converter) = this()
  }
}
