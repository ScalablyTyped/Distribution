package typings.tstl

import typings.tstl.baseContainerMapElementListMod.MapElementList.Iterator
import typings.tstl.baseContainerMapElementListMod.MapElementList.ReverseIterator
import typings.tstl.baseContainerMultiMapMod.MultiMap
import typings.tstl.baseTreeUnderscoreMapTreeMod._MapTree
import typings.tstl.tstlBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/base/tree/_MultiMapTree", JSImport.Namespace)
@js.native
object baseTreeUnderscoreMultiMapTreeMod extends js.Object {
  @js.native
  class _MultiMapTree[Key, T, Source /* <: MultiMap[
    Key, 
    T, 
    Source, 
    Iterator[Key, T, `false`, Source], 
    ReverseIterator[Key, T, `false`, Source]
  ] */] protected () extends _MapTree[Key, T, `false`, Source] {
    def this(source: Source, comp: js.Function2[/* x */ Key, /* y */ Key, Boolean]) = this()
    var _Nearest_by_key: js.Any = js.native
    @JSName("insert")
    def insert_false(`val`: Iterator[Key, T, `false`, Source]): Unit = js.native
  }
  
}

