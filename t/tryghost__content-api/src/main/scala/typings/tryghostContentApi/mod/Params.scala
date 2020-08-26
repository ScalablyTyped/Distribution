package typings.tryghostContentApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Params extends js.Object {
  var fields: js.UndefOr[ArrayOrValue[FieldParam]] = js.native
  var filter: js.UndefOr[ArrayOrValue[FilterParam]] = js.native
  var formats: js.UndefOr[ArrayOrValue[FormatParam]] = js.native
  var include: js.UndefOr[ArrayOrValue[IncludeParam]] = js.native
  var limit: js.UndefOr[ArrayOrValue[LimitParam]] = js.native
  var order: js.UndefOr[ArrayOrValue[OrderParam]] = js.native
  var page: js.UndefOr[ArrayOrValue[PageParam]] = js.native
}

object Params {
  @scala.inline
  def apply(): Params = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Params]
  }
  @scala.inline
  implicit class ParamsOps[Self <: Params] (val x: Self) extends AnyVal {
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
    def setFieldsVarargs(value: FieldParam*): Self = this.set("fields", js.Array(value :_*))
    @scala.inline
    def setFields(value: ArrayOrValue[FieldParam]): Self = this.set("fields", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFields: Self = this.set("fields", js.undefined)
    @scala.inline
    def setFilterVarargs(value: FilterParam*): Self = this.set("filter", js.Array(value :_*))
    @scala.inline
    def setFilter(value: ArrayOrValue[FilterParam]): Self = this.set("filter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    @scala.inline
    def setFormatsVarargs(value: FormatParam*): Self = this.set("formats", js.Array(value :_*))
    @scala.inline
    def setFormats(value: ArrayOrValue[FormatParam]): Self = this.set("formats", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormats: Self = this.set("formats", js.undefined)
    @scala.inline
    def setIncludeVarargs(value: IncludeParam*): Self = this.set("include", js.Array(value :_*))
    @scala.inline
    def setInclude(value: ArrayOrValue[IncludeParam]): Self = this.set("include", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInclude: Self = this.set("include", js.undefined)
    @scala.inline
    def setLimitVarargs(value: LimitParam*): Self = this.set("limit", js.Array(value :_*))
    @scala.inline
    def setLimit(value: ArrayOrValue[LimitParam]): Self = this.set("limit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLimit: Self = this.set("limit", js.undefined)
    @scala.inline
    def setOrderVarargs(value: OrderParam*): Self = this.set("order", js.Array(value :_*))
    @scala.inline
    def setOrder(value: ArrayOrValue[OrderParam]): Self = this.set("order", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrder: Self = this.set("order", js.undefined)
    @scala.inline
    def setPageVarargs(value: PageParam*): Self = this.set("page", js.Array(value :_*))
    @scala.inline
    def setPage(value: ArrayOrValue[PageParam]): Self = this.set("page", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePage: Self = this.set("page", js.undefined)
  }
  
}

