package typings.vsoNodeApi.workItemTrackingInterfacesMod

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
}

