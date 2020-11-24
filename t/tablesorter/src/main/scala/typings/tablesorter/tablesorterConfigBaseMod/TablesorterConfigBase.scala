package typings.tablesorter.tablesorterConfigBaseMod

import typings.tablesorter.sortOrderMod.SortOrder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TablesorterConfigBase extends js.Object {
  
  /**
    * The date-format for dates inside the table.
    */
  var dateFormat: js.UndefOr[String] = js.native
  
  /**
    * The order which will be applied when clicking on the heading the first time.
    */
  var sortInitialOrder: js.UndefOr[SortOrder] = js.native
}
object TablesorterConfigBase {
  
  @scala.inline
  def apply(): TablesorterConfigBase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TablesorterConfigBase]
  }
  
  @scala.inline
  implicit class TablesorterConfigBaseOps[Self <: TablesorterConfigBase] (val x: Self) extends AnyVal {
    
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
    def setDateFormat(value: String): Self = this.set("dateFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDateFormat: Self = this.set("dateFormat", js.undefined)
    
    @scala.inline
    def setSortInitialOrder(value: SortOrder): Self = this.set("sortInitialOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSortInitialOrder: Self = this.set("sortInitialOrder", js.undefined)
  }
}
