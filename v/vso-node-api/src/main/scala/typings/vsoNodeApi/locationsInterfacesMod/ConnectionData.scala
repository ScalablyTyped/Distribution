package typings.vsoNodeApi.locationsInterfacesMod

import typings.std.Date
import typings.vsoNodeApi.identitiesInterfacesMod.Identity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConnectionData extends js.Object {
  /**
    * The Id of the authenticated user who made this request. More information about the user can be obtained by passing this Id to the Identity service
    */
  var authenticatedUser: Identity = js.native
  /**
    * The Id of the authorized user who made this request. More information about the user can be obtained by passing this Id to the Identity service
    */
  var authorizedUser: Identity = js.native
  /**
    * The id for the server.
    */
  var deploymentId: String = js.native
  /**
    * The instance id for this host.
    */
  var instanceId: String = js.native
  /**
    * The last user access for this instance.  Null if not requested specifically.
    */
  var lastUserAccess: Date = js.native
  /**
    * Data that the location service holds.
    */
  var locationServiceData: LocationServiceData = js.native
  /**
    * The virtual directory of the host we are talking to.
    */
  var webApplicationRelativeDirectory: String = js.native
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
    val __obj = js.Dynamic.literal(authenticatedUser = authenticatedUser.asInstanceOf[js.Any], authorizedUser = authorizedUser.asInstanceOf[js.Any], deploymentId = deploymentId.asInstanceOf[js.Any], instanceId = instanceId.asInstanceOf[js.Any], lastUserAccess = lastUserAccess.asInstanceOf[js.Any], locationServiceData = locationServiceData.asInstanceOf[js.Any], webApplicationRelativeDirectory = webApplicationRelativeDirectory.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionData]
  }
  @scala.inline
  implicit class ConnectionDataOps[Self <: ConnectionData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAuthenticatedUser(value: Identity): Self = this.set("authenticatedUser", value.asInstanceOf[js.Any])
    @scala.inline
    def setAuthorizedUser(value: Identity): Self = this.set("authorizedUser", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeploymentId(value: String): Self = this.set("deploymentId", value.asInstanceOf[js.Any])
    @scala.inline
    def setInstanceId(value: String): Self = this.set("instanceId", value.asInstanceOf[js.Any])
    @scala.inline
    def setLastUserAccess(value: Date): Self = this.set("lastUserAccess", value.asInstanceOf[js.Any])
    @scala.inline
    def setLocationServiceData(value: LocationServiceData): Self = this.set("locationServiceData", value.asInstanceOf[js.Any])
    @scala.inline
    def setWebApplicationRelativeDirectory(value: String): Self = this.set("webApplicationRelativeDirectory", value.asInstanceOf[js.Any])
  }
  
}

