package typings.uiGrid.mod.grouping

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IGridOptions extends js.Object {
  
  /**
    * Enable row grouping for entire grid.
    * Defaults to true
    * @default true
    */
  var enableGroupHeaderSelection: js.UndefOr[Boolean] = js.native
  
  /**
    * Allows group header rows to be selected.
    * Defaults to false
    * @default false
    */
  var enableGrouping: js.UndefOr[Boolean] = js.native
  
  /**
    * The string to use for the grouping header row label on rows which contain
    * a null or undefined value in the grouped column.
    * Defaults to "Null"
    * @default 'Null'
    */
  var groupingNullLabel: js.UndefOr[String] = js.native
  
  /**
    * Shows counts on the groupHeader rows.
    * Note that if you are using a cellFilter or a sortingAlgorithm which relies on a specific format or data
    * type, showing counts may cause that to break, since the group header rows will always be a string with
    * groupingShowCounts enabled. Defaults to true except on columns of type 'date'
    * @default true
    */
  var groupingShowCounts: js.UndefOr[Boolean] = js.native
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
    def setEnableGroupHeaderSelection(value: Boolean): Self = this.set("enableGroupHeaderSelection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableGroupHeaderSelection: Self = this.set("enableGroupHeaderSelection", js.undefined)
    
    @scala.inline
    def setEnableGrouping(value: Boolean): Self = this.set("enableGrouping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableGrouping: Self = this.set("enableGrouping", js.undefined)
    
    @scala.inline
    def setGroupingNullLabel(value: String): Self = this.set("groupingNullLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupingNullLabel: Self = this.set("groupingNullLabel", js.undefined)
    
    @scala.inline
    def setGroupingShowCounts(value: Boolean): Self = this.set("groupingShowCounts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupingShowCounts: Self = this.set("groupingShowCounts", js.undefined)
  }
}
