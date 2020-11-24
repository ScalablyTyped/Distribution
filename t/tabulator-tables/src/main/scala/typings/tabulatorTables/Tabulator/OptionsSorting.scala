package typings.tabulatorTables.Tabulator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OptionsSorting extends js.Object {
  
  /** Array of sorters to be applied on load.     */
  var initialSort: js.UndefOr[js.Array[Sorter]] = js.native
  
  /** reverse the order that multiple sorters are applied to the table.     */
  var sortOrderReverse: js.UndefOr[Boolean] = js.native
}
object OptionsSorting {
  
  @scala.inline
  def apply(): OptionsSorting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptionsSorting]
  }
  
  @scala.inline
  implicit class OptionsSortingOps[Self <: OptionsSorting] (val x: Self) extends AnyVal {
    
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
    def setInitialSortVarargs(value: Sorter*): Self = this.set("initialSort", js.Array(value :_*))
    
    @scala.inline
    def setInitialSort(value: js.Array[Sorter]): Self = this.set("initialSort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitialSort: Self = this.set("initialSort", js.undefined)
    
    @scala.inline
    def setSortOrderReverse(value: Boolean): Self = this.set("sortOrderReverse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSortOrderReverse: Self = this.set("sortOrderReverse", js.undefined)
  }
}
