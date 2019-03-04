package typings
package typedDashGithubDashApiLib.distApiDashInterfacesBranchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Branch extends js.Object {
  var _links: typedDashGithubDashApiLib.Anon_Html
  var commit: typedDashGithubDashApiLib.distApiDashInterfacesCommitMod.CommitSummary
  var name: java.lang.String
  var `protected`: js.UndefOr[scala.Boolean] = js.undefined
  var protection_url: js.UndefOr[java.lang.String] = js.undefined
}

object Branch {
  @scala.inline
  def apply(
    _links: typedDashGithubDashApiLib.Anon_Html,
    commit: typedDashGithubDashApiLib.distApiDashInterfacesCommitMod.CommitSummary,
    name: java.lang.String,
    `protected`: js.UndefOr[scala.Boolean] = js.undefined,
    protection_url: java.lang.String = null
  ): Branch = {
    val __obj = js.Dynamic.literal(_links = _links, commit = commit, name = name)
    if (!js.isUndefined(`protected`)) __obj.updateDynamic("protected")(`protected`)
    if (protection_url != null) __obj.updateDynamic("protection_url")(protection_url)
    __obj.asInstanceOf[Branch]
  }
}

