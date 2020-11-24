package typings.typedoc

import typings.typedoc.typesAbstractMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc/dist/lib/models/types/union", JSImport.Namespace)
@js.native
object unionMod extends js.Object {
  
  @js.native
  class UnionType protected () extends Type {
    def this(types: js.Array[Type]) = this()
    
    def equals(`type`: UnionType): Boolean = js.native
    
    var types: js.Array[Type] = js.native
  }
}
