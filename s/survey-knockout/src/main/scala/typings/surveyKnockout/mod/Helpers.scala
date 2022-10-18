package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("survey-knockout", "Helpers")
@js.native
open class Helpers () extends StObject
/* static members */
object Helpers {
  
  @JSImport("survey-knockout", "Helpers")
  @js.native
  val ^ : js.Any = js.native
  
  inline def convertArrayObjectToValue(src: Any, propName: String): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("convertArrayObjectToValue")(src.asInstanceOf[js.Any], propName.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
  
  inline def convertArrayValueToObject(src: Any, propName: String): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("convertArrayValueToObject")(src.asInstanceOf[js.Any], propName.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
  inline def convertArrayValueToObject(src: Any, propName: String, dest: Any): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("convertArrayValueToObject")(src.asInstanceOf[js.Any], propName.asInstanceOf[js.Any], dest.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
  
  inline def convertDateToString(date: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("convertDateToString")(date.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def convertValToQuestionVal(`val`: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("convertValToQuestionVal")(`val`.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def correctAfterMultiple(a: Double, b: Double, res: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("correctAfterMultiple")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], res.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def correctAfterPlusMinis(a: Double, b: Double, res: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("correctAfterPlusMinis")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], res.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def createCopy(obj: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("createCopy")(obj.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def getMaxLength(maxLength: Double, surveyLength: Double): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getMaxLength")(maxLength.asInstanceOf[js.Any], surveyLength.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def getNumberByIndex(index: Double, startIndexStr: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getNumberByIndex")(index.asInstanceOf[js.Any], startIndexStr.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getUnbindValue(value: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getUnbindValue")(value.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def isArrayContainsEqual(x: Any, y: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isArrayContainsEqual")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isArraysEqual(x: Any, y: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isArraysEqual")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isArraysEqual(x: Any, y: Any, ignoreOrder: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isArraysEqual")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], ignoreOrder.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isArraysEqual(x: Any, y: Any, ignoreOrder: Boolean, caseSensitive: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isArraysEqual")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], ignoreOrder.asInstanceOf[js.Any], caseSensitive.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isArraysEqual(x: Any, y: Any, ignoreOrder: Boolean, caseSensitive: Boolean, trimStrings: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isArraysEqual")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], ignoreOrder.asInstanceOf[js.Any], caseSensitive.asInstanceOf[js.Any], trimStrings.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isArraysEqual(x: Any, y: Any, ignoreOrder: Boolean, caseSensitive: Unit, trimStrings: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isArraysEqual")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], ignoreOrder.asInstanceOf[js.Any], caseSensitive.asInstanceOf[js.Any], trimStrings.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isArraysEqual(x: Any, y: Any, ignoreOrder: Unit, caseSensitive: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isArraysEqual")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], ignoreOrder.asInstanceOf[js.Any], caseSensitive.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isArraysEqual(x: Any, y: Any, ignoreOrder: Unit, caseSensitive: Boolean, trimStrings: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isArraysEqual")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], ignoreOrder.asInstanceOf[js.Any], caseSensitive.asInstanceOf[js.Any], trimStrings.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isArraysEqual(x: Any, y: Any, ignoreOrder: Unit, caseSensitive: Unit, trimStrings: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isArraysEqual")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], ignoreOrder.asInstanceOf[js.Any], caseSensitive.asInstanceOf[js.Any], trimStrings.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isCharDigit(ch: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCharDigit")(ch.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isCharNotLetterAndDigit(ch: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCharNotLetterAndDigit")(ch.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isConvertibleToNumber(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isConvertibleToNumber")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isNumber(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNumber")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isTwoValueEquals(x: Any, y: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTwoValueEquals")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isTwoValueEquals(x: Any, y: Any, ignoreOrder: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTwoValueEquals")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], ignoreOrder.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isTwoValueEquals(x: Any, y: Any, ignoreOrder: Boolean, caseSensitive: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTwoValueEquals")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], ignoreOrder.asInstanceOf[js.Any], caseSensitive.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isTwoValueEquals(x: Any, y: Any, ignoreOrder: Boolean, caseSensitive: Boolean, trimStrings: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTwoValueEquals")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], ignoreOrder.asInstanceOf[js.Any], caseSensitive.asInstanceOf[js.Any], trimStrings.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isTwoValueEquals(x: Any, y: Any, ignoreOrder: Boolean, caseSensitive: Unit, trimStrings: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTwoValueEquals")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], ignoreOrder.asInstanceOf[js.Any], caseSensitive.asInstanceOf[js.Any], trimStrings.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isTwoValueEquals(x: Any, y: Any, ignoreOrder: Unit, caseSensitive: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTwoValueEquals")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], ignoreOrder.asInstanceOf[js.Any], caseSensitive.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isTwoValueEquals(x: Any, y: Any, ignoreOrder: Unit, caseSensitive: Boolean, trimStrings: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTwoValueEquals")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], ignoreOrder.asInstanceOf[js.Any], caseSensitive.asInstanceOf[js.Any], trimStrings.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isTwoValueEquals(x: Any, y: Any, ignoreOrder: Unit, caseSensitive: Unit, trimStrings: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTwoValueEquals")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], ignoreOrder.asInstanceOf[js.Any], caseSensitive.asInstanceOf[js.Any], trimStrings.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /*
    * A static methods that returns true if a value undefined, null, empty string or empty array.
    */
  inline def isValueEmpty(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValueEmpty")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def randomizeArray[T](array: Any): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("randomizeArray")(array.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
}
