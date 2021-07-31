package typings.stylableCore.anon

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OutputValue extends StObject {
  
  var outputValue: String
  
  var topLevelType: js.Any
  
  var typeError: Error
}
object OutputValue {
  
  @scala.inline
  def apply(outputValue: String, topLevelType: js.Any, typeError: Error): OutputValue = {
    val __obj = js.Dynamic.literal(outputValue = outputValue.asInstanceOf[js.Any], topLevelType = topLevelType.asInstanceOf[js.Any], typeError = typeError.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutputValue]
  }
  
  @scala.inline
  implicit class OutputValueMutableBuilder[Self <: OutputValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOutputValue(value: String): Self = StObject.set(x, "outputValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopLevelType(value: js.Any): Self = StObject.set(x, "topLevelType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeError(value: Error): Self = StObject.set(x, "typeError", value.asInstanceOf[js.Any])
  }
}
