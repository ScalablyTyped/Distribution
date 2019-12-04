package typings.tstl

import typings.tstl.baseContainerSetContainerMod.SetContainer
import typings.tstl.baseContainerSetElementListMod.SetElementList.Iterator
import typings.tstl.baseContainerSetElementListMod.SetElementList.ReverseIterator
import typings.tstl.baseTreeUnderscoreXTreeMod._XTree
import typings.tstl.baseTreeUnderscoreXTreeNodeMod._XTreeNode
import typings.tstl.utilityPairMod.Pair
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/base/tree/_SetTree", JSImport.Namespace)
@js.native
object baseTreeUnderscoreSetTreeMod extends js.Object {
  @js.native
  abstract class _SetTree[Key, Unique /* <: Boolean */, Source /* <: SetContainer[Key, Unique, Source, Iterator[Key, Unique, Source], ReverseIterator[Key, Unique, Source]] */] protected () extends _XTree[Iterator[Key, Unique, Source]] {
    def this(
      set: Source,
      comp: js.Function2[/* x */ Key, /* y */ Key, Boolean],
      it_comp: js.Function2[
            /* x */ Iterator[Key, Unique, Source], 
            /* y */ Iterator[Key, Unique, Source], 
            Boolean
          ]
    ) = this()
    var key_comp_ : js.Any = js.native
    var key_eq_ : js.Any = js.native
    var source_ : js.Any = js.native
    def equal_range(`val`: Key): Pair[Iterator[Key, Unique, Source], Iterator[Key, Unique, Source]] = js.native
    def get_by_key(`val`: Key): (_XTreeNode[Iterator[Key, Unique, Source]]) | Null = js.native
    def key_comp(): js.Function2[/* x */ Key, /* y */ Key, Boolean] = js.native
    def key_eq(): js.Function2[/* x */ Key, /* y */ Key, Boolean] = js.native
    def lower_bound(`val`: Key): Iterator[Key, Unique, Source] = js.native
    def nearest_by_key(`val`: Key): (_XTreeNode[Iterator[Key, Unique, Source]]) | Null = js.native
    def source(): Source = js.native
    def upper_bound(`val`: Key): Iterator[Key, Unique, Source] = js.native
    def value_comp(): js.Function2[/* x */ Key, /* y */ Key, Boolean] = js.native
  }
  
}

