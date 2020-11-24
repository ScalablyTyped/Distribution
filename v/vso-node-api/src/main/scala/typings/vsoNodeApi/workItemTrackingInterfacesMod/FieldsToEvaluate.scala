package typings.vsoNodeApi.workItemTrackingInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FieldsToEvaluate extends js.Object {
  
  /**
    * Updated field values to evaluate.
    */
  var fieldUpdates: StringDictionary[js.Any] = js.native
  
  /**
    * Initial field values.
    */
  var fieldValues: StringDictionary[js.Any] = js.native
  
  /**
    * List of fields to evaluate.
    */
  var fields: js.Array[String] = js.native
  
  /**
    * URL of the work item type for which the rules need to be executed.
    */
  var rulesFrom: js.Array[String] = js.native
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
  implicit class FieldsToEvaluateOps[Self <: FieldsToEvaluate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFieldUpdates(value: StringDictionary[js.Any]): Self = this.set("fieldUpdates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldValues(value: StringDictionary[js.Any]): Self = this.set("fieldValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldsVarargs(value: String*): Self = this.set("fields", js.Array(value :_*))
    
    @scala.inline
    def setFields(value: js.Array[String]): Self = this.set("fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRulesFromVarargs(value: String*): Self = this.set("rulesFrom", js.Array(value :_*))
    
    @scala.inline
    def setRulesFrom(value: js.Array[String]): Self = this.set("rulesFrom", value.asInstanceOf[js.Any])
  }
}
