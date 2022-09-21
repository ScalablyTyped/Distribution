package typings.vsoNodeApi.formInputInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InputValues extends StObject {
  
  /**
    * The default value to use for this input
    */
  var defaultValue: String
  
  /**
    * Errors encountered while computing dynamic values.
    */
  var error: InputValuesError
  
  /**
    * The id of the input
    */
  var inputId: String
  
  /**
    * Should this input be disabled
    */
  var isDisabled: Boolean
  
  /**
    * Should the value be restricted to one of the values in the PossibleValues (True) or are the values in PossibleValues just a suggestion (False)
    */
  var isLimitedToPossibleValues: Boolean
  
  /**
    * Should this input be made read-only
    */
  var isReadOnly: Boolean
  
  /**
    * Possible values that this input can take
    */
  var possibleValues: js.Array[InputValue]
}
object InputValues {
  
  inline def apply(
    defaultValue: String,
    error: InputValuesError,
    inputId: String,
    isDisabled: Boolean,
    isLimitedToPossibleValues: Boolean,
    isReadOnly: Boolean,
    possibleValues: js.Array[InputValue]
  ): InputValues = {
    val __obj = js.Dynamic.literal(defaultValue = defaultValue.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], inputId = inputId.asInstanceOf[js.Any], isDisabled = isDisabled.asInstanceOf[js.Any], isLimitedToPossibleValues = isLimitedToPossibleValues.asInstanceOf[js.Any], isReadOnly = isReadOnly.asInstanceOf[js.Any], possibleValues = possibleValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputValues]
  }
  
  extension [Self <: InputValues](x: Self) {
    
    inline def setDefaultValue(value: String): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    inline def setError(value: InputValuesError): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setInputId(value: String): Self = StObject.set(x, "inputId", value.asInstanceOf[js.Any])
    
    inline def setIsDisabled(value: Boolean): Self = StObject.set(x, "isDisabled", value.asInstanceOf[js.Any])
    
    inline def setIsLimitedToPossibleValues(value: Boolean): Self = StObject.set(x, "isLimitedToPossibleValues", value.asInstanceOf[js.Any])
    
    inline def setIsReadOnly(value: Boolean): Self = StObject.set(x, "isReadOnly", value.asInstanceOf[js.Any])
    
    inline def setPossibleValues(value: js.Array[InputValue]): Self = StObject.set(x, "possibleValues", value.asInstanceOf[js.Any])
    
    inline def setPossibleValuesVarargs(value: InputValue*): Self = StObject.set(x, "possibleValues", js.Array(value*))
  }
}
