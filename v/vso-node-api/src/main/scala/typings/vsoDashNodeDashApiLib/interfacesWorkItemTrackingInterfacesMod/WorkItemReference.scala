package typings
package vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkItemReference extends js.Object {
  /**
    * Work item ID.
    */
  var id: scala.Double
  /**
    * REST API URL of the resource
    */
  var url: java.lang.String
}

object WorkItemReference {
  @scala.inline
  def apply(id: scala.Double, url: java.lang.String): WorkItemReference = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[WorkItemReference]
  }
}

