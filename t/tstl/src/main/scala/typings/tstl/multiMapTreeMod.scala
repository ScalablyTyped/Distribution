package typings.tstl

import typings.tstl.comparatorMod.Comparator
import typings.tstl.mapElementListMod.MapElementList.Iterator
import typings.tstl.mapElementListMod.MapElementList.ReverseIterator
import typings.tstl.mapTreeMod.MapTree
import typings.tstl.multiTreeMapMod.MultiTreeMap
import typings.tstl.tstlBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/internal/tree/MultiMapTree", JSImport.Namespace)
@js.native
object multiMapTreeMod extends js.Object {
  @js.native
  class MultiMapTree[Key, T, Source /* <: MultiTreeMap[
    Key, 
    T, 
    Source, 
    Iterator[Key, T, `false`, Source], 
    ReverseIterator[Key, T, `false`, Source]
  ] */] protected () extends MapTree[Key, T, `false`, Source] {
    def this(source: Source, comp: Comparator[Key, Key]) = this()
    var _Nearest_by_key: js.Any = js.native
    @JSName("insert")
    def insert_false(`val`: Iterator[Key, T, `false`, Source]): Unit = js.native
  }
  
}

