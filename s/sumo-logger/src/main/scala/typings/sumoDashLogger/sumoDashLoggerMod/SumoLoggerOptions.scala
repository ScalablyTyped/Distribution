package typings.sumoDashLogger.sumoDashLoggerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SumoLoggerOptions extends js.Object {
  /**
    * You can provide a URL, in the Node version of this SDK only,
    * which will be sent as the `url` field of the log line.
    * In the vanilla JS version, the URL is detected from the browser's
    * `window.location` value.
    */
  var clientUrl: js.UndefOr[String] = js.undefined
  /**
    * To send your logs, the script must know which HTTP Source to use.
    * Pass this value (which you can get from the Collectors page) in
    * the `endpoint` parameter.
    */
  var endpoint: String
  /**
    * This value enables and disables sending data as graphite metrics
    */
  var graphite: js.UndefOr[Boolean] = js.undefined
  /**
    * This value identifies the host from which the log is being sent.
    */
  var hostName: js.UndefOr[String] = js.undefined
  /**
    * A number of milliseconds. Messages will be batched and sent at the interval specified.
    * Default value is zero, meaning messages are sent each time `log()` is called.
    */
  var interval: js.UndefOr[Double] = js.undefined
  /**
    * This value enables and disables sending data as a raw string
    */
  var raw: js.UndefOr[Boolean] = js.undefined
  /**
    * Setting `sendErrors` to `true` will send all the unhandled errors to Sumo Logic
    * with the error message, URL, line number, and column number.
    * This attribute plays well with any other `window.onerror` functions that
    * have been defined.
    */
  var sendErrors: js.UndefOr[Boolean] = js.undefined
  /** To identify specific user sessions, set a value for this field. */
  var sessionKey: js.UndefOr[String] = js.undefined
  /**
    * This value sets the Source Category for the logged message.
    */
  var sourceCategory: js.UndefOr[String] = js.undefined
  /**
    * This value sets the Source Name for the logged message.
    */
  var sourceName: js.UndefOr[String] = js.undefined
  /**
    * You can provide a function that is executed if an error
    * occurs when the logs are sent.
    */
  def onError(): Unit
  /**
    * You can provide a function that is executed only when logs are successfully sent.
    * The only information you can be sure of in the callback is that the call succeeded.
    * There is no other response information.
    */
  def onSuccess(): Unit
}

object SumoLoggerOptions {
  @scala.inline
  def apply(
    endpoint: String,
    onError: () => Unit,
    onSuccess: () => Unit,
    clientUrl: String = null,
    graphite: js.UndefOr[Boolean] = js.undefined,
    hostName: String = null,
    interval: Int | Double = null,
    raw: js.UndefOr[Boolean] = js.undefined,
    sendErrors: js.UndefOr[Boolean] = js.undefined,
    sessionKey: String = null,
    sourceCategory: String = null,
    sourceName: String = null
  ): SumoLoggerOptions = {
    val __obj = js.Dynamic.literal(endpoint = endpoint.asInstanceOf[js.Any], onError = js.Any.fromFunction0(onError), onSuccess = js.Any.fromFunction0(onSuccess))
    if (clientUrl != null) __obj.updateDynamic("clientUrl")(clientUrl.asInstanceOf[js.Any])
    if (!js.isUndefined(graphite)) __obj.updateDynamic("graphite")(graphite.asInstanceOf[js.Any])
    if (hostName != null) __obj.updateDynamic("hostName")(hostName.asInstanceOf[js.Any])
    if (interval != null) __obj.updateDynamic("interval")(interval.asInstanceOf[js.Any])
    if (!js.isUndefined(raw)) __obj.updateDynamic("raw")(raw.asInstanceOf[js.Any])
    if (!js.isUndefined(sendErrors)) __obj.updateDynamic("sendErrors")(sendErrors.asInstanceOf[js.Any])
    if (sessionKey != null) __obj.updateDynamic("sessionKey")(sessionKey.asInstanceOf[js.Any])
    if (sourceCategory != null) __obj.updateDynamic("sourceCategory")(sourceCategory.asInstanceOf[js.Any])
    if (sourceName != null) __obj.updateDynamic("sourceName")(sourceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[SumoLoggerOptions]
  }
}

