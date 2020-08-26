package typings.vsoNodeApi.gitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GitForkSyncRequest extends js.Object {
  /**
    * Collection of related links
    */
  var _links: js.Any = js.native
  var detailedStatus: GitForkOperationStatusDetail = js.native
  /**
    * Unique identifier for the operation.
    */
  var operationId: Double = js.native
  /**
    * Fully-qualified identifier for the source repository.
    */
  var source: GlobalGitRepositoryKey = js.native
  /**
    * If supplied, the set of ref mappings to use when performing a "sync" or create. If missing, all refs will be synchronized.
    */
  var sourceToTargetRefs: js.Array[SourceToTargetRef] = js.native
  var status: GitAsyncOperationStatus = js.native
}

object GitForkSyncRequest {
  @scala.inline
  def apply(
    _links: js.Any,
    detailedStatus: GitForkOperationStatusDetail,
    operationId: Double,
    source: GlobalGitRepositoryKey,
    sourceToTargetRefs: js.Array[SourceToTargetRef],
    status: GitAsyncOperationStatus
  ): GitForkSyncRequest = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], detailedStatus = detailedStatus.asInstanceOf[js.Any], operationId = operationId.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], sourceToTargetRefs = sourceToTargetRefs.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitForkSyncRequest]
  }
  @scala.inline
  implicit class GitForkSyncRequestOps[Self <: GitForkSyncRequest] (val x: Self) extends AnyVal {
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
    def set_links(value: js.Any): Self = this.set("_links", value.asInstanceOf[js.Any])
    @scala.inline
    def setDetailedStatus(value: GitForkOperationStatusDetail): Self = this.set("detailedStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def setOperationId(value: Double): Self = this.set("operationId", value.asInstanceOf[js.Any])
    @scala.inline
    def setSource(value: GlobalGitRepositoryKey): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def setSourceToTargetRefsVarargs(value: SourceToTargetRef*): Self = this.set("sourceToTargetRefs", js.Array(value :_*))
    @scala.inline
    def setSourceToTargetRefs(value: js.Array[SourceToTargetRef]): Self = this.set("sourceToTargetRefs", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: GitAsyncOperationStatus): Self = this.set("status", value.asInstanceOf[js.Any])
  }
  
}

