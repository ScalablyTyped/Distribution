package typings.tstl

import org.scalablytyped.runtime.Instantiable0
import typings.tstl.anon.Iteratoranyanyanyany
import typings.tstl.binaryPredicatorMod.BinaryPredicator
import typings.tstl.hashMapMod.HashMap.Iterator
import typings.tstl.hashMapMod.HashMap.ReverseIterator
import typings.tstl.hasherMod.Hasher
import typings.tstl.iforwarditeratorMod.IForwardIterator
import typings.tstl.ipairMod.IPair
import typings.tstl.mapContainerMod.MapContainer
import typings.tstl.mapContainerMod.MapContainer.InsertRet
import typings.tstl.tstlBooleans.`true`
import typings.tstl.uniqueMapMod.UniqueMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/container/HashMap", JSImport.Namespace)
@js.native
object hashMapMod extends js.Object {
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.tstl.isizeMod.ISize because Already inherited
  - typings.tstl.iforwardcontainerMod.IForwardContainer because Already inherited
  - typings.tstl.ipushMod.IPush because Already inherited
  - typings.tstl.iemptyMod.IEmpty because Already inherited
  - typings.std.Iterable because Already inherited
  - typings.tstl.ibidirectionalcontainerMod.IBidirectionalContainer because Already inherited
  - typings.tstl.icontainerMod.IContainer because Already inherited
  - typings.tstl.iassociativecontainerMod.IAssociativeContainer because Already inherited
  - typings.tstl.containerContainerMod.Container because Inheritance from two classes. Inlined empty, rbegin, rend, toJSON
  - typings.tstl.ihashcontainerMod.IHashContainer because var conflicts: iterator. Inlined hash_function, key_eq, bucket, bucket_count, bucket_size, load_factor, max_load_factor, max_load_factor, reserve, rehash
  - typings.tstl.mapContainerMod.MapContainer because Inheritance from two classes. Inlined assign, clear, find, has, count, size, push, emplace, emplace_hint, insert, insert, insert, _Insert_by_range, erase, erase, erase, _Erase_by_key, _Erase_by_range, _Erase_by_range, swap, merge, _Handle_insert, _Handle_erase
  - typings.tstl.ihashmapMod.IHashMap because Inheritance from two classes. Inlined begin, begin, end, end */ @js.native
  /**
    * Default Constructor.
    *
    * @param hash An unary function returns hash code. Default is {hash}.
    * @param equal A binary function predicates two arguments are equal. Default is {@link equal_to}.
    */
  class HashMap[Key, T] () extends UniqueMap[Key, T, HashMap[Key, T], Iterator[Key, T], ReverseIterator[Key, T]] {
    def this(hash: Hasher[Key]) = this()
    /**
      * Initializer Constructor.
      *
      * @param items Items to assign.
      * @param hash An unary function returns hash code. Default is {hash}.
      * @param equal A binary function predicates two arguments are equal. Default is {@link equal_to}.
      */
    def this(items: js.Array[IPair[Key, T]]) = this()
    /**
      * Copy Constructor.
      *
      * @param obj Object to copy.
      */
    def this(obj: HashMap[Key, T]) = this()
    /**
      * Range Constructor.
      *
      * @param first Input iterator of the first position.
      * @param last Input iterator of the last position.
      * @param hash An unary function returns hash code. Default is {hash}.
      * @param equal A binary function predicates two arguments are equal. Default is {@link equal_to}.
      */
    def this(
      first: IForwardIterator[IPair[Key, T], IForwardIterator[IPair[Key, T], _]],
      last: IForwardIterator[IPair[Key, T], IForwardIterator[IPair[Key, T], _]]
    ) = this()
    def this(hash: Hasher[Key], equal: BinaryPredicator[Key, Key]) = this()
    def this(items: js.Array[IPair[Key, T]], hash: Hasher[Key]) = this()
    def this(
      first: IForwardIterator[IPair[Key, T], IForwardIterator[IPair[Key, T], _]],
      last: IForwardIterator[IPair[Key, T], IForwardIterator[IPair[Key, T], _]],
      hash: Hasher[Key]
    ) = this()
    def this(items: js.Array[IPair[Key, T]], hash: Hasher[Key], equal: BinaryPredicator[Key, Key]) = this()
    def this(
      first: IForwardIterator[IPair[Key, T], IForwardIterator[IPair[Key, T], _]],
      last: IForwardIterator[IPair[Key, T], IForwardIterator[IPair[Key, T], _]],
      hash: Hasher[Key],
      equal: BinaryPredicator[Key, Key]
    ) = this()
    var buckets_ : js.Any = js.native
    /* protected */ def _Handle_erase(
      first: (Iterator[Key, T]) | (typings.tstl.ihashmapMod.IHashMap.Iterator[Key, T, `true`, HashMap[Key, T]]),
      last: (Iterator[Key, T]) | (typings.tstl.ihashmapMod.IHashMap.Iterator[Key, T, `true`, HashMap[Key, T]])
    ): Unit = js.native
    /* protected */ def _Handle_insert(
      first: (Iterator[Key, T]) | (typings.tstl.ihashmapMod.IHashMap.Iterator[Key, T, `true`, HashMap[Key, T]]),
      last: (Iterator[Key, T]) | (typings.tstl.ihashmapMod.IHashMap.Iterator[Key, T, `true`, HashMap[Key, T]])
    ): Unit = js.native
    /**
      * Iterator to the first element in a specific bucket.
      *
      * @param index Index number of the specific bucket.
      * @return Iterator from the specific bucket.
      */
    def begin(index: Double): typings.tstl.ihashmapMod.IHashMap.Iterator[Key, T, `true`, HashMap[Key, T]] = js.native
    /**
      * @inheritDoc
      */
    @JSName("begin")
    def begin_Iterator(): Iterator[Key, T] = js.native
    /**
      * @inheritDoc
      */
    @JSName("begin")
    def begin_Iterator(index: Double): Iterator[Key, T] = js.native
    /**
      * @inheritDoc
      */
    /**
      * Compute bucket index for the *key*.
      *
      * @param key Target key.
      * @return Index number.
      */
    def bucket(key: Key): Double = js.native
    /**
      * @inheritDoc
      */
    /**
      * Get number of buckets.
      */
    def bucket_count(): Double = js.native
    /**
      * @inheritDoc
      */
    /**
      * Get size of a specific bucket.
      *
      * @param index Specific position.
      * @return Size of the specific bucket.
      */
    def bucket_size(index: Double): Double = js.native
    @JSName("emplace")
    def emplace_InsertRet(key: Key, `val`: T): InsertRet[
        Key, 
        T, 
        `true`, 
        HashMap[Key, T], 
        typings.tstl.ihashmapMod.IHashMap.Iterator[Key, T, `true`, HashMap[Key, T]], 
        typings.tstl.ihashmapMod.IHashMap.ReverseIterator[Key, T, `true`, HashMap[Key, T]]
      ] = js.native
    /**
      * @inheritDoc
      */
    @JSName("emplace_hint")
    def emplace_hint_Iterator(hint: Iterator[Key, T], key: Key, `val`: T): Iterator[Key, T] = js.native
    /**
      * Iterator to the end in a specific bucket.
      *
      * @param index Index number of the specific bucket.
      * @return Iterator from the specific bucket.
      */
    def end(index: Double): typings.tstl.ihashmapMod.IHashMap.Iterator[Key, T, `true`, HashMap[Key, T]] = js.native
    /**
      * @inheritDoc
      */
    @JSName("end")
    def end_Iterator(): Iterator[Key, T] = js.native
    /**
      * @inheritDoc
      */
    @JSName("end")
    def end_Iterator(index: Double): Iterator[Key, T] = js.native
    /**
      * @inheritDoc
      */
    @JSName("find")
    def find_Iterator(key: Key): Iterator[Key, T] = js.native
    /**
      * @inheritDoc
      */
    /**
      * Get hash function.
      *
      * @return The hash function.
      */
    def hash_function(): Hasher[Key] = js.native
    /**
      * @inheritDoc
      */
    /**
      * Get key equality predicator.
      *
      * @return The key equality predicator.
      */
    def key_eq(): BinaryPredicator[Key, Key] = js.native
    /**
      * @inheritDoc
      */
    /**
      * Compute load factor.
      *
      * @return `this.size() / this.bucket_count()`
      */
    def load_factor(): Double = js.native
    /**
      * @inheritDoc
      */
    /**
      * Get maximum load factor that allowable.
      *
      * @return The maximum load factor.
      */
    def max_load_factor(): Double = js.native
    /**
      * @inheritDoc
      */
    /**
      * Set maximum load factor.
      *
      * @param z The new value to change.
      */
    def max_load_factor(z: Double): Unit = js.native
    /**
      * @inheritDoc
      */
    def rbegin(index: Double): ReverseIterator[Key, T] = js.native
    /**
      * @inheritDoc
      */
    @JSName("rbegin")
    def rbegin_ReverseIterator(): typings.tstl.ihashmapMod.IHashMap.ReverseIterator[Key, T, `true`, HashMap[Key, T]] = js.native
    /**
      * @inheritDoc
      */
    /**
      * Change of bucktes.
      *
      * @param n The number to change.
      */
    def rehash(n: Double): Unit = js.native
    /**
      * @inheritDoc
      */
    def rend(index: Double): ReverseIterator[Key, T] = js.native
    /**
      * @inheritDoc
      */
    @JSName("rend")
    def rend_ReverseIterator(): typings.tstl.ihashmapMod.IHashMap.ReverseIterator[Key, T, `true`, HashMap[Key, T]] = js.native
    /**
      * @inheritDoc
      */
    /**
      * Reserve buckets enable to store *n* elements.
      *
      * @param n The capacity to reserve.
      */
    def reserve(n: Double): Unit = js.native
  }
  
