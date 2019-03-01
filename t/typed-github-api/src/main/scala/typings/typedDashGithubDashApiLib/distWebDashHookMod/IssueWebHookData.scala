package typings
package typedDashGithubDashApiLib.distWebDashHookMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IssueWebHookData extends WebHookData {
  @JSName("action")
  var action_IssueWebHookData: typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.assigned | typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.unassigned | typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.labeled | typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.unlabeled | typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.opened | typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.edited | typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.milestoned | typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.demilestoned | typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.closed | typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.reopened
  var issue: typedDashGithubDashApiLib.distInterfacesIssueMod.Issue
}

object IssueWebHookData {
  @scala.inline
  def apply(
    action: typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.assigned | typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.unassigned | typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.labeled | typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.unlabeled | typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.opened | typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.edited | typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.milestoned | typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.demilestoned | typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.closed | typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.reopened,
    event: java.lang.String,
    id: java.lang.String,
    issue: typedDashGithubDashApiLib.distInterfacesIssueMod.Issue,
    sender: typedDashGithubDashApiLib.distInterfacesUserMod.UserSummary
  ): IssueWebHookData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    __obj.updateDynamic("event")(event)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("issue")(issue)
    __obj.updateDynamic("sender")(sender)
    __obj.asInstanceOf[IssueWebHookData]
  }
}

