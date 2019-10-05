package typings.tstl.tstlMod

import typings.tstl.iteratorIForwardIteratorMod.IForwardIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl", "List")
@js.native
/**
  * Default Constructor.
  */
class List[T] ()
  extends typings.tstl.containerMod.List[T] {
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
  def this(obj: typings.tstl.containerListMod.List[T]) = this()
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

@JSImport("tstl", "list")
@js.native
/**
  * Default Constructor.
  */
class list[T] ()
  extends typings.tstl.containerMod.list[T] {
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
  def this(obj: typings.tstl.containerListMod.List[T]) = this()
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

@JSImport("tstl", "List")
@js.native
object List extends js.Object {
  /**
    * Iterator of the List.
    *
    * @author Jeongho Nam <http://samchon.org>
    */
  @js.native
  /**
    * @hidden
    */
  class Iterator[T] protected ()
    extends typings.tstl.containerMod.List.Iterator[T]
  
  /**
    * Reverse iterator of the List.
    *
    * @author Jeongho Nam <http://samchon.org>
    */
  @js.native
  class ReverseIterator[T] ()
    extends typings.tstl.containerMod.List.ReverseIterator[T]
  
}

@JSImport("tstl", "list")
@js.native
object list extends js.Object {
  /**
    * Iterator of the List.
    *
    * @author Jeongho Nam <http://samchon.org>
    */
  @js.native
  /**
    * @hidden
    */
  class Iterator[T] protected ()
    extends typings.tstl.containerMod.list.Iterator[T]
  
  /**
    * Reverse iterator of the List.
    *
    * @author Jeongho Nam <http://samchon.org>
    */
  @js.native
  class ReverseIterator[T] ()
    extends typings.tstl.containerMod.list.ReverseIterator[T]
  
}

