package typings.vsoNodeApi.gitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitForkSyncRequestParameters extends js.Object {
  /**
    * Fully-qualified identifier for the source repository.
    */
  var source: GlobalGitRepositoryKey
  /**
    * If supplied, the set of ref mappings to use when performing a "sync" or create. If missing, all refs will be synchronized.
    */
  var sourceToTargetRefs: js.Array[SourceToTargetRef]
}

object GitForkSyncRequestParameters {
  @scala.inline
  def apply(source: GlobalGitRepositoryKey, sourceToTargetRefs: js.Array[SourceToTargetRef]): GitForkSyncRequestParameters = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], sourceToTargetRefs = sourceToTargetRefs.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GitForkSyncRequestParameters]
  }
}

