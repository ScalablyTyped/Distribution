package typings
package vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkItemTemplateReference extends WorkItemTrackingResource {
  /**
    * The description of the work item template.
    */
  var description: java.lang.String
  /**
    * The identifier of the work item template.
    */
  var id: java.lang.String
  /**
    * The name of the work item template.
    */
  var name: java.lang.String
  /**
    * The name of the work item type.
    */
  var workItemTypeName: java.lang.String
}

object WorkItemTemplateReference {
  @scala.inline
  def apply(
    _links: js.Any,
    description: java.lang.String,
    id: java.lang.String,
    name: java.lang.String,
    url: java.lang.String,
    workItemTypeName: java.lang.String
  ): WorkItemTemplateReference = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("_links")(_links)
    __obj.updateDynamic("description")(description)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("url")(url)
    __obj.updateDynamic("workItemTypeName")(workItemTypeName)
    __obj.asInstanceOf[WorkItemTemplateReference]
  }
}

