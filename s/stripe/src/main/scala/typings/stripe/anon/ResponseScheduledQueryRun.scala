package typings.stripe.anon

import typings.stripe.mod.Stripe.File
import typings.stripe.mod.Stripe.Sigma.ScheduledQueryRun.Error
import typings.stripe.stripeStrings.scheduled_query_run
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined stripe.stripe.Stripe.Response<stripe.stripe.Stripe.Sigma.ScheduledQueryRun> */
trait ResponseScheduledQueryRun extends StObject {
  
  /**
    * Time at which the object was created. Measured in seconds since the Unix epoch.
    */
  var created: Double
  
  /**
    * When the query was run, Sigma contained a snapshot of your Stripe data at this time.
    */
  var data_load_time: Double
  
  var error: js.UndefOr[Error] = js.undefined
  
  /**
    * The file object representing the results of the query.
    */
  var file: File | Null
  
  /**
    * Unique identifier for the object.
    */
  var id: String
  
  var lastResponse: ApiVersion
  
  /**
    * Has the value `true` if the object exists in live mode or the value `false` if the object exists in test mode.
    */
  var livemode: Boolean
  
  /**
    * String representing the object's type. Objects of the same type share the same value.
    */
  var `object`: scheduled_query_run
  
  /**
    * Time at which the result expires and is no longer available for download.
    */
  var result_available_until: Double
  
  /**
    * SQL for the query.
    */
  var sql: String
  
  /**
    * The query's execution status, which will be `completed` for successful runs, and `canceled`, `failed`, or `timed_out` otherwise.
    */
  var status: String
  
  /**
    * Title of the query.
    */
  var title: String
}
object ResponseScheduledQueryRun {
  
  inline def apply(
    created: Double,
    data_load_time: Double,
    id: String,
    lastResponse: ApiVersion,
    livemode: Boolean,
    result_available_until: Double,
    sql: String,
    status: String,
    title: String
  ): ResponseScheduledQueryRun = {
    val __obj = js.Dynamic.literal(created = created.asInstanceOf[js.Any], data_load_time = data_load_time.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], lastResponse = lastResponse.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any], result_available_until = result_available_until.asInstanceOf[js.Any], sql = sql.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], file = null)
    __obj.updateDynamic("object")("scheduled_query_run")
    __obj.asInstanceOf[ResponseScheduledQueryRun]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResponseScheduledQueryRun] (val x: Self) extends AnyVal {
    
    inline def setCreated(value: Double): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    inline def setData_load_time(value: Double): Self = StObject.set(x, "data_load_time", value.asInstanceOf[js.Any])
    
    inline def setError(value: Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setFile(value: File): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    inline def setFileNull: Self = StObject.set(x, "file", null)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLastResponse(value: ApiVersion): Self = StObject.set(x, "lastResponse", value.asInstanceOf[js.Any])
    
    inline def setLivemode(value: Boolean): Self = StObject.set(x, "livemode", value.asInstanceOf[js.Any])
    
    inline def setObject(value: scheduled_query_run): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    inline def setResult_available_until(value: Double): Self = StObject.set(x, "result_available_until", value.asInstanceOf[js.Any])
    
    inline def setSql(value: String): Self = StObject.set(x, "sql", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
