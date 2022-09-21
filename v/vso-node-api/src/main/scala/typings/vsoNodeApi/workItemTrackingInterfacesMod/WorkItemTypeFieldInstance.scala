package typings.vsoNodeApi.workItemTrackingInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkItemTypeFieldInstance
  extends StObject
     with WorkItemFieldReference {
  
  /**
    * The list of field allowed values.
    */
  var allowedValues: js.Array[String]
  
  /**
    * Indicates whether field value is always required.
    */
  var alwaysRequired: Boolean
  
  /**
    * The list of dependent fields.
    */
  var dependentFields: js.Array[WorkItemFieldReference]
  
  /**
    * Gets the help text for the field.
    */
  var helpText: String
}
object WorkItemTypeFieldInstance {
  
  inline def apply(
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
  
  extension [Self <: WorkItemTypeFieldInstance](x: Self) {
    
    inline def setAllowedValues(value: js.Array[String]): Self = StObject.set(x, "allowedValues", value.asInstanceOf[js.Any])
    
    inline def setAllowedValuesVarargs(value: String*): Self = StObject.set(x, "allowedValues", js.Array(value*))
    
    inline def setAlwaysRequired(value: Boolean): Self = StObject.set(x, "alwaysRequired", value.asInstanceOf[js.Any])
    
    inline def setDependentFields(value: js.Array[WorkItemFieldReference]): Self = StObject.set(x, "dependentFields", value.asInstanceOf[js.Any])
    
    inline def setDependentFieldsVarargs(value: WorkItemFieldReference*): Self = StObject.set(x, "dependentFields", js.Array(value*))
    
    inline def setHelpText(value: String): Self = StObject.set(x, "helpText", value.asInstanceOf[js.Any])
  }
}
