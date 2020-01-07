package typings.tstl

import typings.tstl.baseContainerITreeSetMod.ITreeSet
import typings.tstl.internalContainerAssociativeSetElementListMod.SetElementList.Iterator
import typings.tstl.internalContainerAssociativeSetElementListMod.SetElementList.ReverseIterator
import typings.tstl.internalFunctionalComparatorMod.Comparator
import typings.tstl.internalTreeXTreeMod.XTree
import typings.tstl.internalTreeXTreeNodeMod.XTreeNode
import typings.tstl.utilityPairMod.Pair
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/internal/tree/SetTree", JSImport.Namespace)
@js.native
object internalTreeSetTreeMod extends js.Object {
  @js.native
  abstract class SetTree[Key, Unique /* <: Boolean */, Source /* <: ITreeSet[Key, Unique, Source, Iterator[Key, Unique, Source], ReverseIterator[Key, Unique, Source]] */] protected () extends XTree[Iterator[Key, Unique, Source]] {
    def this(
      set: Source,
      comp: Comparator[Key, Key],
      it_comp: Comparator[Iterator[Key, Unique, Source], Iterator[Key, Unique, Source]]
    ) = this()
    var key_comp_ : js.Any = js.native
    var key_eq_ : js.Any = js.native
    var source_ : js.Any = js.native
    def equal_range(`val`: Key): Pair[Iterator[Key, Unique, Source], Iterator[Key, Unique, Source]] = js.native
    def get_by_key(`val`: Key): (XTreeNode[Iterator[Key, Unique, Source]]) | Null = js.native
    def key_comp(): Comparator[Key, Key] = js.native
    def key_eq(): Comparator[Key, Key] = js.native
    def lower_bound(`val`: Key): Iterator[Key, Unique, Source] = js.native
    def nearest_by_key(`val`: Key): (XTreeNode[Iterator[Key, Unique, Source]]) | Null = js.native
    def source(): Source = js.native
    def upper_bound(`val`: Key): Iterator[Key, Unique, Source] = js.native
    def value_comp(): Comparator[Key, Key] = js.native
  }
  
}

