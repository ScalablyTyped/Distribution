package typings.wxServerSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// type
trait AggregationOperators extends js.Object {
  def abs(operand: Double): Double
  def add(operand: js.Any*): js.Any
  def addToSet(expression: String): js.Any
  def allElementsTrue(expression: js.Array[String]): Boolean
  def and(expression: js.Array[Boolean]): Boolean
  def anyElementTrue(expression: js.Array[String]): Boolean
  def arrayElemAt(expression: js.Tuple2[String, Double]): js.Any
  def arrayToObject(expression: String): js.Object
  // arrayToObject(expression: [string, any][]): object
  // arrayToObject(expression: {k: string; v: any}[]): object
  def avg(expression: String): Double
  def lt(expression: String, value: Double): Boolean
  def lte(expression: String, value: Double): Boolean
}

object AggregationOperators {
  @scala.inline
  def apply(
    abs: Double => Double,
    add: /* repeated */ js.Any => js.Any,
    addToSet: String => js.Any,
    allElementsTrue: js.Array[String] => Boolean,
    and: js.Array[Boolean] => Boolean,
    anyElementTrue: js.Array[String] => Boolean,
    arrayElemAt: js.Tuple2[String, Double] => js.Any,
    arrayToObject: String => js.Object,
    avg: String => Double,
    lt: (String, Double) => Boolean,
    lte: (String, Double) => Boolean
  ): AggregationOperators = {
    val __obj = js.Dynamic.literal(abs = js.Any.fromFunction1(abs), add = js.Any.fromFunction1(add), addToSet = js.Any.fromFunction1(addToSet), allElementsTrue = js.Any.fromFunction1(allElementsTrue), and = js.Any.fromFunction1(and), anyElementTrue = js.Any.fromFunction1(anyElementTrue), arrayElemAt = js.Any.fromFunction1(arrayElemAt), arrayToObject = js.Any.fromFunction1(arrayToObject), avg = js.Any.fromFunction1(avg), lt = js.Any.fromFunction2(lt), lte = js.Any.fromFunction2(lte))
    __obj.asInstanceOf[AggregationOperators]
  }
}

