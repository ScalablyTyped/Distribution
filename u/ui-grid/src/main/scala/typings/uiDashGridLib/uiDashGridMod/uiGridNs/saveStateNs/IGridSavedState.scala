package typings
package uiDashGridLib.uiDashGridMod.uiGridNs.saveStateNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGridSavedState extends js.Object {
  var columns: js.UndefOr[js.Array[ISavedColumn]] = js.undefined
  var grouping: uiDashGridLib.uiDashGridMod.uiGridNs.groupingNs.IGridGroupingConfiguration
  var scrollFocus: js.UndefOr[ISavedScrollFocus] = js.undefined
  var selection: js.Array[IRowVal]
  var treeView: uiDashGridLib.uiDashGridMod.uiGridNs.treeBaseNs.ITreeState
}

object IGridSavedState {
  @scala.inline
  def apply(
    grouping: uiDashGridLib.uiDashGridMod.uiGridNs.groupingNs.IGridGroupingConfiguration,
    selection: js.Array[IRowVal],
    treeView: uiDashGridLib.uiDashGridMod.uiGridNs.treeBaseNs.ITreeState,
    columns: js.Array[ISavedColumn] = null,
    scrollFocus: ISavedScrollFocus = null
  ): IGridSavedState = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("grouping")(grouping)
    __obj.updateDynamic("selection")(selection)
    __obj.updateDynamic("treeView")(treeView)
    if (columns != null) __obj.updateDynamic("columns")(columns)
    if (scrollFocus != null) __obj.updateDynamic("scrollFocus")(scrollFocus)
    __obj.asInstanceOf[IGridSavedState]
  }
}

