package typings.tstl

import typings.tstl.internalContainerAssociativeSetElementListMod.SetElementList.Iterator
import typings.tstl.internalContainerAssociativeSetElementListMod.SetElementList.ReverseIterator
import typings.tstl.internalContainerAssociativeUniqueTreeSetMod.UniqueTreeSet
import typings.tstl.internalFunctionalComparatorMod.Comparator
import typings.tstl.internalTreeSetTreeMod.SetTree
import typings.tstl.tstlBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/internal/tree/UniqueSetTree", JSImport.Namespace)
@js.native
object internalTreeUniqueSetTreeMod extends js.Object {
  @js.native
  class UniqueSetTree[Key, Source /* <: UniqueTreeSet[Key, Source, Iterator[Key, `true`, Source], ReverseIterator[Key, `true`, Source]] */] protected () extends SetTree[Key, `true`, Source] {
    def this(source: Source, comp: Comparator[Key, Key]) = this()
  }
  
}

