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

