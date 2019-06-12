package typings
package tstlLib.baseContainerMultiMapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/base/container/MultiMap", "MultiMap")
@js.native
abstract class MultiMap[Key, T, Source /* <: MultiMap[Key, T, Source] */] ()
  extends tstlLib.baseContainerMapContainerMod.MapContainer[Key, T, tstlLib.tstlLibNumbers.`false`, Source] {
  /**
    * @hidden
    */
  /* protected */ def _Key_eq(x: Key, y: Key): scala.Boolean = js.native
  /**
    * Construct and insert element with hint.
    *
    * @param hint Hint for the position where the element can be inserted.
    * @param key Key of the new element.
    * @param val Value of the new element.
    * @return An iterator to the newly inserted element.
    */
  @JSName("emplace_hint")
  def emplace_hint_false(
    hint: tstlLib.baseIteratorMapIteratorMod.MapIterator[Key, T, tstlLib.tstlLibNumbers.`false`, Source],
    key: Key,
    `val`: T
  ): tstlLib.baseIteratorMapIteratorMod.MapIterator[Key, T, tstlLib.tstlLibNumbers.`false`, Source] = js.native
  /**
    * Insert an element with hint.
    *
    * @param hint Hint for the position where the element can be inserted.
    * @param pair A tuple to be referenced for the insert.
    * @return An iterator to the newly inserted element.
    */
  @JSName("insert")
  def insert_false(
    hint: tstlLib.baseIteratorMapIteratorMod.MapIterator[Key, T, tstlLib.tstlLibNumbers.`false`, Source],
    pair: tstlLib.utilityIPairMod.IPair[Key, T]
  ): tstlLib.baseIteratorMapIteratorMod.MapIterator[Key, T, tstlLib.tstlLibNumbers.`false`, Source] = js.native
}

