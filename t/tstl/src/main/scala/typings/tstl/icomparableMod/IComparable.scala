package typings.tstl.icomparableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IComparable[T] extends js.Object {
  /**
    * Test whether less than some object.
    *
    * @param obj The object to compare.
    * @return Whether less or not.
    */
  def less(obj: T): Boolean
}

object IComparable {
  @scala.inline
  def apply[T](less: T => Boolean): IComparable[T] = {
    val __obj = js.Dynamic.literal(less = js.Any.fromFunction1(less))
    __obj.asInstanceOf[IComparable[T]]
  }
}

