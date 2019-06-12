package typings
package tstlLib.baseContainerUniqueSetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/base/container/UniqueSet", "UniqueSet")
@js.native
abstract class UniqueSet[Key, Source /* <: UniqueSet[Key, Source] */] ()
  extends tstlLib.baseContainerSetContainerMod.SetContainer[Key, tstlLib.tstlLibNumbers.`true`, Source] {
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
  def extract_true(it: tstlLib.baseIteratorSetIteratorMod.SetIterator[Key, tstlLib.tstlLibNumbers.`true`, Source]): tstlLib.baseIteratorSetIteratorMod.SetIterator[Key, tstlLib.tstlLibNumbers.`true`, Source] = js.native
  /**
    * Insert an element with hint.
    *
    * @param hint Hint for the position where the element can be inserted.
    * @param pair A tuple to be referenced for the insert.
    * @return An iterator to the newly inserted element, if the specified key doesn't exist, otherwise an iterator to the ordinary element.
    */
  @JSName("insert")
  def insert_true(
    hint: tstlLib.baseIteratorSetIteratorMod.SetIterator[Key, tstlLib.tstlLibNumbers.`true`, Source],
    key: Key
  ): tstlLib.baseIteratorSetIteratorMod.SetIterator[Key, tstlLib.tstlLibNumbers.`true`, Source] = js.native
}

