package typings
package tstlLib.containerListMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- tstlLib.baseContainerIDequeContainerMod.IDequeContainer because var conflicts: iterator. Inlined  */ @JSImport("tstl/container/List", "List")
@js.native
/**
  * Default Constructor.
  */
class List[T] ()
  extends tstlLib.baseContainerListContainerMod.ListContainer[
      T, 
      List[T], 
      tstlLib.containerListMod.ListNs.Iterator[T], 
      tstlLib.containerListMod.ListNs.ReverseIterator[T]
    ]
     with tstlLib.baseDisposableIListAlgorithmMod._IListAlgorithm[T, List[T]] {
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
  def this(first: stdLib.Readonly[
      tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, _]]
    ], last: stdLib.Readonly[
      tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, _]]
    ]) = this()
  /**
    * Fill Constructor.
    *
    * @param size Initial size.
    * @param val Value to fill.
    */
  def this(size: scala.Double, `val`: T) = this()
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
  var `ptr_`: js.Any = js.native
  /**
    * @inheritDoc
    */
  def back(): T = js.native
  /**
    * @inheritDoc
    */
  def back(`val`: T): scala.Unit = js.native
  /**
    * @inheritDoc
    */
  def front(): T = js.native
  /**
    * @inheritDoc
    */
  def front(`val`: T): scala.Unit = js.native
  /**
    * Transfer elements.
    *
    * @param pos Position to insert.
    * @param from Target container to transfer.
    */
  def splice(pos: tstlLib.containerListMod.ListNs.Iterator[T], from: List[T]): scala.Unit = js.native
  /**
    * Transfer range elements.
    *
    * @param pos Position to insert.
    * @param from Target container to transfer.
    * @param first Range of the first position to transfer.
    * @param last Rangee of the last position to transfer.
    */
  def splice(
    pos: tstlLib.containerListMod.ListNs.Iterator[T],
    from: List[T],
    first: tstlLib.containerListMod.ListNs.Iterator[T],
    last: tstlLib.containerListMod.ListNs.Iterator[T]
  ): scala.Unit = js.native
  /**
    * Transfer a single element.
    *
    * @param pos Position to insert.
    * @param from Target container to transfer.
    * @param it Position of the single element to transfer.
    */
  def splice(
    pos: tstlLib.containerListMod.ListNs.Iterator[T],
    from: List[T],
    it: tstlLib.containerListMod.ListNs.Iterator[T]
  ): scala.Unit = js.native
  /**
    * Swap elements.
    *
    * @param obj Target container to swap.
    */
  /* InferMemberOverrides */
  override def swap(obj: List[T]): scala.Unit = js.native
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
  def this(first: stdLib.Readonly[
      tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, _]]
    ], last: stdLib.Readonly[
      tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, _]]
    ]) = this()
  /**
    * Fill Constructor.
    *
    * @param size Initial size.
    * @param val Value to fill.
    */
  def this(size: scala.Double, `val`: T) = this()
}

