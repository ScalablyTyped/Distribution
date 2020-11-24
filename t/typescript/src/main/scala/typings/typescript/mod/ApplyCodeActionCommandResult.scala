package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApplyCodeActionCommandResult extends js.Object {
  
  var successMessage: java.lang.String = js.native
}
object ApplyCodeActionCommandResult {
  
  @scala.inline
  def apply(successMessage: java.lang.String): ApplyCodeActionCommandResult = {
    val __obj = js.Dynamic.literal(successMessage = successMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplyCodeActionCommandResult]
  }
  
  @scala.inline
  implicit class ApplyCodeActionCommandResultOps[Self <: ApplyCodeActionCommandResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setSuccessMessage(value: java.lang.String): Self = this.set("successMessage", value.asInstanceOf[js.Any])
  }
}
