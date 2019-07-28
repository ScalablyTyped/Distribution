package typings.tstl.containerForwardListMod

import typings.std.Iterable
import typings.std.IterableIterator
import typings.tstl.baseContainerIDequeContainerMod._IDeque
import typings.tstl.baseContainerILinearContainerMod._IFront
import typings.tstl.baseDisposableIForwardContainerMod.IForwardContainer
import typings.tstl.baseDisposableIListAlgorithmMod._IListAlgorithm
import typings.tstl.baseDisposableIPartialContainersMod._IClear
import typings.tstl.baseDisposableIPartialContainersMod._IEmpty
import typings.tstl.baseDisposableIPartialContainersMod._ISize
import typings.tstl.containerForwardListMod.ForwardListNs.Iterator
import typings.tstl.iteratorIForwardIteratorMod.IForwardIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/container/ForwardList", "ForwardList")
@js.native
/**
  * Default Constructor.
  */
class ForwardList[T] ()
  extends _IDeque[T]
     with IForwardContainer[Iterator[T]]
     with _IClear
     with _IEmpty
     with _ISize
     with _IFront[T]
     with Iterable[T]
     with _IListAlgorithm[T, ForwardList[T]] {
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
  def this(
    first: IForwardIterator[T, IForwardIterator[T, _]],
    last: IForwardIterator[T, IForwardIterator[T, _]]
  ) = this()
  /**
    * Fill Constructor.
    *
    * @param size Initial size.
    * @param val Value to fill.
    */
  def this(n: Double, `val`: T) = this()
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
  var iterator_ForwardList: js.Function0[IterableIterator[T]] = js.native
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
  def assign(n: Double, `val`: T): Unit = js.native
  /**
    * Range Assigner.
    *
    * @param first Input iteartor of the first position.
    * @param last Input iterator of the last position.
    */
  def assign[T, InputIterator /* <: IForwardIterator[T, InputIterator] */](first: InputIterator, last: InputIterator): Unit = js.native
  /**
    * Iterator to before beginning.
    *
    * @return Iterator to the before beginning.
    */
  def before_begin(): Iterator[T] = js.native
  /**
    * Iterator to the first element.
    *
    * @return Iterator to the first element.
    */
  /* CompleteClass */
  override def begin(): Iterator[T] = js.native
  /**
    * Clear elements.
    */
  /* CompleteClass */
  override def clear(): Unit = js.native
  /**
    * Test whether container is empty.
    */
  /* CompleteClass */
  override def empty(): Boolean = js.native
  /**
    * Iterator to the end.
    *
    * @return Iterator to the end.
    */
  /* CompleteClass */
  override def end(): Iterator[T] = js.native
  /**
    * Erase elements.
    *
    * @param first Range of the first position to erase after.
    * @param last Rangee of the last position to erase.
    * @return Iterator to the last removed element.
    */
  def erase_after(first: Iterator[T], last: Iterator[T]): Iterator[T] = js.native
  /**
    * Erase an element.
    *
    * @param it Position to erase after.
    * @return Iterator to the erased element.
    */
  def erase_after(it: Iterator[T]): Iterator[T] = js.native
  /**
    * Inserted repeated elements.
    *
    * @param pos Position to insert after.
    * @param n Number of elements to insert.
    * @param val Value to insert repeatedly.
    * @return An iterator to the last of the newly inserted elements.
    */
  def insert_after(pos: Iterator[T], n: Double, `val`: T): Iterator[T] = js.native
  /**
    * Insert an element.
    *
    * @param pos Position to insert after.
    * @param val Value to insert.
    * @return An iterator to the newly inserted element.
    */
  def insert_after(pos: Iterator[T], `val`: T): Iterator[T] = js.native
  /**
    * Insert range elements.
    *
    * @param pos Position to insert after.
    * @param first Input iterator of the first position.
    * @param last Input iteartor of the last position.
    * @return An iterator to the last of the newly inserted elements.
    */
  def insert_after[T, InputIterator /* <: IForwardIterator[T, InputIterator] */](pos: Iterator[T], first: InputIterator, last: InputIterator): Iterator[T] = js.native
  /**
    * Erase the first element.
    */
  /* CompleteClass */
  override def pop_front(): Unit = js.native
  /**
    * Insert an element at the first.
    *
    * @param val Value to insert.
    */
  /* CompleteClass */
  override def push_front(`val`: T): Unit = js.native
  /**
    * Number of elements in the container.
    */
  /* CompleteClass */
  override def size(): Double = js.native
  /**
    * Transfer elements.
    *
    * @param pos Position to insert after.
    * @param from Target container to transfer.
    */
  def splice_after(pos: Iterator[T], from: ForwardList[T]): Unit = js.native
  /**
    * Transfer a single element.
    *
    * @param pos Position to insert after.
    * @param from Target container to transfer.
    * @param before Previous position of the single element to transfer.
    */
  def splice_after(pos: Iterator[T], from: ForwardList[T], before: Iterator[T]): Unit = js.native
  /**
    * Transfer range elements.
    *
    * @param pos Position to insert after.
    * @param from Target container to transfer.
    * @param first Range of previous of the first position to transfer.
    * @param last Rangee of the last position to transfer.
    */
  def splice_after(pos: Iterator[T], from: ForwardList[T], first_before: Iterator[T], last: Iterator[T]): Unit = js.native
  /**
    * Native function for `JSON.stringify()`.
    *
    * @return An array containing children elements.
    */
  def toJSON(): js.Array[T] = js.native
}

