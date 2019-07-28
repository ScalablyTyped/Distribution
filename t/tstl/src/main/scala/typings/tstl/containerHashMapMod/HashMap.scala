package typings.tstl.containerHashMapMod

import typings.tstl.baseContainerUniqueMapMod.UniqueMap
import typings.tstl.containerHashMapMod.HashMapNs.Iterator
import typings.tstl.containerHashMapMod.HashMapNs.ReverseIterator
import typings.tstl.iteratorIForwardIteratorMod.IForwardIterator
import typings.tstl.tstlNumbers.`true`
import typings.tstl.utilityIPairMod.IPair
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.tstl.baseContainerIHashMapMod.IHashMap because Inheritance from two classes. Inlined begin, begin, end, end */ @JSImport("tstl/container/HashMap", "HashMap")
@js.native
/**
  * Default Constructor.
  *
  * @param hash An unary function returns hash code. Default is {hash}.
  * @param equal A binary function predicates two arguments are equal. Default is {@link equal_to}.
  */
class HashMap[Key, T] () extends UniqueMap[Key, T, HashMap[Key, T], Iterator[Key, T], ReverseIterator[Key, T]] {
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
    * @inheritDoc
    */
  def begin(index: Double): Iterator[Key, T] = js.native
  /**
    * @inheritDoc
    */
  @JSName("begin")
  def begin_Iterator(): typings.tstl.baseContainerMapElementListMod.MapElementListNs.Iterator[Key, T, `true`, HashMap[Key, T]] = js.native
  /**
    * Iterator to the first element in a specific bucket.
    *
    * @param index Index number of the specific bucket.
    * @return Iterator from the specific bucket.
    */
  @JSName("begin")
  def begin_Iterator(index: Double): typings.tstl.baseContainerMapElementListMod.MapElementListNs.Iterator[Key, T, `true`, HashMap[Key, T]] = js.native
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
  def end(index: Double): Iterator[Key, T] = js.native
  /**
    * @inheritDoc
    */
  @JSName("end")
  def end_Iterator(): typings.tstl.baseContainerMapElementListMod.MapElementListNs.Iterator[Key, T, `true`, HashMap[Key, T]] = js.native
  /**
    * Iterator to the end in a specific bucket.
    *
    * @param index Index number of the specific bucket.
    * @return Iterator from the specific bucket.
    */
  @JSName("end")
  def end_Iterator(index: Double): typings.tstl.baseContainerMapElementListMod.MapElementListNs.Iterator[Key, T, `true`, HashMap[Key, T]] = js.native
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
  def rehash(n: Double): Unit = js.native
  /**
    * @inheritDoc
    */
  def rend(index: Double): ReverseIterator[Key, T] = js.native
  /**
    * @inheritDoc
    */
  def reserve(n: Double): Unit = js.native
}

