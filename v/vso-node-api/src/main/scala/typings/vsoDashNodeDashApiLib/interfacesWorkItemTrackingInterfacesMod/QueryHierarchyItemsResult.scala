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

object QueryHierarchyItemsResult {
  @scala.inline
  def apply(count: scala.Double, hasMore: scala.Boolean, value: js.Array[QueryHierarchyItem]): QueryHierarchyItemsResult = {
    val __obj = js.Dynamic.literal(count = count, hasMore = hasMore, value = value)
  
    __obj.asInstanceOf[QueryHierarchyItemsResult]
  }
}

