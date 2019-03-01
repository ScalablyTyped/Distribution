package typings
package vsoDashNodeDashApiLib.interfacesGitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitAsyncRefOperation extends js.Object {
  var _links: js.Any
  var detailedStatus: GitAsyncRefOperationDetail
  var parameters: GitAsyncRefOperationParameters
  var status: GitAsyncOperationStatus
  /**
    * A URL that can be used to make further requests for status about the operation
    */
  var url: java.lang.String
}

object GitAsyncRefOperation {
  @scala.inline
  def apply(
    _links: js.Any,
    detailedStatus: GitAsyncRefOperationDetail,
    parameters: GitAsyncRefOperationParameters,
    status: GitAsyncOperationStatus,
    url: java.lang.String
  ): GitAsyncRefOperation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("_links")(_links)
    __obj.updateDynamic("detailedStatus")(detailedStatus)
    __obj.updateDynamic("parameters")(parameters)
    __obj.updateDynamic("status")(status)
    __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[GitAsyncRefOperation]
  }
}

