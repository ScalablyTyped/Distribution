package typings.typedDashGithubDashApi.distApiDashInterfacesWebDashHooksMod

import typings.typedDashGithubDashApi.distApiDashInterfacesRepositoryMod.Repository
import typings.typedDashGithubDashApi.distApiDashInterfacesUserMod.OrganizationSummary
import typings.typedDashGithubDashApi.distApiDashInterfacesUserMod.UserSummary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebHookData extends Event {
  var organization: js.UndefOr[OrganizationSummary] = js.undefined
  var repository: js.UndefOr[Repository] = js.undefined
  var sender: UserSummary
}

object WebHookData {
  @scala.inline
  def apply(
    action: String,
    sender: UserSummary,
    organization: OrganizationSummary = null,
    repository: Repository = null
  ): WebHookData = {
    val __obj = js.Dynamic.literal(action = action, sender = sender)
    if (organization != null) __obj.updateDynamic("organization")(organization)
    if (repository != null) __obj.updateDynamic("repository")(repository)
    __obj.asInstanceOf[WebHookData]
  }
}

