package typings
package typedDashGithubDashApiLib.distApiDashInterfacesBranchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BranchSummary extends js.Object {
  var label: java.lang.String
  var ref: java.lang.String
  var repo: typedDashGithubDashApiLib.distApiDashInterfacesRepositoryMod.Repository
  var sha: java.lang.String
  var user: typedDashGithubDashApiLib.distApiDashInterfacesUserMod.UserSummary
}

object BranchSummary {
  @scala.inline
  def apply(
    label: java.lang.String,
    ref: java.lang.String,
    repo: typedDashGithubDashApiLib.distApiDashInterfacesRepositoryMod.Repository,
    sha: java.lang.String,
    user: typedDashGithubDashApiLib.distApiDashInterfacesUserMod.UserSummary
  ): BranchSummary = {
    val __obj = js.Dynamic.literal(label = label, ref = ref, repo = repo, sha = sha, user = user)
  
    __obj.asInstanceOf[BranchSummary]
  }
}

