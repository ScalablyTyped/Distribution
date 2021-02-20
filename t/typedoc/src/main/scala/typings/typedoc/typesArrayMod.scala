package typings.typedoc

import typings.typedoc.modelsTypesMod.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesArrayMod {
  
  @JSImport("typedoc/dist/lib/models/types/array", "ArrayType")
  @js.native
  class ArrayType protected () extends Type {
    def this(elementType: Type) = this()
    
    var elementType: Type = js.native
    
    def equals(`type`: Type): Boolean = js.native
  }
}
