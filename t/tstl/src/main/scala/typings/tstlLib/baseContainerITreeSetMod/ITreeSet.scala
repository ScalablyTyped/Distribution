package typings
package tstlLib.baseContainerITreeSetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- tstlLib.baseContainerUnderscoreITreeContainerMod._ITreeContainer because var conflicts: iterator. Inlined key_comp, value_comp, lower_bound, upper_bound, equal_range */ @js.native
trait ITreeSet[T, Unique /* <: scala.Boolean */, Source /* <: ITreeSet[T, Unique, Source] */]
  extends tstlLib.baseContainerSetContainerMod.SetContainer[T, Unique, Source] {
  /**
    * Get range of equal elements.
    *
    * @param key Key to search for.
    * @return Pair of {@link lower_bound} and {@link upper_bound}.
    */
  def equal_range(key: T): tstlLib.utilityPairMod.Pair[
    tstlLib.baseIteratorSetIteratorMod.SetIterator[T, Unique, Source], 
    tstlLib.baseIteratorSetIteratorMod.SetIterator[T, Unique, Source]
  ] = js.native
  /**
    * Get key comparison function.
    *
    * @return The key comparison function.
    */
  def key_comp(): js.Function2[T, T, scala.Boolean] = js.native
  /**
    * Get iterator to lower bound.
    *
    * @param key Key to search for.
    * @return Iterator to the first element equal or after to the key.
    */
  def lower_bound(key: T): tstlLib.baseIteratorSetIteratorMod.SetIterator[T, Unique, Source] = js.native
  /**
    * Get iterator to upper bound.
    *
    * @param key Key to search for.
    * @return Iterator to the first element after the key.
    */
  def upper_bound(key: T): tstlLib.baseIteratorSetIteratorMod.SetIterator[T, Unique, Source] = js.native
  /**
    * Get value comparison function.
    *
    * @return The value comparison function.
    */
  def value_comp(): js.Function2[T, T, scala.Boolean] = js.native
}

