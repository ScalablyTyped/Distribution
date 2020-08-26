package typings.tryghostContentApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Pagination extends js.Object {
  var limit: Double = js.native
  var next: Nullable[Double] = js.native
  var page: Double = js.native
  var pages: Double = js.native
  var prev: Nullable[Double] = js.native
  var total: Double = js.native
}

object Pagination {
  @scala.inline
  def apply(limit: Double, page: Double, pages: Double, total: Double): Pagination = {
    val __obj = js.Dynamic.literal(limit = limit.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], pages = pages.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pagination]
  }
  @scala.inline
  implicit class PaginationOps[Self <: Pagination] (val x: Self) extends AnyVal {
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
    def setLimit(value: Double): Self = this.set("limit", value.asInstanceOf[js.Any])
    @scala.inline
    def setPage(value: Double): Self = this.set("page", value.asInstanceOf[js.Any])
    @scala.inline
    def setPages(value: Double): Self = this.set("pages", value.asInstanceOf[js.Any])
    @scala.inline
    def setTotal(value: Double): Self = this.set("total", value.asInstanceOf[js.Any])
    @scala.inline
    def setNext(value: Nullable[Double]): Self = this.set("next", value.asInstanceOf[js.Any])
    @scala.inline
    def setNextNull: Self = this.set("next", null)
    @scala.inline
    def setPrev(value: Nullable[Double]): Self = this.set("prev", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrevNull: Self = this.set("prev", null)
  }
  
}

