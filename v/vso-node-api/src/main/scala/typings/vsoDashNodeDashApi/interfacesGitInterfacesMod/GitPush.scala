package typings.vsoDashNodeDashApi.interfacesGitInterfacesMod

import typings.std.Date
import typings.vsoDashNodeDashApi.interfacesCommonVSSInterfacesMod.IdentityRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitPush extends GitPushRef {
  var commits: js.Array[GitCommitRef]
  var refUpdates: js.Array[GitRefUpdate]
  var repository: GitRepository
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
    val __obj = js.Dynamic.literal(_links = _links, commits = commits, date = date, pushCorrelationId = pushCorrelationId, pushId = pushId, pushedBy = pushedBy, refUpdates = refUpdates, repository = repository, url = url)
  
    __obj.asInstanceOf[GitPush]
  }
}

