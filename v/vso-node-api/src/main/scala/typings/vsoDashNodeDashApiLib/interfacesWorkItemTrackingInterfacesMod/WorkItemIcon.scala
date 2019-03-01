package typings
package vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkItemIcon extends js.Object {
  /**
    * The identifier of the icon.
    */
  var id: java.lang.String
  /**
    * The REST URL of the resource.
    */
  var url: java.lang.String
}

object WorkItemIcon {
  @scala.inline
  def apply(id: java.lang.String, url: java.lang.String): WorkItemIcon = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[WorkItemIcon]
  }
}

