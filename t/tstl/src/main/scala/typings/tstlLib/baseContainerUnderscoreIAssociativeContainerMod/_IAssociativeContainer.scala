package typings
package tstlLib.baseContainerUnderscoreIAssociativeContainerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait _IAssociativeContainer[Key, T /* <: Elem */, SourceT /* <: _IAssociativeContainer[Key, T, SourceT, IteratorT, ReverseIteratorT, Elem] */, IteratorT /* <: tstlLib.baseIteratorIteratorMod.Iterator[T, SourceT, IteratorT, ReverseIteratorT, Elem] */, ReverseIteratorT /* <: tstlLib.baseIteratorReverseIteratorMod.ReverseIterator[T, SourceT, IteratorT, ReverseIteratorT, Elem] */, Elem]
  extends tstlLib.baseContainerIContainerMod.IContainer[T, SourceT, IteratorT, ReverseIteratorT, Elem] {
  /**
    * Count elements with a specified key.
    *
    * @param key Key to search for.
    * @return Number of elements with the specified key.
    */
  def count(key: Key): scala.Double = js.native
  /**
    * @inheritDoc
    */
  @JSName("erase")
  def erase_IteratorT(pos: IteratorT): IteratorT = js.native
  /**
    * Get iterator to element.
    *
    * @param key Key to search for.
    * @return An iterator to the element, if the specified key is found, otherwise `this.end()`.
    */
  def find(key: Key): IteratorT = js.native
  /**
    * Test whether a key exists.
    *
    * @param key Key to search for.
    * @return Whether the specified key exists.
    */
  def has(key: Key): scala.Boolean = js.native
}

