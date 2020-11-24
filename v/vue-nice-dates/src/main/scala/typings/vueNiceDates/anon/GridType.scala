package typings.vueNiceDates.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GridType extends js.Object {
  
  var gridType: String = js.native
  
  var receivedInitialDate: typings.std.Date | Null = js.native
}
object GridType {
  
  @scala.inline
  def apply(gridType: String): GridType = {
    val __obj = js.Dynamic.literal(gridType = gridType.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridType]
  }
  
  @scala.inline
  implicit class GridTypeOps[Self <: GridType] (val x: Self) extends AnyVal {
    
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
    def setGridType(value: String): Self = this.set("gridType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReceivedInitialDate(value: typings.std.Date): Self = this.set("receivedInitialDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReceivedInitialDateNull: Self = this.set("receivedInitialDate", null)
  }
}
