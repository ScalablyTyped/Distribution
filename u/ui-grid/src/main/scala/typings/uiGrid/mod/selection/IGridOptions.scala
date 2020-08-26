package typings.uiGrid.mod.selection

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IGridOptions extends js.Object {
  /**
    * Shows the total number of selected items in footer if true.
    * Defaults to true.
    * GridOptions.showGridFooter must also be set to true.
    * @default true
    */
  var enableFooterTotalSelected: js.UndefOr[Boolean] = js.native
  /**
    * Enable selection by clicking anywhere on the row.
    * Defaults to false if enableRowHeaderSelection is true, otherwise defaults to false.
    */
  var enableFullRowSelection: js.UndefOr[Boolean] = js.native
  /**
    * Enable a row header to be used for selection
    * Defaults to true
    * @default true
    */
  var enableRowHeaderSelection: js.UndefOr[Boolean] = js.native
  /**
    * Enable row selection for entire grid.
    * Defaults to true
    */
  var enableRowSelection: js.UndefOr[Boolean] = js.native
  /**
    * Enable the select all checkbox at the top of the selectionRowHeader
    * Defaults to true
    * @default true
    */
  var enableSelectAll: js.UndefOr[Boolean] = js.native
  /**
    * If selected rows are changed in bulk, either via the API or via the selectAll checkbox,
    * then a separate event is fired.
    * Setting this option to false will cause the rowSelectionChanged event to be called multiple times instead
    * Defaults to true
    * @default true
    */
  var enableSelectionBatchEvent: js.UndefOr[Boolean] = js.native
  /**
    * Makes it possible to specify a method that evaluates for each row and sets its "enableSelection"
    * property.
    */
  var isRowSelectable: js.UndefOr[js.Function1[/* row */ IGridRow, Boolean]] = js.native
  /**
    * Enable multiple row selection only when using the ctrlKey or shiftKey. Requires multiSelect to be true.
    * Defaults to false
    * @default false
    */
  var modifierKeysToMultiSelect: js.UndefOr[Boolean] = js.native
  /**
    * Enable multiple row selection for entire grid
    * Defaults to true
    * @default true
    */
  var multiSelect: js.UndefOr[Boolean] = js.native
  /**
    * Prevent a row from being unselected.
    * Works in conjunction with multiselect = false and gridApi.selection.selectRow() to allow you to
    * create a single selection only grid -
    * a row is always selected, you can only select different rows, you can't unselect the row.
    * Defaults to false
    * @default false
    */
  var noUnselect: js.UndefOr[Boolean] = js.native
  /**
    * can be used to set a custom width for the row header selection column
    * Defaults to 30px
    * @default 30
    */
  var selectionRowHeaderWidth: js.UndefOr[Double] = js.native
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
    def setEnableFooterTotalSelected(value: Boolean): Self = this.set("enableFooterTotalSelected", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableFooterTotalSelected: Self = this.set("enableFooterTotalSelected", js.undefined)
    @scala.inline
    def setEnableFullRowSelection(value: Boolean): Self = this.set("enableFullRowSelection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableFullRowSelection: Self = this.set("enableFullRowSelection", js.undefined)
    @scala.inline
    def setEnableRowHeaderSelection(value: Boolean): Self = this.set("enableRowHeaderSelection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableRowHeaderSelection: Self = this.set("enableRowHeaderSelection", js.undefined)
    @scala.inline
    def setEnableRowSelection(value: Boolean): Self = this.set("enableRowSelection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableRowSelection: Self = this.set("enableRowSelection", js.undefined)
    @scala.inline
    def setEnableSelectAll(value: Boolean): Self = this.set("enableSelectAll", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableSelectAll: Self = this.set("enableSelectAll", js.undefined)
    @scala.inline
    def setEnableSelectionBatchEvent(value: Boolean): Self = this.set("enableSelectionBatchEvent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableSelectionBatchEvent: Self = this.set("enableSelectionBatchEvent", js.undefined)
    @scala.inline
    def setIsRowSelectable(value: /* row */ IGridRow => Boolean): Self = this.set("isRowSelectable", js.Any.fromFunction1(value))
    @scala.inline
    def deleteIsRowSelectable: Self = this.set("isRowSelectable", js.undefined)
    @scala.inline
    def setModifierKeysToMultiSelect(value: Boolean): Self = this.set("modifierKeysToMultiSelect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModifierKeysToMultiSelect: Self = this.set("modifierKeysToMultiSelect", js.undefined)
    @scala.inline
    def setMultiSelect(value: Boolean): Self = this.set("multiSelect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMultiSelect: Self = this.set("multiSelect", js.undefined)
    @scala.inline
    def setNoUnselect(value: Boolean): Self = this.set("noUnselect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoUnselect: Self = this.set("noUnselect", js.undefined)
    @scala.inline
    def setSelectionRowHeaderWidth(value: Double): Self = this.set("selectionRowHeaderWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectionRowHeaderWidth: Self = this.set("selectionRowHeaderWidth", js.undefined)
  }
  
}

