package typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BuildCompletedEvent extends BuildUpdatedEvent {
  /**
    * errors associated with a build used for build notifications
    */
  var buildErrors: js.Array[BuildRequestValidationResult]
  /**
    * warnings associated with a build used for build notifications
    */
  var buildWarnings: js.Array[BuildRequestValidationResult]
  /**
    * Changes associated with a build used for build notifications
    */
  var changes: js.Array[Change]
}

object BuildCompletedEvent {
  @scala.inline
  def apply(
    build: Build,
    buildErrors: js.Array[BuildRequestValidationResult],
    buildId: Double,
    buildWarnings: js.Array[BuildRequestValidationResult],
    changes: js.Array[Change]
  ): BuildCompletedEvent = {
    val __obj = js.Dynamic.literal(build = build.asInstanceOf[js.Any], buildErrors = buildErrors.asInstanceOf[js.Any], buildId = buildId.asInstanceOf[js.Any], buildWarnings = buildWarnings.asInstanceOf[js.Any], changes = changes.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BuildCompletedEvent]
  }
}

