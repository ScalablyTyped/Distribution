package typings.typedDashGithubDashApi.distApiDashInterfacesBranchMod

import typings.typedDashGithubDashApi.distApiDashInterfacesRepositoryMod.Repository
import typings.typedDashGithubDashApi.distApiDashInterfacesUserMod.UserSummary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BranchSummary extends js.Object {
  var label: String
  var ref: String
  var repo: Repository
  var sha: String
  var user: UserSummary
}

object BranchSummary {
  @scala.inline
  def apply(label: String, ref: String, repo: Repository, sha: String, user: UserSummary): BranchSummary = {
    val __obj = js.Dynamic.literal(label = label, ref = ref, repo = repo, sha = sha, user = user)
  
    __obj.asInstanceOf[BranchSummary]
  }
}

