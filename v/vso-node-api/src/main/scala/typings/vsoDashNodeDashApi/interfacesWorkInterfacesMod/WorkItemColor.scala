package typings.vsoDashNodeDashApi.interfacesWorkInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkItemColor extends js.Object {
  var icon: String
  var primaryColor: String
  var workItemTypeName: String
}

object WorkItemColor {
  @scala.inline
  def apply(icon: String, primaryColor: String, workItemTypeName: String): WorkItemColor = {
    val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any], primaryColor = primaryColor.asInstanceOf[js.Any], workItemTypeName = workItemTypeName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[WorkItemColor]
  }
}

