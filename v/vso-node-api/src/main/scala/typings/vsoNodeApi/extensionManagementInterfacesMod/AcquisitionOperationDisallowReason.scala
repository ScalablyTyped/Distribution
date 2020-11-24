package typings.vsoNodeApi.extensionManagementInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AcquisitionOperationDisallowReason extends js.Object {
  
  /**
    * User-friendly message clarifying the reason for disallowance
    */
  var message: String = js.native
  
  /**
    * Type of reason for disallowance - AlreadyInstalled, UnresolvedDemand, etc.
    */
  var `type`: String = js.native
}
object AcquisitionOperationDisallowReason {
  
  @scala.inline
  def apply(message: String, `type`: String): AcquisitionOperationDisallowReason = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AcquisitionOperationDisallowReason]
  }
  
  @scala.inline
  implicit class AcquisitionOperationDisallowReasonOps[Self <: AcquisitionOperationDisallowReason] (val x: Self) extends AnyVal {
    
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
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
