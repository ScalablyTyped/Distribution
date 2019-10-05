package typings.tstl

import typings.tstl.baseContainerIHashMapMod.IHashMap
import typings.tstl.baseContainerMapContainerMod.MapContainer
import typings.tstl.baseContainerMapElementListMod.MapElementList.Iterator
import typings.tstl.baseContainerMapElementListMod.MapElementList.ReverseIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/base/container/IHashMap", JSImport.Namespace)
@js.native
object baseContainerIHashMapMod extends js.Object {
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.tstl.baseDisposableIForwardContainerMod.IForwardContainer because Already inherited
  - typings.tstl.baseDisposableIPartialContainersMod._IPush because Already inherited
  - typings.tstl.baseDisposableIPartialContainersMod._ISize because Already inherited
  - typings.tstl.baseDisposableIPartialContainersMod._IEmpty because Already inherited
  - typings.std.Iterable because Already inherited
  - typings.tstl.baseDisposableIBidirectionalContainerMod.IBidirectionalContainer because Already inherited
  - typings.tstl.baseContainerIContainerMod.IContainer because Already inherited
  - typings.tstl.baseContainerUnderscoreIAssociativeContainerMod._IAssociativeContainer because Already inherited
  - typings.tstl.baseContainerUnderscoreIHashContainerMod._IHashContainer because var conflicts: iterator. Inlined hash_function, key_eq, bucket, bucket_count, bucket_size, load_factor, max_load_factor, max_load_factor, reserve, rehash */ @js.native
  trait IHashMap[Key, T, Unique /* <: Boolean */, Source /* <: IHashMap[Key, T, Unique, Source] */] extends MapContainer[
          Key, 
          T, 
          Unique, 
          Source, 
          Iterator[Key, T, Unique, Source], 
          ReverseIterator[Key, T, Unique, Source]
        ] {
    /**
      * Iterator to the first element in a specific bucket.
      *
      * @param index Index number of the specific bucket.
      * @return Iterator from the specific bucket.
      */
    def begin(index: Double): Iterator[Key, T, Unique, Source] = js.native
    /**
      * Compute bucket index for the *key*.
      *
      * @param key Target key.
      * @return Index number.
      */
    def bucket(key: Key): Double = js.native
    /**
      * Get number of buckets.
      */
    def bucket_count(): Double = js.native
    /**
      * Get size of a specific bucket.
      *
      * @param index Specific position.
      * @return Size of the specific bucket.
      */
    def bucket_size(index: Double): Double = js.native
    /**
      * Iterator to the end in a specific bucket.
      *
      * @param index Index number of the specific bucket.
      * @return Iterator from the specific bucket.
      */
    def end(index: Double): Iterator[Key, T, Unique, Source] = js.native
    /**
      * Get hash function.
      *
      * @return The hash function.
      */
    def hash_function(): js.Function1[Key, Double] = js.native
    /**
      * Get key equality predicator.
      *
      * @return The key equality predicator.
      */
    def key_eq(): js.Function2[Key, Key, Boolean] = js.native
    /**
      * Compute load factor.
      *
      * @return `this.size() / this.bucket_count()`
      */
    def load_factor(): Double = js.native
    /**
      * Get maximum load factor that allowable.
      *
      * @return The maximum load factor.
      */
    def max_load_factor(): Double = js.native
    /**
      * Set maximum load factor.
      *
      * @param z The new value to change.
      */
    def max_load_factor(z: Double): Unit = js.native
    /**
      * Change of bucktes.
      *
      * @param n The number to change.
      */
    def rehash(n: Double): Unit = js.native
    /**
      * Reserve buckets enable to store *n* elements.
      *
      * @param n The capacity to reserve.
      */
    def reserve(n: Double): Unit = js.native
  }
  
}

