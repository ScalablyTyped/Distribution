package typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeploymentAuthorizationInfo extends js.Object {
  var authorizationHeaderFor: AuthorizationHeaderFor
  var resources: js.Array[String]
  var tenantId: String
  var vstsAccessTokenKey: String
}

object DeploymentAuthorizationInfo {
  @scala.inline
  def apply(
    authorizationHeaderFor: AuthorizationHeaderFor,
    resources: js.Array[String],
    tenantId: String,
    vstsAccessTokenKey: String
  ): DeploymentAuthorizationInfo = {
    val __obj = js.Dynamic.literal(authorizationHeaderFor = authorizationHeaderFor, resources = resources, tenantId = tenantId, vstsAccessTokenKey = vstsAccessTokenKey)
  
    __obj.asInstanceOf[DeploymentAuthorizationInfo]
  }
}

