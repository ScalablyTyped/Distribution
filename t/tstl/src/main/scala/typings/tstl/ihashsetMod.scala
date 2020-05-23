package typings.tstl

import typings.tstl.binaryPredicatorMod.BinaryPredicator
import typings.tstl.hasherMod.Hasher
import typings.tstl.ihashsetMod.IHashSet.Iterator
import typings.tstl.ihashsetMod.IHashSet.ReverseIterator
import typings.tstl.setContainerMod.SetContainer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/base/container/IHashSet", JSImport.Namespace)
@js.native
object ihashsetMod extends js.Object {
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.tstl.isizeMod.ISize because Already inherited
  - typings.tstl.iforwardcontainerMod.IForwardContainer because Already inherited
  - typings.tstl.ipushMod.IPush because Already inherited
  - typings.tstl.iemptyMod.IEmpty because Already inherited
  - typings.std.Iterable because Already inherited
  - typings.tstl.ibidirectionalcontainerMod.IBidirectionalContainer because Already inherited
  - typings.tstl.icontainerMod.IContainer because Already inherited
  - typings.tstl.iassociativecontainerMod.IAssociativeContainer because Already inherited
  - typings.tstl.ihashcontainerMod.IHashContainer because var conflicts: iterator. Inlined hash_function, key_eq, bucket, bucket_count, bucket_size, load_factor, max_load_factor, max_load_factor, reserve, rehash */ @js.native
  trait IHashSet[Key, Unique /* <: Boolean */, Source /* <: IHashSet[Key, Unique, Source] */] extends SetContainer[Key, Unique, Source, Iterator[Key, Unique, Source], ReverseIterator[Key, Unique, Source]] {
    /**
      * Iterator to the first element in a specific bucket.
      *
      * @param index Index number of the specific bucket.
      * @return Iterator from the specific bucket.
      */
    def begin(index: Double): Iterator[Key, Unique, Source] = js.native
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
    def end(index: Double): Iterator[Key, Unique, Source] = js.native
    /**
      * Get hash function.
      *
      * @return The hash function.
      */
    def hash_function(): Hasher[Key] = js.native
    /**
      * Get key equality predicator.
      *
      * @return The key equality predicator.
      */
    def key_eq(): BinaryPredicator[Key, Key] = js.native
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
  
  @js.native
  object IHashSet extends js.Object {
    /**
      * Iterator of {@link IHashSet}
      *
      * @author Jenogho Nam <http://samchon.org>
      */
    type Iterator[Key, Unique /* <: Boolean */, Source /* <: IHashSet[Key, Unique, Source] */] = typings.tstl.setElementListMod.SetElementList.Iterator[Key, Unique, Source]
    /**
      * Reverse iterator of {@link IHashSet}
      *
      * @author Jenogho Nam <http://samchon.org>
      */
    type ReverseIterator[Key, Unique /* <: Boolean */, Source /* <: IHashSet[Key, Unique, Source] */] = typings.tstl.setElementListMod.SetElementList.ReverseIterator[Key, Unique, Source]
  }
  
}

