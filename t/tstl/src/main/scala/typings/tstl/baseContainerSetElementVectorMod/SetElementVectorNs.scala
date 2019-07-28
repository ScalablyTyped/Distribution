package typings.tstl.baseContainerSetElementVectorMod

import typings.tstl.baseContainerSetContainerMod.SetContainer
import typings.tstl.baseContainerSetElementVectorMod.SetElementVectorNs.Iterator
import typings.tstl.baseContainerSetElementVectorMod.SetElementVectorNs.ReverseIterator
import typings.tstl.baseIteratorArrayIteratorBaseMod.ArrayIteratorBase
import typings.tstl.baseIteratorArrayIteratorBaseMod.ArrayReverseIteratorBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/base/container/SetElementVector", "SetElementVector")
@js.native
object SetElementVectorNs extends js.Object {
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {readonly [ P in keyof tstl.tstl/base/iterator/Iterator.Iterator<Key, Source, tstl.tstl/base/container/SetElementVector.SetElementVector.Iterator<Key, Unique, Source>, tstl.tstl/base/container/SetElementVector.SetElementVector.ReverseIterator<Key, Unique, Source>, Key> ]: tstl.tstl/base/iterator/Iterator.Iterator<Key, Source, tstl.tstl/base/container/SetElementVector.SetElementVector.Iterator<Key, Unique, Source>, tstl.tstl/base/container/SetElementVector.SetElementVector.ReverseIterator<Key, Unique, Source>, Key>[P]} */ @js.native
  class Iterator[Key, Unique /* <: Boolean */, Source /* <: SetContainer[Key, Unique, Source, Iterator[Key, Unique, Source], ReverseIterator[Key, Unique, Source]] */] () extends ArrayIteratorBase[
          Key, 
          Source, 
          SetElementVector[Key, Unique, Source], 
          Iterator[Key, Unique, Source], 
          ReverseIterator[Key, Unique, Source], 
          Key
        ]
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {readonly [ P in keyof tstl.tstl/base/iterator/ReverseIterator.IReverseIterator<Key, Source, tstl.tstl/base/container/SetElementVector.SetElementVector.Iterator<Key, Unique, Source>, tstl.tstl/base/container/SetElementVector.SetElementVector.ReverseIterator<Key, Unique, Source>, Key> ]: tstl.tstl/base/iterator/ReverseIterator.IReverseIterator<Key, Source, tstl.tstl/base/container/SetElementVector.SetElementVector.Iterator<Key, Unique, Source>, tstl.tstl/base/container/SetElementVector.SetElementVector.ReverseIterator<Key, Unique, Source>, Key>[P]} */ @js.native
  class ReverseIterator[Key, Unique /* <: Boolean */, Source /* <: SetContainer[Key, Unique, Source, Iterator[Key, Unique, Source], ReverseIterator[Key, Unique, Source]] */] () extends ArrayReverseIteratorBase[
          Key, 
          Source, 
          SetElementVector[Key, Unique, Source], 
          Iterator[Key, Unique, Source], 
          ReverseIterator[Key, Unique, Source], 
          Key
        ]
  
}

