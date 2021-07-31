package typings.watsonDeveloperCloud.speechToTextV1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** RecognitionJob. */
trait RecognitionJob extends StObject {
  
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
  def apply(created: String, id: String, status: String): RecognitionJob = {
    val __obj = js.Dynamic.literal(created = created.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecognitionJob]
  }
  
  @scala.inline
  implicit class RecognitionJobMutableBuilder[Self <: RecognitionJob] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreated(value: String): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResults(value: js.Array[SpeechRecognitionResults]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultsUndefined: Self = StObject.set(x, "results", js.undefined)
    
    @scala.inline
    def setResultsVarargs(value: SpeechRecognitionResults*): Self = StObject.set(x, "results", js.Array(value :_*))
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdated(value: String): Self = StObject.set(x, "updated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatedUndefined: Self = StObject.set(x, "updated", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    @scala.inline
    def setUser_token(value: String): Self = StObject.set(x, "user_token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser_tokenUndefined: Self = StObject.set(x, "user_token", js.undefined)
    
    @scala.inline
    def setWarnings(value: js.Array[String]): Self = StObject.set(x, "warnings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWarningsUndefined: Self = StObject.set(x, "warnings", js.undefined)
    
    @scala.inline
    def setWarningsVarargs(value: String*): Self = StObject.set(x, "warnings", js.Array(value :_*))
  }
}
