package typings.vsoNodeApi.workItemTrackingInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkItemIcon extends js.Object {
  /**
    * The identifier of the icon.
    */
  var id: String
  /**
    * The REST URL of the resource.
    */
  var url: String
}

object WorkItemIcon {
  @scala.inline
  def apply(id: String, url: String): WorkItemIcon = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkItemIcon]
  }
}

