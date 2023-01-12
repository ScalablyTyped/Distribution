package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IValidatorOwner extends StObject {
  
  def getDataFilteredProperties(): Any
  
  def getDataFilteredValues(): Any
  
  def getValidatorTitle(): String
  
  def getValidators(): js.Array[SurveyValidator]
  
  var validatedValue: Any
}
object IValidatorOwner {
  
  inline def apply(
    getDataFilteredProperties: () => Any,
    getDataFilteredValues: () => Any,
    getValidatorTitle: () => String,
    getValidators: () => js.Array[SurveyValidator],
    validatedValue: Any
  ): IValidatorOwner = {
    val __obj = js.Dynamic.literal(getDataFilteredProperties = js.Any.fromFunction0(getDataFilteredProperties), getDataFilteredValues = js.Any.fromFunction0(getDataFilteredValues), getValidatorTitle = js.Any.fromFunction0(getValidatorTitle), getValidators = js.Any.fromFunction0(getValidators), validatedValue = validatedValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[IValidatorOwner]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IValidatorOwner] (val x: Self) extends AnyVal {
    
    inline def setGetDataFilteredProperties(value: () => Any): Self = StObject.set(x, "getDataFilteredProperties", js.Any.fromFunction0(value))
    
    inline def setGetDataFilteredValues(value: () => Any): Self = StObject.set(x, "getDataFilteredValues", js.Any.fromFunction0(value))
    
    inline def setGetValidatorTitle(value: () => String): Self = StObject.set(x, "getValidatorTitle", js.Any.fromFunction0(value))
    
    inline def setGetValidators(value: () => js.Array[SurveyValidator]): Self = StObject.set(x, "getValidators", js.Any.fromFunction0(value))
    
    inline def setValidatedValue(value: Any): Self = StObject.set(x, "validatedValue", value.asInstanceOf[js.Any])
  }
}
