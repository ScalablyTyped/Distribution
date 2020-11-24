package typings.vsoNodeApi.gitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GitAsyncRefOperationSource extends js.Object {
  
  /**
    * A list of commits to cherry pick or revert
    */
  var commitList: js.Array[GitCommitRef] = js.native
  
  /**
    * Id of the pull request to cherry pick or revert
    */
  var pullRequestId: Double = js.native
}
object GitAsyncRefOperationSource {
  
  @scala.inline
  def apply(commitList: js.Array[GitCommitRef], pullRequestId: Double): GitAsyncRefOperationSource = {
    val __obj = js.Dynamic.literal(commitList = commitList.asInstanceOf[js.Any], pullRequestId = pullRequestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitAsyncRefOperationSource]
  }
  
  @scala.inline
  implicit class GitAsyncRefOperationSourceOps[Self <: GitAsyncRefOperationSource] (val x: Self) extends AnyVal {
    
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
    def setCommitListVarargs(value: GitCommitRef*): Self = this.set("commitList", js.Array(value :_*))
    
    @scala.inline
    def setCommitList(value: js.Array[GitCommitRef]): Self = this.set("commitList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPullRequestId(value: Double): Self = this.set("pullRequestId", value.asInstanceOf[js.Any])
  }
}
