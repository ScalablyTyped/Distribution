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

object WebApiConnectedService {
  @scala.inline
  def apply(
    authenticatedBy: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef,
    description: java.lang.String,
    friendlyName: java.lang.String,
    id: java.lang.String,
    kind: java.lang.String,
    project: TeamProjectReference,
    serviceUri: java.lang.String,
    url: java.lang.String
  ): WebApiConnectedService = {
    val __obj = js.Dynamic.literal(authenticatedBy = authenticatedBy, description = description, friendlyName = friendlyName, id = id, kind = kind, project = project, serviceUri = serviceUri, url = url)
  
    __obj.asInstanceOf[WebApiConnectedService]
  }
}

