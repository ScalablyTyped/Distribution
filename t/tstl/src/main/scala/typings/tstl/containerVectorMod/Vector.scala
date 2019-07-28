package typings.tstl.containerVectorMod

import typings.tstl.baseContainerVectorContainerMod.VectorContainer
import typings.tstl.containerVectorMod.VectorNs.Iterator
import typings.tstl.containerVectorMod.VectorNs.ReverseIterator
import typings.tstl.iteratorIForwardIteratorMod.IForwardIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/container/Vector", "Vector")
@js.native
/**
  * Default Constructor.
  */
class Vector[T] () extends VectorContainer[T, Vector[T], Vector[T], Iterator[T], ReverseIterator[T], T] {
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
  def this(obj: Vector[T]) = this()
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
  def this(n: Double, `val`: T) = this()
}

@JSImport("tstl/container/Vector", "vector")
@js.native
/**
  * Default Constructor.
  */
class vector[T] () extends Vector[T] {
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
  def this(obj: Vector[T]) = this()
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
  def this(n: Double, `val`: T) = this()
}

/* static members */
@JSImport("tstl/container/Vector", "Vector")
@js.native
object Vector extends js.Object {
  /**
    * Wrap an array into a vector.
    *
    * @param data Target array to be wrapped
    * @return A vector wrapping the parametric array.
    */
  def wrap[T](data: js.Array[T]): Vector[T] = js.native
}

/* static members */
@JSImport("tstl/container/Vector", "vector")
@js.native
object vector extends js.Object {
  /**
    * Wrap an array into a vector.
    *
    * @param data Target array to be wrapped
    * @return A vector wrapping the parametric array.
    */
  def wrap[T](data: js.Array[T]): Vector[T] = js.native
}

