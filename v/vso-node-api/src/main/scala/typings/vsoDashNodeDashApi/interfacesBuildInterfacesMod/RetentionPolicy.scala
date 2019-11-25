package typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RetentionPolicy extends js.Object {
  var artifactTypesToDelete: js.Array[String]
  var artifacts: js.Array[String]
  var branches: js.Array[String]
  /**
    * The number of days to keep builds.
    */
  var daysToKeep: Double
  /**
    * Indicates whether the build record itself should be deleted.
    */
  var deleteBuildRecord: Boolean
  /**
    * Indicates whether to delete test results associated with the build.
    */
  var deleteTestResults: Boolean
  /**
    * The minimum number of builds to keep.
    */
  var minimumToKeep: Double
}

object RetentionPolicy {
  @scala.inline
  def apply(
    artifactTypesToDelete: js.Array[String],
    artifacts: js.Array[String],
    branches: js.Array[String],
    daysToKeep: Double,
    deleteBuildRecord: Boolean,
    deleteTestResults: Boolean,
    minimumToKeep: Double
  ): RetentionPolicy = {
    val __obj = js.Dynamic.literal(artifactTypesToDelete = artifactTypesToDelete.asInstanceOf[js.Any], artifacts = artifacts.asInstanceOf[js.Any], branches = branches.asInstanceOf[js.Any], daysToKeep = daysToKeep.asInstanceOf[js.Any], deleteBuildRecord = deleteBuildRecord.asInstanceOf[js.Any], deleteTestResults = deleteTestResults.asInstanceOf[js.Any], minimumToKeep = minimumToKeep.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RetentionPolicy]
  }
}

