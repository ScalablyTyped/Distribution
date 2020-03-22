package typings.tstl.multiSetMod

import typings.tstl.multiSetMod.MultiSet.Iterator
import typings.tstl.multiSetMod.MultiSet.ReverseIterator
import typings.tstl.setContainerMod.SetContainer
import typings.tstl.tstlBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/base/container/MultiSet", "MultiSet")
@js.native
abstract class MultiSet_[Key, Source /* <: MultiSet[Key, Source, IteratorT, ReverseT] */, IteratorT /* <: Iterator[Key, Source, IteratorT, ReverseT] */, ReverseT /* <: ReverseIterator[Key, Source, IteratorT, ReverseT] */] () extends SetContainer[Key, `false`, Source, IteratorT, ReverseT] {
  /* protected */ def _Key_eq(x: Key, y: Key): Boolean = js.native
}

