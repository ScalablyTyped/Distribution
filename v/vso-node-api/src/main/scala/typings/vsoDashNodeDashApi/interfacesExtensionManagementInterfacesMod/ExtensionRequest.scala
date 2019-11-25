package typings.vsoDashNodeDashApi.interfacesExtensionManagementInterfacesMod

import typings.std.Date
import typings.vsoDashNodeDashApi.interfacesCommonVSSInterfacesMod.IdentityRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExtensionRequest extends js.Object {
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
}

