package typings.xmlCore

import typings.xmlCore.typesMod.ICollection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object collectionMod {
  
  @JSImport("xml-core/dist/types/collection", "Collection")
  @js.native
  class Collection[I] () extends ICollection[I] {
    def this(items: js.Array[I]) = this()
    
    @JSName("Count")
    def Count_MCollection: Double = js.native
    
    var items: js.Array[I] = js.native
  }
}
