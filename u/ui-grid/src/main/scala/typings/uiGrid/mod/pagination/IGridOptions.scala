package typings.uiGrid.mod.pagination

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGridOptions extends js.Object {
  /**
    * Enables pagination, defaults to true
    * @default true
    */
  var enablePagination: js.UndefOr[Boolean] = js.undefined
  /**
    * Enables the paginator at the bottom of the grid. Turn this off, if you want to implement your own
    * controls outside the grid
    */
  var enablePaginationControls: js.UndefOr[Boolean] = js.undefined
  /**
    * Current page number, defaults to 1
    * @default 1
    */
  var paginationCurrentPage: js.UndefOr[Double] = js.undefined
  /**
    * Page size, defaults to the first item in paginationPageSizes, or 0 if paginationPageSizes is empty
    */
  var paginationPageSize: js.UndefOr[Double] = js.undefined
  /**
    * Array of page sizes, defaults to [250, 500, 1000]
    * @default [250, 500, 1000]
    */
  var paginationPageSizes: js.UndefOr[js.Array[Double]] = js.undefined
  /**
    * A custom template for the pager, defaults to ui-grid/pagination
    * @default 'ui-grid/pagination'
    */
  var paginationTemplate: js.UndefOr[String] = js.undefined
  /**
    * Total number of items, set automatically when client side pagination,
    * needs set by user for server side pagination
    */
  var totalItems: js.UndefOr[Double] = js.undefined
  /**
    * Disables client side pagination. When true, handle the paginationChanged event and set data and
    * totalItems, defaults to false
    * @default false
    */
  var useExternalPagination: js.UndefOr[Boolean] = js.undefined
}

object IGridOptions {
  @scala.inline
  def apply(
    enablePagination: js.UndefOr[Boolean] = js.undefined,
    enablePaginationControls: js.UndefOr[Boolean] = js.undefined,
    paginationCurrentPage: js.UndefOr[Double] = js.undefined,
    paginationPageSize: js.UndefOr[Double] = js.undefined,
    paginationPageSizes: js.Array[Double] = null,
    paginationTemplate: String = null,
    totalItems: js.UndefOr[Double] = js.undefined,
    useExternalPagination: js.UndefOr[Boolean] = js.undefined
  ): IGridOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enablePagination)) __obj.updateDynamic("enablePagination")(enablePagination.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enablePaginationControls)) __obj.updateDynamic("enablePaginationControls")(enablePaginationControls.get.asInstanceOf[js.Any])
    if (!js.isUndefined(paginationCurrentPage)) __obj.updateDynamic("paginationCurrentPage")(paginationCurrentPage.get.asInstanceOf[js.Any])
    if (!js.isUndefined(paginationPageSize)) __obj.updateDynamic("paginationPageSize")(paginationPageSize.get.asInstanceOf[js.Any])
    if (paginationPageSizes != null) __obj.updateDynamic("paginationPageSizes")(paginationPageSizes.asInstanceOf[js.Any])
    if (paginationTemplate != null) __obj.updateDynamic("paginationTemplate")(paginationTemplate.asInstanceOf[js.Any])
    if (!js.isUndefined(totalItems)) __obj.updateDynamic("totalItems")(totalItems.get.asInstanceOf[js.Any])
    if (!js.isUndefined(useExternalPagination)) __obj.updateDynamic("useExternalPagination")(useExternalPagination.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGridOptions]
  }
}

