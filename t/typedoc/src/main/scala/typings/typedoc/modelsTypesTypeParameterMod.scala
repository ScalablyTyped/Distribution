package typings.typedoc

import typings.typedoc.typesAbstractMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc/dist/lib/models/types/type-parameter", JSImport.Namespace)
@js.native
object modelsTypesTypeParameterMod extends js.Object {
  
  @js.native
  class TypeParameterType protected () extends Type {
    def this(name: String) = this()
    
    var constraint: js.UndefOr[Type] = js.native
    
    var default: js.UndefOr[Type] = js.native
    
    def equals(`type`: TypeParameterType): Boolean = js.native
    
    val name: String = js.native
  }
}
