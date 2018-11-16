package typings
package vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait QueryHierarchyItemsResult extends js.Object {
  /**
       * The count of items.
       */
  var count: scala.Double
  /**
       * Indicates if the max return limit was hit but there are still more items
       */
  var hasMore: scala.Boolean
  /**
       * The list of items
       */
  var value: js.Array[QueryHierarchyItem]
}

