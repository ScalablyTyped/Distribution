package typings.sumoLogger.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SumoLoggerOptions extends js.Object {
  
  /**
    * An integer specifying total log length.
    * This can be used by itself or in addition to interval but is ignored when useIntervalOnly is true.
    * For higher volume applications, Sumo Logic recommends using between 100000 and 1000000 to optimize the tradeoff between network calls and load.
    * If both batchSize and interval are configured sending will be triggered when the pending logs' aggregate message length
    * is reached or when the specified interval is hit, and in either case the interval will be reset on send.
    */
  var batchSize: js.UndefOr[Double] = js.native
  
  /**
    * You can provide a URL, in the Node version of this SDK only,
    * which will be sent as the `url` field of the log line.
    * In the vanilla JS version, the URL is detected from the browser's
    * `window.location` value.
    */
  var clientUrl: js.UndefOr[String] = js.native
  
  /**
    * To send your logs, the script must know which HTTP Source to use.
    * Pass this value (which you can get from the Collectors page) in
    * the `endpoint` parameter.
    */
  var endpoint: String = js.native
  
  /**
    * This value enables and disables sending data as graphite metrics
    */
  var graphite: js.UndefOr[Boolean] = js.native
  
  /**
    * This value identifies the host from which the log is being sent.
    */
  var hostName: js.UndefOr[String] = js.native
  
  /**
    * A number of milliseconds. Messages will be batched and sent at the interval specified.
    * Default value is zero, meaning messages are sent each time `log()` is called.
    */
  var interval: js.UndefOr[Double] = js.native
  
  /**
    * You can provide a function that is executed if an error
    * occurs when the logs are sent.
    */
  var onError: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * You can provide a function that is executed only when logs are successfully sent.
    * The only information you can be sure of in the callback is that the call succeeded.
    * There is no other response information.
    */
  var onSuccess: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * This value enables and disables sending data as a raw string
    */
  var raw: js.UndefOr[Boolean] = js.native
  
  /**
    * Setting `sendErrors` to `true` will send all the unhandled errors to Sumo Logic
    * with the error message, URL, line number, and column number.
    * This attribute plays well with any other `window.onerror` functions that
    * have been defined.
    */
  var sendErrors: js.UndefOr[Boolean] = js.native
  
  /** To identify specific user sessions, set a value for this field. */
  var sessionKey: js.UndefOr[String] = js.native
  
  /**
    * This value sets the Source Category for the logged message.
    */
  var sourceCategory: js.UndefOr[String] = js.native
  
  /**
    * This value sets the Source Name for the logged message.
    */
  var sourceName: js.UndefOr[String] = js.native
  
  /**
    * If enabled batchSize is ignored and only interval is used to trigger when the pending logs will be sent.
    */
  var useIntervalOnly: js.UndefOr[Boolean] = js.native
}
object SumoLoggerOptions {
  
  @scala.inline
  def apply(endpoint: String): SumoLoggerOptions = {
    val __obj = js.Dynamic.literal(endpoint = endpoint.asInstanceOf[js.Any])
    __obj.asInstanceOf[SumoLoggerOptions]
  }
  
  @scala.inline
  implicit class SumoLoggerOptionsOps[Self <: SumoLoggerOptions] (val x: Self) extends AnyVal {
    
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
    def setEndpoint(value: String): Self = this.set("endpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBatchSize(value: Double): Self = this.set("batchSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBatchSize: Self = this.set("batchSize", js.undefined)
    
    @scala.inline
    def setClientUrl(value: String): Self = this.set("clientUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientUrl: Self = this.set("clientUrl", js.undefined)
    
    @scala.inline
    def setGraphite(value: Boolean): Self = this.set("graphite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGraphite: Self = this.set("graphite", js.undefined)
    
    @scala.inline
    def setHostName(value: String): Self = this.set("hostName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHostName: Self = this.set("hostName", js.undefined)
    
    @scala.inline
    def setInterval(value: Double): Self = this.set("interval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInterval: Self = this.set("interval", js.undefined)
    
    @scala.inline
    def setOnError(value: () => Unit): Self = this.set("onError", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnError: Self = this.set("onError", js.undefined)
    
    @scala.inline
    def setOnSuccess(value: () => Unit): Self = this.set("onSuccess", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnSuccess: Self = this.set("onSuccess", js.undefined)
    
    @scala.inline
    def setRaw(value: Boolean): Self = this.set("raw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRaw: Self = this.set("raw", js.undefined)
    
    @scala.inline
    def setSendErrors(value: Boolean): Self = this.set("sendErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSendErrors: Self = this.set("sendErrors", js.undefined)
    
    @scala.inline
    def setSessionKey(value: String): Self = this.set("sessionKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSessionKey: Self = this.set("sessionKey", js.undefined)
    
    @scala.inline
    def setSourceCategory(value: String): Self = this.set("sourceCategory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceCategory: Self = this.set("sourceCategory", js.undefined)
    
    @scala.inline
    def setSourceName(value: String): Self = this.set("sourceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceName: Self = this.set("sourceName", js.undefined)
    
    @scala.inline
    def setUseIntervalOnly(value: Boolean): Self = this.set("useIntervalOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseIntervalOnly: Self = this.set("useIntervalOnly", js.undefined)
  }
}
