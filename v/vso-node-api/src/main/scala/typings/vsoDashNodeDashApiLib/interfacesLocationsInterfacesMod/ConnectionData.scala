package typings
package vsoDashNodeDashApiLib.interfacesLocationsInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectionData extends js.Object {
  /**
    * The Id of the authenticated user who made this request. More information about the user can be obtained by passing this Id to the Identity service
    */
  var authenticatedUser: vsoDashNodeDashApiLib.interfacesIdentitiesInterfacesMod.Identity
  /**
    * The Id of the authorized user who made this request. More information about the user can be obtained by passing this Id to the Identity service
    */
  var authorizedUser: vsoDashNodeDashApiLib.interfacesIdentitiesInterfacesMod.Identity
  /**
    * The id for the server.
    */
  var deploymentId: java.lang.String
  /**
    * The instance id for this host.
    */
  var instanceId: java.lang.String
  /**
    * The last user access for this instance.  Null if not requested specifically.
    */
  var lastUserAccess: stdLib.Date
  /**
    * Data that the location service holds.
    */
  var locationServiceData: LocationServiceData
  /**
    * The virtual directory of the host we are talking to.
    */
  var webApplicationRelativeDirectory: java.lang.String
}

object ConnectionData {
  @scala.inline
  def apply(
    authenticatedUser: vsoDashNodeDashApiLib.interfacesIdentitiesInterfacesMod.Identity,
    authorizedUser: vsoDashNodeDashApiLib.interfacesIdentitiesInterfacesMod.Identity,
    deploymentId: java.lang.String,
    instanceId: java.lang.String,
    lastUserAccess: stdLib.Date,
    locationServiceData: LocationServiceData,
    webApplicationRelativeDirectory: java.lang.String
  ): ConnectionData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("authenticatedUser")(authenticatedUser)
    __obj.updateDynamic("authorizedUser")(authorizedUser)
    __obj.updateDynamic("deploymentId")(deploymentId)
    __obj.updateDynamic("instanceId")(instanceId)
    __obj.updateDynamic("lastUserAccess")(lastUserAccess)
    __obj.updateDynamic("locationServiceData")(locationServiceData)
    __obj.updateDynamic("webApplicationRelativeDirectory")(webApplicationRelativeDirectory)
    __obj.asInstanceOf[ConnectionData]
  }
}

