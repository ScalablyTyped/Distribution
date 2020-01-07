package typings.tstl

import typings.tstl.baseContainerSetContainerMod.SetContainer.InsertRet
import typings.tstl.baseContainerUniqueSetMod.UniqueSet
import typings.tstl.containerHashSetMod.HashSet.Iterator
import typings.tstl.containerHashSetMod.HashSet.ReverseIterator
import typings.tstl.iteratorIForwardIteratorMod.IForwardIterator
import typings.tstl.tstlBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/container/HashSet", JSImport.Namespace)
@js.native
object containerHashSetMod extends js.Object {
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.std.Iterable because Already inherited
  - typings.tstl.baseContainerIContainerMod.IContainer because Already inherited
  - typings.tstl.baseContainerContainerMod.Container because Inheritance from two classes. Inlined empty, rbegin, rend, toJSON
  - typings.tstl.baseContainerSetContainerMod.SetContainer because Inheritance from two classes. Inlined assign, clear, find, has, count, size, push, insert, insert, insert, _Insert_by_key, _Insert_by_hint, _Insert_by_range, erase, erase, erase, _Erase_by_val, _Erase_by_range, _Erase_by_range, swap, merge, _Handle_insert, _Handle_erase
  - typings.tstl.baseContainerIHashSetMod.IHashSet because Inheritance from two classes. Inlined begin, begin, end, end */ @js.native
  /**
    * Default Constructor.
    *
    * @param hash An unary function returns hash code. Default is {hash}.
    * @param equal A binary function predicates two arguments are equal. Default is {@link equal_to}.
    */
  class HashSet[Key] () extends UniqueSet[Key, HashSet[Key], Iterator[Key], ReverseIterator[Key]] {
    def this(hash: js.Function1[/* key */ Key, Double]) = this()
    /**
      * Initializer Constructor.
      *
      * @param items Items to assign.
      * @param hash An unary function returns hash code. Default is {hash}.
      * @param equal A binary function predicates two arguments are equal. Default is {@link equal_to}.
      */
    def this(items: js.Array[Key]) = this()
    /**
      * Copy Constructor.
      *
      * @param obj Object to copy.
      */
    def this(obj: HashSet[Key]) = this()
    /**
      * Range Constructor.
      *
      * @param first Input iterator of the first position.
      * @param last Input iterator of the last position.
      * @param hash An unary function returns hash code. Default is {hash}.
      * @param equal A binary function predicates two arguments are equal. Default is {@link equal_to}.
      */
    def this(
      first: IForwardIterator[Key, IForwardIterator[Key, _]],
      last: IForwardIterator[Key, IForwardIterator[Key, _]]
    ) = this()
    def this(hash: js.Function1[/* key */ Key, Double], equal: js.Function2[/* x */ Key, /* y */ Key, Boolean]) = this()
    def this(items: js.Array[Key], hash: js.Function1[/* key */ Key, Double]) = this()
    def this(
      first: IForwardIterator[Key, IForwardIterator[Key, _]],
      last: IForwardIterator[Key, IForwardIterator[Key, _]],
      hash: js.Function1[/* key */ Key, Double]
    ) = this()
    def this(
      items: js.Array[Key],
      hash: js.Function1[/* key */ Key, Double],
      equal: js.Function2[/* x */ Key, /* y */ Key, Boolean]
    ) = this()
    def this(
      first: IForwardIterator[Key, IForwardIterator[Key, _]],
      last: IForwardIterator[Key, IForwardIterator[Key, _]],
      hash: js.Function1[/* key */ Key, Double],
      equal: js.Function2[/* x */ Key, /* y */ Key, Boolean]
    ) = this()
    /**
      * @hidden
      */
    var buckets_ : /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify _SetHashBuckets<Key, true, HashSet<Key>> */ js.Any = js.native
    /**
      * @hidden
      */
    /* protected */ def _Handle_erase(
      first: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SetElementList.Iterator<Key, Unique, Source> */ js.Any) | Iterator[Key],
      last: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SetElementList.Iterator<Key, Unique, Source> */ js.Any) | Iterator[Key]
    ): Unit = js.native
    /**
      * @hidden
      */
    /* protected */ def _Handle_insert(
      first: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SetElementList.Iterator<Key, Unique, Source> */ js.Any) | Iterator[Key],
      last: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SetElementList.Iterator<Key, Unique, Source> */ js.Any) | Iterator[Key]
    ): Unit = js.native
    /**
      * @hidden
      */
    @JSName("_Insert_by_hint")
    /* protected */ def _Insert_by_hint_Iterator(hint: Iterator[Key], key: Key): Iterator[Key] = js.native
    /**
      * @hidden
      */
    @JSName("_Insert_by_key")
    /* protected */ def _Insert_by_key_InsertRet(key: Key): InsertRet[
        Key, 
        `true`, 
        HashSet[Key], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SetElementList.Iterator<Key, Unique, Source> */ js.Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SetElementList.ReverseIterator<Key, Unique, Source> */ js.Any
      ] = js.native
    /**
      * Iterator to the first element in a specific bucket.
      *
      * @param index Index number of the specific bucket.
      * @return Iterator from the specific bucket.
      */
    def begin(index: Double): js.Any = js.native
    /**
      * @inheritDoc
      */
    @JSName("begin")
    def begin_Iterator(): Iterator[Key] = js.native
    /**
      * @inheritDoc
      */
    @JSName("begin")
    def begin_Iterator(index: Double): Iterator[Key] = js.native
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
    def bucket_size(n: Double): Double = js.native
    /**
      * Iterator to the end in a specific bucket.
      *
      * @param index Index number of the specific bucket.
      * @return Iterator from the specific bucket.
      */
    def end(index: Double): js.Any = js.native
    /**
      * @inheritDoc
      */
    @JSName("end")
    def end_Iterator(): Iterator[Key] = js.native
    /**
      * @inheritDoc
      */
    @JSName("end")
    def end_Iterator(index: Double): Iterator[Key] = js.native
    /**
      * @inheritDoc
      */
    def erase(key: Key): Double = js.native
    /**
      * @inheritDoc
      */
    @JSName("find")
    def find_Iterator(key: Key): Iterator[Key] = js.native
    /**
      * @inheritDoc
      */
    def hash_function(): js.Function1[/* key */ Key, Double] = js.native
    def insert[InputIterator /* <: IForwardIterator[Key, InputIterator] */](first: InputIterator, last: InputIterator): Unit = js.native
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
    def rbegin(index: Double): ReverseIterator[Key] = js.native
    /**
      * @inheritDoc
      */
    @JSName("rbegin")
    def rbegin_ReverseIterator(): ReverseIterator[Key] = js.native
    /**
      * @inheritDoc
      */
    def rehash(n: Double): Unit = js.native
    /**
      * @inheritDoc
      */
    def rend(index: Double): ReverseIterator[Key] = js.native
    /**
      * @inheritDoc
      */
    @JSName("rend")
    def rend_ReverseIterator(): ReverseIterator[Key] = js.native
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
  class unordered_set[Key] () extends HashSet[Key] {
    def this(hash: js.Function1[/* key */ Key, Double]) = this()
    /**
      * Initializer Constructor.
      *
      * @param items Items to assign.
      * @param hash An unary function returns hash code. Default is {hash}.
      * @param equal A binary function predicates two arguments are equal. Default is {@link equal_to}.
      */
    def this(items: js.Array[Key]) = this()
    /**
      * Copy Constructor.
      *
      * @param obj Object to copy.
      */
    def this(obj: HashSet[Key]) = this()
    /**
      * Range Constructor.
      *
      * @param first Input iterator of the first position.
      * @param last Input iterator of the last position.
      * @param hash An unary function returns hash code. Default is {hash}.
      * @param equal A binary function predicates two arguments are equal. Default is {@link equal_to}.
      */
    def this(
      first: IForwardIterator[Key, IForwardIterator[Key, _]],
      last: IForwardIterator[Key, IForwardIterator[Key, _]]
    ) = this()
    def this(hash: js.Function1[/* key */ Key, Double], equal: js.Function2[/* x */ Key, /* y */ Key, Boolean]) = this()
    def this(items: js.Array[Key], hash: js.Function1[/* key */ Key, Double]) = this()
    def this(
      first: IForwardIterator[Key, IForwardIterator[Key, _]],
      last: IForwardIterator[Key, IForwardIterator[Key, _]],
      hash: js.Function1[/* key */ Key, Double]
    ) = this()
    def this(
      items: js.Array[Key],
      hash: js.Function1[/* key */ Key, Double],
      equal: js.Function2[/* x */ Key, /* y */ Key, Boolean]
    ) = this()
    def this(
      first: IForwardIterator[Key, IForwardIterator[Key, _]],
      last: IForwardIterator[Key, IForwardIterator[Key, _]],
      hash: js.Function1[/* key */ Key, Double],
      equal: js.Function2[/* x */ Key, /* y */ Key, Boolean]
    ) = this()
  }
  
  @js.native
  object HashSet extends js.Object {
    val Iterator: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SetElementList.Iterator */ js.Any = js.native
    val ReverseIterator: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SetElementList.ReverseIterator */ js.Any = js.native
    val iterator: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SetElementList.Iterator */ js.Any = js.native
    val reverse_iterator: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SetElementList.ReverseIterator */ js.Any = js.native
    type Iterator[Key] = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SetElementList.Iterator<Key, true, HashSet<Key>> */ js.Any
    type ReverseIterator[Key] = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SetElementList.ReverseIterator<Key, true, HashSet<Key>> */ js.Any
    type iterator[Key] = typings.tstl.containerHashSetMod.HashSet.Iterator[Key]
    type reverse_iterator[Key] = typings.tstl.containerHashSetMod.HashSet.ReverseIterator[Key]
  }
  
  @js.native
  object unordered_set extends js.Object {
    val Iterator: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SetElementList.Iterator */ js.Any = js.native
    val ReverseIterator: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SetElementList.ReverseIterator */ js.Any = js.native
    val iterator: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SetElementList.Iterator */ js.Any = js.native
    val reverse_iterator: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SetElementList.ReverseIterator */ js.Any = js.native
  }
  
}

