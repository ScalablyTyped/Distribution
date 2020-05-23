package typings.sumoLogger.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SumoLoggerOptions extends js.Object {
  /**
    * An integer specifying total log length.
    * This can be used by itself or in addition to interval but is ignored when useIntervalOnly is true.
    * For higher volume applications, Sumo Logic recommends using between 100000 and 1000000 to optimize the tradeoff between network calls and load.
    * If both batchSize and interval are configured sending will be triggered when the pending logs' aggregate message length
    * is reached or when the specified interval is hit, and in either case the interval will be reset on send.
    */
  var batchSize: js.UndefOr[Double] = js.undefined
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
    * You can provide a function that is executed if an error
    * occurs when the logs are sent.
    */
  var onError: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * You can provide a function that is executed only when logs are successfully sent.
    * The only information you can be sure of in the callback is that the call succeeded.
    * There is no other response information.
    */
  var onSuccess: js.UndefOr[js.Function0[Unit]] = js.undefined
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
    * If enabled batchSize is ignored and only interval is used to trigger when the pending logs will be sent.
    */
  var useIntervalOnly: js.UndefOr[Boolean] = js.undefined
}

object SumoLoggerOptions {
  @scala.inline
  def apply(
    endpoint: String,
    batchSize: js.UndefOr[Double] = js.undefined,
    clientUrl: String = null,
    graphite: js.UndefOr[Boolean] = js.undefined,
    hostName: String = null,
    interval: js.UndefOr[Double] = js.undefined,
    onError: () => Unit = null,
    onSuccess: () => Unit = null,
    raw: js.UndefOr[Boolean] = js.undefined,
    sendErrors: js.UndefOr[Boolean] = js.undefined,
    sessionKey: String = null,
    sourceCategory: String = null,
    sourceName: String = null,
    useIntervalOnly: js.UndefOr[Boolean] = js.undefined
  ): SumoLoggerOptions = {
    val __obj = js.Dynamic.literal(endpoint = endpoint.asInstanceOf[js.Any])
    if (!js.isUndefined(batchSize)) __obj.updateDynamic("batchSize")(batchSize.get.asInstanceOf[js.Any])
    if (clientUrl != null) __obj.updateDynamic("clientUrl")(clientUrl.asInstanceOf[js.Any])
    if (!js.isUndefined(graphite)) __obj.updateDynamic("graphite")(graphite.get.asInstanceOf[js.Any])
    if (hostName != null) __obj.updateDynamic("hostName")(hostName.asInstanceOf[js.Any])
    if (!js.isUndefined(interval)) __obj.updateDynamic("interval")(interval.get.asInstanceOf[js.Any])
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction0(onError))
    if (onSuccess != null) __obj.updateDynamic("onSuccess")(js.Any.fromFunction0(onSuccess))
    if (!js.isUndefined(raw)) __obj.updateDynamic("raw")(raw.get.asInstanceOf[js.Any])
    if (!js.isUndefined(sendErrors)) __obj.updateDynamic("sendErrors")(sendErrors.get.asInstanceOf[js.Any])
    if (sessionKey != null) __obj.updateDynamic("sessionKey")(sessionKey.asInstanceOf[js.Any])
    if (sourceCategory != null) __obj.updateDynamic("sourceCategory")(sourceCategory.asInstanceOf[js.Any])
    if (sourceName != null) __obj.updateDynamic("sourceName")(sourceName.asInstanceOf[js.Any])
    if (!js.isUndefined(useIntervalOnly)) __obj.updateDynamic("useIntervalOnly")(useIntervalOnly.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SumoLoggerOptions]
  }
}

