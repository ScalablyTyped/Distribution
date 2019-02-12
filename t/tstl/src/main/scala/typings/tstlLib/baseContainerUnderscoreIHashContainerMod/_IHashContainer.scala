package typings
package tstlLib.baseContainerUnderscoreIHashContainerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait _IHashContainer[Key, T /* <: Elem */, SourceT /* <: _IHashContainer[Key, T, SourceT, IteratorT, ReverseIteratorT, Elem] */, IteratorT /* <: tstlLib.baseIteratorIteratorMod.Iterator[T, SourceT, IteratorT, ReverseIteratorT, Elem] */, ReverseIteratorT /* <: tstlLib.baseIteratorReverseIteratorMod.ReverseIterator[T, SourceT, IteratorT, ReverseIteratorT, Elem] */, Elem]
  extends tstlLib.baseContainerUnderscoreIAssociativeContainerMod._IAssociativeContainer[Key, T, SourceT, IteratorT, ReverseIteratorT, Elem] {
  /**
    * Compute bucket index for the *key*.
    *
    * @param key Target key.
    * @return Index number.
    */
  def bucket(key: Key): scala.Double = js.native
  /**
    * Get number of buckets.
    */
  def bucket_count(): scala.Double = js.native
  /**
    * Get size of a specific bucket.
    *
    * @param index Specific position.
    * @return Size of the specific bucket.
    */
  def bucket_size(index: scala.Double): scala.Double = js.native
  /**
    * Get hash function.
    *
    * @return The hash function.
    */
  def hash_function(): js.Function1[/* key */ Key, scala.Double] = js.native
  /**
    * Get key equality predicator.
    *
    * @return The key equality predicator.
    */
  def key_eq(): js.Function2[/* x */ Key, /* y */ Key, scala.Boolean] = js.native
  /**
    * Compute load factor.
    *
    * @return `this.size() / this.bucket_count()`
    */
  def load_factor(): scala.Double = js.native
  /**
    * Get maximum load factor that allowable.
    *
    * @return The maximum load factor.
    */
  def max_load_factor(): scala.Double = js.native
  /**
    * Set maximum load factor.
    *
    * @param z The new value to change.
    */
  def max_load_factor(z: scala.Double): scala.Unit = js.native
  /**
    * Change of bucktes.
    *
    * @param n The number to change.
    */
  def rehash(n: scala.Double): scala.Unit = js.native
  /**
    * Reserve buckets enable to store *n* elements.
    *
    * @param n The capacity to reserve.
    */
  def reserve(n: scala.Double): scala.Unit = js.native
}

