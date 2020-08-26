package typings.typedGithubApi.interfacesBranchMod

import typings.typedGithubApi.interfacesRepositoryMod.Repository
import typings.typedGithubApi.interfacesUserMod.UserSummary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BranchSummaryWithRepository extends BranchSummary {
  @JSName("repository")
  var repository_BranchSummaryWithRepository: Repository = js.native
}

object BranchSummaryWithRepository {
  @scala.inline
  def apply(name: String, repository: Repository, sha: String, user: UserSummary): BranchSummaryWithRepository = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], repository = repository.asInstanceOf[js.Any], sha = sha.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[BranchSummaryWithRepository]
  }
  @scala.inline
  implicit class BranchSummaryWithRepositoryOps[Self <: BranchSummaryWithRepository] (val x: Self) extends AnyVal {
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
    def setRepository(value: Repository): Self = this.set("repository", value.asInstanceOf[js.Any])
  }
  
}

