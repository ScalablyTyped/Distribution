package typings.tstl

import typings.tstl.comparatorMod.Comparator
import typings.tstl.mapElementListMod.MapElementList.Iterator
import typings.tstl.mapElementListMod.MapElementList.ReverseIterator
import typings.tstl.mapTreeMod.MapTree
import typings.tstl.tstlBooleans.`true`
import typings.tstl.uniqueTreeMapMod.UniqueTreeMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tstl/internal/tree/UniqueMapTree", JSImport.Namespace)
@js.native
object uniqueMapTreeMod extends js.Object {
  
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
