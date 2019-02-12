package typings
package tstlLib.baseContainerITreeMapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- tstlLib.baseContainerUnderscoreITreeContainerMod._ITreeContainer because var conflicts: iterator. Inlined key_comp, value_comp, lower_bound, upper_bound, equal_range */ @js.native
trait ITreeMap[Key, T, Unique /* <: scala.Boolean */, Source /* <: ITreeMap[Key, T, Unique, Source] */]
  extends tstlLib.baseContainerMapContainerMod.MapContainer[Key, T, Unique, Source] {
  /**
    * Get range of equal elements.
    *
    * @param key Key to search for.
    * @return Pair of {@link lower_bound} and {@link upper_bound}.
    */
  def equal_range(key: Key): tstlLib.utilityPairMod.Pair[
    tstlLib.baseIteratorMapIteratorMod.MapIterator[Key, T, Unique, Source], 
    tstlLib.baseIteratorMapIteratorMod.MapIterator[Key, T, Unique, Source]
  ] = js.native
  /**
    * Get key comparison function.
    *
    * @return The key comparison function.
    */
  def key_comp(): js.Function2[Key, Key, scala.Boolean] = js.native
  /**
    * Get iterator to lower bound.
    *
    * @param key Key to search for.
    * @return Iterator to the first element equal or after to the key.
    */
  def lower_bound(key: Key): tstlLib.baseIteratorMapIteratorMod.MapIterator[Key, T, Unique, Source] = js.native
  /**
    * Get iterator to upper bound.
    *
    * @param key Key to search for.
    * @return Iterator to the first element after the key.
    */
  def upper_bound(key: Key): tstlLib.baseIteratorMapIteratorMod.MapIterator[Key, T, Unique, Source] = js.native
  /**
    * Get value comparison function.
    *
    * @return The value comparison function.
    */
  def value_comp(): js.Function2[
    tstlLib.utilityIPairMod.IPair[Key, T], 
    tstlLib.utilityIPairMod.IPair[Key, T], 
    scala.Boolean
  ] = js.native
}

