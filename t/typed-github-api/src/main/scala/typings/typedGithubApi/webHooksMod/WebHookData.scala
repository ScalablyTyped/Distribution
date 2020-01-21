package typings.typedGithubApi.webHooksMod

import typings.typedGithubApi.repositoryMod.Repository
import typings.typedGithubApi.userMod.OrganizationSummary
import typings.typedGithubApi.userMod.UserSummary
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
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    if (organization != null) __obj.updateDynamic("organization")(organization.asInstanceOf[js.Any])
    if (repository != null) __obj.updateDynamic("repository")(repository.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebHookData]
  }
}

