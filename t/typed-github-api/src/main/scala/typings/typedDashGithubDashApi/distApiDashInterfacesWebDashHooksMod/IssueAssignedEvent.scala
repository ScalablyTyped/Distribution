package typings.typedDashGithubDashApi.distApiDashInterfacesWebDashHooksMod

import typings.typedDashGithubDashApi.distApiDashInterfacesIssueMod.Issue
import typings.typedDashGithubDashApi.distApiDashInterfacesUserMod.UserSummary
import typings.typedDashGithubDashApi.typedDashGithubDashApiStrings.assigned
import typings.typedDashGithubDashApi.typedDashGithubDashApiStrings.unassigned
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
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], assignee = assignee, issue = issue)
  
    __obj.asInstanceOf[IssueAssignedEvent]
  }
}

