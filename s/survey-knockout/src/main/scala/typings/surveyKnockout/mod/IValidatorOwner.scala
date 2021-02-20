package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IValidatorOwner extends StObject {
  
  def getDataFilteredProperties(): js.Any = js.native
  
  def getDataFilteredValues(): js.Any = js.native
  
  def getValidatorTitle(): String = js.native
  
  def getValidators(): js.Array[SurveyValidator] = js.native
  
  var validatedValue: js.Any = js.native
}
object IValidatorOwner {
  
  @scala.inline
  def apply(
    getDataFilteredProperties: () => js.Any,
    getDataFilteredValues: () => js.Any,
    getValidatorTitle: () => String,
    getValidators: () => js.Array[SurveyValidator],
    validatedValue: js.Any
  ): IValidatorOwner = {
    val __obj = js.Dynamic.literal(getDataFilteredProperties = js.Any.fromFunction0(getDataFilteredProperties), getDataFilteredValues = js.Any.fromFunction0(getDataFilteredValues), getValidatorTitle = js.Any.fromFunction0(getValidatorTitle), getValidators = js.Any.fromFunction0(getValidators), validatedValue = validatedValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[IValidatorOwner]
  }
  
  @scala.inline
  implicit class IValidatorOwnerMutableBuilder[Self <: IValidatorOwner] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetDataFilteredProperties(value: () => js.Any): Self = StObject.set(x, "getDataFilteredProperties", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetDataFilteredValues(value: () => js.Any): Self = StObject.set(x, "getDataFilteredValues", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetValidatorTitle(value: () => String): Self = StObject.set(x, "getValidatorTitle", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetValidators(value: () => js.Array[SurveyValidator]): Self = StObject.set(x, "getValidators", js.Any.fromFunction0(value))
    
    @scala.inline
    def setValidatedValue(value: js.Any): Self = StObject.set(x, "validatedValue", value.asInstanceOf[js.Any])
  }
}
