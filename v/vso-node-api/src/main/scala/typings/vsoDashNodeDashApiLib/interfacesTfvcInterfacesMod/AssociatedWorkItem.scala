package typings
package vsoDashNodeDashApiLib.interfacesTfvcInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssociatedWorkItem extends js.Object {
  var assignedTo: java.lang.String
  /**
    * Id of associated the work item.
    */
  var id: scala.Double
  var state: java.lang.String
  var title: java.lang.String
  /**
    * REST Url of the work item.
    */
  var url: java.lang.String
  var webUrl: java.lang.String
  var workItemType: java.lang.String
}

object AssociatedWorkItem {
  @scala.inline
  def apply(
    assignedTo: java.lang.String,
    id: scala.Double,
    state: java.lang.String,
    title: java.lang.String,
    url: java.lang.String,
    webUrl: java.lang.String,
    workItemType: java.lang.String
  ): AssociatedWorkItem = {
    val __obj = js.Dynamic.literal(assignedTo = assignedTo, id = id, state = state, title = title, url = url, webUrl = webUrl, workItemType = workItemType)
  
    __obj.asInstanceOf[AssociatedWorkItem]
  }
}

