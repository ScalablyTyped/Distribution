package typings
package tstlLib.containerForwardListMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/container/ForwardList", "ForwardList")
@js.native
/**
  * Default Constructor.
  */
class ForwardList[T] ()
  extends tstlLib.baseContainerIDequeContainerMod._IDeque[T]
     with tstlLib.baseDisposableIForwardContainerMod.IForwardContainer[tstlLib.containerForwardListMod.ForwardListNs.Iterator[T]]
     with tstlLib.baseDisposableIPartialContainersMod._IClear
     with tstlLib.baseDisposableIPartialContainersMod._IEmpty
     with tstlLib.baseDisposableIPartialContainersMod._ISize
     with tstlLib.baseContainerILinearContainerMod._IFront[T]
     with stdLib.Iterable[T]
     with tstlLib.baseDisposableIListAlgorithmMod._IListAlgorithm[T, ForwardList[T]] {
  /**
    * Initializer Constructor.
    *
    * @param items Items to assign.
    */
  def this(items: js.Array[T]) = this()
  /**
    * Copy Constructor
    *
    * @param obj Object to copy.
    */
  def this(obj: ForwardList[T]) = this()
  /**
    * Range Constructor.
    *
    * @param first Input iterator of the first position.
    * @param last Input iterator of the last position.
    */
  def this(first: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, _]], last: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, _]]) = this()
  /**
    * Fill Constructor.
    *
    * @param size Initial size.
    * @param val Value to fill.
    */
  def this(n: scala.Double, `val`: T) = this()
  /**
    * @hidden
    */
  var _Insert_by_range: js.Any = js.native
  /**
    * @hidden
    */
  var _Insert_by_repeating_val: js.Any = js.native
  /**
    * @hidden
    */
  var before_begin_ : js.Any = js.native
  /**
    * @hidden
    */
  var end_ : js.Any = js.native
  /**
    * @inheritDoc
    */
  @JSName(scala.scalajs.js.Symbol.iterator)
  var iterator_ForwardList: js.Function0[stdLib.IterableIterator[T]] = js.native
  /**
    * @hidden
    */
  var ptr_ : js.Any = js.native
  /**
    * @hidden
    */
  var size_ : js.Any = js.native
  /**
    * Fill Assigner.
    *
    * @param n Initial size.
    * @param val Value to fill.
    */
  def assign(n: scala.Double, `val`: T): scala.Unit = js.native
  /**
    * Range Assigner.
    *
    * @param first Input iteartor of the first position.
    * @param last Input iterator of the last position.
    */
  def assign[T, InputIterator /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, InputIterator] */](first: InputIterator, last: InputIterator): scala.Unit = js.native
  /**
    * Iterator to before beginning.
    *
    * @return Iterator to the before beginning.
    */
  def before_begin(): tstlLib.containerForwardListMod.ForwardListNs.Iterator[T] = js.native
  /**
    * Iterator to the first element.
    *
    * @return Iterator to the first element.
    */
  /* CompleteClass */
  override def begin(): tstlLib.containerForwardListMod.ForwardListNs.Iterator[T] = js.native
  /**
    * Clear elements.
    */
  /* CompleteClass */
  override def clear(): scala.Unit = js.native
  /**
    * Test whether container is empty.
    */
  /* CompleteClass */
  override def empty(): scala.Boolean = js.native
  /**
    * Iterator to the end.
    *
    * @return Iterator to the end.
    */
  /* CompleteClass */
  override def end(): tstlLib.containerForwardListMod.ForwardListNs.Iterator[T] = js.native
  /**
    * Erase elements.
    *
    * @param first Range of the first position to erase after.
    * @param last Rangee of the last position to erase.
    * @return Iterator to the last removed element.
    */
  def erase_after(
    first: tstlLib.containerForwardListMod.ForwardListNs.Iterator[T],
    last: tstlLib.containerForwardListMod.ForwardListNs.Iterator[T]
  ): tstlLib.containerForwardListMod.ForwardListNs.Iterator[T] = js.native
  /**
    * Erase an element.
    *
    * @param it Position to erase after.
    * @return Iterator to the erased element.
    */
  def erase_after(it: tstlLib.containerForwardListMod.ForwardListNs.Iterator[T]): tstlLib.containerForwardListMod.ForwardListNs.Iterator[T] = js.native
  /**
    * Inserted repeated elements.
    *
    * @param pos Position to insert after.
    * @param n Number of elements to insert.
    * @param val Value to insert repeatedly.
    * @return An iterator to the last of the newly inserted elements.
    */
  def insert_after(pos: tstlLib.containerForwardListMod.ForwardListNs.Iterator[T], n: scala.Double, `val`: T): tstlLib.containerForwardListMod.ForwardListNs.Iterator[T] = js.native
  /**
    * Insert an element.
    *
    * @param pos Position to insert after.
    * @param val Value to insert.
    * @return An iterator to the newly inserted element.
    */
  def insert_after(pos: tstlLib.containerForwardListMod.ForwardListNs.Iterator[T], `val`: T): tstlLib.containerForwardListMod.ForwardListNs.Iterator[T] = js.native
  /**
    * Insert range elements.
    *
    * @param pos Position to insert after.
    * @param first Input iterator of the first position.
    * @param last Input iteartor of the last position.
    * @return An iterator to the last of the newly inserted elements.
    */
  def insert_after[T, InputIterator /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, InputIterator] */](
    pos: tstlLib.containerForwardListMod.ForwardListNs.Iterator[T],
    first: InputIterator,
    last: InputIterator
  ): tstlLib.containerForwardListMod.ForwardListNs.Iterator[T] = js.native
  /**
    * Erase the first element.
    */
  /* CompleteClass */
  override def pop_front(): scala.Unit = js.native
  /**
    * Insert an element at the first.
    *
    * @param val Value to insert.
    */
  /* CompleteClass */
  override def push_front(`val`: T): scala.Unit = js.native
  /**
    * Number of elements in the container.
    */
  /* CompleteClass */
  override def size(): scala.Double = js.native
  /**
    * Transfer elements.
    *
    * @param pos Position to insert after.
    * @param from Target container to transfer.
    */
  def splice_after(pos: tstlLib.containerForwardListMod.ForwardListNs.Iterator[T], from: ForwardList[T]): scala.Unit = js.native
  /**
    * Transfer a single element.
    *
    * @param pos Position to insert after.
    * @param from Target container to transfer.
    * @param before Previous position of the single element to transfer.
    */
  def splice_after(
    pos: tstlLib.containerForwardListMod.ForwardListNs.Iterator[T],
    from: ForwardList[T],
    before: tstlLib.containerForwardListMod.ForwardListNs.Iterator[T]
  ): scala.Unit = js.native
  /**
    * Transfer range elements.
    *
    * @param pos Position to insert after.
    * @param from Target container to transfer.
    * @param first Range of previous of the first position to transfer.
    * @param last Rangee of the last position to transfer.
    */
  def splice_after(
    pos: tstlLib.containerForwardListMod.ForwardListNs.Iterator[T],
    from: ForwardList[T],
    first_before: tstlLib.containerForwardListMod.ForwardListNs.Iterator[T],
    last: tstlLib.containerForwardListMod.ForwardListNs.Iterator[T]
  ): scala.Unit = js.native
  /**
    * Native function for `JSON.stringify()`.
    *
    * @return An array containing children elements.
    */
  def toJSON(): js.Array[T] = js.native
}

