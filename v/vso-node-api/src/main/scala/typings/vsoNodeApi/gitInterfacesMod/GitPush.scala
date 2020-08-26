package typings.vsoNodeApi.gitInterfacesMod

import typings.std.Date
import typings.vsoNodeApi.vssinterfacesMod.IdentityRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GitPush extends GitPushRef {
  var commits: js.Array[GitCommitRef] = js.native
  var refUpdates: js.Array[GitRefUpdate] = js.native
  var repository: GitRepository = js.native
}

object GitPush {
  @scala.inline
  def apply(
    _links: js.Any,
    commits: js.Array[GitCommitRef],
    date: Date,
    pushCorrelationId: String,
    pushId: Double,
    pushedBy: IdentityRef,
    refUpdates: js.Array[GitRefUpdate],
    repository: GitRepository,
    url: String
  ): GitPush = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], commits = commits.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], pushCorrelationId = pushCorrelationId.asInstanceOf[js.Any], pushId = pushId.asInstanceOf[js.Any], pushedBy = pushedBy.asInstanceOf[js.Any], refUpdates = refUpdates.asInstanceOf[js.Any], repository = repository.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitPush]
  }
  @scala.inline
  implicit class GitPushOps[Self <: GitPush] (val x: Self) extends AnyVal {
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
    def setCommitsVarargs(value: GitCommitRef*): Self = this.set("commits", js.Array(value :_*))
    @scala.inline
    def setCommits(value: js.Array[GitCommitRef]): Self = this.set("commits", value.asInstanceOf[js.Any])
    @scala.inline
    def setRefUpdatesVarargs(value: GitRefUpdate*): Self = this.set("refUpdates", js.Array(value :_*))
    @scala.inline
    def setRefUpdates(value: js.Array[GitRefUpdate]): Self = this.set("refUpdates", value.asInstanceOf[js.Any])
    @scala.inline
    def setRepository(value: GitRepository): Self = this.set("repository", value.asInstanceOf[js.Any])
  }
  
}

