package typings.uiGrid.mod.saveState

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IRowVal extends js.Object {
  
  var identity: Boolean = js.native
  
  var row: Double | js.Any = js.native
}
object IRowVal {
  
  @scala.inline
  def apply(identity: Boolean, row: Double | js.Any): IRowVal = {
    val __obj = js.Dynamic.literal(identity = identity.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRowVal]
  }
  
  @scala.inline
  implicit class IRowValOps[Self <: IRowVal] (val x: Self) extends AnyVal {
    
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
    def setIdentity(value: Boolean): Self = this.set("identity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRow(value: Double | js.Any): Self = this.set("row", value.asInstanceOf[js.Any])
  }
}
