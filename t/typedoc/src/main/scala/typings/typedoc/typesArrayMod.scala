package typings.typedoc

import typings.typedoc.modelsTypesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc/dist/lib/models/types/array", JSImport.Namespace)
@js.native
object typesArrayMod extends js.Object {
  
  @js.native
  class ArrayType protected () extends Type {
    def this(elementType: Type) = this()
    
    var elementType: Type = js.native
    
    def equals(`type`: Type): Boolean = js.native
  }
}
