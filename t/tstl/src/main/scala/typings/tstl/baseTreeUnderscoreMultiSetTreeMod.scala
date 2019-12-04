package typings.tstl

import typings.tstl.baseContainerMultiSetMod.MultiSet
import typings.tstl.baseContainerSetElementListMod.SetElementList.Iterator
import typings.tstl.baseContainerSetElementListMod.SetElementList.ReverseIterator
import typings.tstl.baseTreeUnderscoreSetTreeMod._SetTree
import typings.tstl.tstlNumbers.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/base/tree/_MultiSetTree", JSImport.Namespace)
@js.native
object baseTreeUnderscoreMultiSetTreeMod extends js.Object {
  @js.native
  class _MultiSetTree[Key, Source /* <: MultiSet[Key, Source, Iterator[Key, `false`, Source], ReverseIterator[Key, `false`, Source]] */] protected () extends _SetTree[Key, `false`, Source] {
    def this(source: Source, comp: js.Function2[/* x */ Key, /* y */ Key, Boolean]) = this()
    var _Nearest_by_key: js.Any = js.native
    @JSName("insert")
    def insert_false(`val`: Iterator[Key, `false`, Source]): Unit = js.native
  }
  
}

