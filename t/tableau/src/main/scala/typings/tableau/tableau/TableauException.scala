package typings.tableau.tableau

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//#region Error Classes
@js.native
trait TableauException extends Error {
  
  var tableauSoftwareErrorCode: ErrorCode = js.native
}
object TableauException {
  
  @scala.inline
  def apply(message: String, name: String, tableauSoftwareErrorCode: ErrorCode): TableauException = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], tableauSoftwareErrorCode = tableauSoftwareErrorCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableauException]
  }
  
  @scala.inline
  implicit class TableauExceptionOps[Self <: TableauException] (val x: Self) extends AnyVal {
    
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
    def setTableauSoftwareErrorCode(value: ErrorCode): Self = this.set("tableauSoftwareErrorCode", value.asInstanceOf[js.Any])
  }
}
