package typings
package tstlLib.baseContainerSetElementListMod

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
  class Iterator[Key, Unique /* <: scala.Boolean */, Source /* <: tstlLib.baseContainerSetContainerMod.SetContainer[Key, Unique, Source, Iterator[Key, Unique, Source], ReverseIterator[Key, Unique, Source]] */] protected ()
    extends tstlLib.baseIteratorListIteratorMod.ListIterator[Key, Source, Iterator[Key, Unique, Source], ReverseIterator[Key, Unique, Source], Key] {
    /**
      * @hidden
      */
    var source_ : js.Any = js.native
  }
  
  @js.native
  class ReverseIterator[Key, Unique /* <: scala.Boolean */, Source /* <: tstlLib.baseContainerSetContainerMod.SetContainer[Key, Unique, Source, Iterator[Key, Unique, Source], ReverseIterator[Key, Unique, Source]] */] ()
    extends tstlLib.baseIteratorReverseIteratorMod.ReverseIterator[Key, Source, Iterator[Key, Unique, Source], ReverseIterator[Key, Unique, Source], Key]
  
}

