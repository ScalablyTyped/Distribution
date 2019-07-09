package typings
package tstlLib.baseContainerSetElementVectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/base/container/SetElementVector", "SetElementVector")
@js.native
object SetElementVectorNs extends js.Object {
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {readonly [ P in keyof tstl.tstl/base/iterator/Iterator.Iterator<Key, Source, tstl.tstl/base/container/SetElementVector.SetElementVector.Iterator<Key, Unique, Source>, tstl.tstl/base/container/SetElementVector.SetElementVector.ReverseIterator<Key, Unique, Source>, Key> ]: tstl.tstl/base/iterator/Iterator.Iterator<Key, Source, tstl.tstl/base/container/SetElementVector.SetElementVector.Iterator<Key, Unique, Source>, tstl.tstl/base/container/SetElementVector.SetElementVector.ReverseIterator<Key, Unique, Source>, Key>[P]} */ @js.native
  class Iterator[Key, Unique /* <: scala.Boolean */, Source /* <: tstlLib.baseContainerSetContainerMod.SetContainer[Key, Unique, Source, Iterator[Key, Unique, Source], ReverseIterator[Key, Unique, Source]] */] ()
    extends tstlLib.baseIteratorArrayIteratorBaseMod.ArrayIteratorBase[
          Key, 
          Source, 
          tstlLib.baseContainerSetElementVectorMod.SetElementVector[Key, Unique, Source], 
          Iterator[Key, Unique, Source], 
          ReverseIterator[Key, Unique, Source], 
          Key
        ]
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {readonly [ P in keyof tstl.tstl/base/iterator/ReverseIterator.IReverseIterator<Key, Source, tstl.tstl/base/container/SetElementVector.SetElementVector.Iterator<Key, Unique, Source>, tstl.tstl/base/container/SetElementVector.SetElementVector.ReverseIterator<Key, Unique, Source>, Key> ]: tstl.tstl/base/iterator/ReverseIterator.IReverseIterator<Key, Source, tstl.tstl/base/container/SetElementVector.SetElementVector.Iterator<Key, Unique, Source>, tstl.tstl/base/container/SetElementVector.SetElementVector.ReverseIterator<Key, Unique, Source>, Key>[P]} */ @js.native
  class ReverseIterator[Key, Unique /* <: scala.Boolean */, Source /* <: tstlLib.baseContainerSetContainerMod.SetContainer[Key, Unique, Source, Iterator[Key, Unique, Source], ReverseIterator[Key, Unique, Source]] */] ()
    extends tstlLib.baseIteratorArrayIteratorBaseMod.ArrayReverseIteratorBase[
          Key, 
          Source, 
          tstlLib.baseContainerSetElementVectorMod.SetElementVector[Key, Unique, Source], 
          Iterator[Key, Unique, Source], 
          ReverseIterator[Key, Unique, Source], 
          Key
        ]
  
}

