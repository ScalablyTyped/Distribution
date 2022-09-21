package typings.vsoNodeApi.formInputInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InputValuesQuery extends StObject {
  
  var currentValues: StringDictionary[String]
  
  /**
    * The input values to return on input, and the result from the consumer on output.
    */
  var inputValues: js.Array[InputValues]
  
  /**
    * Subscription containing information about the publisher/consumer and the current input values
    */
  var resource: Any
}
object InputValuesQuery {
  
  inline def apply(currentValues: StringDictionary[String], inputValues: js.Array[InputValues], resource: Any): InputValuesQuery = {
    val __obj = js.Dynamic.literal(currentValues = currentValues.asInstanceOf[js.Any], inputValues = inputValues.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputValuesQuery]
  }
  
  extension [Self <: InputValuesQuery](x: Self) {
    
    inline def setCurrentValues(value: StringDictionary[String]): Self = StObject.set(x, "currentValues", value.asInstanceOf[js.Any])
    
    inline def setInputValues(value: js.Array[InputValues]): Self = StObject.set(x, "inputValues", value.asInstanceOf[js.Any])
    
    inline def setInputValuesVarargs(value: InputValues*): Self = StObject.set(x, "inputValues", js.Array(value*))
    
    inline def setResource(value: Any): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
  }
}
