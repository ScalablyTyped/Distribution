package typings.waterline.mod

import typings.std.Date
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttributeValidations extends StObject {
  
  var custom: js.UndefOr[AttributeValidation[js.Function]] = js.undefined
  
  var isAfter: js.UndefOr[AttributeValidation[Date]] = js.undefined
  
  var isBefore: js.UndefOr[AttributeValidation[Date]] = js.undefined
  
  var isBoolean: js.UndefOr[AttributeValidation[Boolean]] = js.undefined
  
  var isCreditCard: js.UndefOr[AttributeValidation[Boolean]] = js.undefined
  
  var isEmail: js.UndefOr[AttributeValidation[Boolean]] = js.undefined
  
  var isHexColor: js.UndefOr[AttributeValidation[Boolean]] = js.undefined
  
  var isIP: js.UndefOr[AttributeValidation[Boolean]] = js.undefined
  
  var isIn: js.UndefOr[AttributeValidation[js.Array[String]]] = js.undefined
  
  var isInteger: js.UndefOr[AttributeValidation[Boolean]] = js.undefined
  
  var isNotEmptyString: js.UndefOr[AttributeValidation[Boolean]] = js.undefined
  
  var isNotIn: js.UndefOr[AttributeValidation[js.Array[String]]] = js.undefined
  
  var isNumber: js.UndefOr[AttributeValidation[Boolean]] = js.undefined
  
  var isString: js.UndefOr[AttributeValidation[Boolean]] = js.undefined
  
  var isURL: js.UndefOr[AttributeValidation[Boolean]] = js.undefined
  
  var isUUID: js.UndefOr[AttributeValidation[Boolean]] = js.undefined
  
  var max: js.UndefOr[AttributeValidation[Double]] = js.undefined
  
  var maxLength: js.UndefOr[AttributeValidation[Double]] = js.undefined
  
  var min: js.UndefOr[AttributeValidation[Double]] = js.undefined
  
  var minLength: js.UndefOr[AttributeValidation[Double]] = js.undefined
  
  var regex: js.UndefOr[AttributeValidation[RegExp]] = js.undefined
}
object AttributeValidations {
  
