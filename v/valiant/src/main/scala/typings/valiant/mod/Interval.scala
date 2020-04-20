package typings.valiant.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Interval[T] extends js.Object {
  var constructor: IntervalConstructor[Double]
  var empty: Boolean
  var from: Endpoint[T]
  var to: Endpoint[T]
  def contains(value: T): Boolean
  def contiguousWith(interval: Interval[T]): Boolean
  def equalTo(interval: Interval[T]): Boolean
  def fromComparator(a: Endpoint[T], b: Endpoint[T]): Double
  def hull(interval: Interval[T]): Interval[T]
  def intersection(interval: Interval[T]): Boolean
  def isEmpty(): Boolean
  def isSubsetOf(interval: Interval[T]): Boolean
  def toComparator(a: Endpoint[T], b: Endpoint[T]): Double
  def unify(interval: Interval[T]): Interval[T]
}

object Interval {
  @scala.inline
  def apply[T](
    constructor: IntervalConstructor[Double],
    contains: T => Boolean,
    contiguousWith: Interval[T] => Boolean,
    empty: Boolean,
    equalTo: Interval[T] => Boolean,
    from: Endpoint[T],
    fromComparator: (Endpoint[T], Endpoint[T]) => Double,
    hull: Interval[T] => Interval[T],
    intersection: Interval[T] => Boolean,
    isEmpty: () => Boolean,
    isSubsetOf: Interval[T] => Boolean,
    to: Endpoint[T],
    toComparator: (Endpoint[T], Endpoint[T]) => Double,
    unify: Interval[T] => Interval[T]
  ): Interval[T] = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], contains = js.Any.fromFunction1(contains), contiguousWith = js.Any.fromFunction1(contiguousWith), empty = empty.asInstanceOf[js.Any], equalTo = js.Any.fromFunction1(equalTo), from = from.asInstanceOf[js.Any], fromComparator = js.Any.fromFunction2(fromComparator), hull = js.Any.fromFunction1(hull), intersection = js.Any.fromFunction1(intersection), isEmpty = js.Any.fromFunction0(isEmpty), isSubsetOf = js.Any.fromFunction1(isSubsetOf), to = to.asInstanceOf[js.Any], toComparator = js.Any.fromFunction2(toComparator), unify = js.Any.fromFunction1(unify))
    __obj.asInstanceOf[Interval[T]]
  }
}

