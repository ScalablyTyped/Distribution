package typings.vsoNodeApi.workItemTrackingInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkItemTemplateReference extends WorkItemTrackingResource {
  /**
    * The description of the work item template.
    */
  var description: String
  /**
    * The identifier of the work item template.
    */
  var id: String
  /**
    * The name of the work item template.
    */
  var name: String
  /**
    * The name of the work item type.
    */
  var workItemTypeName: String
}

object WorkItemTemplateReference {
  @scala.inline
  def apply(
    _links: js.Any,
    description: String,
    id: String,
    name: String,
    url: String,
    workItemTypeName: String
  ): WorkItemTemplateReference = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], workItemTypeName = workItemTypeName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[WorkItemTemplateReference]
  }
}

