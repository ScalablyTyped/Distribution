package typings.tstl

import typings.tstl.baseContainerMapContainerMod.MapContainer
import typings.tstl.baseContainerMapElementListMod.MapElementList.Iterator
import typings.tstl.baseContainerMapElementListMod.MapElementList.ReverseIterator
import typings.tstl.baseTreeUnderscoreXTreeMod._XTree
import typings.tstl.baseTreeUnderscoreXTreeNodeMod._XTreeNode
import typings.tstl.utilityIPairMod.IPair
import typings.tstl.utilityPairMod.Pair
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/base/tree/_MapTree", JSImport.Namespace)
@js.native
object baseTreeUnderscoreMapTreeMod extends js.Object {
  @js.native
  abstract class _MapTree[Key, T, Unique /* <: Boolean */, Source /* <: MapContainer[
    Key, 
    T, 
    Unique, 
    Source, 
    Iterator[Key, T, Unique, Source], 
    ReverseIterator[Key, T, Unique, Source]
  ] */] protected () extends _XTree[Iterator[Key, T, Unique, Source]] {
    def this(
      source: Source,
      comp: js.Function2[/* x */ Key, /* y */ Key, Boolean],
      it_comp: js.Function2[
            /* x */ Iterator[Key, T, Unique, Source], 
            /* y */ Iterator[Key, T, Unique, Source], 
            Boolean
          ]
    ) = this()
    var key_compare_ : js.Any = js.native
    var key_eq_ : js.Any = js.native
    var source_ : js.Any = js.native
    var value_compare_ : js.Any = js.native
    def equal_range(key: Key): Pair[Iterator[Key, T, Unique, Source], Iterator[Key, T, Unique, Source]] = js.native
    def get_by_key(key: Key): (_XTreeNode[Iterator[Key, T, Unique, Source]]) | Null = js.native
    def key_comp(): js.Function2[/* x */ Key, /* y */ Key, Boolean] = js.native
    def key_eq(): js.Function2[/* x */ Key, /* y */ Key, Boolean] = js.native
    def lower_bound(key: Key): Iterator[Key, T, Unique, Source] = js.native
    def nearest_by_key(key: Key): (_XTreeNode[Iterator[Key, T, Unique, Source]]) | Null = js.native
    def source(): Source = js.native
    def upper_bound(key: Key): Iterator[Key, T, Unique, Source] = js.native
    def value_comp(): js.Function2[/* x */ IPair[Key, T], /* y */ IPair[Key, T], Boolean] = js.native
  }
  
}

