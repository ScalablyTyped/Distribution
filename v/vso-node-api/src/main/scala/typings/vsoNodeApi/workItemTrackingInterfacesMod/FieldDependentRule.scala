package typings.vsoNodeApi.workItemTrackingInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FieldDependentRule
  extends StObject
     with WorkItemTrackingResource {
  
  /**
    * The dependent fields.
    */
  var dependentFields: js.Array[WorkItemFieldReference]
}
object FieldDependentRule {
  
  inline def apply(_links: Any, dependentFields: js.Array[WorkItemFieldReference], url: String): FieldDependentRule = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], dependentFields = dependentFields.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldDependentRule]
  }
  
  extension [Self <: FieldDependentRule](x: Self) {
    
    inline def setDependentFields(value: js.Array[WorkItemFieldReference]): Self = StObject.set(x, "dependentFields", value.asInstanceOf[js.Any])
    
    inline def setDependentFieldsVarargs(value: WorkItemFieldReference*): Self = StObject.set(x, "dependentFields", js.Array(value*))
  }
}
