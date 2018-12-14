package typings
package vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait WorkItemUpdate extends WorkItemTrackingResource {
  /**
       * List of updates to fields.
       */
  var fields: org.scalablytyped.runtime.StringDictionary[WorkItemFieldUpdate]
  /**
       * ID of update.
       */
  var id: scala.Double
  /**
       * List of updates to relations.
       */
  var relations: WorkItemRelationUpdates
  /**
       * The revision number of work item update.
       */
  var rev: scala.Double
  /**
       * Identity for the work item update.
       */
  var revisedBy: IdentityReference
  /**
       * The work item updates revision date.
       */
  var revisedDate: stdLib.Date
  /**
       * The work item ID.
       */
  var workItemId: scala.Double
}

