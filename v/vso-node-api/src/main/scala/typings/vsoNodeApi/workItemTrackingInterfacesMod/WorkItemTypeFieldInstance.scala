package typings.vsoNodeApi.workItemTrackingInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkItemTypeFieldInstance extends WorkItemFieldReference {
  
  /**
    * The list of field allowed values.
    */
  var allowedValues: js.Array[String] = js.native
  
  /**
    * Indicates whether field value is always required.
    */
  var alwaysRequired: Boolean = js.native
  
  /**
    * The list of dependent fields.
    */
  var dependentFields: js.Array[WorkItemFieldReference] = js.native
  
  /**
    * Gets the help text for the field.
    */
  var helpText: String = js.native
}
object WorkItemTypeFieldInstance {
  
  @scala.inline
  def apply(
    allowedValues: js.Array[String],
    alwaysRequired: Boolean,
    dependentFields: js.Array[WorkItemFieldReference],
    helpText: String,
    name: String,
    referenceName: String,
    url: String
  ): WorkItemTypeFieldInstance = {
    val __obj = js.Dynamic.literal(allowedValues = allowedValues.asInstanceOf[js.Any], alwaysRequired = alwaysRequired.asInstanceOf[js.Any], dependentFields = dependentFields.asInstanceOf[js.Any], helpText = helpText.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], referenceName = referenceName.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkItemTypeFieldInstance]
  }
  
  @scala.inline
  implicit class WorkItemTypeFieldInstanceMutableBuilder[Self <: WorkItemTypeFieldInstance] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowedValues(value: js.Array[String]): Self = StObject.set(x, "allowedValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowedValuesVarargs(value: String*): Self = StObject.set(x, "allowedValues", js.Array(value :_*))
    
    @scala.inline
    def setAlwaysRequired(value: Boolean): Self = StObject.set(x, "alwaysRequired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDependentFields(value: js.Array[WorkItemFieldReference]): Self = StObject.set(x, "dependentFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDependentFieldsVarargs(value: WorkItemFieldReference*): Self = StObject.set(x, "dependentFields", js.Array(value :_*))
    
    @scala.inline
    def setHelpText(value: String): Self = StObject.set(x, "helpText", value.asInstanceOf[js.Any])
  }
}
