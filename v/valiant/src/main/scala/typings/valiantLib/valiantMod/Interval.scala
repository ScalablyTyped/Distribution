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
    val __obj = js.Dynamic.literal(constructor = constructor, contains = contains, contiguousWith = contiguousWith, empty = empty, equalTo = equalTo, from = from, fromComparator = fromComparator, hull = hull, intersection = intersection, isEmpty = isEmpty, isSubsetOf = isSubsetOf, to = to, toComparator = toComparator, unify = unify)
  
    __obj.asInstanceOf[Interval[T]]
  }
}

