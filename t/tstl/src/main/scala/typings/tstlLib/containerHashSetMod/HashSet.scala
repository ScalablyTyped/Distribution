package typings
package tstlLib.containerHashSetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- tstlLib.baseContainerIHashSetMod.IHashSet because var conflicts: data_, iterator. Inlined  */ @JSImport("tstl/container/HashSet", "HashSet")
@js.native
/**
  * Default Constructor.
  *
  * @param hash An unary function returns hash code. Default is {hash}.
  * @param equal A binary function predicates two arguments are equal. Default is {@link equal_to}.
  */
class HashSet[Key] ()
  extends tstlLib.baseContainerUniqueSetMod.UniqueSet[Key, HashSet[Key]] {
  def this(hash: js.Function1[/* key */ Key, scala.Double]) = this()
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
  def this(first: stdLib.Readonly[
      tstlLib.iteratorIForwardIteratorMod.IForwardIterator[Key, tstlLib.iteratorIForwardIteratorMod.IForwardIterator[Key, _]]
    ], last: stdLib.Readonly[
      tstlLib.iteratorIForwardIteratorMod.IForwardIterator[Key, tstlLib.iteratorIForwardIteratorMod.IForwardIterator[Key, _]]
    ]) = this()
  def this(hash: js.Function1[/* key */ Key, scala.Double], equal: js.Function2[/* x */ Key, /* y */ Key, scala.Boolean]) = this()
  def this(items: js.Array[Key], hash: js.Function1[/* key */ Key, scala.Double]) = this()
  def this(first: stdLib.Readonly[
      tstlLib.iteratorIForwardIteratorMod.IForwardIterator[Key, tstlLib.iteratorIForwardIteratorMod.IForwardIterator[Key, _]]
    ], last: stdLib.Readonly[
      tstlLib.iteratorIForwardIteratorMod.IForwardIterator[Key, tstlLib.iteratorIForwardIteratorMod.IForwardIterator[Key, _]]
    ], hash: js.Function1[/* key */ Key, scala.Double]) = this()
  def this(items: js.Array[Key], hash: js.Function1[/* key */ Key, scala.Double], equal: js.Function2[/* x */ Key, /* y */ Key, scala.Boolean]) = this()
  def this(first: stdLib.Readonly[
      tstlLib.iteratorIForwardIteratorMod.IForwardIterator[Key, tstlLib.iteratorIForwardIteratorMod.IForwardIterator[Key, _]]
    ], last: stdLib.Readonly[
      tstlLib.iteratorIForwardIteratorMod.IForwardIterator[Key, tstlLib.iteratorIForwardIteratorMod.IForwardIterator[Key, _]]
    ], hash: js.Function1[/* key */ Key, scala.Double], equal: js.Function2[/* x */ Key, /* y */ Key, scala.Boolean]) = this()
  /**
    * @hidden
    */
  var buckets_ : tstlLib.baseHashUnderscoreSetHashBucketsMod._SetHashBuckets[Key, tstlLib.tstlLibNumbers.`true`, HashSet[Key]] = js.native
  /**
    * @inheritDoc
    */
  def begin(index: scala.Double): tstlLib.containerHashSetMod.HashSetNs.Iterator[Key] = js.native
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
  def bucket_size(n: scala.Double): scala.Double = js.native
  /**
    * @inheritDoc
    */
  def end(index: scala.Double): tstlLib.containerHashSetMod.HashSetNs.Iterator[Key] = js.native
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
  def rbegin(index: scala.Double): tstlLib.containerHashSetMod.HashSetNs.ReverseIterator[Key] = js.native
  /**
    * @inheritDoc
    */
  def rehash(n: scala.Double): scala.Unit = js.native
  /**
    * @inheritDoc
    */
  def rend(index: scala.Double): tstlLib.containerHashSetMod.HashSetNs.ReverseIterator[Key] = js.native
  /**
    * @inheritDoc
    */
  def reserve(n: scala.Double): scala.Unit = js.native
}

