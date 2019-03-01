package typings
package vsoDashNodeDashApiLib.interfacesExtensionManagementInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExtensionRequest extends js.Object {
  /**
    * Required message supplied if the request is rejected
    */
  var rejectMessage: java.lang.String
  /**
    * Date at which the request was made
    */
  var requestDate: stdLib.Date
  /**
    * Optional message supplied by the requester justifying the request
    */
  var requestMessage: java.lang.String
  /**
    * Represents the state of the request
    */
  var requestState: ExtensionRequestState
  /**
    * Represents the user who made the request
    */
  var requestedBy: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef
  /**
    * Date at which the request was resolved
    */
  var resolveDate: stdLib.Date
  /**
    * Represents the user who resolved the request
    */
  var resolvedBy: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef
}

object ExtensionRequest {
  @scala.inline
  def apply(
    rejectMessage: java.lang.String,
    requestDate: stdLib.Date,
    requestMessage: java.lang.String,
    requestState: ExtensionRequestState,
    requestedBy: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef,
    resolveDate: stdLib.Date,
    resolvedBy: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef
  ): ExtensionRequest = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("rejectMessage")(rejectMessage)
    __obj.updateDynamic("requestDate")(requestDate)
    __obj.updateDynamic("requestMessage")(requestMessage)
    __obj.updateDynamic("requestState")(requestState)
    __obj.updateDynamic("requestedBy")(requestedBy)
    __obj.updateDynamic("resolveDate")(resolveDate)
    __obj.updateDynamic("resolvedBy")(resolvedBy)
    __obj.asInstanceOf[ExtensionRequest]
  }
}

