package typings.tstl

import typings.tstl.internalContainerAssociativeMultiTreeSetMod.MultiTreeSet
import typings.tstl.internalContainerAssociativeSetElementListMod.SetElementList.Iterator
import typings.tstl.internalContainerAssociativeSetElementListMod.SetElementList.ReverseIterator
import typings.tstl.internalFunctionalComparatorMod.Comparator
import typings.tstl.internalTreeSetTreeMod.SetTree
import typings.tstl.tstlBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/internal/tree/MultiSetTree", JSImport.Namespace)
@js.native
object internalTreeMultiSetTreeMod extends js.Object {
  @js.native
  class MultiSetTree[Key, Source /* <: MultiTreeSet[Key, Source, Iterator[Key, `false`, Source], ReverseIterator[Key, `false`, Source]] */] protected () extends SetTree[Key, `false`, Source] {
    def this(source: Source, comp: Comparator[Key, Key]) = this()
    var _Nearest_by_key: js.Any = js.native
    @JSName("insert")
    def insert_false(`val`: Iterator[Key, `false`, Source]): Unit = js.native
  }
  
}

