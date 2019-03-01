package typings
package vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkItemTrackingReference extends WorkItemTrackingResource {
  /**
    * The name.
    */
  var name: java.lang.String
  /**
    * The reference name.
    */
  var referenceName: java.lang.String
}

object WorkItemTrackingReference {
  @scala.inline
  def apply(_links: js.Any, name: java.lang.String, referenceName: java.lang.String, url: java.lang.String): WorkItemTrackingReference = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("_links")(_links)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("referenceName")(referenceName)
    __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[WorkItemTrackingReference]
  }
}

