package typings
package vsoDashNodeDashApiLib.interfacesGitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitPushEventData extends js.Object {
  var afterId: java.lang.String
  var beforeId: java.lang.String
  var branch: java.lang.String
  var commits: js.Array[GitCommit]
  var repository: GitRepository
}

object GitPushEventData {
  @scala.inline
  def apply(
    afterId: java.lang.String,
    beforeId: java.lang.String,
    branch: java.lang.String,
    commits: js.Array[GitCommit],
    repository: GitRepository
  ): GitPushEventData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("afterId")(afterId)
    __obj.updateDynamic("beforeId")(beforeId)
    __obj.updateDynamic("branch")(branch)
    __obj.updateDynamic("commits")(commits)
    __obj.updateDynamic("repository")(repository)
    __obj.asInstanceOf[GitPushEventData]
  }
}

