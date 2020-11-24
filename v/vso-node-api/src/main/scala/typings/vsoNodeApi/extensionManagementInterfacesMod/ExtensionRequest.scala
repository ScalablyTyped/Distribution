package typings.vsoNodeApi.extensionManagementInterfacesMod

import typings.std.Date
import typings.vsoNodeApi.vssinterfacesMod.IdentityRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExtensionRequest extends js.Object {
  
  /**
    * Required message supplied if the request is rejected
    */
  var rejectMessage: String = js.native
  
  /**
    * Date at which the request was made
    */
  var requestDate: Date = js.native
  
  /**
    * Optional message supplied by the requester justifying the request
    */
  var requestMessage: String = js.native
  
  /**
    * Represents the state of the request
    */
  var requestState: ExtensionRequestState = js.native
  
  /**
    * Represents the user who made the request
    */
  var requestedBy: IdentityRef = js.native
  
  /**
    * Date at which the request was resolved
    */
  var resolveDate: Date = js.native
  
  /**
    * Represents the user who resolved the request
    */
  var resolvedBy: IdentityRef = js.native
}
object ExtensionRequest {
  
  @scala.inline
  def apply(
    rejectMessage: String,
    requestDate: Date,
    requestMessage: String,
    requestState: ExtensionRequestState,
    requestedBy: IdentityRef,
    resolveDate: Date,
    resolvedBy: IdentityRef
  ): ExtensionRequest = {
    val __obj = js.Dynamic.literal(rejectMessage = rejectMessage.asInstanceOf[js.Any], requestDate = requestDate.asInstanceOf[js.Any], requestMessage = requestMessage.asInstanceOf[js.Any], requestState = requestState.asInstanceOf[js.Any], requestedBy = requestedBy.asInstanceOf[js.Any], resolveDate = resolveDate.asInstanceOf[js.Any], resolvedBy = resolvedBy.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtensionRequest]
  }
  
  @scala.inline
  implicit class ExtensionRequestOps[Self <: ExtensionRequest] (val x: Self) extends AnyVal {
    
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
    def setRejectMessage(value: String): Self = this.set("rejectMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestDate(value: Date): Self = this.set("requestDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestMessage(value: String): Self = this.set("requestMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestState(value: ExtensionRequestState): Self = this.set("requestState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestedBy(value: IdentityRef): Self = this.set("requestedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResolveDate(value: Date): Self = this.set("resolveDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResolvedBy(value: IdentityRef): Self = this.set("resolvedBy", value.asInstanceOf[js.Any])
  }
}
