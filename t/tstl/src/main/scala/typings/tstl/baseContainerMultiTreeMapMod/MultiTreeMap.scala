package typings.tstl.baseContainerMultiTreeMapMod

import typings.tstl.baseContainerMultiMapMod.MultiMap
import typings.tstl.baseIteratorIMapIteratorMod.IMapIterator
import typings.tstl.baseIteratorIMapIteratorMod.IMapReverseIterator
import typings.tstl.tstlNumbers.`false`
import typings.tstl.utilityIPairMod.IPair
import typings.tstl.utilityPairMod.Pair
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.tstl.baseContainerUnderscoreITreeContainerMod._ITreeContainer because var conflicts: iterator. Inlined key_comp, value_comp, lower_bound, upper_bound, equal_range */ @JSImport("tstl/base/container/MultiTreeMap", "MultiTreeMap")
@js.native
abstract class MultiTreeMap[Key, T, Source /* <: MultiTreeMap[Key, T, Source, IteratorT, ReverseT] */, IteratorT /* <: IMapIterator[Key, T, `false`, Source, IteratorT, ReverseT] */, ReverseT /* <: IMapReverseIterator[Key, T, `false`, Source, IteratorT, ReverseT] */] () extends MultiMap[Key, T, Source, IteratorT, ReverseT] {
  /**
    * @inheritDoc
    */
  /**
    * Get range of equal elements.
    *
    * @param key Key to search for.
    * @return Pair of {@link lower_bound} and {@link upper_bound}.
    */
  def equal_range(key: Key): Pair[IteratorT, IteratorT] = js.native
  /**
    * @inheritDoc
    */
  /**
    * Get key comparison function.
    *
    * @return The key comparison function.
    */
  def key_comp(): js.Function2[/* x */ Key, /* y */ Key, Boolean] = js.native
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
  def value_comp(): js.Function2[/* x */ IPair[Key, T], /* y */ IPair[Key, T], Boolean] = js.native
}

