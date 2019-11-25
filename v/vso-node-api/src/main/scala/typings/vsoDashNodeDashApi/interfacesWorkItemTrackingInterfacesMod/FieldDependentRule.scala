package typings.vsoDashNodeDashApi.interfacesWorkItemTrackingInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FieldDependentRule extends WorkItemTrackingResource {
  /**
    * The dependent fields.
    */
  var dependentFields: js.Array[WorkItemFieldReference]
}

object FieldDependentRule {
  @scala.inline
  def apply(_links: js.Any, dependentFields: js.Array[WorkItemFieldReference], url: String): FieldDependentRule = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], dependentFields = dependentFields.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FieldDependentRule]
  }
}

