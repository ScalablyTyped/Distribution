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

