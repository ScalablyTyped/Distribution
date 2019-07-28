package typings.tstl.baseContainerSetElementListMod

import typings.tstl.baseContainerSetContainerMod.SetContainer
import typings.tstl.baseContainerSetElementListMod.SetElementListNs.Iterator
import typings.tstl.baseContainerSetElementListMod.SetElementListNs.ReverseIterator
import typings.tstl.baseIteratorListIteratorMod.ListIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/base/container/SetElementList", "SetElementList")
@js.native
object SetElementListNs extends js.Object {
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {readonly [ P in keyof tstl.tstl/base/iterator/Iterator.Iterator<Key, Source, tstl.tstl/base/container/SetElementList.SetElementList.Iterator<Key, Unique, Source>, tstl.tstl/base/container/SetElementList.SetElementList.ReverseIterator<Key, Unique, Source>, Key> ]: tstl.tstl/base/iterator/Iterator.Iterator<Key, Source, tstl.tstl/base/container/SetElementList.SetElementList.Iterator<Key, Unique, Source>, tstl.tstl/base/container/SetElementList.SetElementList.ReverseIterator<Key, Unique, Source>, Key>[P]} */ @js.native
  /**
    * @hidden
    */
  class Iterator[Key, Unique /* <: Boolean */, Source /* <: SetContainer[Key, Unique, Source, Iterator[Key, Unique, Source], ReverseIterator[Key, Unique, Source]] */] protected () extends ListIterator[Key, Source, Iterator[Key, Unique, Source], ReverseIterator[Key, Unique, Source], Key] {
    /**
      * @hidden
      */
    var source_ : js.Any = js.native
  }
  
  @js.native
  class ReverseIterator[Key, Unique /* <: Boolean */, Source /* <: SetContainer[Key, Unique, Source, Iterator[Key, Unique, Source], ReverseIterator[Key, Unique, Source]] */] ()
    extends typings.tstl.baseIteratorReverseIteratorMod.ReverseIterator[Key, Source, Iterator[Key, Unique, Source], ReverseIterator[Key, Unique, Source], Key]
  
}

