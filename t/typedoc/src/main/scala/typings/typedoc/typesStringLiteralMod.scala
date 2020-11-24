package typings.typedoc

import typings.typedoc.typesAbstractMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc/dist/lib/models/types/string-literal", JSImport.Namespace)
@js.native
object typesStringLiteralMod extends js.Object {
  
  @js.native
  class StringLiteralType protected () extends Type {
    def this(value: String) = this()
    
    def equals(`type`: StringLiteralType): Boolean = js.native
    
    var value: String = js.native
  }
}
