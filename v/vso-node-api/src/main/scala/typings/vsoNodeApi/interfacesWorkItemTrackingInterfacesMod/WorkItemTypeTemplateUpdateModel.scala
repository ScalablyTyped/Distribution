package typings.vsoNodeApi.interfacesWorkItemTrackingInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkItemTypeTemplateUpdateModel extends StObject {
  
  /**
    * Describes the type of the action for the update request.
    */
  var actionType: ProvisioningActionType
  
  /**
    * Methodology to which the template belongs, eg. Agile, Scrum, CMMI.
    */
  var methodology: String
  
  /**
    * String representation of the work item type template.
    */
  var template: String
  
  /**
    * The type of the template described in the request body.
    */
  var templateType: TemplateType
}
object WorkItemTypeTemplateUpdateModel {
  
  inline def apply(
    actionType: ProvisioningActionType,
    methodology: String,
    template: String,
    templateType: TemplateType
  ): WorkItemTypeTemplateUpdateModel = {
    val __obj = js.Dynamic.literal(actionType = actionType.asInstanceOf[js.Any], methodology = methodology.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any], templateType = templateType.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkItemTypeTemplateUpdateModel]
  }
  
  extension [Self <: WorkItemTypeTemplateUpdateModel](x: Self) {
    
    inline def setActionType(value: ProvisioningActionType): Self = StObject.set(x, "actionType", value.asInstanceOf[js.Any])
    
    inline def setMethodology(value: String): Self = StObject.set(x, "methodology", value.asInstanceOf[js.Any])
    
    inline def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    inline def setTemplateType(value: TemplateType): Self = StObject.set(x, "templateType", value.asInstanceOf[js.Any])
  }
}
