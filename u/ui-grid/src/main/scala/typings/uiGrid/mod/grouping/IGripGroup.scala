package typings.uiGrid.mod.grouping

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IGripGroup extends js.Object {
  
  var colName: String = js.native
  
  var field: String = js.native
  
  var groupPriority: Double = js.native
}
object IGripGroup {
  
  @scala.inline
  def apply(colName: String, field: String, groupPriority: Double): IGripGroup = {
    val __obj = js.Dynamic.literal(colName = colName.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any], groupPriority = groupPriority.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGripGroup]
  }
  
  @scala.inline
  implicit class IGripGroupOps[Self <: IGripGroup] (val x: Self) extends AnyVal {
    
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
    def setColName(value: String): Self = this.set("colName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setField(value: String): Self = this.set("field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupPriority(value: Double): Self = this.set("groupPriority", value.asInstanceOf[js.Any])
  }
}
