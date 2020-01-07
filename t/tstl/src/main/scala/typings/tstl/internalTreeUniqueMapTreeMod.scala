package typings.tstl

import typings.tstl.internalContainerAssociativeMapElementListMod.MapElementList.Iterator
import typings.tstl.internalContainerAssociativeMapElementListMod.MapElementList.ReverseIterator
import typings.tstl.internalContainerAssociativeUniqueTreeMapMod.UniqueTreeMap
import typings.tstl.internalFunctionalComparatorMod.Comparator
import typings.tstl.internalTreeMapTreeMod.MapTree
import typings.tstl.tstlBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/internal/tree/UniqueMapTree", JSImport.Namespace)
@js.native
object internalTreeUniqueMapTreeMod extends js.Object {
  @js.native
  class UniqueMapTree[Key, T, Source /* <: UniqueTreeMap[
    Key, 
    T, 
    Source, 
    Iterator[Key, T, `true`, Source], 
    ReverseIterator[Key, T, `true`, Source]
  ] */] protected () extends MapTree[Key, T, `true`, Source] {
    def this(source: Source, comp: Comparator[Key, Key]) = this()
  }
  
}

