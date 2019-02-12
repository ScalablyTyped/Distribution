package typings
package tstlLib.baseContainerUnderscoreITreeContainerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait _ITreeContainer[Key, T /* <: Elem */, SourceT /* <: _ITreeContainer[Key, T, SourceT, IteratorT, ReverseIteratorT, Elem] */, IteratorT /* <: tstlLib.baseIteratorIteratorMod.Iterator[T, SourceT, IteratorT, ReverseIteratorT, Elem] */, ReverseIteratorT /* <: tstlLib.baseIteratorReverseIteratorMod.ReverseIterator[T, SourceT, IteratorT, ReverseIteratorT, Elem] */, Elem]
  extends tstlLib.baseContainerUnderscoreIAssociativeContainerMod._IAssociativeContainer[Key, T, SourceT, IteratorT, ReverseIteratorT, Elem] {
  /**
    * Get range of equal elements.
    *
    * @param key Key to search for.
    * @return Pair of {@link lower_bound} and {@link upper_bound}.
    */
  def equal_range(key: Key): tstlLib.utilityPairMod.Pair[IteratorT, IteratorT] = js.native
  /**
    * Get key comparison function.
    *
    * @return The key comparison function.
    */
  def key_comp(): js.Function2[/* x */ Key, /* y */ Key, scala.Boolean] = js.native
  /**
    * Get iterator to lower bound.
    *
    * @param key Key to search for.
    * @return Iterator to the first element equal or after to the key.
    */
  def lower_bound(key: Key): IteratorT = js.native
  /**
    * Get iterator to upper bound.
    *
    * @param key Key to search for.
    * @return Iterator to the first element after the key.
    */
  def upper_bound(key: Key): IteratorT = js.native
  /**
    * Get value comparison function.
    *
    * @return The value comparison function.
    */
  def value_comp(): js.Function2[/* x */ Elem, /* y */ Elem, scala.Boolean] = js.native
}

