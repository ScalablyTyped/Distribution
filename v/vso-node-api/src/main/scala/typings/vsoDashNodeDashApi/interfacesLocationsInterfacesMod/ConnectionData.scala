package typings.vsoDashNodeDashApi.interfacesLocationsInterfacesMod

import typings.std.Date
import typings.vsoDashNodeDashApi.interfacesIdentitiesInterfacesMod.Identity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectionData extends js.Object {
  /**
    * The Id of the authenticated user who made this request. More information about the user can be obtained by passing this Id to the Identity service
    */
  var authenticatedUser: Identity
  /**
    * The Id of the authorized user who made this request. More information about the user can be obtained by passing this Id to the Identity service
    */
  var authorizedUser: Identity
  /**
    * The id for the server.
    */
  var deploymentId: String
  /**
    * The instance id for this host.
    */
  var instanceId: String
  /**
    * The last user access for this instance.  Null if not requested specifically.
    */
  var lastUserAccess: Date
  /**
    * Data that the location service holds.
    */
  var locationServiceData: LocationServiceData
  /**
    * The virtual directory of the host we are talking to.
    */
  var webApplicationRelativeDirectory: String
}

object ConnectionData {
  @scala.inline
  def apply(
    authenticatedUser: Identity,
    authorizedUser: Identity,
    deploymentId: String,
    instanceId: String,
    lastUserAccess: Date,
    locationServiceData: LocationServiceData,
    webApplicationRelativeDirectory: String
  ): ConnectionData = {
    val __obj = js.Dynamic.literal(authenticatedUser = authenticatedUser, authorizedUser = authorizedUser, deploymentId = deploymentId, instanceId = instanceId, lastUserAccess = lastUserAccess, locationServiceData = locationServiceData, webApplicationRelativeDirectory = webApplicationRelativeDirectory)
  
    __obj.asInstanceOf[ConnectionData]
  }
}

