package typings
package vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeploymentAuthorizationInfo extends js.Object {
  var authorizationHeaderFor: AuthorizationHeaderFor
  var resources: js.Array[java.lang.String]
  var tenantId: java.lang.String
  var vstsAccessTokenKey: java.lang.String
}

object DeploymentAuthorizationInfo {
  @scala.inline
  def apply(
    authorizationHeaderFor: AuthorizationHeaderFor,
    resources: js.Array[java.lang.String],
    tenantId: java.lang.String,
    vstsAccessTokenKey: java.lang.String
  ): DeploymentAuthorizationInfo = {
    val __obj = js.Dynamic.literal(authorizationHeaderFor = authorizationHeaderFor, resources = resources, tenantId = tenantId, vstsAccessTokenKey = vstsAccessTokenKey)
  
    __obj.asInstanceOf[DeploymentAuthorizationInfo]
  }
}

