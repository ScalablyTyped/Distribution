package typings
package vsoDashNodeDashApiLib.interfacesBuildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RetentionPolicy extends js.Object {
  var artifactTypesToDelete: js.Array[java.lang.String]
  var artifacts: js.Array[java.lang.String]
  var branches: js.Array[java.lang.String]
  /**
    * The number of days to keep builds.
    */
  var daysToKeep: scala.Double
  /**
    * Indicates whether the build record itself should be deleted.
    */
  var deleteBuildRecord: scala.Boolean
  /**
    * Indicates whether to delete test results associated with the build.
    */
  var deleteTestResults: scala.Boolean
  /**
    * The minimum number of builds to keep.
    */
  var minimumToKeep: scala.Double
}

object RetentionPolicy {
  @scala.inline
  def apply(
    artifactTypesToDelete: js.Array[java.lang.String],
    artifacts: js.Array[java.lang.String],
    branches: js.Array[java.lang.String],
    daysToKeep: scala.Double,
    deleteBuildRecord: scala.Boolean,
    deleteTestResults: scala.Boolean,
    minimumToKeep: scala.Double
  ): RetentionPolicy = {
    val __obj = js.Dynamic.literal(artifactTypesToDelete = artifactTypesToDelete, artifacts = artifacts, branches = branches, daysToKeep = daysToKeep, deleteBuildRecord = deleteBuildRecord, deleteTestResults = deleteTestResults, minimumToKeep = minimumToKeep)
  
    __obj.asInstanceOf[RetentionPolicy]
  }
}

