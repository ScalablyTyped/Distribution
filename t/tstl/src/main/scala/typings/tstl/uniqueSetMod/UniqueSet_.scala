package typings.tstl.uniqueSetMod

import typings.tstl.setContainerMod.SetContainer
import typings.tstl.tstlBooleans.`true`
import typings.tstl.uniqueSetMod.UniqueSet.Iterator
import typings.tstl.uniqueSetMod.UniqueSet.ReverseIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/base/container/UniqueSet", "UniqueSet")
@js.native
abstract class UniqueSet_[Key, Source /* <: UniqueSet[Key, Source, IteratorT, ReverseT] */, IteratorT /* <: Iterator[Key, Source, IteratorT, ReverseT] */, ReverseT /* <: ReverseIterator[Key, Source, IteratorT, ReverseT] */] () extends SetContainer[Key, `true`, Source, IteratorT, ReverseT] {
  var _Extract_by_iterator: js.Any = js.native
  var _Extract_by_val: js.Any = js.native
  /**
    * Extract an element by key.
    *
    * @param key Key to search for.
    * @return The extracted element.
    */
  def extract(key: Key): Key = js.native
  /**
    * Extract an element by iterator.
    *
    * @param pos The iterator to the element for extraction.
    * @return Iterator following the *pos*, strained by the extraction.
    */
  @JSName("extract")
  def extract_IteratorT(it: IteratorT): IteratorT = js.native
}

