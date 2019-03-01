package typings
package uiDashGridLib.uiDashGridMod.uiGridNs.paginationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGridOptions extends js.Object {
  /**
    * Enables pagination, defaults to true
    * @default true
    */
  var enablePagination: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Enables the paginator at the bottom of the grid. Turn this off, if you want to implement your own
    * controls outside the grid
    */
  var enablePaginationControls: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Current page number, defaults to 1
    * @default 1
    */
  var paginationCurrentPage: js.UndefOr[scala.Double] = js.undefined
  /**
    * Page size, defaults to the first item in paginationPageSizes, or 0 if paginationPageSizes is empty
    */
  var paginationPageSize: js.UndefOr[scala.Double] = js.undefined
  /**
    * Array of page sizes, defaults to [250, 500, 1000]
    * @default [250, 500, 1000]
    */
  var paginationPageSizes: js.UndefOr[js.Array[scala.Double]] = js.undefined
  /**
    * A custom template for the pager, defaults to ui-grid/pagination
    * @default 'ui-grid/pagination'
    */
  var paginationTemplate: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Total number of items, set automatically when client side pagination,
    * needs set by user for server side pagination
    */
  var totalItems: js.UndefOr[scala.Double] = js.undefined
  /**
    * Disables client side pagination. When true, handle the paginationChanged event and set data and
    * totalItems, defaults to false
    * @default false
    */
  var useExternalPagination: js.UndefOr[scala.Boolean] = js.undefined
}

object IGridOptions {
  @scala.inline
  def apply(
    enablePagination: js.UndefOr[scala.Boolean] = js.undefined,
    enablePaginationControls: js.UndefOr[scala.Boolean] = js.undefined,
    paginationCurrentPage: scala.Int | scala.Double = null,
    paginationPageSize: scala.Int | scala.Double = null,
    paginationPageSizes: js.Array[scala.Double] = null,
    paginationTemplate: java.lang.String = null,
    totalItems: scala.Int | scala.Double = null,
    useExternalPagination: js.UndefOr[scala.Boolean] = js.undefined
  ): IGridOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enablePagination)) __obj.updateDynamic("enablePagination")(enablePagination)
    if (!js.isUndefined(enablePaginationControls)) __obj.updateDynamic("enablePaginationControls")(enablePaginationControls)
    if (paginationCurrentPage != null) __obj.updateDynamic("paginationCurrentPage")(paginationCurrentPage.asInstanceOf[js.Any])
    if (paginationPageSize != null) __obj.updateDynamic("paginationPageSize")(paginationPageSize.asInstanceOf[js.Any])
    if (paginationPageSizes != null) __obj.updateDynamic("paginationPageSizes")(paginationPageSizes)
    if (paginationTemplate != null) __obj.updateDynamic("paginationTemplate")(paginationTemplate)
    if (totalItems != null) __obj.updateDynamic("totalItems")(totalItems.asInstanceOf[js.Any])
    if (!js.isUndefined(useExternalPagination)) __obj.updateDynamic("useExternalPagination")(useExternalPagination)
    __obj.asInstanceOf[IGridOptions]
  }
}

