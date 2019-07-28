package typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod

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
    val __obj = js.Dynamic.literal(accountName = accountName, authenticationToken = authenticationToken, tfsUrl = tfsUrl, version = version)
  
    __obj.asInstanceOf[ArtifactInstanceData]
  }
}

