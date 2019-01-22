package typings
package tstlLib.baseContainerUnderscoreITreeContainerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _ITreeContainer[Key, Iterator] extends js.Object {
  /**
    * Get range of equal elements.
    *
    * @param key Key to search for.
    * @return Pair of {@link lower_bound} and {@link upper_bound}.
    */
  def equal_range(key: Key): tstlLib.utilityPairMod.Pair[Iterator, Iterator]
  /**
    * Get key comparison function.
    *
    * @return The key comparison function.
    */
  def key_comp(): js.Function2[/* x */ Key, /* y */ Key, scala.Boolean]
  /**
    * Get iterator to lower bound.
    *
    * @param key Key to search for.
    * @return Iterator to the first element equal or after to the key.
    */
  def lower_bound(key: Key): Iterator
  /**
    * Get iterator to upper bound.
    *
    * @param key Key to search for.
    * @return Iterator to the first element after the key.
    */
  def upper_bound(key: Key): Iterator
}

