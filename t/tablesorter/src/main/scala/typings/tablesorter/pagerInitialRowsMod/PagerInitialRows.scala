package typings.tablesorter.pagerInitialRowsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PagerInitialRows extends js.Object {
  
  /**
    * The filtered number of rows.
    */
  var filtered: js.UndefOr[Double] = js.native
  
  /**
    * The total number of rows.
    */
  var total: js.UndefOr[Double] = js.native
}
object PagerInitialRows {
  
  @scala.inline
  def apply(): PagerInitialRows = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PagerInitialRows]
  }
  
  @scala.inline
  implicit class PagerInitialRowsOps[Self <: PagerInitialRows] (val x: Self) extends AnyVal {
    
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
    def setFiltered(value: Double): Self = this.set("filtered", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFiltered: Self = this.set("filtered", js.undefined)
    
    @scala.inline
    def setTotal(value: Double): Self = this.set("total", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotal: Self = this.set("total", js.undefined)
  }
}
