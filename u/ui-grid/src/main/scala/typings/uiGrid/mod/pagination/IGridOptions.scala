package typings.uiGrid.mod.pagination

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IGridOptions extends js.Object {
  /**
    * Enables pagination, defaults to true
    * @default true
    */
  var enablePagination: js.UndefOr[Boolean] = js.native
  /**
    * Enables the paginator at the bottom of the grid. Turn this off, if you want to implement your own
    * controls outside the grid
    */
  var enablePaginationControls: js.UndefOr[Boolean] = js.native
  /**
    * Current page number, defaults to 1
    * @default 1
    */
  var paginationCurrentPage: js.UndefOr[Double] = js.native
  /**
    * Page size, defaults to the first item in paginationPageSizes, or 0 if paginationPageSizes is empty
    */
  var paginationPageSize: js.UndefOr[Double] = js.native
  /**
    * Array of page sizes, defaults to [250, 500, 1000]
    * @default [250, 500, 1000]
    */
  var paginationPageSizes: js.UndefOr[js.Array[Double]] = js.native
  /**
    * A custom template for the pager, defaults to ui-grid/pagination
    * @default 'ui-grid/pagination'
    */
  var paginationTemplate: js.UndefOr[String] = js.native
  /**
    * Total number of items, set automatically when client side pagination,
    * needs set by user for server side pagination
    */
  var totalItems: js.UndefOr[Double] = js.native
  /**
    * Disables client side pagination. When true, handle the paginationChanged event and set data and
    * totalItems, defaults to false
    * @default false
    */
  var useExternalPagination: js.UndefOr[Boolean] = js.native
}

object IGridOptions {
  @scala.inline
  def apply(): IGridOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IGridOptions]
  }
  @scala.inline
  implicit class IGridOptionsOps[Self <: IGridOptions] (val x: Self) extends AnyVal {
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
    def setEnablePagination(value: Boolean): Self = this.set("enablePagination", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnablePagination: Self = this.set("enablePagination", js.undefined)
    @scala.inline
    def setEnablePaginationControls(value: Boolean): Self = this.set("enablePaginationControls", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnablePaginationControls: Self = this.set("enablePaginationControls", js.undefined)
    @scala.inline
    def setPaginationCurrentPage(value: Double): Self = this.set("paginationCurrentPage", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaginationCurrentPage: Self = this.set("paginationCurrentPage", js.undefined)
    @scala.inline
    def setPaginationPageSize(value: Double): Self = this.set("paginationPageSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaginationPageSize: Self = this.set("paginationPageSize", js.undefined)
    @scala.inline
    def setPaginationPageSizesVarargs(value: Double*): Self = this.set("paginationPageSizes", js.Array(value :_*))
    @scala.inline
    def setPaginationPageSizes(value: js.Array[Double]): Self = this.set("paginationPageSizes", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaginationPageSizes: Self = this.set("paginationPageSizes", js.undefined)
    @scala.inline
    def setPaginationTemplate(value: String): Self = this.set("paginationTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaginationTemplate: Self = this.set("paginationTemplate", js.undefined)
    @scala.inline
    def setTotalItems(value: Double): Self = this.set("totalItems", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTotalItems: Self = this.set("totalItems", js.undefined)
    @scala.inline
    def setUseExternalPagination(value: Boolean): Self = this.set("useExternalPagination", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseExternalPagination: Self = this.set("useExternalPagination", js.undefined)
  }
  
}

