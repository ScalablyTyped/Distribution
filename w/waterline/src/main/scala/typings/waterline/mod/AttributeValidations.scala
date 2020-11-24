package typings.waterline.mod

import typings.std.Date
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AttributeValidations extends js.Object {
  
  var custom: js.UndefOr[AttributeValidation[js.Function]] = js.native
  
  var isAfter: js.UndefOr[AttributeValidation[Date]] = js.native
  
  var isBefore: js.UndefOr[AttributeValidation[Date]] = js.native
  
  var isBoolean: js.UndefOr[AttributeValidation[Boolean]] = js.native
  
  var isCreditCard: js.UndefOr[AttributeValidation[Boolean]] = js.native
  
  var isEmail: js.UndefOr[AttributeValidation[Boolean]] = js.native
  
  var isHexColor: js.UndefOr[AttributeValidation[Boolean]] = js.native
  
  var isIP: js.UndefOr[AttributeValidation[Boolean]] = js.native
  
  var isIn: js.UndefOr[AttributeValidation[js.Array[String]]] = js.native
  
  var isInteger: js.UndefOr[AttributeValidation[Boolean]] = js.native
  
  var isNotEmptyString: js.UndefOr[AttributeValidation[Boolean]] = js.native
  
  var isNotIn: js.UndefOr[AttributeValidation[js.Array[String]]] = js.native
  
  var isNumber: js.UndefOr[AttributeValidation[Boolean]] = js.native
  
  var isString: js.UndefOr[AttributeValidation[Boolean]] = js.native
  
  var isURL: js.UndefOr[AttributeValidation[Boolean]] = js.native
  
  var isUUID: js.UndefOr[AttributeValidation[Boolean]] = js.native
  
  var max: js.UndefOr[AttributeValidation[Double]] = js.native
  
  var maxLength: js.UndefOr[AttributeValidation[Double]] = js.native
  
  var min: js.UndefOr[AttributeValidation[Double]] = js.native
  
  var minLength: js.UndefOr[AttributeValidation[Double]] = js.native
  
  var regex: js.UndefOr[AttributeValidation[RegExp]] = js.native
}
object AttributeValidations {
  
