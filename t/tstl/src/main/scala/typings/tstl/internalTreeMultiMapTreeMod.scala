package typings.tstl

import typings.tstl.internalContainerAssociativeMapElementListMod.MapElementList.Iterator
import typings.tstl.internalContainerAssociativeMapElementListMod.MapElementList.ReverseIterator
import typings.tstl.internalContainerAssociativeMultiTreeMapMod.MultiTreeMap
import typings.tstl.internalFunctionalComparatorMod.Comparator
import typings.tstl.internalTreeMapTreeMod.MapTree
import typings.tstl.tstlBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/internal/tree/MultiMapTree", JSImport.Namespace)
@js.native
object internalTreeMultiMapTreeMod extends js.Object {
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

