package typings.tstl

import typings.tstl.baseContainerSetElementListMod.SetElementList.Iterator
import typings.tstl.baseContainerSetElementListMod.SetElementList.ReverseIterator
import typings.tstl.baseContainerUniqueSetMod.UniqueSet
import typings.tstl.baseTreeUnderscoreSetTreeMod._SetTree
import typings.tstl.tstlBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/base/tree/_UniqueSetTree", JSImport.Namespace)
@js.native
object baseTreeUnderscoreUniqueSetTreeMod extends js.Object {
  @js.native
  class _UniqueSetTree[Key, Source /* <: UniqueSet[Key, Source, Iterator[Key, `true`, Source], ReverseIterator[Key, `true`, Source]] */] protected () extends _SetTree[Key, `true`, Source] {
    def this(source: Source, comp: js.Function2[/* x */ Key, /* y */ Key, Boolean]) = this()
  }
  
}

