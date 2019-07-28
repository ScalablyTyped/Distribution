package typings.vsoDashNodeDashApi.interfacesWorkItemTrackingInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkItemRelationType extends WorkItemTrackingReference {
  /**
    * The collection of relation type attributes.
    */
  var attributes: StringDictionary[js.Any]
}

object WorkItemRelationType {
  @scala.inline
  def apply(
    _links: js.Any,
    attributes: StringDictionary[js.Any],
    name: String,
    referenceName: String,
    url: String
  ): WorkItemRelationType = {
    val __obj = js.Dynamic.literal(_links = _links, attributes = attributes, name = name, referenceName = referenceName, url = url)
  
    __obj.asInstanceOf[WorkItemRelationType]
  }
}

