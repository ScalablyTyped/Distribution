package typings.vsoNodeApi.releaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArtifactInstanceData extends js.Object {
  var accountName: String
  var authenticationToken: String
  var tfsUrl: String
  var version: String
}

object ArtifactInstanceData {
  @scala.inline
  def apply(accountName: String, authenticationToken: String, tfsUrl: String, version: String): ArtifactInstanceData = {
    val __obj = js.Dynamic.literal(accountName = accountName.asInstanceOf[js.Any], authenticationToken = authenticationToken.asInstanceOf[js.Any], tfsUrl = tfsUrl.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArtifactInstanceData]
  }
}

