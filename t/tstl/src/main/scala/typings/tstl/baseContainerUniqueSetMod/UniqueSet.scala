package typings.tstl.baseContainerUniqueSetMod

import typings.tstl.baseContainerSetContainerMod.SetContainer
import typings.tstl.baseIteratorISetIteratorMod.ISetIterator
import typings.tstl.baseIteratorISetIteratorMod.ISetReverseIterator
import typings.tstl.tstlNumbers.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/base/container/UniqueSet", "UniqueSet")
@js.native
abstract class UniqueSet[Key, Source /* <: UniqueSet[Key, Source, IteratorT, ReverseT] */, IteratorT /* <: ISetIterator[Key, `true`, Source, IteratorT, ReverseT] */, ReverseT /* <: ISetReverseIterator[Key, `true`, Source, IteratorT, ReverseT] */] () extends SetContainer[Key, `true`, Source, IteratorT, ReverseT] {
  /**
    * @hidden
    */
  var _Extract_by_iterator: js.Any = js.native
  /**
    * @hidden
    */
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

