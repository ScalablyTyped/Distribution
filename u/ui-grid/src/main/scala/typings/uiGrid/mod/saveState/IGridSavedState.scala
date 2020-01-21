package typings.uiGrid.mod.saveState

import typings.uiGrid.mod.grouping.IGridGroupingConfiguration
import typings.uiGrid.mod.treeBase.ITreeState
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
    val __obj = js.Dynamic.literal(grouping = grouping.asInstanceOf[js.Any], selection = selection.asInstanceOf[js.Any], treeView = treeView.asInstanceOf[js.Any])
    if (columns != null) __obj.updateDynamic("columns")(columns.asInstanceOf[js.Any])
    if (scrollFocus != null) __obj.updateDynamic("scrollFocus")(scrollFocus.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGridSavedState]
  }
}

