package typings.vsoNodeApi.interfacesCommonFormInputInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InputValidation extends StObject {
  
  var dataType: InputDataType
  
  var isRequired: Boolean
  
  var maxLength: Double
  
  var maxValue: Double
  
  var minLength: Double
  
  var minValue: Double
  
  var pattern: String
  
  var patternMismatchErrorMessage: String
}
object InputValidation {
  
  inline def apply(
    dataType: InputDataType,
    isRequired: Boolean,
    maxLength: Double,
    maxValue: Double,
    minLength: Double,
    minValue: Double,
    pattern: String,
    patternMismatchErrorMessage: String
  ): InputValidation = {
    val __obj = js.Dynamic.literal(dataType = dataType.asInstanceOf[js.Any], isRequired = isRequired.asInstanceOf[js.Any], maxLength = maxLength.asInstanceOf[js.Any], maxValue = maxValue.asInstanceOf[js.Any], minLength = minLength.asInstanceOf[js.Any], minValue = minValue.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any], patternMismatchErrorMessage = patternMismatchErrorMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputValidation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InputValidation] (val x: Self) extends AnyVal {
    
    inline def setDataType(value: InputDataType): Self = StObject.set(x, "dataType", value.asInstanceOf[js.Any])
    
    inline def setIsRequired(value: Boolean): Self = StObject.set(x, "isRequired", value.asInstanceOf[js.Any])
    
    inline def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
    
    inline def setMaxValue(value: Double): Self = StObject.set(x, "maxValue", value.asInstanceOf[js.Any])
    
    inline def setMinLength(value: Double): Self = StObject.set(x, "minLength", value.asInstanceOf[js.Any])
    
    inline def setMinValue(value: Double): Self = StObject.set(x, "minValue", value.asInstanceOf[js.Any])
    
    inline def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
    
    inline def setPatternMismatchErrorMessage(value: String): Self = StObject.set(x, "patternMismatchErrorMessage", value.asInstanceOf[js.Any])
  }
}
