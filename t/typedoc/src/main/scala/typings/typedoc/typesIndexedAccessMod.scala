package typings.typedoc

import typings.typedoc.modelsTypesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc/dist/lib/models/types/indexed-access", JSImport.Namespace)
@js.native
object typesIndexedAccessMod extends js.Object {
  
  @js.native
  class IndexedAccessType protected () extends Type {
    def this(objectType: Type, indexType: Type) = this()
    
    def equals(`type`: Type): Boolean = js.native
    
    var indexType: Type = js.native
    
    var objectType: Type = js.native
  }
}
