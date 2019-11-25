package typings.typedDashGithubDashApi.distWebDashHookMod

import typings.typedDashGithubDashApi.distInterfacesIssueMod.Issue
import typings.typedDashGithubDashApi.distInterfacesUserMod.UserSummary
import typings.typedDashGithubDashApi.typedDashGithubDashApiStrings.assigned
import typings.typedDashGithubDashApi.typedDashGithubDashApiStrings.closed
import typings.typedDashGithubDashApi.typedDashGithubDashApiStrings.demilestoned
import typings.typedDashGithubDashApi.typedDashGithubDashApiStrings.edited
import typings.typedDashGithubDashApi.typedDashGithubDashApiStrings.labeled
import typings.typedDashGithubDashApi.typedDashGithubDashApiStrings.milestoned
import typings.typedDashGithubDashApi.typedDashGithubDashApiStrings.opened
import typings.typedDashGithubDashApi.typedDashGithubDashApiStrings.reopened
import typings.typedDashGithubDashApi.typedDashGithubDashApiStrings.unassigned
import typings.typedDashGithubDashApi.typedDashGithubDashApiStrings.unlabeled
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IssueWebHookData extends WebHookData {
  @JSName("action")
  var action_IssueWebHookData: assigned | unassigned | labeled | unlabeled | opened | edited | milestoned | demilestoned | closed | reopened
  var issue: Issue
}

object IssueWebHookData {
  @scala.inline
  def apply(
    action: assigned | unassigned | labeled | unlabeled | opened | edited | milestoned | demilestoned | closed | reopened,
    event: String,
    id: String,
    issue: Issue,
    sender: UserSummary
  ): IssueWebHookData = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], issue = issue.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IssueWebHookData]
  }
}

