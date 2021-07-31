package typings.vsoNodeApi.testInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FieldDetailsForTestResults extends StObject {
  
  /**
    * Group by field name
    */
  var fieldName: String
  
  /**
    * Group by field values
    */
  var groupsForField: js.Array[js.Any]
}
object FieldDetailsForTestResults {
  
  @scala.inline
  def apply(fieldName: String, groupsForField: js.Array[js.Any]): FieldDetailsForTestResults = {
    val __obj = js.Dynamic.literal(fieldName = fieldName.asInstanceOf[js.Any], groupsForField = groupsForField.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldDetailsForTestResults]
  }
  
  @scala.inline
  implicit class FieldDetailsForTestResultsMutableBuilder[Self <: FieldDetailsForTestResults] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFieldName(value: String): Self = StObject.set(x, "fieldName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupsForField(value: js.Array[js.Any]): Self = StObject.set(x, "groupsForField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupsForFieldVarargs(value: js.Any*): Self = StObject.set(x, "groupsForField", js.Array(value :_*))
  }
}
