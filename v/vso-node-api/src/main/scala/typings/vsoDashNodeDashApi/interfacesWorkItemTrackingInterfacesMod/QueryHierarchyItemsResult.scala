package typings.vsoDashNodeDashApi.interfacesWorkItemTrackingInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryHierarchyItemsResult extends js.Object {
  /**
    * The count of items.
    */
  var count: Double
  /**
    * Indicates if the max return limit was hit but there are still more items
    */
  var hasMore: Boolean
  /**
    * The list of items
    */
  var value: js.Array[QueryHierarchyItem]
}

object QueryHierarchyItemsResult {
  @scala.inline
  def apply(count: Double, hasMore: Boolean, value: js.Array[QueryHierarchyItem]): QueryHierarchyItemsResult = {
    val __obj = js.Dynamic.literal(count = count, hasMore = hasMore, value = value)
  
    __obj.asInstanceOf[QueryHierarchyItemsResult]
  }
}

