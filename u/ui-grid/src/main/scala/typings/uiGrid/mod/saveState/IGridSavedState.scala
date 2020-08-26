package typings.uiGrid.mod.saveState

import typings.uiGrid.mod.grouping.IGridGroupingConfiguration
import typings.uiGrid.mod.treeBase.ITreeState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IGridSavedState extends js.Object {
  var columns: js.UndefOr[js.Array[ISavedColumn]] = js.native
  var grouping: IGridGroupingConfiguration = js.native
  var scrollFocus: js.UndefOr[ISavedScrollFocus] = js.native
  var selection: js.Array[IRowVal] = js.native
  var treeView: ITreeState = js.native
}

object IGridSavedState {
  @scala.inline
  def apply(grouping: IGridGroupingConfiguration, selection: js.Array[IRowVal], treeView: ITreeState): IGridSavedState = {
    val __obj = js.Dynamic.literal(grouping = grouping.asInstanceOf[js.Any], selection = selection.asInstanceOf[js.Any], treeView = treeView.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGridSavedState]
  }
  @scala.inline
  implicit class IGridSavedStateOps[Self <: IGridSavedState] (val x: Self) extends AnyVal {
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
    def setGrouping(value: IGridGroupingConfiguration): Self = this.set("grouping", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelectionVarargs(value: IRowVal*): Self = this.set("selection", js.Array(value :_*))
    @scala.inline
    def setSelection(value: js.Array[IRowVal]): Self = this.set("selection", value.asInstanceOf[js.Any])
    @scala.inline
    def setTreeView(value: ITreeState): Self = this.set("treeView", value.asInstanceOf[js.Any])
    @scala.inline
    def setColumnsVarargs(value: ISavedColumn*): Self = this.set("columns", js.Array(value :_*))
    @scala.inline
    def setColumns(value: js.Array[ISavedColumn]): Self = this.set("columns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumns: Self = this.set("columns", js.undefined)
    @scala.inline
    def setScrollFocus(value: ISavedScrollFocus): Self = this.set("scrollFocus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScrollFocus: Self = this.set("scrollFocus", js.undefined)
  }
  
}

