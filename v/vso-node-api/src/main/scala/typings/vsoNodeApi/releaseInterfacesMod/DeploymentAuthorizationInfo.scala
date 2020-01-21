package typings.vsoNodeApi.releaseInterfacesMod

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
    val __obj = js.Dynamic.literal(authorizationHeaderFor = authorizationHeaderFor.asInstanceOf[js.Any], resources = resources.asInstanceOf[js.Any], tenantId = tenantId.asInstanceOf[js.Any], vstsAccessTokenKey = vstsAccessTokenKey.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeploymentAuthorizationInfo]
  }
}

