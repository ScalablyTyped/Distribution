package typings.tstl

import typings.tstl.baseContainerMapElementListMod.MapElementList.Iterator
import typings.tstl.baseContainerMapElementListMod.MapElementList.ReverseIterator
import typings.tstl.baseContainerUniqueMapMod.UniqueMap
import typings.tstl.baseTreeUnderscoreMapTreeMod._MapTree
import typings.tstl.tstlNumbers.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/base/tree/_UniqueMapTree", JSImport.Namespace)
@js.native
object baseTreeUnderscoreUniqueMapTreeMod extends js.Object {
  @js.native
  class _UniqueMapTree[Key, T, Source /* <: UniqueMap[
    Key, 
    T, 
    Source, 
    Iterator[Key, T, `true`, Source], 
    ReverseIterator[Key, T, `true`, Source]
  ] */] protected () extends _MapTree[Key, T, `true`, Source] {
    def this(source: Source, comp: js.Function2[/* x */ Key, /* y */ Key, Boolean]) = this()
  }
  
}

