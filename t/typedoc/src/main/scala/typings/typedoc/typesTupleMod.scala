package typings.typedoc

import typings.typedoc.typesAbstractMod.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesTupleMod {
  
  @JSImport("typedoc/dist/lib/models/types/tuple", "NamedTupleMember")
  @js.native
  class NamedTupleMember protected () extends Type {
    def this(name: String, isOptional: Boolean, element: Type) = this()
    
    var element: Type = js.native
    
    var isOptional: Boolean = js.native
    
    var name: String = js.native
  }
  
  @JSImport("typedoc/dist/lib/models/types/tuple", "TupleType")
  @js.native
  class TupleType protected () extends Type {
    def this(elements: js.Array[Type]) = this()
    
    var elements: js.Array[Type] = js.native
    
    def equals(`type`: TupleType): Boolean = js.native
  }
}
