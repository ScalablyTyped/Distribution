package typings
package vsoDashNodeDashApiLib.interfacesBuildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait BuildReference extends js.Object {
  var _links: js.Any
  /**
       * The build number.
       */
  var buildNumber: java.lang.String
  /**
       * Indicates whether the build has been deleted.
       */
  var deleted: scala.Boolean
  /**
       * The time that the build was completed.
       */
  var finishTime: stdLib.Date
  /**
       * The ID of the build.
       */
  var id: scala.Double
  /**
       * The time that the build was queued.
       */
  var queueTime: stdLib.Date
  /**
       * The identity on whose behalf the build was queued.
       */
  var requestedFor: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef
  /**
       * The build result.
       */
  var result: BuildResult
  /**
       * The time that the build was started.
       */
  var startTime: stdLib.Date
  /**
       * The build status.
       */
  var status: BuildStatus
}

