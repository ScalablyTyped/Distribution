package typings
package typedDashGithubDashApiLib.distApiDashInterfacesWebDashHooksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IssueEvent extends Event {
  @JSName("action")
  var action_IssueEvent: typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.assigned | typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.unassigned | typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.labeled | typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.unlabeled | typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.opened | typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.edited | typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.milestoned | typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.demilestoned | typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.closed | typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.reopened
  var issue: typedDashGithubDashApiLib.distApiDashInterfacesIssueMod.Issue
}

object IssueEvent {
  @scala.inline
  def apply(
    action: typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.assigned | typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.unassigned | typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.labeled | typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.unlabeled | typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.opened | typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.edited | typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.milestoned | typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.demilestoned | typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.closed | typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.reopened,
    issue: typedDashGithubDashApiLib.distApiDashInterfacesIssueMod.Issue
  ): IssueEvent = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], issue = issue)
  
    __obj.asInstanceOf[IssueEvent]
  }
}

