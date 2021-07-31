package typings.typedoc

import typings.typedoc.modelsTypesMod.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesIndexedAccessMod {
  
  @JSImport("typedoc/dist/lib/models/types/indexed-access", "IndexedAccessType")
  @js.native
  class IndexedAccessType protected () extends Type {
    def this(objectType: Type, indexType: Type) = this()
    
    def equals(`type`: Type): Boolean = js.native
    
    var indexType: Type = js.native
    
    var objectType: Type = js.native
  }
}
