package typings
package vsoDashNodeDashApiLib.interfacesGitInterfacesMod

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
    date: stdLib.Date,
    pushCorrelationId: java.lang.String,
    pushId: scala.Double,
    pushedBy: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef,
    refUpdates: js.Array[GitRefUpdate],
    repository: GitRepository,
    url: java.lang.String
  ): GitPush = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("_links")(_links)
    __obj.updateDynamic("commits")(commits)
    __obj.updateDynamic("date")(date)
    __obj.updateDynamic("pushCorrelationId")(pushCorrelationId)
    __obj.updateDynamic("pushId")(pushId)
    __obj.updateDynamic("pushedBy")(pushedBy)
    __obj.updateDynamic("refUpdates")(refUpdates)
    __obj.updateDynamic("repository")(repository)
    __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[GitPush]
  }
}

