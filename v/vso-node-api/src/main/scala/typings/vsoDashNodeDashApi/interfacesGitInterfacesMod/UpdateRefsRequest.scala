package typings.vsoDashNodeDashApi.interfacesGitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateRefsRequest extends js.Object {
  var refUpdateRequests: js.Array[GitRefUpdate]
  var updateMode: GitRefUpdateMode
}

object UpdateRefsRequest {
  @scala.inline
  def apply(refUpdateRequests: js.Array[GitRefUpdate], updateMode: GitRefUpdateMode): UpdateRefsRequest = {
    val __obj = js.Dynamic.literal(refUpdateRequests = refUpdateRequests.asInstanceOf[js.Any], updateMode = updateMode.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UpdateRefsRequest]
  }
}

