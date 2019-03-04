package typings
package vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkItemTypeTemplateUpdateModel extends js.Object {
  /**
    * Describes the type of the action for the update request.
    */
  var actionType: ProvisioningActionType
  /**
    * Methodology to which the template belongs, eg. Agile, Scrum, CMMI.
    */
  var methodology: java.lang.String
  /**
    * String representation of the work item type template.
    */
  var template: java.lang.String
  /**
    * The type of the template described in the request body.
    */
  var templateType: TemplateType
}

object WorkItemTypeTemplateUpdateModel {
  @scala.inline
  def apply(
    actionType: ProvisioningActionType,
    methodology: java.lang.String,
    template: java.lang.String,
    templateType: TemplateType
  ): WorkItemTypeTemplateUpdateModel = {
    val __obj = js.Dynamic.literal(actionType = actionType, methodology = methodology, template = template, templateType = templateType)
  
    __obj.asInstanceOf[WorkItemTypeTemplateUpdateModel]
  }
}

