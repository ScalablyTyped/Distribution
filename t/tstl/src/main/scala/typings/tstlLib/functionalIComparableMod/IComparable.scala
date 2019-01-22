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

