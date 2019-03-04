package typings
package vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkItemRelationType extends WorkItemTrackingReference {
  /**
    * The collection of relation type attributes.
    */
  var attributes: org.scalablytyped.runtime.StringDictionary[js.Any]
}

object WorkItemRelationType {
  @scala.inline
  def apply(
    _links: js.Any,
    attributes: org.scalablytyped.runtime.StringDictionary[js.Any],
    name: java.lang.String,
    referenceName: java.lang.String,
    url: java.lang.String
  ): WorkItemRelationType = {
    val __obj = js.Dynamic.literal(_links = _links, attributes = attributes, name = name, referenceName = referenceName, url = url)
  
    __obj.asInstanceOf[WorkItemRelationType]
  }
}

