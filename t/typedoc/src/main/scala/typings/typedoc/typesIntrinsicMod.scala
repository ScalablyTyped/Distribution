package typings.typedoc

import typings.typedoc.typesAbstractMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc/dist/lib/models/types/intrinsic", JSImport.Namespace)
@js.native
object typesIntrinsicMod extends js.Object {
  
  @js.native
  class IntrinsicType protected () extends Type {
    def this(name: String) = this()
    
    def equals(`type`: IntrinsicType): Boolean = js.native
    
    var name: String = js.native
  }
}
