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

