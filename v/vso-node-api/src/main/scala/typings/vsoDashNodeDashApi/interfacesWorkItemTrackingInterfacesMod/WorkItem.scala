package typings.vsoDashNodeDashApi.interfacesWorkItemTrackingInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkItem extends WorkItemTrackingResource {
  /**
    * Map of field and values for the work item.
    */
  var fields: StringDictionary[js.Any]
  /**
    * The work item ID.
    */
  var id: Double
  /**
    * Relations of the work item.
    */
  var relations: js.Array[WorkItemRelation]
  /**
    * Revision number of the work item.
    */
  var rev: Double
}

object WorkItem {
  @scala.inline
  def apply(
    _links: js.Any,
    fields: StringDictionary[js.Any],
    id: Double,
    relations: js.Array[WorkItemRelation],
    rev: Double,
    url: String
  ): WorkItem = {
    val __obj = js.Dynamic.literal(_links = _links, fields = fields, id = id, relations = relations, rev = rev, url = url)
  
    __obj.asInstanceOf[WorkItem]
  }
}

