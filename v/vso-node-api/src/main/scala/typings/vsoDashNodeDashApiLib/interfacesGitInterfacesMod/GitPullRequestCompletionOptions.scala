package typings
package vsoDashNodeDashApiLib.interfacesGitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitPullRequestCompletionOptions extends js.Object {
  /**
    * If true, policies will be explicitly bypassed while the pull request is completed.
    */
  var bypassPolicy: scala.Boolean
  /**
    * If policies are bypassed, this reason is stored as to why bypass was used.
    */
  var bypassReason: java.lang.String
  /**
    * If true, the source branch of the pull request will be deleted after completion.
    */
  var deleteSourceBranch: scala.Boolean
  /**
    * If set, this will be used as the commit message of the merge commit.
    */
  var mergeCommitMessage: java.lang.String
  /**
    * If true, the commits in the pull request will be squash-merged into the specified target branch on completion.
    */
  var squashMerge: scala.Boolean
  /**
    * If true, we will attempt to transition any work items linked to the pull request into the next logical state (i.e. Active -> Resolved)
    */
  var transitionWorkItems: scala.Boolean
  /**
    * If true, the current completion attempt was triggered via auto-complete. Used internally.
    */
  var triggeredByAutoComplete: scala.Boolean
}

object GitPullRequestCompletionOptions {
  @scala.inline
  def apply(
    bypassPolicy: scala.Boolean,
    bypassReason: java.lang.String,
    deleteSourceBranch: scala.Boolean,
    mergeCommitMessage: java.lang.String,
    squashMerge: scala.Boolean,
    transitionWorkItems: scala.Boolean,
    triggeredByAutoComplete: scala.Boolean
  ): GitPullRequestCompletionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("bypassPolicy")(bypassPolicy)
    __obj.updateDynamic("bypassReason")(bypassReason)
    __obj.updateDynamic("deleteSourceBranch")(deleteSourceBranch)
    __obj.updateDynamic("mergeCommitMessage")(mergeCommitMessage)
    __obj.updateDynamic("squashMerge")(squashMerge)
    __obj.updateDynamic("transitionWorkItems")(transitionWorkItems)
    __obj.updateDynamic("triggeredByAutoComplete")(triggeredByAutoComplete)
    __obj.asInstanceOf[GitPullRequestCompletionOptions]
  }
}

