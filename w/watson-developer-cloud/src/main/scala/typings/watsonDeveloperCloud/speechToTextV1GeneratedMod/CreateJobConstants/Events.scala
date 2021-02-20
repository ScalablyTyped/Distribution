package typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.CreateJobConstants

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Events extends StObject
/** If the job includes a callback URL, a comma-separated list of notification events to which to subscribe. Valid events are * `recognitions.started` generates a callback notification when the service begins to process the job. * `recognitions.completed` generates a callback notification when the job is complete. You must use the **Check a job** method to retrieve the results before they time out or are deleted. * `recognitions.completed_with_results` generates a callback notification when the job is complete. The notification includes the results of the request. * `recognitions.failed` generates a callback notification if the service experiences an error while processing the job. The `recognitions.completed` and `recognitions.completed_with_results` events are incompatible. You can specify only of the two events. If the job includes a callback URL, omit the parameter to subscribe to the default events: `recognitions.started`, `recognitions.completed`, and `recognitions.failed`. If the job does not include a callback URL, omit the parameter. */
@JSImport("watson-developer-cloud/speech-to-text/v1-generated", "CreateJobConstants.Events")
@js.native
object Events extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[Events with String] = js.native
  
  @js.native
  sealed trait RECOGNITIONS_COMPLETED extends Events
  /* "recognitions.completed" */ val RECOGNITIONS_COMPLETED: typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.CreateJobConstants.Events.RECOGNITIONS_COMPLETED with String = js.native
  
  @js.native
  sealed trait RECOGNITIONS_COMPLETED_WITH_RESULTS extends Events
  /* "recognitions.completed_with_results" */ val RECOGNITIONS_COMPLETED_WITH_RESULTS: typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.CreateJobConstants.Events.RECOGNITIONS_COMPLETED_WITH_RESULTS with String = js.native
  
  @js.native
  sealed trait RECOGNITIONS_FAILED extends Events
  /* "recognitions.failed" */ val RECOGNITIONS_FAILED: typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.CreateJobConstants.Events.RECOGNITIONS_FAILED with String = js.native
  
  @js.native
  sealed trait RECOGNITIONS_STARTED extends Events
  /* "recognitions.started" */ val RECOGNITIONS_STARTED: typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.CreateJobConstants.Events.RECOGNITIONS_STARTED with String = js.native
}
