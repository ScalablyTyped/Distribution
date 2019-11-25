package typings.typedDashGithubDashApi.distApiDashInterfacesWebDashHooksMod

import typings.typedDashGithubDashApi.distApiDashInterfacesIssueMod.Issue
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

trait IssueEvent extends Event {
  @JSName("action")
  var action_IssueEvent: assigned | unassigned | labeled | unlabeled | opened | edited | milestoned | demilestoned | closed | reopened
  var issue: Issue
}

object IssueEvent {
  @scala.inline
  def apply(
    action: assigned | unassigned | labeled | unlabeled | opened | edited | milestoned | demilestoned | closed | reopened,
    issue: Issue
  ): IssueEvent = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], issue = issue.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IssueEvent]
  }
}

