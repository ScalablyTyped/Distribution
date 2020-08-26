package typings.watsonDeveloperCloud.speechToTextV1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** RecognitionJob. */
@js.native
trait RecognitionJob extends js.Object {
  /** The date and time in Coordinated Universal Time (UTC) at which the job was created. The value is provided in full ISO 8601 format (`YYYY-MM-DDThh:mm:ss.sTZD`). */
  var created: String = js.native
  /** The ID of the asynchronous job. */
  var id: String = js.native
  /** If the status is `completed`, the results of the recognition request as an array that includes a single instance of a `SpeechRecognitionResults` object. This field is returned only by the **Check a job** method. */
  var results: js.UndefOr[js.Array[SpeechRecognitionResults]] = js.native
  /** The current status of the job: * `waiting`: The service is preparing the job for processing. The service returns this status when the job is initially created or when it is waiting for capacity to process the job. The job remains in this state until the service has the capacity to begin processing it. * `processing`: The service is actively processing the job. * `completed`: The service has finished processing the job. If the job specified a callback URL and the event `recognitions.completed_with_results`, the service sent the results with the callback notification. Otherwise, you must retrieve the results by checking the individual job. * `failed`: The job failed. */
  var status: String = js.native
  /** The date and time in Coordinated Universal Time (UTC) at which the job was last updated by the service. The value is provided in full ISO 8601 format (`YYYY-MM-DDThh:mm:ss.sTZD`). This field is returned only by the **Check jobs** and **Check a job** methods. */
  var updated: js.UndefOr[String] = js.native
  /** The URL to use to request information about the job with the **Check a job** method. This field is returned only by the **Create a job** method. */
  var url: js.UndefOr[String] = js.native
  /** The user token associated with a job that was created with a callback URL and a user token. This field can be returned only by the **Check jobs** method. */
  var user_token: js.UndefOr[String] = js.native
  /** An array of warning messages about invalid parameters included with the request. Each warning includes a descriptive message and a list of invalid argument strings, for example, `"unexpected query parameter 'user_token', query parameter 'callback_url' was not specified"`. The request succeeds despite the warnings. This field can be returned only by the **Create a job** method. */
  var warnings: js.UndefOr[js.Array[String]] = js.native
}

object RecognitionJob {
  @scala.inline
  def apply(created: String, id: String, status: String): RecognitionJob = {
    val __obj = js.Dynamic.literal(created = created.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecognitionJob]
  }
  @scala.inline
  implicit class RecognitionJobOps[Self <: RecognitionJob] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCreated(value: String): Self = this.set("created", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def setResultsVarargs(value: SpeechRecognitionResults*): Self = this.set("results", js.Array(value :_*))
    @scala.inline
    def setResults(value: js.Array[SpeechRecognitionResults]): Self = this.set("results", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResults: Self = this.set("results", js.undefined)
    @scala.inline
    def setUpdated(value: String): Self = this.set("updated", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdated: Self = this.set("updated", js.undefined)
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
    @scala.inline
    def setUser_token(value: String): Self = this.set("user_token", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUser_token: Self = this.set("user_token", js.undefined)
    @scala.inline
    def setWarningsVarargs(value: String*): Self = this.set("warnings", js.Array(value :_*))
    @scala.inline
    def setWarnings(value: js.Array[String]): Self = this.set("warnings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWarnings: Self = this.set("warnings", js.undefined)
  }
  
}

