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
    val __obj = js.Dynamic.literal(icon = icon, primaryColor = primaryColor, workItemTypeName = workItemTypeName)
  
    __obj.asInstanceOf[WorkItemColor]
  }
}

