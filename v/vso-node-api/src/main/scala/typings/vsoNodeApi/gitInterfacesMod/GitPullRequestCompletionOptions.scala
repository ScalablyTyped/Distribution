package typings.vsoNodeApi.gitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GitPullRequestCompletionOptions extends js.Object {
  /**
    * If true, policies will be explicitly bypassed while the pull request is completed.
    */
  var bypassPolicy: Boolean = js.native
  /**
    * If policies are bypassed, this reason is stored as to why bypass was used.
    */
  var bypassReason: String = js.native
  /**
    * If true, the source branch of the pull request will be deleted after completion.
    */
  var deleteSourceBranch: Boolean = js.native
  /**
    * If set, this will be used as the commit message of the merge commit.
    */
  var mergeCommitMessage: String = js.native
  /**
    * If true, the commits in the pull request will be squash-merged into the specified target branch on completion.
    */
  var squashMerge: Boolean = js.native
  /**
    * If true, we will attempt to transition any work items linked to the pull request into the next logical state (i.e. Active -> Resolved)
    */
  var transitionWorkItems: Boolean = js.native
  /**
    * If true, the current completion attempt was triggered via auto-complete. Used internally.
    */
  var triggeredByAutoComplete: Boolean = js.native
}

object GitPullRequestCompletionOptions {
  @scala.inline
  def apply(
    bypassPolicy: Boolean,
    bypassReason: String,
    deleteSourceBranch: Boolean,
    mergeCommitMessage: String,
    squashMerge: Boolean,
    transitionWorkItems: Boolean,
    triggeredByAutoComplete: Boolean
  ): GitPullRequestCompletionOptions = {
    val __obj = js.Dynamic.literal(bypassPolicy = bypassPolicy.asInstanceOf[js.Any], bypassReason = bypassReason.asInstanceOf[js.Any], deleteSourceBranch = deleteSourceBranch.asInstanceOf[js.Any], mergeCommitMessage = mergeCommitMessage.asInstanceOf[js.Any], squashMerge = squashMerge.asInstanceOf[js.Any], transitionWorkItems = transitionWorkItems.asInstanceOf[js.Any], triggeredByAutoComplete = triggeredByAutoComplete.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitPullRequestCompletionOptions]
  }
  @scala.inline
  implicit class GitPullRequestCompletionOptionsOps[Self <: GitPullRequestCompletionOptions] (val x: Self) extends AnyVal {
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
    def setBypassPolicy(value: Boolean): Self = this.set("bypassPolicy", value.asInstanceOf[js.Any])
    @scala.inline
    def setBypassReason(value: String): Self = this.set("bypassReason", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeleteSourceBranch(value: Boolean): Self = this.set("deleteSourceBranch", value.asInstanceOf[js.Any])
    @scala.inline
    def setMergeCommitMessage(value: String): Self = this.set("mergeCommitMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def setSquashMerge(value: Boolean): Self = this.set("squashMerge", value.asInstanceOf[js.Any])
    @scala.inline
    def setTransitionWorkItems(value: Boolean): Self = this.set("transitionWorkItems", value.asInstanceOf[js.Any])
    @scala.inline
    def setTriggeredByAutoComplete(value: Boolean): Self = this.set("triggeredByAutoComplete", value.asInstanceOf[js.Any])
  }
  
}

