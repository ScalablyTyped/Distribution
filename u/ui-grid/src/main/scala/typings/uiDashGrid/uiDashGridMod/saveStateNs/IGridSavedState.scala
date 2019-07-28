package typings.uiDashGrid.uiDashGridMod.saveStateNs

import typings.uiDashGrid.uiDashGridMod.groupingNs.IGridGroupingConfiguration
import typings.uiDashGrid.uiDashGridMod.treeBaseNs.ITreeState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGridSavedState extends js.Object {
  var columns: js.UndefOr[js.Array[ISavedColumn]] = js.undefined
  var grouping: IGridGroupingConfiguration
  var scrollFocus: js.UndefOr[ISavedScrollFocus] = js.undefined
  var selection: js.Array[IRowVal]
  var treeView: ITreeState
}

object IGridSavedState {
  @scala.inline
  def apply(
    grouping: IGridGroupingConfiguration,
    selection: js.Array[IRowVal],
    treeView: ITreeState,
    columns: js.Array[ISavedColumn] = null,
    scrollFocus: ISavedScrollFocus = null
  ): IGridSavedState = {
    val __obj = js.Dynamic.literal(grouping = grouping, selection = selection, treeView = treeView)
    if (columns != null) __obj.updateDynamic("columns")(columns)
    if (scrollFocus != null) __obj.updateDynamic("scrollFocus")(scrollFocus)
    __obj.asInstanceOf[IGridSavedState]
  }
}

