package typings
package tstlLib.containerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/container", "Vector")
@js.native
/**
  * Default Constructor.
  */
class Vector[T] ()
  extends tstlLib.containerVectorMod.Vector[T] {
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
  def this(obj: tstlLib.containerVectorMod.Vector[T]) = this()
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
  def this(n: scala.Double, `val`: T) = this()
}

@JSImport("tstl/container", "vector")
@js.native
/**
  * Default Constructor.
  */
class vector[T] ()
  extends tstlLib.containerVectorMod.vector[T] {
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
  def this(obj: tstlLib.containerVectorMod.Vector[T]) = this()
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
  def this(n: scala.Double, `val`: T) = this()
}

