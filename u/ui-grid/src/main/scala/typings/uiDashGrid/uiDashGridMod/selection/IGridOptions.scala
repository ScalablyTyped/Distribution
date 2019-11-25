package typings.uiDashGrid.uiDashGridMod.selection

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGridOptions extends js.Object {
  /**
    * Shows the total number of selected items in footer if true.
    * Defaults to true.
    * GridOptions.showGridFooter must also be set to true.
    * @default true
    */
  var enableFooterTotalSelected: js.UndefOr[Boolean] = js.undefined
  /**
    * Enable selection by clicking anywhere on the row.
    * Defaults to false if enableRowHeaderSelection is true, otherwise defaults to false.
    */
  var enableFullRowSelection: js.UndefOr[Boolean] = js.undefined
  /**
    * Enable a row header to be used for selection
    * Defaults to true
    * @default true
    */
  var enableRowHeaderSelection: js.UndefOr[Boolean] = js.undefined
  /**
    * Enable row selection for entire grid.
    * Defaults to true
    */
  var enableRowSelection: js.UndefOr[Boolean] = js.undefined
  /**
    * Enable the select all checkbox at the top of the selectionRowHeader
    * Defaults to true
    * @default true
    */
  var enableSelectAll: js.UndefOr[Boolean] = js.undefined
  /**
    * If selected rows are changed in bulk, either via the API or via the selectAll checkbox,
    * then a separate event is fired.
    * Setting this option to false will cause the rowSelectionChanged event to be called multiple times instead
    * Defaults to true
    * @default true
    */
  var enableSelectionBatchEvent: js.UndefOr[Boolean] = js.undefined
  /**
    * Makes it possible to specify a method that evaluates for each row and sets its "enableSelection"
    * property.
    */
  var isRowSelectable: js.UndefOr[
    js.Function1[/* row */ typings.uiDashGrid.uiDashGridMod.selection.IGridRow, Boolean]
  ] = js.undefined
  /**
    * Enable multiple row selection only when using the ctrlKey or shiftKey. Requires multiSelect to be true.
    * Defaults to false
    * @default false
    */
  var modifierKeysToMultiSelect: js.UndefOr[Boolean] = js.undefined
  /**
    * Enable multiple row selection for entire grid
    * Defaults to true
    * @default true
    */
  var multiSelect: js.UndefOr[Boolean] = js.undefined
  /**
    * Prevent a row from being unselected.
    * Works in conjunction with multiselect = false and gridApi.selection.selectRow() to allow you to
    * create a single selection only grid -
    * a row is always selected, you can only select different rows, you can't unselect the row.
    * Defaults to false
    * @default false
    */
  var noUnselect: js.UndefOr[Boolean] = js.undefined
  /**
    * can be used to set a custom width for the row header selection column
    * Defaults to 30px
    * @default 30
    */
  var selectionRowHeaderWidth: js.UndefOr[Double] = js.undefined
}

object IGridOptions {
  @scala.inline
  def apply(
    enableFooterTotalSelected: js.UndefOr[Boolean] = js.undefined,
    enableFullRowSelection: js.UndefOr[Boolean] = js.undefined,
    enableRowHeaderSelection: js.UndefOr[Boolean] = js.undefined,
    enableRowSelection: js.UndefOr[Boolean] = js.undefined,
    enableSelectAll: js.UndefOr[Boolean] = js.undefined,
    enableSelectionBatchEvent: js.UndefOr[Boolean] = js.undefined,
    isRowSelectable: /* row */ typings.uiDashGrid.uiDashGridMod.selection.IGridRow => Boolean = null,
    modifierKeysToMultiSelect: js.UndefOr[Boolean] = js.undefined,
    multiSelect: js.UndefOr[Boolean] = js.undefined,
    noUnselect: js.UndefOr[Boolean] = js.undefined,
    selectionRowHeaderWidth: Int | Double = null
  ): IGridOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enableFooterTotalSelected)) __obj.updateDynamic("enableFooterTotalSelected")(enableFooterTotalSelected.asInstanceOf[js.Any])
    if (!js.isUndefined(enableFullRowSelection)) __obj.updateDynamic("enableFullRowSelection")(enableFullRowSelection.asInstanceOf[js.Any])
    if (!js.isUndefined(enableRowHeaderSelection)) __obj.updateDynamic("enableRowHeaderSelection")(enableRowHeaderSelection.asInstanceOf[js.Any])
    if (!js.isUndefined(enableRowSelection)) __obj.updateDynamic("enableRowSelection")(enableRowSelection.asInstanceOf[js.Any])
    if (!js.isUndefined(enableSelectAll)) __obj.updateDynamic("enableSelectAll")(enableSelectAll.asInstanceOf[js.Any])
    if (!js.isUndefined(enableSelectionBatchEvent)) __obj.updateDynamic("enableSelectionBatchEvent")(enableSelectionBatchEvent.asInstanceOf[js.Any])
    if (isRowSelectable != null) __obj.updateDynamic("isRowSelectable")(js.Any.fromFunction1(isRowSelectable))
    if (!js.isUndefined(modifierKeysToMultiSelect)) __obj.updateDynamic("modifierKeysToMultiSelect")(modifierKeysToMultiSelect.asInstanceOf[js.Any])
    if (!js.isUndefined(multiSelect)) __obj.updateDynamic("multiSelect")(multiSelect.asInstanceOf[js.Any])
    if (!js.isUndefined(noUnselect)) __obj.updateDynamic("noUnselect")(noUnselect.asInstanceOf[js.Any])
    if (selectionRowHeaderWidth != null) __obj.updateDynamic("selectionRowHeaderWidth")(selectionRowHeaderWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGridOptions]
  }
}

