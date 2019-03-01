package typings
package vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BuildVersion extends js.Object {
  var commitMessage: java.lang.String
  var id: java.lang.String
  var name: java.lang.String
  var sourceBranch: java.lang.String
  /**
    * PullRequestId or Commit Id for the Pull Request for which the release will publish status
    */
  var sourcePullRequestId: java.lang.String
  var sourceRepositoryId: java.lang.String
  var sourceRepositoryType: java.lang.String
  var sourceVersion: java.lang.String
}

object BuildVersion {
  @scala.inline
  def apply(
    commitMessage: java.lang.String,
    id: java.lang.String,
    name: java.lang.String,
    sourceBranch: java.lang.String,
    sourcePullRequestId: java.lang.String,
    sourceRepositoryId: java.lang.String,
    sourceRepositoryType: java.lang.String,
    sourceVersion: java.lang.String
  ): BuildVersion = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("commitMessage")(commitMessage)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("sourceBranch")(sourceBranch)
    __obj.updateDynamic("sourcePullRequestId")(sourcePullRequestId)
    __obj.updateDynamic("sourceRepositoryId")(sourceRepositoryId)
    __obj.updateDynamic("sourceRepositoryType")(sourceRepositoryType)
    __obj.updateDynamic("sourceVersion")(sourceVersion)
    __obj.asInstanceOf[BuildVersion]
  }
}

