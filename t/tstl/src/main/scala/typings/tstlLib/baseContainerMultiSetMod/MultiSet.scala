package typings
package tstlLib.baseContainerMultiSetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/base/container/MultiSet", "MultiSet")
@js.native
abstract class MultiSet[Key, Source /* <: MultiSet[Key, Source] */] ()
  extends tstlLib.baseContainerSetContainerMod.SetContainer[Key, tstlLib.tstlLibNumbers.`false`, Source] {
  /**
    * @hidden
    */
  /* protected */ def _Key_eq(x: Key, y: Key): scala.Boolean = js.native
  /**
    * Insert an element with hint.
    *
    * @param hint Hint for the position where the element can be inserted.
    * @param pair A tuple to be referenced for the insert.
    * @return An iterator to the newly inserted element.
    */
  @JSName("insert")
  def insert_false(
    hint: tstlLib.baseIteratorSetIteratorMod.SetIterator[Key, tstlLib.tstlLibNumbers.`false`, Source],
    key: Key
  ): tstlLib.baseIteratorSetIteratorMod.SetIterator[Key, tstlLib.tstlLibNumbers.`false`, Source] = js.native
}

