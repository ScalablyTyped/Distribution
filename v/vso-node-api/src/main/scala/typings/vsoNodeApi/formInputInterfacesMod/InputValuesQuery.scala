package typings.vsoNodeApi.formInputInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InputValuesQuery extends StObject {
  
  var currentValues: StringDictionary[String] = js.native
  
  /**
    * The input values to return on input, and the result from the consumer on output.
    */
  var inputValues: js.Array[InputValues] = js.native
  
  /**
    * Subscription containing information about the publisher/consumer and the current input values
    */
  var resource: js.Any = js.native
}
object InputValuesQuery {
  
  @scala.inline
  def apply(currentValues: StringDictionary[String], inputValues: js.Array[InputValues], resource: js.Any): InputValuesQuery = {
    val __obj = js.Dynamic.literal(currentValues = currentValues.asInstanceOf[js.Any], inputValues = inputValues.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputValuesQuery]
  }
  
  @scala.inline
  implicit class InputValuesQueryMutableBuilder[Self <: InputValuesQuery] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurrentValues(value: StringDictionary[String]): Self = StObject.set(x, "currentValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputValues(value: js.Array[InputValues]): Self = StObject.set(x, "inputValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputValuesVarargs(value: InputValues*): Self = StObject.set(x, "inputValues", js.Array(value :_*))
    
    @scala.inline
    def setResource(value: js.Any): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
  }
}