  @js.native
  object HashMap extends js.Object {
    val Iterator: Instantiable0[
        typings.tstl.mapElementListMod.MapElementList.Iterator[
          js.Object, 
          js.Object, 
          Boolean, 
          MapContainer[
            /* import warning: RewrittenClass.unapply cls was tparam Key */ js.Any, 
            /* import warning: RewrittenClass.unapply cls was tparam T */ js.Any, 
            /* import warning: RewrittenClass.unapply cls was tparam Unique */ js.Any, 
            /* import warning: RewrittenClass.unapply cls was tparam Source */ js.Any, 
            Iteratoranyanyanyany, 
            typings.tstl.mapElementListMod.MapElementList.ReverseIterator[
              /* import warning: RewrittenClass.unapply cls was tparam Key */ js.Any, 
              /* import warning: RewrittenClass.unapply cls was tparam T */ js.Any, 
              /* import warning: RewrittenClass.unapply cls was tparam Unique */ js.Any, 
              /* import warning: RewrittenClass.unapply cls was tparam Source */ js.Any
            ]
          ]
        ]
      ] = js.native
    val ReverseIterator: Instantiable0[
        typings.tstl.mapElementListMod.MapElementList.ReverseIterator[
          js.Object, 
          js.Object, 
          Boolean, 
          MapContainer[
            /* import warning: RewrittenClass.unapply cls was tparam Key */ js.Any, 
            /* import warning: RewrittenClass.unapply cls was tparam T */ js.Any, 
            /* import warning: RewrittenClass.unapply cls was tparam Unique */ js.Any, 
            /* import warning: RewrittenClass.unapply cls was tparam Source */ js.Any, 
            Iteratoranyanyanyany, 
            typings.tstl.mapElementListMod.MapElementList.ReverseIterator[
              /* import warning: RewrittenClass.unapply cls was tparam Key */ js.Any, 
              /* import warning: RewrittenClass.unapply cls was tparam T */ js.Any, 
              /* import warning: RewrittenClass.unapply cls was tparam Unique */ js.Any, 
              /* import warning: RewrittenClass.unapply cls was tparam Source */ js.Any
            ]
          ]
        ]
      ] = js.native
    /**
      * Iterator of {@link HashMap}
      */
    type Iterator[Key, T] = typings.tstl.mapElementListMod.MapElementList.Iterator[Key, T, `true`, HashMap[Key, T]]
    /**
      * Reverse iterator of {@link HashMap}
      */
    type ReverseIterator[Key, T] = typings.tstl.mapElementListMod.MapElementList.ReverseIterator[Key, T, `true`, HashMap[Key, T]]
  }
  
}

