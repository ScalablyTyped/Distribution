package typings
package vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait WorkItemRelationUpdates extends js.Object {
  /**
       * List of newly added relations.
       */
  var added: js.Array[WorkItemRelation]
  /**
       * List of removed relations.
       */
  var removed: js.Array[WorkItemRelation]
  /**
       * List of updated relations.
       */
  var updated: js.Array[WorkItemRelation]
}

