package typings.watsonDashDeveloperDashCloud.speechDashToDashTextV1DashGeneratedMod.CreateJobConstants

import org.scalablytyped.runtime.TopLevel
import typings.watsonDashDeveloperDashCloud.speechDashToDashTextV1DashGeneratedMod.CreateJobConstants.Events.RECOGNITIONS_COMPLETED
import typings.watsonDashDeveloperDashCloud.speechDashToDashTextV1DashGeneratedMod.CreateJobConstants.Events.RECOGNITIONS_COMPLETED_WITH_RESULTS
import typings.watsonDashDeveloperDashCloud.speechDashToDashTextV1DashGeneratedMod.CreateJobConstants.Events.RECOGNITIONS_FAILED
import typings.watsonDashDeveloperDashCloud.speechDashToDashTextV1DashGeneratedMod.CreateJobConstants.Events.RECOGNITIONS_STARTED
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Events extends js.Object

/** If the job includes a callback URL, a comma-separated list of notification events to which to subscribe. Valid events are * `recognitions.started` generates a callback notification when the service begins to process the job. * `recognitions.completed` generates a callback notification when the job is complete. You must use the **Check a job** method to retrieve the results before they time out or are deleted. * `recognitions.completed_with_results` generates a callback notification when the job is complete. The notification includes the results of the request. * `recognitions.failed` generates a callback notification if the service experiences an error while processing the job. The `recognitions.completed` and `recognitions.completed_with_results` events are incompatible. You can specify only of the two events. If the job includes a callback URL, omit the parameter to subscribe to the default events: `recognitions.started`, `recognitions.completed`, and `recognitions.failed`. If the job does not include a callback URL, omit the parameter. */
@JSImport("watson-developer-cloud/speech-to-text/v1-generated", "CreateJobConstants.Events")
@js.native
object Events extends js.Object {
  @js.native
  sealed trait RECOGNITIONS_COMPLETED extends Events
  
  @js.native
  sealed trait RECOGNITIONS_COMPLETED_WITH_RESULTS extends Events
  
  @js.native
  sealed trait RECOGNITIONS_FAILED extends Events
  
  @js.native
  sealed trait RECOGNITIONS_STARTED extends Events
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[Events with String] = js.native
  /* "recognitions.completed" */ @js.native
  object RECOGNITIONS_COMPLETED extends TopLevel[RECOGNITIONS_COMPLETED with String]
  
  /* "recognitions.completed_with_results" */ @js.native
  object RECOGNITIONS_COMPLETED_WITH_RESULTS extends TopLevel[RECOGNITIONS_COMPLETED_WITH_RESULTS with String]
  
  /* "recognitions.failed" */ @js.native
  object RECOGNITIONS_FAILED extends TopLevel[RECOGNITIONS_FAILED with String]
  
  /* "recognitions.started" */ @js.native
  object RECOGNITIONS_STARTED extends TopLevel[RECOGNITIONS_STARTED with String]
  
}

