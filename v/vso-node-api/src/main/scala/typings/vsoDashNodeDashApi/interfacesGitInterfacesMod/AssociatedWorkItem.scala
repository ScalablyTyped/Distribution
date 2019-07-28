package typings.vsoDashNodeDashApi.interfacesGitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssociatedWorkItem extends js.Object {
  var assignedTo: String
  /**
    * Id of associated the work item.
    */
  var id: Double
  var state: String
  var title: String
  /**
    * REST Url of the work item.
    */
  var url: String
  var webUrl: String
  var workItemType: String
}

object AssociatedWorkItem {
  @scala.inline
  def apply(
    assignedTo: String,
    id: Double,
    state: String,
    title: String,
    url: String,
    webUrl: String,
    workItemType: String
  ): AssociatedWorkItem = {
    val __obj = js.Dynamic.literal(assignedTo = assignedTo, id = id, state = state, title = title, url = url, webUrl = webUrl, workItemType = workItemType)
  
    __obj.asInstanceOf[AssociatedWorkItem]
  }
}

