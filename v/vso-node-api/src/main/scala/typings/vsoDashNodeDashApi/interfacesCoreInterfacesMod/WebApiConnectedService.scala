package typings.vsoDashNodeDashApi.interfacesCoreInterfacesMod

import typings.vsoDashNodeDashApi.interfacesCommonVSSInterfacesMod.IdentityRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebApiConnectedService extends WebApiConnectedServiceRef {
  /**
    * The user who did the OAuth authentication to created this service
    */
  var authenticatedBy: IdentityRef
  /**
    * Extra description on the service.
    */
  var description: String
  /**
    * Friendly Name of service connection
    */
  var friendlyName: String
  /**
    * The kind of service.
    */
  var kind: String
  /**
    * The project associated with this service
    */
  var project: TeamProjectReference
  /**
    * Optional uri to connect directly to the service such as https://windows.azure.com
    */
  var serviceUri: String
}

object WebApiConnectedService {
  @scala.inline
  def apply(
    authenticatedBy: IdentityRef,
    description: String,
    friendlyName: String,
    id: String,
    kind: String,
    project: TeamProjectReference,
    serviceUri: String,
    url: String
  ): WebApiConnectedService = {
    val __obj = js.Dynamic.literal(authenticatedBy = authenticatedBy, description = description, friendlyName = friendlyName, id = id, kind = kind, project = project, serviceUri = serviceUri, url = url)
  
    __obj.asInstanceOf[WebApiConnectedService]
  }
}

