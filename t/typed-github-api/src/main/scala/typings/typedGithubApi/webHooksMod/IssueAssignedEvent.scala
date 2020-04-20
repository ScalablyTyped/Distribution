package typings.typedGithubApi.webHooksMod

import typings.typedGithubApi.issueMod.Issue
import typings.typedGithubApi.typedGithubApiStrings.assigned
import typings.typedGithubApi.typedGithubApiStrings.unassigned
import typings.typedGithubApi.userMod.UserSummary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IssueAssignedEvent extends IssueEvent {
  @JSName("action")
  var action_IssueAssignedEvent: assigned | unassigned
  var assignee: UserSummary
}

object IssueAssignedEvent {
  @scala.inline
  def apply(action: assigned | unassigned, assignee: UserSummary, issue: Issue): IssueAssignedEvent = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], assignee = assignee.asInstanceOf[js.Any], issue = issue.asInstanceOf[js.Any])
    __obj.asInstanceOf[IssueAssignedEvent]
  }
}

