package typings.vsoNodeApi.workInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TeamFieldValuesPatch extends StObject {
  
  var defaultValue: String
  
  var values: js.Array[TeamFieldValue]
}
object TeamFieldValuesPatch {
  
  @scala.inline
  def apply(defaultValue: String, values: js.Array[TeamFieldValue]): TeamFieldValuesPatch = {
    val __obj = js.Dynamic.literal(defaultValue = defaultValue.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamFieldValuesPatch]
  }
  
  @scala.inline
  implicit class TeamFieldValuesPatchMutableBuilder[Self <: TeamFieldValuesPatch] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultValue(value: String): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValues(value: js.Array[TeamFieldValue]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesVarargs(value: TeamFieldValue*): Self = StObject.set(x, "values", js.Array(value :_*))
  }
}
