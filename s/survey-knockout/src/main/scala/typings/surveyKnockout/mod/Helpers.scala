package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("survey-knockout", "Helpers")
@js.native
class Helpers () extends StObject
/* static members */
object Helpers {
  
  @JSImport("survey-knockout", "Helpers")
  @js.native
  val ^ : js.Any = js.native
  
  inline def createCopy(obj: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("createCopy")(obj.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  inline def getMaxLength(maxLength: Double, surveyLength: Double): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getMaxLength")(maxLength.asInstanceOf[js.Any], surveyLength.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  inline def getNumberByIndex(index: Double, startIndexStr: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getNumberByIndex")(index.asInstanceOf[js.Any], startIndexStr.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getUnbindValue(value: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getUnbindValue")(value.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  inline def isArrayContainsEqual(x: js.Any, y: js.Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isArrayContainsEqual")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isArraysEqual(x: js.Any, y: js.Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isArraysEqual")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isArraysEqual(x: js.Any, y: js.Any, ignoreOrder: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isArraysEqual")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], ignoreOrder.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isCharDigit(ch: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCharDigit")(ch.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isCharNotLetterAndDigit(ch: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCharNotLetterAndDigit")(ch.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isConvertibleToNumber(value: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isConvertibleToNumber")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isNumber(value: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNumber")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isTwoValueEquals(x: js.Any, y: js.Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTwoValueEquals")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isTwoValueEquals(x: js.Any, y: js.Any, ignoreOrder: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTwoValueEquals")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], ignoreOrder.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * A static methods that returns true if a value underfined, null, empty string or empty array.
    * @param value
    */
  inline def isValueEmpty(value: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValueEmpty")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def randomizeArray[T](array: js.Array[T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("randomizeArray")(array.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
}
