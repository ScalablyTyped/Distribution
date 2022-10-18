package typings.vsoNodeApi.interfacesWorkItemTrackingInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FieldsToEvaluate extends StObject {
  
  /**
    * Updated field values to evaluate.
    */
  var fieldUpdates: StringDictionary[Any]
  
  /**
    * Initial field values.
    */
  var fieldValues: StringDictionary[Any]
  
  /**
    * List of fields to evaluate.
    */
  var fields: js.Array[String]
  
  /**
    * URL of the work item type for which the rules need to be executed.
    */
  var rulesFrom: js.Array[String]
}
object FieldsToEvaluate {
  
  inline def apply(
    fieldUpdates: StringDictionary[Any],
    fieldValues: StringDictionary[Any],
    fields: js.Array[String],
    rulesFrom: js.Array[String]
  ): FieldsToEvaluate = {
    val __obj = js.Dynamic.literal(fieldUpdates = fieldUpdates.asInstanceOf[js.Any], fieldValues = fieldValues.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any], rulesFrom = rulesFrom.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldsToEvaluate]
  }
  
  extension [Self <: FieldsToEvaluate](x: Self) {
    
    inline def setFieldUpdates(value: StringDictionary[Any]): Self = StObject.set(x, "fieldUpdates", value.asInstanceOf[js.Any])
    
    inline def setFieldValues(value: StringDictionary[Any]): Self = StObject.set(x, "fieldValues", value.asInstanceOf[js.Any])
    
    inline def setFields(value: js.Array[String]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsVarargs(value: String*): Self = StObject.set(x, "fields", js.Array(value*))
    
    inline def setRulesFrom(value: js.Array[String]): Self = StObject.set(x, "rulesFrom", value.asInstanceOf[js.Any])
    
    inline def setRulesFromVarargs(value: String*): Self = StObject.set(x, "rulesFrom", js.Array(value*))
  }
}
