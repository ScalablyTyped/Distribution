package typings.watsonDashDeveloperDashCloud.speechDashToDashTextV1DashGeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** RecognitionJob. */
trait RecognitionJob extends js.Object {
  /** The date and time in Coordinated Universal Time (UTC) at which the job was created. The value is provided in full ISO 8601 format (`YYYY-MM-DDThh:mm:ss.sTZD`). */
  var created: String
  /** The ID of the asynchronous job. */
  var id: String
  /** If the status is `completed`, the results of the recognition request as an array that includes a single instance of a `SpeechRecognitionResults` object. This field is returned only by the **Check a job** method. */
  var results: js.UndefOr[js.Array[SpeechRecognitionResults]] = js.undefined
  /** The current status of the job: * `waiting`: The service is preparing the job for processing. The service returns this status when the job is initially created or when it is waiting for capacity to process the job. The job remains in this state until the service has the capacity to begin processing it. * `processing`: The service is actively processing the job. * `completed`: The service has finished processing the job. If the job specified a callback URL and the event `recognitions.completed_with_results`, the service sent the results with the callback notification. Otherwise, you must retrieve the results by checking the individual job. * `failed`: The job failed. */
  var status: String
  /** The date and time in Coordinated Universal Time (UTC) at which the job was last updated by the service. The value is provided in full ISO 8601 format (`YYYY-MM-DDThh:mm:ss.sTZD`). This field is returned only by the **Check jobs** and **Check a job** methods. */
  var updated: js.UndefOr[String] = js.undefined
  /** The URL to use to request information about the job with the **Check a job** method. This field is returned only by the **Create a job** method. */
  var url: js.UndefOr[String] = js.undefined
  /** The user token associated with a job that was created with a callback URL and a user token. This field can be returned only by the **Check jobs** method. */
  var user_token: js.UndefOr[String] = js.undefined
  /** An array of warning messages about invalid parameters included with the request. Each warning includes a descriptive message and a list of invalid argument strings, for example, `"unexpected query parameter 'user_token', query parameter 'callback_url' was not specified"`. The request succeeds despite the warnings. This field can be returned only by the **Create a job** method. */
  var warnings: js.UndefOr[js.Array[String]] = js.undefined
}

object RecognitionJob {
  @scala.inline
  def apply(
    created: String,
    id: String,
    status: String,
    results: js.Array[SpeechRecognitionResults] = null,
    updated: String = null,
    url: String = null,
    user_token: String = null,
    warnings: js.Array[String] = null
  ): RecognitionJob = {
    val __obj = js.Dynamic.literal(created = created, id = id, status = status)
    if (results != null) __obj.updateDynamic("results")(results)
    if (updated != null) __obj.updateDynamic("updated")(updated)
    if (url != null) __obj.updateDynamic("url")(url)
    if (user_token != null) __obj.updateDynamic("user_token")(user_token)
    if (warnings != null) __obj.updateDynamic("warnings")(warnings)
    __obj.asInstanceOf[RecognitionJob]
  }
}

