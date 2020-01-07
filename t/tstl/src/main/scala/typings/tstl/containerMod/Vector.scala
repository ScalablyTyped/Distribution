package typings.tstl.containerMod

import typings.tstl.iteratorIForwardIteratorMod.IForwardIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/container", "Vector")
@js.native
/**
  * Default Constructor.
  */
class Vector[T] ()
  extends typings.tstl.containerVectorMod.Vector[T] {
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
  def this(obj: typings.tstl.containerVectorMod.Vector[T]) = this()
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

@JSImport("tstl/container", "vector")
@js.native
/**
  * Default Constructor.
  */
class vector[T] ()
  extends typings.tstl.containerVectorMod.vector[T] {
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
  def this(obj: typings.tstl.containerVectorMod.Vector[T]) = this()
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
@JSImport("tstl/container", "Vector")
@js.native
object Vector extends js.Object {
  val Iterator: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ArrayIterator */ js.Any = js.native
  val ReverseIterator: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ArrayReverseIterator */ js.Any = js.native
  val iterator: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ArrayIterator */ js.Any = js.native
  val reverse_iterator: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ArrayReverseIterator */ js.Any = js.native
  /**
    * Wrap an array into a vector.
    *
    * @param data Target array to be wrapped
    * @return A vector wrapping the parametric array.
    */
  def wrap[T](data: js.Array[T]): typings.tstl.containerVectorMod.Vector[T] = js.native
}

/* static members */
@JSImport("tstl/container", "vector")
@js.native
object vector extends js.Object {
  val Iterator: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ArrayIterator */ js.Any = js.native
  val ReverseIterator: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ArrayReverseIterator */ js.Any = js.native
  val iterator: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ArrayIterator */ js.Any = js.native
  val reverse_iterator: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ArrayReverseIterator */ js.Any = js.native
  /**
    * Wrap an array into a vector.
    *
    * @param data Target array to be wrapped
    * @return A vector wrapping the parametric array.
    */
  def wrap[T](data: js.Array[T]): typings.tstl.containerVectorMod.Vector[T] = js.native
}

