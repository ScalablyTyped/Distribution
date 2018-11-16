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

