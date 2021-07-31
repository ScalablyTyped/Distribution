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
  
  @scala.inline
  def apply(): AttributeValidations = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AttributeValidations]
  }
  
  @scala.inline
  implicit class AttributeValidationsMutableBuilder[Self <: AttributeValidations] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCustom(value: AttributeValidation[js.Function]): Self = StObject.set(x, "custom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomFunction0(value: () => js.Function): Self = StObject.set(x, "custom", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCustomFunction1(value: /* cb */ js.Function1[js.Function, js.Any] => Unit): Self = StObject.set(x, "custom", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCustomUndefined: Self = StObject.set(x, "custom", js.undefined)
    
    @scala.inline
    def setIsAfter(value: AttributeValidation[Date]): Self = StObject.set(x, "isAfter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsAfterFunction0(value: () => Date): Self = StObject.set(x, "isAfter", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsAfterFunction1(value: /* cb */ js.Function1[Date, js.Any] => Unit): Self = StObject.set(x, "isAfter", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsAfterUndefined: Self = StObject.set(x, "isAfter", js.undefined)
    
    @scala.inline
    def setIsBefore(value: AttributeValidation[Date]): Self = StObject.set(x, "isBefore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsBeforeFunction0(value: () => Date): Self = StObject.set(x, "isBefore", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsBeforeFunction1(value: /* cb */ js.Function1[Date, js.Any] => Unit): Self = StObject.set(x, "isBefore", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsBeforeUndefined: Self = StObject.set(x, "isBefore", js.undefined)
    
    @scala.inline
    def setIsBoolean(value: AttributeValidation[Boolean]): Self = StObject.set(x, "isBoolean", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsBooleanFunction0(value: () => Boolean): Self = StObject.set(x, "isBoolean", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsBooleanFunction1(value: /* cb */ js.Function1[Boolean, js.Any] => Unit): Self = StObject.set(x, "isBoolean", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsBooleanUndefined: Self = StObject.set(x, "isBoolean", js.undefined)
    
    @scala.inline
    def setIsCreditCard(value: AttributeValidation[Boolean]): Self = StObject.set(x, "isCreditCard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsCreditCardFunction0(value: () => Boolean): Self = StObject.set(x, "isCreditCard", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsCreditCardFunction1(value: /* cb */ js.Function1[Boolean, js.Any] => Unit): Self = StObject.set(x, "isCreditCard", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsCreditCardUndefined: Self = StObject.set(x, "isCreditCard", js.undefined)
    
    @scala.inline
    def setIsEmail(value: AttributeValidation[Boolean]): Self = StObject.set(x, "isEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsEmailFunction0(value: () => Boolean): Self = StObject.set(x, "isEmail", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsEmailFunction1(value: /* cb */ js.Function1[Boolean, js.Any] => Unit): Self = StObject.set(x, "isEmail", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsEmailUndefined: Self = StObject.set(x, "isEmail", js.undefined)
    
    @scala.inline
    def setIsHexColor(value: AttributeValidation[Boolean]): Self = StObject.set(x, "isHexColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsHexColorFunction0(value: () => Boolean): Self = StObject.set(x, "isHexColor", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsHexColorFunction1(value: /* cb */ js.Function1[Boolean, js.Any] => Unit): Self = StObject.set(x, "isHexColor", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsHexColorUndefined: Self = StObject.set(x, "isHexColor", js.undefined)
    
    @scala.inline
    def setIsIP(value: AttributeValidation[Boolean]): Self = StObject.set(x, "isIP", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsIPFunction0(value: () => Boolean): Self = StObject.set(x, "isIP", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsIPFunction1(value: /* cb */ js.Function1[Boolean, js.Any] => Unit): Self = StObject.set(x, "isIP", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsIPUndefined: Self = StObject.set(x, "isIP", js.undefined)
    
    @scala.inline
    def setIsIn(value: AttributeValidation[js.Array[String]]): Self = StObject.set(x, "isIn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsInFunction0(value: () => js.Array[String]): Self = StObject.set(x, "isIn", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsInFunction1(value: /* cb */ js.Function1[js.Array[String], js.Any] => Unit): Self = StObject.set(x, "isIn", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsInUndefined: Self = StObject.set(x, "isIn", js.undefined)
    
    @scala.inline
    def setIsInVarargs(value: String*): Self = StObject.set(x, "isIn", js.Array(value :_*))
    
    @scala.inline
    def setIsInteger(value: AttributeValidation[Boolean]): Self = StObject.set(x, "isInteger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsIntegerFunction0(value: () => Boolean): Self = StObject.set(x, "isInteger", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsIntegerFunction1(value: /* cb */ js.Function1[Boolean, js.Any] => Unit): Self = StObject.set(x, "isInteger", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsIntegerUndefined: Self = StObject.set(x, "isInteger", js.undefined)
    
    @scala.inline
    def setIsNotEmptyString(value: AttributeValidation[Boolean]): Self = StObject.set(x, "isNotEmptyString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsNotEmptyStringFunction0(value: () => Boolean): Self = StObject.set(x, "isNotEmptyString", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsNotEmptyStringFunction1(value: /* cb */ js.Function1[Boolean, js.Any] => Unit): Self = StObject.set(x, "isNotEmptyString", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsNotEmptyStringUndefined: Self = StObject.set(x, "isNotEmptyString", js.undefined)
    
    @scala.inline
    def setIsNotIn(value: AttributeValidation[js.Array[String]]): Self = StObject.set(x, "isNotIn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsNotInFunction0(value: () => js.Array[String]): Self = StObject.set(x, "isNotIn", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsNotInFunction1(value: /* cb */ js.Function1[js.Array[String], js.Any] => Unit): Self = StObject.set(x, "isNotIn", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsNotInUndefined: Self = StObject.set(x, "isNotIn", js.undefined)
    
    @scala.inline
    def setIsNotInVarargs(value: String*): Self = StObject.set(x, "isNotIn", js.Array(value :_*))
    
    @scala.inline
    def setIsNumber(value: AttributeValidation[Boolean]): Self = StObject.set(x, "isNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsNumberFunction0(value: () => Boolean): Self = StObject.set(x, "isNumber", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsNumberFunction1(value: /* cb */ js.Function1[Boolean, js.Any] => Unit): Self = StObject.set(x, "isNumber", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsNumberUndefined: Self = StObject.set(x, "isNumber", js.undefined)
    
    @scala.inline
    def setIsString(value: AttributeValidation[Boolean]): Self = StObject.set(x, "isString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsStringFunction0(value: () => Boolean): Self = StObject.set(x, "isString", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsStringFunction1(value: /* cb */ js.Function1[Boolean, js.Any] => Unit): Self = StObject.set(x, "isString", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsStringUndefined: Self = StObject.set(x, "isString", js.undefined)
    
    @scala.inline
    def setIsURL(value: AttributeValidation[Boolean]): Self = StObject.set(x, "isURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsURLFunction0(value: () => Boolean): Self = StObject.set(x, "isURL", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsURLFunction1(value: /* cb */ js.Function1[Boolean, js.Any] => Unit): Self = StObject.set(x, "isURL", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsURLUndefined: Self = StObject.set(x, "isURL", js.undefined)
    
    @scala.inline
    def setIsUUID(value: AttributeValidation[Boolean]): Self = StObject.set(x, "isUUID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsUUIDFunction0(value: () => Boolean): Self = StObject.set(x, "isUUID", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsUUIDFunction1(value: /* cb */ js.Function1[Boolean, js.Any] => Unit): Self = StObject.set(x, "isUUID", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsUUIDUndefined: Self = StObject.set(x, "isUUID", js.undefined)
    
    @scala.inline
    def setMax(value: AttributeValidation[Double]): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxFunction0(value: () => Double): Self = StObject.set(x, "max", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMaxFunction1(value: /* cb */ js.Function1[Double, js.Any] => Unit): Self = StObject.set(x, "max", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMaxLength(value: AttributeValidation[Double]): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxLengthFunction0(value: () => Double): Self = StObject.set(x, "maxLength", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMaxLengthFunction1(value: /* cb */ js.Function1[Double, js.Any] => Unit): Self = StObject.set(x, "maxLength", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
    
    @scala.inline
    def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    @scala.inline
    def setMin(value: AttributeValidation[Double]): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinFunction0(value: () => Double): Self = StObject.set(x, "min", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMinFunction1(value: /* cb */ js.Function1[Double, js.Any] => Unit): Self = StObject.set(x, "min", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMinLength(value: AttributeValidation[Double]): Self = StObject.set(x, "minLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinLengthFunction0(value: () => Double): Self = StObject.set(x, "minLength", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMinLengthFunction1(value: /* cb */ js.Function1[Double, js.Any] => Unit): Self = StObject.set(x, "minLength", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMinLengthUndefined: Self = StObject.set(x, "minLength", js.undefined)
    
    @scala.inline
    def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    @scala.inline
    def setRegex(value: AttributeValidation[RegExp]): Self = StObject.set(x, "regex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegexFunction0(value: () => RegExp): Self = StObject.set(x, "regex", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRegexFunction1(value: /* cb */ js.Function1[RegExp, js.Any] => Unit): Self = StObject.set(x, "regex", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRegexUndefined: Self = StObject.set(x, "regex", js.undefined)
  }
}
