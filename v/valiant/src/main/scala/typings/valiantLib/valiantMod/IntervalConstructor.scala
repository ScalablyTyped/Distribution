package typings
package valiantLib.valiantMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IntervalConstructor[T]
  extends org.scalablytyped.runtime.Instantiable2[/* from */ Endpoint[T], /* to */ Endpoint[T], Interval[T]] {
  var empty: Interval[T] = js.native
  var negInf: Endpoint[T] = js.native
  var negativeInfinity: Endpoint[T] = js.native
  var posInf: Endpoint[T] = js.native
  var positiveInfinity: Endpoint[T] = js.native
  var whole: Interval[T] = js.native
  def adjacentEndpoint(endpoint: Endpoint[T]): Endpoint[T] = js.native
  def compareEndpoints(a: Endpoint[T], b: Endpoint[T]): scala.Double = js.native
  def compareValues(a: T, b: T): scala.Double = js.native
  def excEnd(value: T): Endpoint[T] = js.native
  def exclusiveEndpoint(value: T): Endpoint[T] = js.native
  def incEnd(value: T): Endpoint[T] = js.native
  def inclusiveEndpoint(value: T): Endpoint[T] = js.native
  def singleton(value: T): Interval[T] = js.native
}

