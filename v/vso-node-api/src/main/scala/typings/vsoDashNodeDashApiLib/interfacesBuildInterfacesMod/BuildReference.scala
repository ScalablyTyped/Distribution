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

object BuildReference {
  @scala.inline
  def apply(
    _links: js.Any,
    buildNumber: java.lang.String,
    deleted: scala.Boolean,
    finishTime: stdLib.Date,
    id: scala.Double,
    queueTime: stdLib.Date,
    requestedFor: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef,
    result: BuildResult,
    startTime: stdLib.Date,
    status: BuildStatus
  ): BuildReference = {
    val __obj = js.Dynamic.literal(_links = _links, buildNumber = buildNumber, deleted = deleted, finishTime = finishTime, id = id, queueTime = queueTime, requestedFor = requestedFor, result = result, startTime = startTime, status = status)
  
    __obj.asInstanceOf[BuildReference]
  }
}

