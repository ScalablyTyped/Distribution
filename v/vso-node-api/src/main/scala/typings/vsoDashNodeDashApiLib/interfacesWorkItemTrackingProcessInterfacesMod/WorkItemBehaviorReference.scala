package typings
package vsoDashNodeDashApiLib.interfacesWorkItemTrackingProcessInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkItemBehaviorReference extends js.Object {
  var id: java.lang.String
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

