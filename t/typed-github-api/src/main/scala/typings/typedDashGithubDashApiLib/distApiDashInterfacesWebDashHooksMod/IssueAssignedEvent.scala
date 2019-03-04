package typings
package typedDashGithubDashApiLib.distApiDashInterfacesWebDashHooksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IssueAssignedEvent extends IssueEvent {
  @JSName("action")
  var action_IssueAssignedEvent: typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.assigned | typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.unassigned
  var assignee: typedDashGithubDashApiLib.distApiDashInterfacesUserMod.UserSummary
}

object IssueAssignedEvent {
  @scala.inline
  def apply(
    action: typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.assigned | typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.unassigned,
    assignee: typedDashGithubDashApiLib.distApiDashInterfacesUserMod.UserSummary,
    issue: typedDashGithubDashApiLib.distApiDashInterfacesIssueMod.Issue
  ): IssueAssignedEvent = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], assignee = assignee, issue = issue)
  
    __obj.asInstanceOf[IssueAssignedEvent]
  }
}

