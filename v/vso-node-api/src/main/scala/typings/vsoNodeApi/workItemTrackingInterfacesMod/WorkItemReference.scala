package typings.vsoNodeApi.workItemTrackingInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkItemReference extends js.Object {
  /**
    * Work item ID.
    */
  var id: Double
  /**
    * REST API URL of the resource
    */
  var url: String
}

object WorkItemReference {
  @scala.inline
  def apply(id: Double, url: String): WorkItemReference = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[WorkItemReference]
  }
}

