package typings
package tstlLib.functionalIComparableMod

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
  def less(obj: T): scala.Boolean
}

object IComparable {
  @scala.inline
  def apply[T](equals: T => scala.Boolean, hashCode: () => scala.Double, less: T => scala.Boolean): IComparable[T] = {
    val __obj = js.Dynamic.literal(equals = js.Any.fromFunction1(equals), hashCode = js.Any.fromFunction0(hashCode), less = js.Any.fromFunction1(less))
  
    __obj.asInstanceOf[IComparable[T]]
  }
}

