package typings.tryghostContentApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Pagination extends js.Object {
  var pagination: typings.tryghostContentApi.mod.Pagination = js.native
}

object Pagination {
  @scala.inline
  def apply(pagination: typings.tryghostContentApi.mod.Pagination): Pagination = {
    val __obj = js.Dynamic.literal(pagination = pagination.asInstanceOf[js.Any])
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
    def setPagination(value: typings.tryghostContentApi.mod.Pagination): Self = this.set("pagination", value.asInstanceOf[js.Any])
  }
  
}