  inline def apply(): AttributeValidations = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AttributeValidations]
  }
  
  extension [Self <: AttributeValidations](x: Self) {
    
    inline def setCustom(value: AttributeValidation[js.Function]): Self = StObject.set(x, "custom", value.asInstanceOf[js.Any])
    
    inline def setCustomFunction0(value: () => js.Function): Self = StObject.set(x, "custom", js.Any.fromFunction0(value))
    
    inline def setCustomFunction1(value: /* cb */ js.Function1[js.Function, js.Any] => Unit): Self = StObject.set(x, "custom", js.Any.fromFunction1(value))
    
    inline def setCustomUndefined: Self = StObject.set(x, "custom", js.undefined)
    
    inline def setIsAfter(value: AttributeValidation[Date]): Self = StObject.set(x, "isAfter", value.asInstanceOf[js.Any])
    
    inline def setIsAfterFunction0(value: () => Date): Self = StObject.set(x, "isAfter", js.Any.fromFunction0(value))
    
    inline def setIsAfterFunction1(value: /* cb */ js.Function1[Date, js.Any] => Unit): Self = StObject.set(x, "isAfter", js.Any.fromFunction1(value))
    
    inline def setIsAfterUndefined: Self = StObject.set(x, "isAfter", js.undefined)
    
    inline def setIsBefore(value: AttributeValidation[Date]): Self = StObject.set(x, "isBefore", value.asInstanceOf[js.Any])
    
    inline def setIsBeforeFunction0(value: () => Date): Self = StObject.set(x, "isBefore", js.Any.fromFunction0(value))
    
    inline def setIsBeforeFunction1(value: /* cb */ js.Function1[Date, js.Any] => Unit): Self = StObject.set(x, "isBefore", js.Any.fromFunction1(value))
    
    inline def setIsBeforeUndefined: Self = StObject.set(x, "isBefore", js.undefined)
    
    inline def setIsBoolean(value: AttributeValidation[Boolean]): Self = StObject.set(x, "isBoolean", value.asInstanceOf[js.Any])
    
    inline def setIsBooleanFunction0(value: () => Boolean): Self = StObject.set(x, "isBoolean", js.Any.fromFunction0(value))
    
    inline def setIsBooleanFunction1(value: /* cb */ js.Function1[Boolean, js.Any] => Unit): Self = StObject.set(x, "isBoolean", js.Any.fromFunction1(value))
    
    inline def setIsBooleanUndefined: Self = StObject.set(x, "isBoolean", js.undefined)
    
    inline def setIsCreditCard(value: AttributeValidation[Boolean]): Self = StObject.set(x, "isCreditCard", value.asInstanceOf[js.Any])
    
    inline def setIsCreditCardFunction0(value: () => Boolean): Self = StObject.set(x, "isCreditCard", js.Any.fromFunction0(value))
    
    inline def setIsCreditCardFunction1(value: /* cb */ js.Function1[Boolean, js.Any] => Unit): Self = StObject.set(x, "isCreditCard", js.Any.fromFunction1(value))
    
    inline def setIsCreditCardUndefined: Self = StObject.set(x, "isCreditCard", js.undefined)
    
    inline def setIsEmail(value: AttributeValidation[Boolean]): Self = StObject.set(x, "isEmail", value.asInstanceOf[js.Any])
    
    inline def setIsEmailFunction0(value: () => Boolean): Self = StObject.set(x, "isEmail", js.Any.fromFunction0(value))
    
    inline def setIsEmailFunction1(value: /* cb */ js.Function1[Boolean, js.Any] => Unit): Self = StObject.set(x, "isEmail", js.Any.fromFunction1(value))
    
    inline def setIsEmailUndefined: Self = StObject.set(x, "isEmail", js.undefined)
    
    inline def setIsHexColor(value: AttributeValidation[Boolean]): Self = StObject.set(x, "isHexColor", value.asInstanceOf[js.Any])
    
    inline def setIsHexColorFunction0(value: () => Boolean): Self = StObject.set(x, "isHexColor", js.Any.fromFunction0(value))
    
    inline def setIsHexColorFunction1(value: /* cb */ js.Function1[Boolean, js.Any] => Unit): Self = StObject.set(x, "isHexColor", js.Any.fromFunction1(value))
    
    inline def setIsHexColorUndefined: Self = StObject.set(x, "isHexColor", js.undefined)
    
    inline def setIsIP(value: AttributeValidation[Boolean]): Self = StObject.set(x, "isIP", value.asInstanceOf[js.Any])
    
    inline def setIsIPFunction0(value: () => Boolean): Self = StObject.set(x, "isIP", js.Any.fromFunction0(value))
    
    inline def setIsIPFunction1(value: /* cb */ js.Function1[Boolean, js.Any] => Unit): Self = StObject.set(x, "isIP", js.Any.fromFunction1(value))
    
    inline def setIsIPUndefined: Self = StObject.set(x, "isIP", js.undefined)
    
    inline def setIsIn(value: AttributeValidation[js.Array[String]]): Self = StObject.set(x, "isIn", value.asInstanceOf[js.Any])
    
    inline def setIsInFunction0(value: () => js.Array[String]): Self = StObject.set(x, "isIn", js.Any.fromFunction0(value))
    
    inline def setIsInFunction1(value: /* cb */ js.Function1[js.Array[String], js.Any] => Unit): Self = StObject.set(x, "isIn", js.Any.fromFunction1(value))
    
    inline def setIsInUndefined: Self = StObject.set(x, "isIn", js.undefined)
    
    inline def setIsInVarargs(value: String*): Self = StObject.set(x, "isIn", js.Array(value :_*))
    
    inline def setIsInteger(value: AttributeValidation[Boolean]): Self = StObject.set(x, "isInteger", value.asInstanceOf[js.Any])
    
    inline def setIsIntegerFunction0(value: () => Boolean): Self = StObject.set(x, "isInteger", js.Any.fromFunction0(value))
    
    inline def setIsIntegerFunction1(value: /* cb */ js.Function1[Boolean, js.Any] => Unit): Self = StObject.set(x, "isInteger", js.Any.fromFunction1(value))
    
    inline def setIsIntegerUndefined: Self = StObject.set(x, "isInteger", js.undefined)
    
    inline def setIsNotEmptyString(value: AttributeValidation[Boolean]): Self = StObject.set(x, "isNotEmptyString", value.asInstanceOf[js.Any])
    
    inline def setIsNotEmptyStringFunction0(value: () => Boolean): Self = StObject.set(x, "isNotEmptyString", js.Any.fromFunction0(value))
    
    inline def setIsNotEmptyStringFunction1(value: /* cb */ js.Function1[Boolean, js.Any] => Unit): Self = StObject.set(x, "isNotEmptyString", js.Any.fromFunction1(value))
    
    inline def setIsNotEmptyStringUndefined: Self = StObject.set(x, "isNotEmptyString", js.undefined)
    
    inline def setIsNotIn(value: AttributeValidation[js.Array[String]]): Self = StObject.set(x, "isNotIn", value.asInstanceOf[js.Any])
    
    inline def setIsNotInFunction0(value: () => js.Array[String]): Self = StObject.set(x, "isNotIn", js.Any.fromFunction0(value))
    
    inline def setIsNotInFunction1(value: /* cb */ js.Function1[js.Array[String], js.Any] => Unit): Self = StObject.set(x, "isNotIn", js.Any.fromFunction1(value))
    
    inline def setIsNotInUndefined: Self = StObject.set(x, "isNotIn", js.undefined)
    
    inline def setIsNotInVarargs(value: String*): Self = StObject.set(x, "isNotIn", js.Array(value :_*))
    
    inline def setIsNumber(value: AttributeValidation[Boolean]): Self = StObject.set(x, "isNumber", value.asInstanceOf[js.Any])
    
    inline def setIsNumberFunction0(value: () => Boolean): Self = StObject.set(x, "isNumber", js.Any.fromFunction0(value))
    
    inline def setIsNumberFunction1(value: /* cb */ js.Function1[Boolean, js.Any] => Unit): Self = StObject.set(x, "isNumber", js.Any.fromFunction1(value))
    
    inline def setIsNumberUndefined: Self = StObject.set(x, "isNumber", js.undefined)
    
    inline def setIsString(value: AttributeValidation[Boolean]): Self = StObject.set(x, "isString", value.asInstanceOf[js.Any])
    
    inline def setIsStringFunction0(value: () => Boolean): Self = StObject.set(x, "isString", js.Any.fromFunction0(value))
    
    inline def setIsStringFunction1(value: /* cb */ js.Function1[Boolean, js.Any] => Unit): Self = StObject.set(x, "isString", js.Any.fromFunction1(value))
    
    inline def setIsStringUndefined: Self = StObject.set(x, "isString", js.undefined)
    
    inline def setIsURL(value: AttributeValidation[Boolean]): Self = StObject.set(x, "isURL", value.asInstanceOf[js.Any])
    
    inline def setIsURLFunction0(value: () => Boolean): Self = StObject.set(x, "isURL", js.Any.fromFunction0(value))
    
    inline def setIsURLFunction1(value: /* cb */ js.Function1[Boolean, js.Any] => Unit): Self = StObject.set(x, "isURL", js.Any.fromFunction1(value))
    
    inline def setIsURLUndefined: Self = StObject.set(x, "isURL", js.undefined)
    
    inline def setIsUUID(value: AttributeValidation[Boolean]): Self = StObject.set(x, "isUUID", value.asInstanceOf[js.Any])
    
    inline def setIsUUIDFunction0(value: () => Boolean): Self = StObject.set(x, "isUUID", js.Any.fromFunction0(value))
    
    inline def setIsUUIDFunction1(value: /* cb */ js.Function1[Boolean, js.Any] => Unit): Self = StObject.set(x, "isUUID", js.Any.fromFunction1(value))
    
    inline def setIsUUIDUndefined: Self = StObject.set(x, "isUUID", js.undefined)
    
    inline def setMax(value: AttributeValidation[Double]): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxFunction0(value: () => Double): Self = StObject.set(x, "max", js.Any.fromFunction0(value))
    
    inline def setMaxFunction1(value: /* cb */ js.Function1[Double, js.Any] => Unit): Self = StObject.set(x, "max", js.Any.fromFunction1(value))
    
    inline def setMaxLength(value: AttributeValidation[Double]): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
    
    inline def setMaxLengthFunction0(value: () => Double): Self = StObject.set(x, "maxLength", js.Any.fromFunction0(value))
    
    inline def setMaxLengthFunction1(value: /* cb */ js.Function1[Double, js.Any] => Unit): Self = StObject.set(x, "maxLength", js.Any.fromFunction1(value))
    
    inline def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setMin(value: AttributeValidation[Double]): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinFunction0(value: () => Double): Self = StObject.set(x, "min", js.Any.fromFunction0(value))
    
    inline def setMinFunction1(value: /* cb */ js.Function1[Double, js.Any] => Unit): Self = StObject.set(x, "min", js.Any.fromFunction1(value))
    
    inline def setMinLength(value: AttributeValidation[Double]): Self = StObject.set(x, "minLength", value.asInstanceOf[js.Any])
    
    inline def setMinLengthFunction0(value: () => Double): Self = StObject.set(x, "minLength", js.Any.fromFunction0(value))
    
    inline def setMinLengthFunction1(value: /* cb */ js.Function1[Double, js.Any] => Unit): Self = StObject.set(x, "minLength", js.Any.fromFunction1(value))
    
    inline def setMinLengthUndefined: Self = StObject.set(x, "minLength", js.undefined)
    
    inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    inline def setRegex(value: AttributeValidation[RegExp]): Self = StObject.set(x, "regex", value.asInstanceOf[js.Any])
    
    inline def setRegexFunction0(value: () => RegExp): Self = StObject.set(x, "regex", js.Any.fromFunction0(value))
    
    inline def setRegexFunction1(value: /* cb */ js.Function1[RegExp, js.Any] => Unit): Self = StObject.set(x, "regex", js.Any.fromFunction1(value))
    
    inline def setRegexUndefined: Self = StObject.set(x, "regex", js.undefined)
  }
}
