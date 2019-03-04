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
    val __obj = js.Dynamic.literal(_links = _links, name = name, referenceName = referenceName, url = url)
  
    __obj.asInstanceOf[WorkItemTrackingReference]
  }
}

