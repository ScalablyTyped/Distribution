package typings.tstl.containerListMod

import typings.tstl.baseContainerListContainerMod.ListContainer
import typings.tstl.baseDisposableIListAlgorithmMod._IListAlgorithm
import typings.tstl.containerListMod.ListNs.Iterator
import typings.tstl.containerListMod.ListNs.ReverseIterator
import typings.tstl.iteratorIForwardIteratorMod.IForwardIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.tstl.baseContainerIDequeContainerMod.IDequeContainer because var conflicts: iterator. Inlined  */ @JSImport("tstl/container/List", "List")
@js.native
/**
  * Default Constructor.
  */
class List[T] ()
  extends ListContainer[T, List[T], Iterator[T], ReverseIterator[T]]
     with _IListAlgorithm[T, List[T]] {
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
  def this(obj: List[T]) = this()
  /**
    * Range Constructor.
    *
    * @param first Input iterator of the first position.
    * @param last Input iteartor of the last position.
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
  def this(size: Double, `val`: T) = this()
  /**
    * @hidden
    */
  var _Quick_sort: js.Any = js.native
  /**
    * @hidden
    */
  var _Quick_sort_partition: js.Any = js.native
  /**
    * @hidden
    */
  var ptr_ : js.Any = js.native
  /**
    * @inheritDoc
    */
  def back(): T = js.native
  /**
    * @inheritDoc
    */
  def back(`val`: T): Unit = js.native
  /**
    * @inheritDoc
    */
  def front(): T = js.native
  /**
    * @inheritDoc
    */
  def front(`val`: T): Unit = js.native
  /**
    * Transfer elements.
    *
    * @param pos Position to insert.
    * @param from Target container to transfer.
    */
  def splice(pos: Iterator[T], from: List[T]): Unit = js.native
  /**
    * Transfer range elements.
    *
    * @param pos Position to insert.
    * @param from Target container to transfer.
    * @param first Range of the first position to transfer.
    * @param last Rangee of the last position to transfer.
    */
  def splice(pos: Iterator[T], from: List[T], first: Iterator[T], last: Iterator[T]): Unit = js.native
  /**
    * Transfer a single element.
    *
    * @param pos Position to insert.
    * @param from Target container to transfer.
    * @param it Position of the single element to transfer.
    */
  def splice(pos: Iterator[T], from: List[T], it: Iterator[T]): Unit = js.native
  /**
    * Swap elements.
    *
    * @param obj Target container to swap.
    */
  /* InferMemberOverrides */
  override def swap(obj: List[T]): Unit = js.native
}

@JSImport("tstl/container/List", "list")
@js.native
/**
  * Default Constructor.
  */
class list[T] () extends List[T] {
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
  def this(obj: List[T]) = this()
  /**
    * Range Constructor.
    *
    * @param first Input iterator of the first position.
    * @param last Input iteartor of the last position.
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
  def this(size: Double, `val`: T) = this()
}

