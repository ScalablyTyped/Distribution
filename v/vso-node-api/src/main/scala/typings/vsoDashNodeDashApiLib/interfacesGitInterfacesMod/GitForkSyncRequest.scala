package typings
package vsoDashNodeDashApiLib.interfacesGitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitForkSyncRequest extends js.Object {
  /**
    * Collection of related links
    */
  var _links: js.Any
  var detailedStatus: GitForkOperationStatusDetail
  /**
    * Unique identifier for the operation.
    */
  var operationId: scala.Double
  /**
    * Fully-qualified identifier for the source repository.
    */
  var source: GlobalGitRepositoryKey
  /**
    * If supplied, the set of ref mappings to use when performing a "sync" or create. If missing, all refs will be synchronized.
    */
  var sourceToTargetRefs: js.Array[SourceToTargetRef]
  var status: GitAsyncOperationStatus
}

object GitForkSyncRequest {
  @scala.inline
  def apply(
    _links: js.Any,
    detailedStatus: GitForkOperationStatusDetail,
    operationId: scala.Double,
    source: GlobalGitRepositoryKey,
    sourceToTargetRefs: js.Array[SourceToTargetRef],
    status: GitAsyncOperationStatus
  ): GitForkSyncRequest = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("_links")(_links)
    __obj.updateDynamic("detailedStatus")(detailedStatus)
    __obj.updateDynamic("operationId")(operationId)
    __obj.updateDynamic("source")(source)
    __obj.updateDynamic("sourceToTargetRefs")(sourceToTargetRefs)
    __obj.updateDynamic("status")(status)
    __obj.asInstanceOf[GitForkSyncRequest]
  }
}

