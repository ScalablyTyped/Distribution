package typings.vsoNodeApi.gitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GitForkSyncRequestParameters extends js.Object {
  /**
    * Fully-qualified identifier for the source repository.
    */
  var source: GlobalGitRepositoryKey = js.native
  /**
    * If supplied, the set of ref mappings to use when performing a "sync" or create. If missing, all refs will be synchronized.
    */
  var sourceToTargetRefs: js.Array[SourceToTargetRef] = js.native
}

object GitForkSyncRequestParameters {
  @scala.inline
  def apply(source: GlobalGitRepositoryKey, sourceToTargetRefs: js.Array[SourceToTargetRef]): GitForkSyncRequestParameters = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], sourceToTargetRefs = sourceToTargetRefs.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitForkSyncRequestParameters]
  }
  @scala.inline
  implicit class GitForkSyncRequestParametersOps[Self <: GitForkSyncRequestParameters] (val x: Self) extends AnyVal {
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
    def setSource(value: GlobalGitRepositoryKey): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def setSourceToTargetRefsVarargs(value: SourceToTargetRef*): Self = this.set("sourceToTargetRefs", js.Array(value :_*))
    @scala.inline
    def setSourceToTargetRefs(value: js.Array[SourceToTargetRef]): Self = this.set("sourceToTargetRefs", value.asInstanceOf[js.Any])
  }
  
}

