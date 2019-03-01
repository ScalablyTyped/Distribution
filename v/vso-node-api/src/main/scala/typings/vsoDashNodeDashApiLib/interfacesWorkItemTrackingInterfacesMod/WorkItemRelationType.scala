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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("_links")(_links)
    __obj.updateDynamic("attributes")(attributes)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("referenceName")(referenceName)
    __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[WorkItemRelationType]
  }
}

