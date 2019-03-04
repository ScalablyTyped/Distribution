package typings
package tstlLib.containerDequeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/container/Deque", "Deque")
@js.native
/**
  * Default Constructor.
  */
class Deque[T] ()
  extends tstlLib.baseContainerArrayContainerMod.ArrayContainer[T, Deque[T]] {
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
  def this(obj: Deque[T]) = this()
  /**
    * Range Constructor.
    *
    * @param first Input iterator of the first position.
    * @param last Input iterator of the last position.
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
  var _Compute_col_size: js.Any = js.native
  /**
    * @hidden
    */
  var _Fetch_index: js.Any = js.native
  /**
    * @hidden
    */
  var _Insert_to_end: js.Any = js.native
  /**
    * @hidden
    */
  var _Insert_to_middle: js.Any = js.native
  /**
    * @hidden
    */
  var _Try_add_row_at_back: js.Any = js.native
  /**
    * @hidden
    */
  var _Try_add_row_at_front: js.Any = js.native
  /**
    * @hidden
    */
  var _Try_expand_capacity: js.Any = js.native
  /**
    * @hidden
    */
  var capacity_ : js.Any = js.native
  /**
    * @hidden
    */
  var matrix_ : js.Any = js.native
  /**
    * @hidden
    */
  var size_ : js.Any = js.native
  /**
    * The capacity to store elements.
    *
    * @return The capacity.
    */
  def capacity(): scala.Double = js.native
  /**
    * @inheritDoc
    */
  def pop_front(): scala.Unit = js.native
  /**
    * @inheritDoc
    */
  def push_front(`val`: T): scala.Unit = js.native
  /**
    * Reserve {@link capacity} enable to store *n* elements.
    *
    * @param n The capacity to reserve.
    */
  def reserve(n: scala.Double): scala.Unit = js.native
  /**
    * Shrink {@link capacity} to actual {@link size}.
    */
  def shrink_to_fit(): scala.Unit = js.native
}

@JSImport("tstl/container/Deque", "deque")
@js.native
/**
  * Default Constructor.
  */
class deque[T] () extends Deque[T] {
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
  def this(obj: Deque[T]) = this()
  /**
    * Range Constructor.
    *
    * @param first Input iterator of the first position.
    * @param last Input iterator of the last position.
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

/* static members */
@JSImport("tstl/container/Deque", "Deque")
@js.native
object Deque extends js.Object {
  /**
    * @hidden
    */
  val MAGNIFIER: js.Any = js.native
  /**
    * @hidden
    */
  val MIN_CAPACITY: js.Any = js.native
  /**
    * @hidden
    */
  val ROW_SIZE: js.Any = js.native
}

/* static members */
@JSImport("tstl/container/Deque", "deque")
@js.native
object deque extends js.Object {
  /**
    * @hidden
    */
  val MAGNIFIER: js.Any = js.native
  /**
    * @hidden
    */
  val MIN_CAPACITY: js.Any = js.native
  /**
    * @hidden
    */
  val ROW_SIZE: js.Any = js.native
}

