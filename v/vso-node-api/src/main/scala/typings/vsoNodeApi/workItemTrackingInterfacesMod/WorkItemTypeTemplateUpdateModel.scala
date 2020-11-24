package typings.vsoNodeApi.workItemTrackingInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkItemTypeTemplateUpdateModel extends js.Object {
  
  /**
    * Describes the type of the action for the update request.
    */
  var actionType: ProvisioningActionType = js.native
  
  /**
    * Methodology to which the template belongs, eg. Agile, Scrum, CMMI.
    */
  var methodology: String = js.native
  
  /**
    * String representation of the work item type template.
    */
  var template: String = js.native
  
  /**
    * The type of the template described in the request body.
    */
  var templateType: TemplateType = js.native
}
object WorkItemTypeTemplateUpdateModel {
  
  @scala.inline
  def apply(
    actionType: ProvisioningActionType,
    methodology: String,
    template: String,
    templateType: TemplateType
  ): WorkItemTypeTemplateUpdateModel = {
    val __obj = js.Dynamic.literal(actionType = actionType.asInstanceOf[js.Any], methodology = methodology.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any], templateType = templateType.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkItemTypeTemplateUpdateModel]
  }
  
  @scala.inline
  implicit class WorkItemTypeTemplateUpdateModelOps[Self <: WorkItemTypeTemplateUpdateModel] (val x: Self) extends AnyVal {
    
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
    def setActionType(value: ProvisioningActionType): Self = this.set("actionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethodology(value: String): Self = this.set("methodology", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplate(value: String): Self = this.set("template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateType(value: TemplateType): Self = this.set("templateType", value.asInstanceOf[js.Any])
  }
}
