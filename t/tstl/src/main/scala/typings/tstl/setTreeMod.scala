package typings.tstl

import typings.tstl.comparatorMod.Comparator
import typings.tstl.itreesetMod.ITreeSet
import typings.tstl.pairMod.Pair
import typings.tstl.setElementListMod.SetElementList.Iterator
import typings.tstl.setElementListMod.SetElementList.ReverseIterator
import typings.tstl.xtreeMod.XTree
import typings.tstl.xtreenodeMod.XTreeNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tstl/internal/tree/SetTree", JSImport.Namespace)
@js.native
object setTreeMod extends js.Object {
  
  @js.native
  abstract class SetTree[Key, Unique /* <: Boolean */, Source /* <: ITreeSet[Key, Unique, Source, Iterator[Key, Unique, Source], ReverseIterator[Key, Unique, Source]] */] protected () extends XTree[Iterator[Key, Unique, Source]] {
    def this(
      set: Source,
      comp: Comparator[Key, Key],
      it_comp: Comparator[Iterator[Key, Unique, Source], Iterator[Key, Unique, Source]]
    ) = this()
    
    def equal_range(`val`: Key): Pair[Iterator[Key, Unique, Source], Iterator[Key, Unique, Source]] = js.native
    
    def get_by_key(`val`: Key): (XTreeNode[Iterator[Key, Unique, Source]]) | Null = js.native
    
    def key_comp(): Comparator[Key, Key] = js.native
    
    var key_comp_ : js.Any = js.native
    
    def key_eq(): Comparator[Key, Key] = js.native
    
    var key_eq_ : js.Any = js.native
    
    def lower_bound(`val`: Key): Iterator[Key, Unique, Source] = js.native
    
    def nearest_by_key(`val`: Key): (XTreeNode[Iterator[Key, Unique, Source]]) | Null = js.native
    
    def source(): Source = js.native
    
    var source_ : js.Any = js.native
    
    def upper_bound(`val`: Key): Iterator[Key, Unique, Source] = js.native
    
    def value_comp(): Comparator[Key, Key] = js.native
  }
}
