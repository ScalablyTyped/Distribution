package typings.typedGithubApi.interfacesBranchMod

import typings.typedGithubApi.interfacesRepositoryMod.Repository
import typings.typedGithubApi.interfacesUserMod.UserSummary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BranchSummary extends js.Object {
  var name: String = js.native
  var repository: js.UndefOr[Repository] = js.native
  var sha: String = js.native
  var user: UserSummary = js.native
}

object BranchSummary {
  @scala.inline
  def apply(name: String, sha: String, user: UserSummary): BranchSummary = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], sha = sha.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[BranchSummary]
  }
  @scala.inline
  implicit class BranchSummaryOps[Self <: BranchSummary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setSha(value: String): Self = this.set("sha", value.asInstanceOf[js.Any])
    @scala.inline
    def setUser(value: UserSummary): Self = this.set("user", value.asInstanceOf[js.Any])
    @scala.inline
    def setRepository(value: Repository): Self = this.set("repository", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRepository: Self = this.set("repository", js.undefined)
  }
  
}

