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

