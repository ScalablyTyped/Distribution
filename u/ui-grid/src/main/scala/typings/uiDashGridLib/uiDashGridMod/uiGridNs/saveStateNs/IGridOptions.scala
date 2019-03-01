package typings
package uiDashGridLib.uiDashGridMod.uiGridNs.saveStateNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGridOptions extends js.Object {
  /**
    * Save the current filter state for each column
    * Defaults to true
    * @default true
    */
  var saveFilter: js.UndefOr[scala.Boolean] = js.undefined
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
  var saveFocus: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Save the grouping configuration. If set to true and the grouping feature is not enabled then does
    * nothing. Defaults to true
    * @default true
    */
  var saveGrouping: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Save the grouping row expanded states.
    * If set to true and the grouping feature is not enabled then does nothing.
    *
    * This can be quite a bit of data, in many cases you wouldn't want to save this information.
    *
    * Defaults to false
    * @default false
    */
  var saveGroupingExpandedStates: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Restore the current column order.
    * Note that unless you've provided the user with some way to reorder their columns
    * (for example the move columns feature), this makes little sense.
    * Defaults to true
    * @default true
    */
  var saveOrder: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Save pinning state for columns.
    * Defaults to true
    * @default true
    */
  var savePinning: js.UndefOr[scala.Boolean] = js.undefined
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
  var saveRowIdentity: js.UndefOr[scala.Boolean] = js.undefined
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
  var saveScroll: js.UndefOr[scala.Boolean] = js.undefined
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
  var saveSelection: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Save the current sort state for each column
    * Defaults to true
    *
    * @default true
    */
  var saveSort: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Save the treeView configuration. If set to true and the treeView feature is not enabled then does
    * nothing.
    *
    * @default true;
    */
  var saveTreeView: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Save whether or not columns are visible
    * Defaults to true
    * @default true
    */
  var saveVisible: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Save the current column widths.
    * Note that unless you've provided the user with some way to resize their columns
    * (say the resize columns feature), then this makes little sense.
    * Defaults to true
    * @default true
    */
  var saveWidths: js.UndefOr[scala.Boolean] = js.undefined
}

object IGridOptions {
  @scala.inline
  def apply(
    saveFilter: js.UndefOr[scala.Boolean] = js.undefined,
    saveFocus: js.UndefOr[scala.Boolean] = js.undefined,
    saveGrouping: js.UndefOr[scala.Boolean] = js.undefined,
    saveGroupingExpandedStates: js.UndefOr[scala.Boolean] = js.undefined,
    saveOrder: js.UndefOr[scala.Boolean] = js.undefined,
    savePinning: js.UndefOr[scala.Boolean] = js.undefined,
    saveRowIdentity: js.UndefOr[scala.Boolean] = js.undefined,
    saveScroll: js.UndefOr[scala.Boolean] = js.undefined,
    saveSelection: js.UndefOr[scala.Boolean] = js.undefined,
    saveSort: js.UndefOr[scala.Boolean] = js.undefined,
    saveTreeView: js.UndefOr[scala.Boolean] = js.undefined,
    saveVisible: js.UndefOr[scala.Boolean] = js.undefined,
    saveWidths: js.UndefOr[scala.Boolean] = js.undefined
  ): IGridOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(saveFilter)) __obj.updateDynamic("saveFilter")(saveFilter)
    if (!js.isUndefined(saveFocus)) __obj.updateDynamic("saveFocus")(saveFocus)
    if (!js.isUndefined(saveGrouping)) __obj.updateDynamic("saveGrouping")(saveGrouping)
    if (!js.isUndefined(saveGroupingExpandedStates)) __obj.updateDynamic("saveGroupingExpandedStates")(saveGroupingExpandedStates)
    if (!js.isUndefined(saveOrder)) __obj.updateDynamic("saveOrder")(saveOrder)
    if (!js.isUndefined(savePinning)) __obj.updateDynamic("savePinning")(savePinning)
    if (!js.isUndefined(saveRowIdentity)) __obj.updateDynamic("saveRowIdentity")(saveRowIdentity)
    if (!js.isUndefined(saveScroll)) __obj.updateDynamic("saveScroll")(saveScroll)
    if (!js.isUndefined(saveSelection)) __obj.updateDynamic("saveSelection")(saveSelection)
    if (!js.isUndefined(saveSort)) __obj.updateDynamic("saveSort")(saveSort)
    if (!js.isUndefined(saveTreeView)) __obj.updateDynamic("saveTreeView")(saveTreeView)
    if (!js.isUndefined(saveVisible)) __obj.updateDynamic("saveVisible")(saveVisible)
    if (!js.isUndefined(saveWidths)) __obj.updateDynamic("saveWidths")(saveWidths)
    __obj.asInstanceOf[IGridOptions]
  }
}

