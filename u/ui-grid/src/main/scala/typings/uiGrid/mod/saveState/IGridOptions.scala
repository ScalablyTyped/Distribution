package typings.uiGrid.mod.saveState

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IGridOptions extends js.Object {
  /**
    * Save the current filter state for each column
    * Defaults to true
    * @default true
    */
  var saveFilter: js.UndefOr[Boolean] = js.native
  /**
    * Save the current focused cell. On returning to this focused cell we'll also scroll.
    * This option is preferred to the saveScroll option, so is set to true by default.
    * If saveScroll is set to true then this option will be disabled.
    *
    * By default this option saves the current row number and column number, and returns to that row and
    * column. However, if you define a saveRowIdentity function, then it will return you to the currently
    * selected column within that row (in a business sense - so if some rows have been deleted, it will still
    * find the same data, presuming it still exists in the list. If it isn't in the list then it will instead
    * return to the same row number - i.e. scroll percentage)
    *
    * Note that this option will do nothing if the cellNav feature is not enabled.
    *
    * Defaults to true (unless saveScroll is true)
    * @default true
    */
  var saveFocus: js.UndefOr[Boolean] = js.native
  /**
    * Save the grouping configuration. If set to true and the grouping feature is not enabled then does
    * nothing. Defaults to true
    * @default true
    */
  var saveGrouping: js.UndefOr[Boolean] = js.native
  /**
    * Save the grouping row expanded states.
    * If set to true and the grouping feature is not enabled then does nothing.
    *
    * This can be quite a bit of data, in many cases you wouldn't want to save this information.
    *
    * Defaults to false
    * @default false
    */
  var saveGroupingExpandedStates: js.UndefOr[Boolean] = js.native
  /**
    * Restore the current column order.
    * Note that unless you've provided the user with some way to reorder their columns
    * (for example the move columns feature), this makes little sense.
    * Defaults to true
    * @default true
    */
  var saveOrder: js.UndefOr[Boolean] = js.native
  /**
    * Save pinning state for columns.
    * Defaults to true
    * @default true
    */
  var savePinning: js.UndefOr[Boolean] = js.native
  /**
    * A function that can be called, passing in a rowEntity, and that will return a unique id for that row.
    * This might simply return the id field from that row (if you have one),
    * or it might concatenate some fields within the row to make a unique value.
    *
    * This value will be used to find the same row again and set the focus to it, if it exists when we return.
    *
    * Defaults to undefined
    * @default undefined
    */
  var saveRowIdentity: js.UndefOr[Boolean] = js.native
  /**
    * Save the current scroll position.
    * Note that this is saved as the percentage of the grid scrolled -
    * so if your user returns to a grid with a significantly different number of rows
    * (perhaps some data has been deleted) then the scroll won't actually show the same rows as before.
    * If you want to scroll to a specific row then you should instead use the saveFocus option,
    * which is the default.
    *
    * Note that this element will only be saved if the cellNav feature is enabled
    *
    * Defaults to false
    * @default false
    */
  var saveScroll: js.UndefOr[Boolean] = js.native
  /**
    * Save the currently selected rows.
    * If the saveRowIdentity callback is defined, then it will save the id of the row and select that.
    * If not, then it will attempt to select the rows by row number,
    * which will give the wrong results if the data set has changed in the mean-time.
    *
    * Note that this option only does anything if the selection feature is enabled.
    *
    * Defaults to true
    * @default true
    */
  var saveSelection: js.UndefOr[Boolean] = js.native
  /**
    * Save the current sort state for each column
    * Defaults to true
    *
    * @default true
    */
  var saveSort: js.UndefOr[Boolean] = js.native
  /**
    * Save the treeView configuration. If set to true and the treeView feature is not enabled then does
    * nothing.
    *
    * @default true;
    */
  var saveTreeView: js.UndefOr[Boolean] = js.native
  /**
    * Save whether or not columns are visible
    * Defaults to true
    * @default true
    */
  var saveVisible: js.UndefOr[Boolean] = js.native
  /**
    * Save the current column widths.
    * Note that unless you've provided the user with some way to resize their columns
    * (say the resize columns feature), then this makes little sense.
    * Defaults to true
    * @default true
    */
  var saveWidths: js.UndefOr[Boolean] = js.native
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
    def setSaveFilter(value: Boolean): Self = this.set("saveFilter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSaveFilter: Self = this.set("saveFilter", js.undefined)
    @scala.inline
    def setSaveFocus(value: Boolean): Self = this.set("saveFocus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSaveFocus: Self = this.set("saveFocus", js.undefined)
    @scala.inline
    def setSaveGrouping(value: Boolean): Self = this.set("saveGrouping", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSaveGrouping: Self = this.set("saveGrouping", js.undefined)
    @scala.inline
    def setSaveGroupingExpandedStates(value: Boolean): Self = this.set("saveGroupingExpandedStates", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSaveGroupingExpandedStates: Self = this.set("saveGroupingExpandedStates", js.undefined)
    @scala.inline
    def setSaveOrder(value: Boolean): Self = this.set("saveOrder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSaveOrder: Self = this.set("saveOrder", js.undefined)
    @scala.inline
    def setSavePinning(value: Boolean): Self = this.set("savePinning", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSavePinning: Self = this.set("savePinning", js.undefined)
    @scala.inline
    def setSaveRowIdentity(value: Boolean): Self = this.set("saveRowIdentity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSaveRowIdentity: Self = this.set("saveRowIdentity", js.undefined)
    @scala.inline
    def setSaveScroll(value: Boolean): Self = this.set("saveScroll", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSaveScroll: Self = this.set("saveScroll", js.undefined)
    @scala.inline
    def setSaveSelection(value: Boolean): Self = this.set("saveSelection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSaveSelection: Self = this.set("saveSelection", js.undefined)
    @scala.inline
    def setSaveSort(value: Boolean): Self = this.set("saveSort", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSaveSort: Self = this.set("saveSort", js.undefined)
    @scala.inline
    def setSaveTreeView(value: Boolean): Self = this.set("saveTreeView", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSaveTreeView: Self = this.set("saveTreeView", js.undefined)
    @scala.inline
    def setSaveVisible(value: Boolean): Self = this.set("saveVisible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSaveVisible: Self = this.set("saveVisible", js.undefined)
    @scala.inline
    def setSaveWidths(value: Boolean): Self = this.set("saveWidths", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSaveWidths: Self = this.set("saveWidths", js.undefined)
  }
  
}

