package typings.vsoNodeApi.coreInterfacesMod

import typings.vsoNodeApi.vssinterfacesMod.IdentityRef
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
    val __obj = js.Dynamic.literal(authenticatedBy = authenticatedBy.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], friendlyName = friendlyName.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], project = project.asInstanceOf[js.Any], serviceUri = serviceUri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebApiConnectedService]
  }
}

