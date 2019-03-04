package typings
package typedDashGithubDashApiLib.distApiDashInterfacesWebDashHooksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebHookData extends Event {
  var organization: js.UndefOr[typedDashGithubDashApiLib.distApiDashInterfacesUserMod.OrganizationSummary] = js.undefined
  var repository: js.UndefOr[typedDashGithubDashApiLib.distApiDashInterfacesRepositoryMod.Repository] = js.undefined
  var sender: typedDashGithubDashApiLib.distApiDashInterfacesUserMod.UserSummary
}

object WebHookData {
  @scala.inline
  def apply(
    action: java.lang.String,
    sender: typedDashGithubDashApiLib.distApiDashInterfacesUserMod.UserSummary,
    organization: typedDashGithubDashApiLib.distApiDashInterfacesUserMod.OrganizationSummary = null,
    repository: typedDashGithubDashApiLib.distApiDashInterfacesRepositoryMod.Repository = null
  ): WebHookData = {
    val __obj = js.Dynamic.literal(action = action, sender = sender)
    if (organization != null) __obj.updateDynamic("organization")(organization)
    if (repository != null) __obj.updateDynamic("repository")(repository)
    __obj.asInstanceOf[WebHookData]
  }
}