  @scala.inline
  def apply(): AttributeValidations = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AttributeValidations]
  }
  
  @scala.inline
  implicit class AttributeValidationsOps[Self <: AttributeValidations] (val x: Self) extends AnyVal {
    
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
    def setCustomFunction1(value: /* cb */ js.Function1[js.Function, js.Any] => Unit): Self = this.set("custom", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCustomFunction0(value: () => js.Function): Self = this.set("custom", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCustom(value: AttributeValidation[js.Function]): Self = this.set("custom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustom: Self = this.set("custom", js.undefined)
    
    @scala.inline
    def setIsAfterFunction1(value: /* cb */ js.Function1[Date, js.Any] => Unit): Self = this.set("isAfter", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsAfterFunction0(value: () => Date): Self = this.set("isAfter", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsAfter(value: AttributeValidation[Date]): Self = this.set("isAfter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsAfter: Self = this.set("isAfter", js.undefined)
    
    @scala.inline
    def setIsBeforeFunction1(value: /* cb */ js.Function1[Date, js.Any] => Unit): Self = this.set("isBefore", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsBeforeFunction0(value: () => Date): Self = this.set("isBefore", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsBefore(value: AttributeValidation[Date]): Self = this.set("isBefore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsBefore: Self = this.set("isBefore", js.undefined)
    
    @scala.inline
    def setIsBooleanFunction1(value: /* cb */ js.Function1[Boolean, js.Any] => Unit): Self = this.set("isBoolean", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsBooleanFunction0(value: () => Boolean): Self = this.set("isBoolean", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsBoolean(value: AttributeValidation[Boolean]): Self = this.set("isBoolean", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsBoolean: Self = this.set("isBoolean", js.undefined)
    
    @scala.inline
    def setIsCreditCardFunction1(value: /* cb */ js.Function1[Boolean, js.Any] => Unit): Self = this.set("isCreditCard", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsCreditCardFunction0(value: () => Boolean): Self = this.set("isCreditCard", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsCreditCard(value: AttributeValidation[Boolean]): Self = this.set("isCreditCard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsCreditCard: Self = this.set("isCreditCard", js.undefined)
    
    @scala.inline
    def setIsEmailFunction1(value: /* cb */ js.Function1[Boolean, js.Any] => Unit): Self = this.set("isEmail", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsEmailFunction0(value: () => Boolean): Self = this.set("isEmail", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsEmail(value: AttributeValidation[Boolean]): Self = this.set("isEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsEmail: Self = this.set("isEmail", js.undefined)
    
    @scala.inline
    def setIsHexColorFunction1(value: /* cb */ js.Function1[Boolean, js.Any] => Unit): Self = this.set("isHexColor", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsHexColorFunction0(value: () => Boolean): Self = this.set("isHexColor", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsHexColor(value: AttributeValidation[Boolean]): Self = this.set("isHexColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsHexColor: Self = this.set("isHexColor", js.undefined)
    
    @scala.inline
    def setIsIPFunction1(value: /* cb */ js.Function1[Boolean, js.Any] => Unit): Self = this.set("isIP", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsIPFunction0(value: () => Boolean): Self = this.set("isIP", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsIP(value: AttributeValidation[Boolean]): Self = this.set("isIP", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsIP: Self = this.set("isIP", js.undefined)
    
    @scala.inline
    def setIsInVarargs(value: String*): Self = this.set("isIn", js.Array(value :_*))
    
    @scala.inline
    def setIsInFunction1(value: /* cb */ js.Function1[js.Array[String], js.Any] => Unit): Self = this.set("isIn", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsInFunction0(value: () => js.Array[String]): Self = this.set("isIn", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsIn(value: AttributeValidation[js.Array[String]]): Self = this.set("isIn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsIn: Self = this.set("isIn", js.undefined)
    
    @scala.inline
    def setIsIntegerFunction1(value: /* cb */ js.Function1[Boolean, js.Any] => Unit): Self = this.set("isInteger", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsIntegerFunction0(value: () => Boolean): Self = this.set("isInteger", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsInteger(value: AttributeValidation[Boolean]): Self = this.set("isInteger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsInteger: Self = this.set("isInteger", js.undefined)
    
    @scala.inline
    def setIsNotEmptyStringFunction1(value: /* cb */ js.Function1[Boolean, js.Any] => Unit): Self = this.set("isNotEmptyString", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsNotEmptyStringFunction0(value: () => Boolean): Self = this.set("isNotEmptyString", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsNotEmptyString(value: AttributeValidation[Boolean]): Self = this.set("isNotEmptyString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsNotEmptyString: Self = this.set("isNotEmptyString", js.undefined)
    
    @scala.inline
    def setIsNotInVarargs(value: String*): Self = this.set("isNotIn", js.Array(value :_*))
    
    @scala.inline
    def setIsNotInFunction1(value: /* cb */ js.Function1[js.Array[String], js.Any] => Unit): Self = this.set("isNotIn", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsNotInFunction0(value: () => js.Array[String]): Self = this.set("isNotIn", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsNotIn(value: AttributeValidation[js.Array[String]]): Self = this.set("isNotIn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsNotIn: Self = this.set("isNotIn", js.undefined)
    
    @scala.inline
    def setIsNumberFunction1(value: /* cb */ js.Function1[Boolean, js.Any] => Unit): Self = this.set("isNumber", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsNumberFunction0(value: () => Boolean): Self = this.set("isNumber", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsNumber(value: AttributeValidation[Boolean]): Self = this.set("isNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsNumber: Self = this.set("isNumber", js.undefined)
    
    @scala.inline
    def setIsStringFunction1(value: /* cb */ js.Function1[Boolean, js.Any] => Unit): Self = this.set("isString", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsStringFunction0(value: () => Boolean): Self = this.set("isString", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsString(value: AttributeValidation[Boolean]): Self = this.set("isString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsString: Self = this.set("isString", js.undefined)
    
    @scala.inline
    def setIsURLFunction1(value: /* cb */ js.Function1[Boolean, js.Any] => Unit): Self = this.set("isURL", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsURLFunction0(value: () => Boolean): Self = this.set("isURL", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsURL(value: AttributeValidation[Boolean]): Self = this.set("isURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsURL: Self = this.set("isURL", js.undefined)
    
    @scala.inline
    def setIsUUIDFunction1(value: /* cb */ js.Function1[Boolean, js.Any] => Unit): Self = this.set("isUUID", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsUUIDFunction0(value: () => Boolean): Self = this.set("isUUID", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsUUID(value: AttributeValidation[Boolean]): Self = this.set("isUUID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsUUID: Self = this.set("isUUID", js.undefined)
    
    @scala.inline
    def setMaxFunction1(value: /* cb */ js.Function1[Double, js.Any] => Unit): Self = this.set("max", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMaxFunction0(value: () => Double): Self = this.set("max", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMax(value: AttributeValidation[Double]): Self = this.set("max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    
    @scala.inline
    def setMaxLengthFunction1(value: /* cb */ js.Function1[Double, js.Any] => Unit): Self = this.set("maxLength", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMaxLengthFunction0(value: () => Double): Self = this.set("maxLength", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMaxLength(value: AttributeValidation[Double]): Self = this.set("maxLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxLength: Self = this.set("maxLength", js.undefined)
    
    @scala.inline
    def setMinFunction1(value: /* cb */ js.Function1[Double, js.Any] => Unit): Self = this.set("min", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMinFunction0(value: () => Double): Self = this.set("min", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMin(value: AttributeValidation[Double]): Self = this.set("min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMin: Self = this.set("min", js.undefined)
    
    @scala.inline
    def setMinLengthFunction1(value: /* cb */ js.Function1[Double, js.Any] => Unit): Self = this.set("minLength", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMinLengthFunction0(value: () => Double): Self = this.set("minLength", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMinLength(value: AttributeValidation[Double]): Self = this.set("minLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinLength: Self = this.set("minLength", js.undefined)
    
    @scala.inline
    def setRegexFunction1(value: /* cb */ js.Function1[RegExp, js.Any] => Unit): Self = this.set("regex", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRegexFunction0(value: () => RegExp): Self = this.set("regex", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRegex(value: AttributeValidation[RegExp]): Self = this.set("regex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegex: Self = this.set("regex", js.undefined)
  }
}
