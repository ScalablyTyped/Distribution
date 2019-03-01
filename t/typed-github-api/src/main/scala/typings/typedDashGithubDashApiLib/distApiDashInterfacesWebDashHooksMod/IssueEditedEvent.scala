package typings
package typedDashGithubDashApiLib.distApiDashInterfacesWebDashHooksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IssueEditedEvent extends IssueEvent {
  @JSName("action")
  var action_IssueEditedEvent: typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.edited
  var changes: typedDashGithubDashApiLib.Anon_Body
}

object IssueEditedEvent {
  @scala.inline
  def apply(
    action: typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.edited,
    changes: typedDashGithubDashApiLib.Anon_Body,
    issue: typedDashGithubDashApiLib.distApiDashInterfacesIssueMod.Issue
  ): IssueEditedEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("action")(action)
    __obj.updateDynamic("changes")(changes)
    __obj.updateDynamic("issue")(issue)
    __obj.asInstanceOf[IssueEditedEvent]
  }
}

