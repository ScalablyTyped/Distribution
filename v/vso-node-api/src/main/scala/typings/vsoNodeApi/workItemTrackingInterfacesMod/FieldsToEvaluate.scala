package typings.vsoNodeApi.workItemTrackingInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FieldsToEvaluate extends StObject {
  
  /**
    * Updated field values to evaluate.
    */
  var fieldUpdates: StringDictionary[js.Any]
  
  /**
    * Initial field values.
    */
  var fieldValues: StringDictionary[js.Any]
  
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
  
  @scala.inline
  def apply(
    fieldUpdates: StringDictionary[js.Any],
    fieldValues: StringDictionary[js.Any],
    fields: js.Array[String],
    rulesFrom: js.Array[String]
  ): FieldsToEvaluate = {
    val __obj = js.Dynamic.literal(fieldUpdates = fieldUpdates.asInstanceOf[js.Any], fieldValues = fieldValues.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any], rulesFrom = rulesFrom.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldsToEvaluate]
  }
  
  @scala.inline
  implicit class FieldsToEvaluateMutableBuilder[Self <: FieldsToEvaluate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFieldUpdates(value: StringDictionary[js.Any]): Self = StObject.set(x, "fieldUpdates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldValues(value: StringDictionary[js.Any]): Self = StObject.set(x, "fieldValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFields(value: js.Array[String]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldsVarargs(value: String*): Self = StObject.set(x, "fields", js.Array(value :_*))
    
    @scala.inline
    def setRulesFrom(value: js.Array[String]): Self = StObject.set(x, "rulesFrom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRulesFromVarargs(value: String*): Self = StObject.set(x, "rulesFrom", js.Array(value :_*))
  }
}
