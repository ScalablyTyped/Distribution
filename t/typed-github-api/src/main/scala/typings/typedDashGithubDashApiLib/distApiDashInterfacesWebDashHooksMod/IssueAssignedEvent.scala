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

