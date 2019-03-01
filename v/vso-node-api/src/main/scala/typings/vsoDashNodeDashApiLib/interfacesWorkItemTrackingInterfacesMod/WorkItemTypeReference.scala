package typings
package vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkItemTypeReference extends WorkItemTrackingResourceReference {
  /**
    * Name of the work item type.
    */
  var name: java.lang.String
}

object WorkItemTypeReference {
  @scala.inline
  def apply(name: java.lang.String, url: java.lang.String): WorkItemTypeReference = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[WorkItemTypeReference]
  }
}

