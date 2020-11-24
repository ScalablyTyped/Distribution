package typings.typedoc

import typings.typedoc.typesAbstractMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc/dist/lib/models/types/inferred", JSImport.Namespace)
@js.native
object typesInferredMod extends js.Object {
  
  @js.native
  class InferredType protected () extends Type {
    def this(name: String) = this()
    
    def equals(`type`: js.Any): Boolean = js.native
    
    var name: String = js.native
  }
}
