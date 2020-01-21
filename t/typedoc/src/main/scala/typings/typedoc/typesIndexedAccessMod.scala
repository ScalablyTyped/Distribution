package typings.typedoc

import typings.typedoc.modelsTypesMod.Type
import typings.typedoc.typedocStrings.indexedAccess
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/models/types/indexed-access", JSImport.Namespace)
@js.native
object typesIndexedAccessMod extends js.Object {
  @js.native
  class IndexedAccessType protected () extends Type {
    def this(objectType: Type, indexType: Type) = this()
    var indexType: Type = js.native
    var objectType: Type = js.native
    @JSName("type")
    val type_IndexedAccessType: indexedAccess = js.native
    def equals(`type`: Type): Boolean = js.native
  }
  
}

