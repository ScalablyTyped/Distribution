package typings
package tstlLib.tstlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl", "Deque")
@js.native
/**
  * Default Constructor.
  */
class Deque[T] ()
  extends tstlLib.containerMod.Deque[T] {
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
  def this(obj: tstlLib.containerDequeMod.Deque[T]) = this()
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
  def this(size: scala.Double, `val`: T) = this()
}

@JSImport("tstl", "deque")
@js.native
/**
  * Default Constructor.
  */
class deque[T] ()
  extends tstlLib.containerMod.deque[T] {
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
  def this(obj: tstlLib.containerDequeMod.Deque[T]) = this()
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
  def this(size: scala.Double, `val`: T) = this()
}

/* static members */
@JSImport("tstl", "Deque")
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
@JSImport("tstl", "deque")
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

