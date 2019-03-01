package typings
package sumoDashLoggerLib.sumoDashLoggerMod.SumoLoggerNs

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
  var clientUrl: js.UndefOr[java.lang.String] = js.undefined
  /**
    * To send your logs, the script must know which HTTP Source to use.
    * Pass this value (which you can get from the Collectors page) in
    * the `endpoint` parameter.
    */
  var endpoint: java.lang.String
  /**
    * This value enables and disables sending data as graphite metrics
    */
  var graphite: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * This value identifies the host from which the log is being sent.
    */
  var hostName: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A number of milliseconds. Messages will be batched and sent at the interval specified.
    * Default value is zero, meaning messages are sent each time `log()` is called.
    */
  var interval: js.UndefOr[scala.Double] = js.undefined
  /**
    * This value enables and disables sending data as a raw string
    */
  var raw: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Setting `sendErrors` to `true` will send all the unhandled errors to Sumo Logic
    * with the error message, URL, line number, and column number.
    * This attribute plays well with any other `window.onerror` functions that
    * have been defined.
    */
  var sendErrors: js.UndefOr[scala.Boolean] = js.undefined
  /** To identify specific user sessions, set a value for this field. */
  var sessionKey: js.UndefOr[java.lang.String] = js.undefined
  /**
    * This value sets the Source Category for the logged message.
    */
  var sourceCategory: js.UndefOr[java.lang.String] = js.undefined
  /**
    * This value sets the Source Name for the logged message.
    */
  var sourceName: js.UndefOr[java.lang.String] = js.undefined
  /**
    * You can provide a function that is executed if an error
    * occurs when the logs are sent.
    */
  def onError(): scala.Unit
  /**
    * You can provide a function that is executed only when logs are successfully sent.
    * The only information you can be sure of in the callback is that the call succeeded.
    * There is no other response information.
    */
  def onSuccess(): scala.Unit
}

object SumoLoggerOptions {
  @scala.inline
  def apply(
    endpoint: java.lang.String,
    onError: js.Function0[scala.Unit],
    onSuccess: js.Function0[scala.Unit],
    clientUrl: java.lang.String = null,
    graphite: js.UndefOr[scala.Boolean] = js.undefined,
    hostName: java.lang.String = null,
    interval: scala.Int | scala.Double = null,
    raw: js.UndefOr[scala.Boolean] = js.undefined,
    sendErrors: js.UndefOr[scala.Boolean] = js.undefined,
    sessionKey: java.lang.String = null,
    sourceCategory: java.lang.String = null,
    sourceName: java.lang.String = null
  ): SumoLoggerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("endpoint")(endpoint)
    __obj.updateDynamic("onError")(onError)
    __obj.updateDynamic("onSuccess")(onSuccess)
    if (clientUrl != null) __obj.updateDynamic("clientUrl")(clientUrl)
    if (!js.isUndefined(graphite)) __obj.updateDynamic("graphite")(graphite)
    if (hostName != null) __obj.updateDynamic("hostName")(hostName)
    if (interval != null) __obj.updateDynamic("interval")(interval.asInstanceOf[js.Any])
    if (!js.isUndefined(raw)) __obj.updateDynamic("raw")(raw)
    if (!js.isUndefined(sendErrors)) __obj.updateDynamic("sendErrors")(sendErrors)
    if (sessionKey != null) __obj.updateDynamic("sessionKey")(sessionKey)
    if (sourceCategory != null) __obj.updateDynamic("sourceCategory")(sourceCategory)
    if (sourceName != null) __obj.updateDynamic("sourceName")(sourceName)
    __obj.asInstanceOf[SumoLoggerOptions]
  }
}

