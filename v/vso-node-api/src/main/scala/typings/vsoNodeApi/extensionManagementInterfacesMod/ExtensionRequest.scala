package typings.vsoNodeApi.extensionManagementInterfacesMod

import typings.std.Date
import typings.vsoNodeApi.vssinterfacesMod.IdentityRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExtensionRequest extends StObject {
  
  /**
    * Required message supplied if the request is rejected
    */
  var rejectMessage: String
  
  /**
    * Date at which the request was made
    */
  var requestDate: Date
  
  /**
    * Optional message supplied by the requester justifying the request
    */
  var requestMessage: String
  
  /**
    * Represents the state of the request
    */
  var requestState: ExtensionRequestState
  
  /**
    * Represents the user who made the request
    */
  var requestedBy: IdentityRef
  
  /**
    * Date at which the request was resolved
    */
  var resolveDate: Date
  
  /**
    * Represents the user who resolved the request
    */
  var resolvedBy: IdentityRef
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
  implicit class ExtensionRequestMutableBuilder[Self <: ExtensionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRejectMessage(value: String): Self = StObject.set(x, "rejectMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestDate(value: Date): Self = StObject.set(x, "requestDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestMessage(value: String): Self = StObject.set(x, "requestMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestState(value: ExtensionRequestState): Self = StObject.set(x, "requestState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestedBy(value: IdentityRef): Self = StObject.set(x, "requestedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResolveDate(value: Date): Self = StObject.set(x, "resolveDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResolvedBy(value: IdentityRef): Self = StObject.set(x, "resolvedBy", value.asInstanceOf[js.Any])
  }
}
