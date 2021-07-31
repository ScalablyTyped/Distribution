package typings.vsoNodeApi.gitInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GitPullRequestCompletionOptions extends StObject {
  
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
  
  @scala.inline
  implicit class GitPullRequestCompletionOptionsMutableBuilder[Self <: GitPullRequestCompletionOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBypassPolicy(value: Boolean): Self = StObject.set(x, "bypassPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBypassReason(value: String): Self = StObject.set(x, "bypassReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteSourceBranch(value: Boolean): Self = StObject.set(x, "deleteSourceBranch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMergeCommitMessage(value: String): Self = StObject.set(x, "mergeCommitMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSquashMerge(value: Boolean): Self = StObject.set(x, "squashMerge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitionWorkItems(value: Boolean): Self = StObject.set(x, "transitionWorkItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTriggeredByAutoComplete(value: Boolean): Self = StObject.set(x, "triggeredByAutoComplete", value.asInstanceOf[js.Any])
  }
}
