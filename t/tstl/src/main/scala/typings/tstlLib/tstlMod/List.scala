package typings
package tstlLib.tstlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl", "List")
@js.native
/**
  * Default Constructor.
  */
class List[T] ()
  extends tstlLib.containerMod.List[T] {
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
  def this(obj: tstlLib.containerListMod.List[T]) = this()
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

@JSImport("tstl", "list")
@js.native
/**
  * Default Constructor.
  */
class list[T] ()
  extends tstlLib.containerMod.list[T] {
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
  def this(obj: tstlLib.containerListMod.List[T]) = this()
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

