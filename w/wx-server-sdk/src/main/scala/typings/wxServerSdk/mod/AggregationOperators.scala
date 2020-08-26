package typings.wxServerSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// type
@js.native
trait AggregationOperators extends js.Object {
  def abs(operand: Double): Double = js.native
  def add(operand: js.Any*): js.Any = js.native
  def addToSet(expression: String): js.Any = js.native
  def allElementsTrue(expression: js.Array[String]): Boolean = js.native
  def and(expression: js.Array[Boolean]): Boolean = js.native
  def anyElementTrue(expression: js.Array[String]): Boolean = js.native
  def arrayElemAt(expression: js.Tuple2[String, Double]): js.Any = js.native
  def arrayToObject(expression: String): js.Object = js.native
  // arrayToObject(expression: [string, any][]): object
  // arrayToObject(expression: {k: string; v: any}[]): object
  def avg(expression: String): Double = js.native
  def lt(expression: String, value: Double): Boolean = js.native
  def lte(expression: String, value: Double): Boolean = js.native
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
  @scala.inline
  implicit class AggregationOperatorsOps[Self <: AggregationOperators] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAbs(value: Double => Double): Self = this.set("abs", js.Any.fromFunction1(value))
    @scala.inline
    def setAdd(value: /* repeated */ js.Any => js.Any): Self = this.set("add", js.Any.fromFunction1(value))
    @scala.inline
    def setAddToSet(value: String => js.Any): Self = this.set("addToSet", js.Any.fromFunction1(value))
    @scala.inline
    def setAllElementsTrue(value: js.Array[String] => Boolean): Self = this.set("allElementsTrue", js.Any.fromFunction1(value))
    @scala.inline
    def setAnd(value: js.Array[Boolean] => Boolean): Self = this.set("and", js.Any.fromFunction1(value))
    @scala.inline
    def setAnyElementTrue(value: js.Array[String] => Boolean): Self = this.set("anyElementTrue", js.Any.fromFunction1(value))
    @scala.inline
    def setArrayElemAt(value: js.Tuple2[String, Double] => js.Any): Self = this.set("arrayElemAt", js.Any.fromFunction1(value))
    @scala.inline
    def setArrayToObject(value: String => js.Object): Self = this.set("arrayToObject", js.Any.fromFunction1(value))
    @scala.inline
    def setAvg(value: String => Double): Self = this.set("avg", js.Any.fromFunction1(value))
    @scala.inline
    def setLt(value: (String, Double) => Boolean): Self = this.set("lt", js.Any.fromFunction2(value))
    @scala.inline
    def setLte(value: (String, Double) => Boolean): Self = this.set("lte", js.Any.fromFunction2(value))
  }
  
}

