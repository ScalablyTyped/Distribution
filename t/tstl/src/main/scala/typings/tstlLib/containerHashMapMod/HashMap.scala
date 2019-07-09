package typings
package tstlLib.containerHashMapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- tstlLib.baseContainerIHashMapMod.IHashMap because Inheritance from two classes. Inlined begin, begin, end, end */ @JSImport("tstl/container/HashMap", "HashMap")
@js.native
/**
  * Default Constructor.
  *
  * @param hash An unary function returns hash code. Default is {hash}.
  * @param equal A binary function predicates two arguments are equal. Default is {@link equal_to}.
  */
class HashMap[Key, T] ()
  extends tstlLib.baseContainerUniqueMapMod.UniqueMap[
      Key, 
      T, 
      HashMap[Key, T], 
      tstlLib.containerHashMapMod.HashMapNs.Iterator[Key, T], 
      tstlLib.containerHashMapMod.HashMapNs.ReverseIterator[Key, T]
    ] {
  def this(hash: js.Function1[/* key */ Key, scala.Double]) = this()
  /**
    * Initializer Constructor.
    *
    * @param items Items to assign.
    * @param hash An unary function returns hash code. Default is {hash}.
    * @param equal A binary function predicates two arguments are equal. Default is {@link equal_to}.
    */
  def this(items: js.Array[tstlLib.utilityIPairMod.IPair[Key, T]]) = this()
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
  def this(first: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[
      tstlLib.utilityIPairMod.IPair[Key, T], 
      tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.utilityIPairMod.IPair[Key, T], _]
    ], last: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[
      tstlLib.utilityIPairMod.IPair[Key, T], 
      tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.utilityIPairMod.IPair[Key, T], _]
    ]) = this()
  def this(hash: js.Function1[/* key */ Key, scala.Double], equal: js.Function2[/* x */ Key, /* y */ Key, scala.Boolean]) = this()
  def this(items: js.Array[tstlLib.utilityIPairMod.IPair[Key, T]], hash: js.Function1[/* key */ Key, scala.Double]) = this()
  def this(first: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[
      tstlLib.utilityIPairMod.IPair[Key, T], 
      tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.utilityIPairMod.IPair[Key, T], _]
    ], last: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[
      tstlLib.utilityIPairMod.IPair[Key, T], 
      tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.utilityIPairMod.IPair[Key, T], _]
    ], hash: js.Function1[/* key */ Key, scala.Double]) = this()
  def this(items: js.Array[tstlLib.utilityIPairMod.IPair[Key, T]], hash: js.Function1[/* key */ Key, scala.Double], equal: js.Function2[/* x */ Key, /* y */ Key, scala.Boolean]) = this()
  def this(first: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[
      tstlLib.utilityIPairMod.IPair[Key, T], 
      tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.utilityIPairMod.IPair[Key, T], _]
    ], last: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[
      tstlLib.utilityIPairMod.IPair[Key, T], 
      tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.utilityIPairMod.IPair[Key, T], _]
    ], hash: js.Function1[/* key */ Key, scala.Double], equal: js.Function2[/* x */ Key, /* y */ Key, scala.Boolean]) = this()
  /**
    * @hidden
    */
  var buckets_ : js.Any = js.native
  /**
    * Iterator to the first element in a specific bucket.
    *
    * @param index Index number of the specific bucket.
    * @return Iterator from the specific bucket.
    */
  def begin(index: scala.Double): tstlLib.baseContainerMapElementListMod.MapElementListNs.Iterator[Key, T, tstlLib.tstlLibNumbers.`true`, HashMap[Key, T]] = js.native
  /**
    * @inheritDoc
    */
  @JSName("begin")
  def begin_Iterator(): tstlLib.containerHashMapMod.HashMapNs.Iterator[Key, T] = js.native
  /**
    * @inheritDoc
    */
  @JSName("begin")
  def begin_Iterator(index: scala.Double): tstlLib.containerHashMapMod.HashMapNs.Iterator[Key, T] = js.native
  /**
    * @inheritDoc
    */
  def bucket(key: Key): scala.Double = js.native
  /**
    * @inheritDoc
    */
  def bucket_count(): scala.Double = js.native
  /**
    * @inheritDoc
    */
  def bucket_size(index: scala.Double): scala.Double = js.native
  /**
    * Iterator to the end in a specific bucket.
    *
    * @param index Index number of the specific bucket.
    * @return Iterator from the specific bucket.
    */
  def end(index: scala.Double): tstlLib.baseContainerMapElementListMod.MapElementListNs.Iterator[Key, T, tstlLib.tstlLibNumbers.`true`, HashMap[Key, T]] = js.native
  /**
    * @inheritDoc
    */
  @JSName("end")
  def end_Iterator(): tstlLib.containerHashMapMod.HashMapNs.Iterator[Key, T] = js.native
  /**
    * @inheritDoc
    */
  @JSName("end")
  def end_Iterator(index: scala.Double): tstlLib.containerHashMapMod.HashMapNs.Iterator[Key, T] = js.native
  /**
    * @inheritDoc
    */
  def hash_function(): js.Function1[/* key */ Key, scala.Double] = js.native
  /**
    * @inheritDoc
    */
  def key_eq(): js.Function2[/* x */ Key, /* y */ Key, scala.Boolean] = js.native
  /**
    * @inheritDoc
    */
  def load_factor(): scala.Double = js.native
  /**
    * @inheritDoc
    */
  def max_load_factor(): scala.Double = js.native
  /**
    * @inheritDoc
    */
  def max_load_factor(z: scala.Double): scala.Unit = js.native
  /**
    * @inheritDoc
    */
  def rbegin(index: scala.Double): tstlLib.containerHashMapMod.HashMapNs.ReverseIterator[Key, T] = js.native
  /**
    * @inheritDoc
    */
  def rehash(n: scala.Double): scala.Unit = js.native
  /**
    * @inheritDoc
    */
  def rend(index: scala.Double): tstlLib.containerHashMapMod.HashMapNs.ReverseIterator[Key, T] = js.native
  /**
    * @inheritDoc
    */
  def reserve(n: scala.Double): scala.Unit = js.native
}

