package typings.tstl.containerHashSetMod

import typings.tstl.baseContainerUniqueSetMod.UniqueSet
import typings.tstl.baseHashUnderscoreSetHashBucketsMod._SetHashBuckets
import typings.tstl.containerHashSetMod.HashSetNs.Iterator
import typings.tstl.containerHashSetMod.HashSetNs.ReverseIterator
import typings.tstl.iteratorIForwardIteratorMod.IForwardIterator
import typings.tstl.tstlNumbers.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.tstl.baseContainerIHashSetMod.IHashSet because Inheritance from two classes. Inlined begin, begin, end, end */ @JSImport("tstl/container/HashSet", "HashSet")
@js.native
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
  var buckets_ : _SetHashBuckets[Key, `true`, HashSet[Key]] = js.native
  /**
    * @inheritDoc
    */
  def begin(index: Double): Iterator[Key] = js.native
  /**
    * @inheritDoc
    */
  @JSName("begin")
  def begin_Iterator(): typings.tstl.baseContainerSetElementListMod.SetElementListNs.Iterator[Key, `true`, HashSet[Key]] = js.native
  /**
    * Iterator to the first element in a specific bucket.
    *
    * @param index Index number of the specific bucket.
    * @return Iterator from the specific bucket.
    */
  @JSName("begin")
  def begin_Iterator(index: Double): typings.tstl.baseContainerSetElementListMod.SetElementListNs.Iterator[Key, `true`, HashSet[Key]] = js.native
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
    * @inheritDoc
    */
  def end(index: Double): Iterator[Key] = js.native
  /**
    * @inheritDoc
    */
  @JSName("end")
  def end_Iterator(): typings.tstl.baseContainerSetElementListMod.SetElementListNs.Iterator[Key, `true`, HashSet[Key]] = js.native
  /**
    * Iterator to the end in a specific bucket.
    *
    * @param index Index number of the specific bucket.
    * @return Iterator from the specific bucket.
    */
  @JSName("end")
  def end_Iterator(index: Double): typings.tstl.baseContainerSetElementListMod.SetElementListNs.Iterator[Key, `true`, HashSet[Key]] = js.native
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
  def rbegin(index: Double): ReverseIterator[Key] = js.native
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
  def reserve(n: Double): Unit = js.native
}

