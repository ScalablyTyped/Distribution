package typings
package vsoDashNodeDashApiLib.interfacesWorkItemTrackingProcessDefinitionsInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkItemBehaviorReference extends js.Object {
  /**
    * The ID of the reference behavior
    */
  var id: java.lang.String
  /**
    * The url of the reference behavior
    */
  var url: java.lang.String
}

object WorkItemBehaviorReference {
  @scala.inline
  def apply(id: java.lang.String, url: java.lang.String): WorkItemBehaviorReference = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[WorkItemBehaviorReference]
  }
}

