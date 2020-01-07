package typings.tstl

import typings.tstl.baseContainerMultiMapMod.MultiMap
import typings.tstl.containerHashMultiMapMod.HashMultiMap.Iterator
import typings.tstl.containerHashMultiMapMod.HashMultiMap.ReverseIterator
import typings.tstl.iteratorIForwardIteratorMod.IForwardIterator
import typings.tstl.utilityIPairMod.IPair
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/container/HashMultiMap", JSImport.Namespace)
@js.native
object containerHashMultiMapMod extends js.Object {
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.std.Iterable because Already inherited
  - typings.tstl.baseContainerIContainerMod.IContainer because Already inherited
  - typings.tstl.baseContainerContainerMod.Container because Inheritance from two classes. Inlined empty, rbegin, rend, toJSON
  - typings.tstl.baseContainerMapContainerMod.MapContainer because Inheritance from two classes. Inlined assign, clear, find, has, count, size, push, emplace, emplace_hint, insert, insert, insert, _Insert_by_range, erase, erase, erase, _Erase_by_key, _Erase_by_range, _Erase_by_range, swap, merge, _Handle_insert, _Handle_erase
  - typings.tstl.baseContainerIHashMapMod.IHashMap because Inheritance from two classes. Inlined begin, begin, end, end */ @js.native
  /**
    * Default Constructor.
    *
    * @param hash An unary function returns hash code. Default is {hash}.
    * @param equal A binary function predicates two arguments are equal. Default is {@link equal_to}.
    */
  class HashMultiMap[Key, T] () extends MultiMap[Key, T, HashMultiMap[Key, T], Iterator[Key, T], ReverseIterator[Key, T]] {
    def this(hash: js.Function1[/* key */ Key, Double]) = this()
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
    def this(obj: HashMultiMap[Key, T]) = this()
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
    def this(hash: js.Function1[/* key */ Key, Double], equal: js.Function2[/* x */ Key, /* y */ Key, Boolean]) = this()
    def this(items: js.Array[IPair[Key, T]], hash: js.Function1[/* key */ Key, Double]) = this()
    def this(
      first: IForwardIterator[IPair[Key, T], IForwardIterator[IPair[Key, T], _]],
      last: IForwardIterator[IPair[Key, T], IForwardIterator[IPair[Key, T], _]],
      hash: js.Function1[/* key */ Key, Double]
    ) = this()
    def this(
      items: js.Array[IPair[Key, T]],
      hash: js.Function1[/* key */ Key, Double],
      equal: js.Function2[/* x */ Key, /* y */ Key, Boolean]
    ) = this()
    def this(
      first: IForwardIterator[IPair[Key, T], IForwardIterator[IPair[Key, T], _]],
      last: IForwardIterator[IPair[Key, T], IForwardIterator[IPair[Key, T], _]],
      hash: js.Function1[/* key */ Key, Double],
      equal: js.Function2[/* x */ Key, /* y */ Key, Boolean]
    ) = this()
    /**
      * @hidden
      */
    var buckets_ : js.Any = js.native
    /**
      * @hidden
      */
    /* protected */ def _Handle_erase(
      first: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MapElementList.Iterator<Key, T, Unique, Source> */ js.Any) | (Iterator[Key, T]),
      last: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MapElementList.Iterator<Key, T, Unique, Source> */ js.Any) | (Iterator[Key, T])
    ): Unit = js.native
    /**
      * @hidden
      */
    /* protected */ def _Handle_insert(
      first: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MapElementList.Iterator<Key, T, Unique, Source> */ js.Any) | (Iterator[Key, T]),
      last: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MapElementList.Iterator<Key, T, Unique, Source> */ js.Any) | (Iterator[Key, T])
    ): Unit = js.native
    /**
      * @inheritDoc
      */
    def begin(index: Double): Iterator[Key, T] = js.native
    /**
      * @inheritDoc
      */
    @JSName("begin")
    def begin_Any(): js.Any = js.native
    /**
      * Iterator to the first element in a specific bucket.
      *
      * @param index Index number of the specific bucket.
      * @return Iterator from the specific bucket.
      */
    @JSName("begin")
    def begin_Any(index: Double): js.Any = js.native
    /**
      * @inheritDoc
      */
    def bucket(key: Key): Double = js.native
    /**
      * @inheritDoc
      */
    def bucket_count(): Double = js.native
    /**
      * @inheritDoc
      */
    def bucket_size(index: Double): Double = js.native
    /**
      * @inheritDoc
      */
    @JSName("emplace")
    def emplace_Iterator(key: Key, `val`: T): Iterator[Key, T] = js.native
    @JSName("emplace_hint")
    def emplace_hint_Any(
      hint: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MapElementList.Iterator<Key, T, Unique, Source> */ js.Any,
      key: Key,
      `val`: T
    ): /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MapElementList.Iterator<Key, T, Unique, Source> */ js.Any = js.native
    /**
      * @inheritDoc
      */
    def end(index: Double): Iterator[Key, T] = js.native
    /**
      * @inheritDoc
      */
    @JSName("end")
    def end_Any(): js.Any = js.native
    /**
      * Iterator to the end in a specific bucket.
      *
      * @param index Index number of the specific bucket.
      * @return Iterator from the specific bucket.
      */
    @JSName("end")
    def end_Any(index: Double): js.Any = js.native
    /**
      * @inheritDoc
      */
    def erase(key: Key): Double = js.native
    /**
      * @inheritDoc
      */
    @JSName("find")
    def find_Any(key: Key): /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MapElementList.Iterator<Key, T, Unique, Source> */ js.Any = js.native
    /**
      * @inheritDoc
      */
    def hash_function(): js.Function1[/* key */ Key, Double] = js.native
    /**
      * @inheritDoc
      */
    def key_eq(): js.Function2[/* x */ Key, /* y */ Key, Boolean] = js.native
    /**
      * @inheritDoc
      */
    def load_factor(): Double = js.native
    /**
      * @inheritDoc
      */
    def max_load_factor(): Double = js.native
    /**
      * @inheritDoc
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
    def rbegin_Any(): /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MapElementList.ReverseIterator<Key, T, Unique, Source> */ js.Any = js.native
    /**
      * @inheritDoc
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
    def rend_Any(): /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MapElementList.ReverseIterator<Key, T, Unique, Source> */ js.Any = js.native
    /**
      * @inheritDoc
      */
    def reserve(n: Double): Unit = js.native
  }
  
  @js.native
  /**
    * Default Constructor.
    *
    * @param hash An unary function returns hash code. Default is {hash}.
    * @param equal A binary function predicates two arguments are equal. Default is {@link equal_to}.
    */
  class unordered_multimap[Key, T] () extends HashMultiMap[Key, T] {
    def this(hash: js.Function1[/* key */ Key, Double]) = this()
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
    def this(obj: HashMultiMap[Key, T]) = this()
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
    def this(hash: js.Function1[/* key */ Key, Double], equal: js.Function2[/* x */ Key, /* y */ Key, Boolean]) = this()
    def this(items: js.Array[IPair[Key, T]], hash: js.Function1[/* key */ Key, Double]) = this()
    def this(
      first: IForwardIterator[IPair[Key, T], IForwardIterator[IPair[Key, T], _]],
      last: IForwardIterator[IPair[Key, T], IForwardIterator[IPair[Key, T], _]],
      hash: js.Function1[/* key */ Key, Double]
    ) = this()
    def this(
      items: js.Array[IPair[Key, T]],
      hash: js.Function1[/* key */ Key, Double],
      equal: js.Function2[/* x */ Key, /* y */ Key, Boolean]
    ) = this()
    def this(
      first: IForwardIterator[IPair[Key, T], IForwardIterator[IPair[Key, T], _]],
      last: IForwardIterator[IPair[Key, T], IForwardIterator[IPair[Key, T], _]],
      hash: js.Function1[/* key */ Key, Double],
      equal: js.Function2[/* x */ Key, /* y */ Key, Boolean]
    ) = this()
  }
  
  @js.native
  object HashMultiMap extends js.Object {
    val Iterator: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof MapElementList.Iterator */ js.Any = js.native
    val ReverseIterator: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof MapElementList.ReverseIterator */ js.Any = js.native
    val iterator: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof MapElementList.Iterator */ js.Any = js.native
    val reverse_iterator: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof MapElementList.ReverseIterator */ js.Any = js.native
    type Iterator[Key, T] = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MapElementList.Iterator<Key, T, false, HashMultiMap<Key, T>> */ js.Any
    type ReverseIterator[Key, T] = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MapElementList.ReverseIterator<Key, T, false, HashMultiMap<Key, T>> */ js.Any
    type iterator[Key, T] = typings.tstl.containerHashMultiMapMod.HashMultiMap.Iterator[Key, T]
    type reverse_iterator[Key, T] = typings.tstl.containerHashMultiMapMod.HashMultiMap.ReverseIterator[Key, T]
  }
  
  @js.native
  object unordered_multimap extends js.Object {
    val Iterator: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof MapElementList.Iterator */ js.Any = js.native
    val ReverseIterator: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof MapElementList.ReverseIterator */ js.Any = js.native
    val iterator: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof MapElementList.Iterator */ js.Any = js.native
    val reverse_iterator: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof MapElementList.ReverseIterator */ js.Any = js.native
  }
  
}

