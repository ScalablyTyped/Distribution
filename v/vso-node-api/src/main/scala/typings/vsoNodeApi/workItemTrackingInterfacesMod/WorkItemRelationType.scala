package typings.vsoNodeApi.workItemTrackingInterfacesMod

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
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], attributes = attributes.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], referenceName = referenceName.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[WorkItemRelationType]
  }
}

