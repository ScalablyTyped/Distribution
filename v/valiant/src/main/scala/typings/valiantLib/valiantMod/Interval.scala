package typings
package valiantLib.valiantMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Interval[T] extends js.Object {
  var constructor: IntervalConstructor[scala.Double]
  var empty: scala.Boolean
  var from: Endpoint[T]
  var to: Endpoint[T]
  def contains(value: T): scala.Boolean
  def contiguousWith(interval: Interval[T]): scala.Boolean
  def equalTo(interval: Interval[T]): scala.Boolean
  def fromComparator(a: Endpoint[T], b: Endpoint[T]): scala.Double
  def hull(interval: Interval[T]): Interval[T]
  def intersection(interval: Interval[T]): scala.Boolean
  def isEmpty(): scala.Boolean
  def isSubsetOf(interval: Interval[T]): scala.Boolean
  def toComparator(a: Endpoint[T], b: Endpoint[T]): scala.Double
  def unify(interval: Interval[T]): Interval[T]
}

object Interval {
  @scala.inline
  def apply[T](
    constructor: IntervalConstructor[scala.Double],
    contains: js.Function1[T, scala.Boolean],
    contiguousWith: js.Function1[Interval[T], scala.Boolean],
    empty: scala.Boolean,
    equalTo: js.Function1[Interval[T], scala.Boolean],
    from: Endpoint[T],
    fromComparator: js.Function2[Endpoint[T], Endpoint[T], scala.Double],
    hull: js.Function1[Interval[T], Interval[T]],
    intersection: js.Function1[Interval[T], scala.Boolean],
    isEmpty: js.Function0[scala.Boolean],
    isSubsetOf: js.Function1[Interval[T], scala.Boolean],
    to: Endpoint[T],
    toComparator: js.Function2[Endpoint[T], Endpoint[T], scala.Double],
    unify: js.Function1[Interval[T], Interval[T]]
  ): Interval[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("constructor")(constructor)
    __obj.updateDynamic("contains")(contains)
    __obj.updateDynamic("contiguousWith")(contiguousWith)
    __obj.updateDynamic("empty")(empty)
    __obj.updateDynamic("equalTo")(equalTo)
    __obj.updateDynamic("from")(from)
    __obj.updateDynamic("fromComparator")(fromComparator)
    __obj.updateDynamic("hull")(hull)
    __obj.updateDynamic("intersection")(intersection)
    __obj.updateDynamic("isEmpty")(isEmpty)
    __obj.updateDynamic("isSubsetOf")(isSubsetOf)
    __obj.updateDynamic("to")(to)
    __obj.updateDynamic("toComparator")(toComparator)
    __obj.updateDynamic("unify")(unify)
    __obj.asInstanceOf[Interval[T]]
  }
}

