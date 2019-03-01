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
  def apply[T](
    equals: js.Function1[T, scala.Boolean],
    hashCode: js.Function0[scala.Double],
    less: js.Function1[T, scala.Boolean]
  ): IComparable[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("equals")(equals)
    __obj.updateDynamic("hashCode")(hashCode)
    __obj.updateDynamic("less")(less)
    __obj.asInstanceOf[IComparable[T]]
  }
}

