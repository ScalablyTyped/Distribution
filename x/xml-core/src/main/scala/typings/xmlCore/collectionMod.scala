package typings.xmlCore

import typings.xmlCore.typesMod.ICollection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xml-core/dist/types/collection", JSImport.Namespace)
@js.native
object collectionMod extends js.Object {
  @js.native
  class Collection[I] () extends ICollection[I] {
    def this(items: js.Array[I]) = this()
    var items: js.Array[I] = js.native
    @JSName("Count")
    def Count_MCollection: Double = js.native
  }
  
}

