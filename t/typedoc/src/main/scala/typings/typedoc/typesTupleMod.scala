package typings.typedoc

import typings.typedoc.typesAbstractMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc/dist/lib/models/types/tuple", JSImport.Namespace)
@js.native
object typesTupleMod extends js.Object {
  
  @js.native
  class NamedTupleMember protected () extends Type {
    def this(name: String, isOptional: Boolean, element: Type) = this()
    
    var element: Type = js.native
    
    var isOptional: Boolean = js.native
    
    var name: String = js.native
  }
  
  @js.native
  class TupleType protected () extends Type {
    def this(elements: js.Array[Type]) = this()
    
    var elements: js.Array[Type] = js.native
    
    def equals(`type`: TupleType): Boolean = js.native
  }
}
