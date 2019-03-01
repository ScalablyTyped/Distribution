package typings
package vsoDashNodeDashApiLib.interfacesGitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitRevert extends GitAsyncRefOperation {
  var revertId: scala.Double
}

object GitRevert {
  @scala.inline
  def apply(
    _links: js.Any,
    detailedStatus: GitAsyncRefOperationDetail,
    parameters: GitAsyncRefOperationParameters,
    revertId: scala.Double,
    status: GitAsyncOperationStatus,
    url: java.lang.String
  ): GitRevert = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("_links")(_links)
    __obj.updateDynamic("detailedStatus")(detailedStatus)
    __obj.updateDynamic("parameters")(parameters)
    __obj.updateDynamic("revertId")(revertId)
    __obj.updateDynamic("status")(status)
    __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[GitRevert]
  }
}

