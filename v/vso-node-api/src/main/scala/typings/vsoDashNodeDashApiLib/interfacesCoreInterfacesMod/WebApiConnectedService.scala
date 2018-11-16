package typings
package vsoDashNodeDashApiLib.interfacesCoreInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait WebApiConnectedService extends WebApiConnectedServiceRef {
  /**
       * The user who did the OAuth authentication to created this service
       */
  var authenticatedBy: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef
  /**
       * Extra description on the service.
       */
  var description: java.lang.String
  /**
       * Friendly Name of service connection
       */
  var friendlyName: java.lang.String
  /**
       * The kind of service.
       */
  var kind: java.lang.String
  /**
       * The project associated with this service
       */
  var project: TeamProjectReference
  /**
       * Optional uri to connect directly to the service such as https://windows.azure.com
       */
  var serviceUri: java.lang.String
}

