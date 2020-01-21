package typings.tstl

import typings.tstl.comparatorMod.Comparator
import typings.tstl.multiTreeSetMod.MultiTreeSet
import typings.tstl.setElementListMod.SetElementList.Iterator
import typings.tstl.setElementListMod.SetElementList.ReverseIterator
import typings.tstl.setTreeMod.SetTree
import typings.tstl.tstlBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/internal/tree/MultiSetTree", JSImport.Namespace)
@js.native
object multiSetTreeMod extends js.Object {
  @js.native
  class MultiSetTree[Key, Source /* <: MultiTreeSet[Key, Source, Iterator[Key, `false`, Source], ReverseIterator[Key, `false`, Source]] */] protected () extends SetTree[Key, `false`, Source] {
    def this(source: Source, comp: Comparator[Key, Key]) = this()
    var _Nearest_by_key: js.Any = js.native
    @JSName("insert")
    def insert_false(`val`: Iterator[Key, `false`, Source]): Unit = js.native
  }
  
}

