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
    contains: T => scala.Boolean,
    contiguousWith: Interval[T] => scala.Boolean,
    empty: scala.Boolean,
    equalTo: Interval[T] => scala.Boolean,
    from: Endpoint[T],
    fromComparator: (Endpoint[T], Endpoint[T]) => scala.Double,
    hull: Interval[T] => Interval[T],
    intersection: Interval[T] => scala.Boolean,
    isEmpty: () => scala.Boolean,
    isSubsetOf: Interval[T] => scala.Boolean,
    to: Endpoint[T],
    toComparator: (Endpoint[T], Endpoint[T]) => scala.Double,
    unify: Interval[T] => Interval[T]
  ): Interval[T] = {
    val __obj = js.Dynamic.literal(constructor = constructor, contains = js.Any.fromFunction1(contains), contiguousWith = js.Any.fromFunction1(contiguousWith), empty = empty, equalTo = js.Any.fromFunction1(equalTo), from = from, fromComparator = js.Any.fromFunction2(fromComparator), hull = js.Any.fromFunction1(hull), intersection = js.Any.fromFunction1(intersection), isEmpty = js.Any.fromFunction0(isEmpty), isSubsetOf = js.Any.fromFunction1(isSubsetOf), to = to, toComparator = js.Any.fromFunction2(toComparator), unify = js.Any.fromFunction1(unify))
  
    __obj.asInstanceOf[Interval[T]]
  }
}

