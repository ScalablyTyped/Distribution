package typings.vsoNodeApi.workItemTrackingInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryHierarchyItemsResult extends js.Object {
  /**
    * The count of items.
    */
  var count: Double = js.native
  /**
    * Indicates if the max return limit was hit but there are still more items
    */
  var hasMore: Boolean = js.native
  /**
    * The list of items
    */
  var value: js.Array[QueryHierarchyItem] = js.native
}

object QueryHierarchyItemsResult {
  @scala.inline
  def apply(count: Double, hasMore: Boolean, value: js.Array[QueryHierarchyItem]): QueryHierarchyItemsResult = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], hasMore = hasMore.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryHierarchyItemsResult]
  }
  @scala.inline
  implicit class QueryHierarchyItemsResultOps[Self <: QueryHierarchyItemsResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCount(value: Double): Self = this.set("count", value.asInstanceOf[js.Any])
    @scala.inline
    def setHasMore(value: Boolean): Self = this.set("hasMore", value.asInstanceOf[js.Any])
    @scala.inline
    def setValueVarargs(value: QueryHierarchyItem*): Self = this.set("value", js.Array(value :_*))
    @scala.inline
    def setValue(value: js.Array[QueryHierarchyItem]): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

