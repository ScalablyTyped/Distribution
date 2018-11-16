package typings
package vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait AccountMyWorkResult extends js.Object {
  /**
       * True, when length of WorkItemDetails is same as the limit
       */
  var querySizeLimitExceeded: scala.Boolean
  /**
       * WorkItem Details
       */
  var workItemDetails: js.Array[AccountWorkWorkItemModel]
}

