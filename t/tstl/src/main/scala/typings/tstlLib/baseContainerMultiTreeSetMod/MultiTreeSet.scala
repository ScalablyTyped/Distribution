package typings
package tstlLib.baseContainerMultiTreeSetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- tstlLib.baseContainerUnderscoreITreeContainerMod._ITreeContainer because var conflicts: iterator. Inlined key_comp, value_comp, lower_bound, upper_bound, equal_range */ @JSImport("tstl/base/container/MultiTreeSet", "MultiTreeSet")
@js.native
abstract class MultiTreeSet[Key, Source /* <: MultiTreeSet[Key, Source, IteratorT, ReverseT] */, IteratorT /* <: tstlLib.baseIteratorISetIteratorMod.ISetIterator[Key, tstlLib.tstlLibNumbers.`false`, Source, IteratorT, ReverseT] */, ReverseT /* <: tstlLib.baseIteratorISetIteratorMod.ISetReverseIterator[Key, tstlLib.tstlLibNumbers.`false`, Source, IteratorT, ReverseT] */] ()
  extends tstlLib.baseContainerMultiSetMod.MultiSet[Key, Source, IteratorT, ReverseT] {
  /**
    * @inheritDoc
    */
  /**
    * Get range of equal elements.
    *
    * @param key Key to search for.
    * @return Pair of {@link lower_bound} and {@link upper_bound}.
    */
  def equal_range(key: Key): tstlLib.utilityPairMod.Pair[IteratorT, IteratorT] = js.native
  /**
    * @inheritDoc
    */
  /**
    * Get key comparison function.
    *
    * @return The key comparison function.
    */
  def key_comp(): js.Function2[/* x */ Key, /* y */ Key, scala.Boolean] = js.native
  /**
    * @inheritDoc
    */
  /**
    * Get iterator to lower bound.
    *
    * @param key Key to search for.
    * @return Iterator to the first element equal or after to the key.
    */
  def lower_bound(key: Key): IteratorT = js.native
  /**
    * @inheritDoc
    */
  /**
    * Get iterator to upper bound.
    *
    * @param key Key to search for.
    * @return Iterator to the first element after the key.
    */
  def upper_bound(key: Key): IteratorT = js.native
  /**
    * @inheritDoc
    */
  /**
    * Get value comparison function.
    *
    * @return The value comparison function.
    */
  def value_comp(): js.Function2[/* x */ Key, /* y */ Key, scala.Boolean] = js.native
}

