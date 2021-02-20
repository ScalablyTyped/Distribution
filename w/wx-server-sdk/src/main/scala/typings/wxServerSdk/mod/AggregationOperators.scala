package typings.wxServerSdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// type
@js.native
trait AggregationOperators extends StObject {
  
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
  implicit class AggregationOperatorsMutableBuilder[Self <: AggregationOperators] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAbs(value: Double => Double): Self = StObject.set(x, "abs", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAdd(value: /* repeated */ js.Any => js.Any): Self = StObject.set(x, "add", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAddToSet(value: String => js.Any): Self = StObject.set(x, "addToSet", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAllElementsTrue(value: js.Array[String] => Boolean): Self = StObject.set(x, "allElementsTrue", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAnd(value: js.Array[Boolean] => Boolean): Self = StObject.set(x, "and", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAnyElementTrue(value: js.Array[String] => Boolean): Self = StObject.set(x, "anyElementTrue", js.Any.fromFunction1(value))
    
    @scala.inline
    def setArrayElemAt(value: js.Tuple2[String, Double] => js.Any): Self = StObject.set(x, "arrayElemAt", js.Any.fromFunction1(value))
    
    @scala.inline
    def setArrayToObject(value: String => js.Object): Self = StObject.set(x, "arrayToObject", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAvg(value: String => Double): Self = StObject.set(x, "avg", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLt(value: (String, Double) => Boolean): Self = StObject.set(x, "lt", js.Any.fromFunction2(value))
    
    @scala.inline
    def setLte(value: (String, Double) => Boolean): Self = StObject.set(x, "lte", js.Any.fromFunction2(value))
  }
}
