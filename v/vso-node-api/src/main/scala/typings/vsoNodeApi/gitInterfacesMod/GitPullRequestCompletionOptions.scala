package typings.vsoNodeApi.gitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitPullRequestCompletionOptions extends js.Object {
  /**
    * If true, policies will be explicitly bypassed while the pull request is completed.
    */
  var bypassPolicy: Boolean
  /**
    * If policies are bypassed, this reason is stored as to why bypass was used.
    */
  var bypassReason: String
  /**
    * If true, the source branch of the pull request will be deleted after completion.
    */
  var deleteSourceBranch: Boolean
  /**
    * If set, this will be used as the commit message of the merge commit.
    */
  var mergeCommitMessage: String
  /**
    * If true, the commits in the pull request will be squash-merged into the specified target branch on completion.
    */
  var squashMerge: Boolean
  /**
    * If true, we will attempt to transition any work items linked to the pull request into the next logical state (i.e. Active -> Resolved)
    */
  var transitionWorkItems: Boolean
  /**
    * If true, the current completion attempt was triggered via auto-complete. Used internally.
    */
  var triggeredByAutoComplete: Boolean
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
}

