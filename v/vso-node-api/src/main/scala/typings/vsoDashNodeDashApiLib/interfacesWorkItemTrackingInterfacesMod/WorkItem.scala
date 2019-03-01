package typings
package vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkItem extends WorkItemTrackingResource {
  /**
    * Map of field and values for the work item.
    */
  var fields: org.scalablytyped.runtime.StringDictionary[js.Any]
  /**
    * The work item ID.
    */
  var id: scala.Double
  /**
    * Relations of the work item.
    */
  var relations: js.Array[WorkItemRelation]
  /**
    * Revision number of the work item.
    */
  var rev: scala.Double
}

object WorkItem {
  @scala.inline
  def apply(
    _links: js.Any,
    fields: org.scalablytyped.runtime.StringDictionary[js.Any],
    id: scala.Double,
    relations: js.Array[WorkItemRelation],
    rev: scala.Double,
    url: java.lang.String
  ): WorkItem = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("_links")(_links)
    __obj.updateDynamic("fields")(fields)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("relations")(relations)
    __obj.updateDynamic("rev")(rev)
    __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[WorkItem]
  }
}

