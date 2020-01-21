package typings.waitOn.mod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WaitOnOptions extends js.Object {
  /**
    * Https specific option.
    * see https:// github.com/request/request#readme for specific details
    */
  var auth: js.UndefOr[WaitOnAuth] = js.undefined
  /**
    * Initial delay in ms.
    * @default 0
    */
  var delay: js.UndefOr[Double] = js.undefined
  var followAllRedirects: js.UndefOr[Boolean] = js.undefined
  var followRedirect: js.UndefOr[Boolean] = js.undefined
  var headers: js.UndefOr[Record[String, _]] = js.undefined
  var httpSignature: js.UndefOr[HttpSignature] = js.undefined
  /**
    * Poll resource interval in ms,
    * @default 250ms
    */
  var interval: js.UndefOr[Double] = js.undefined
  /**
    * Flag which outputs to stdout, remaining resources waited on and when complete or any error occurs.
    */
  var log: js.UndefOr[Boolean] = js.undefined
  /**
    * Array of string resources to wait for. prefix determines the type of resource with the default type of file:
    */
  var resources: js.Array[String]
  /**
    * Flag to reverse operation so checks are for resources being NOT available.
    * @default false
    */
  var reverse: js.UndefOr[Boolean] = js.undefined
  var strictSSL: js.UndefOr[Boolean] = js.undefined
  /**
    * Tcp timeout in ms.
    * @default 300
    */
  var tcpTimeout: js.UndefOr[Double] = js.undefined
  /**
    * Timeout in ms until it aborts with error.
    * @default Infinity
    */
  var timeout: js.UndefOr[Double] = js.undefined
  /**
    * Flag which outputs debug output.
    * @default false
    */
  var verbose: js.UndefOr[Boolean] = js.undefined
  /**
    * Stabilization time in ms
    * Waits this amount of time for file sizes to stabilize or other resource availability to remain unchanged.
    * @default 750ms.
    */
  var window: js.UndefOr[Double] = js.undefined
}

object WaitOnOptions {
  @scala.inline
  def apply(
    resources: js.Array[String],
    auth: WaitOnAuth = null,
    delay: Int | Double = null,
    followAllRedirects: js.UndefOr[Boolean] = js.undefined,
    followRedirect: js.UndefOr[Boolean] = js.undefined,
    headers: Record[String, _] = null,
    httpSignature: HttpSignature = null,
    interval: Int | Double = null,
    log: js.UndefOr[Boolean] = js.undefined,
    reverse: js.UndefOr[Boolean] = js.undefined,
    strictSSL: js.UndefOr[Boolean] = js.undefined,
    tcpTimeout: Int | Double = null,
    timeout: Int | Double = null,
    verbose: js.UndefOr[Boolean] = js.undefined,
    window: Int | Double = null
  ): WaitOnOptions = {
    val __obj = js.Dynamic.literal(resources = resources.asInstanceOf[js.Any])
    if (auth != null) __obj.updateDynamic("auth")(auth.asInstanceOf[js.Any])
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (!js.isUndefined(followAllRedirects)) __obj.updateDynamic("followAllRedirects")(followAllRedirects.asInstanceOf[js.Any])
    if (!js.isUndefined(followRedirect)) __obj.updateDynamic("followRedirect")(followRedirect.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (httpSignature != null) __obj.updateDynamic("httpSignature")(httpSignature.asInstanceOf[js.Any])
    if (interval != null) __obj.updateDynamic("interval")(interval.asInstanceOf[js.Any])
    if (!js.isUndefined(log)) __obj.updateDynamic("log")(log.asInstanceOf[js.Any])
    if (!js.isUndefined(reverse)) __obj.updateDynamic("reverse")(reverse.asInstanceOf[js.Any])
    if (!js.isUndefined(strictSSL)) __obj.updateDynamic("strictSSL")(strictSSL.asInstanceOf[js.Any])
    if (tcpTimeout != null) __obj.updateDynamic("tcpTimeout")(tcpTimeout.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (!js.isUndefined(verbose)) __obj.updateDynamic("verbose")(verbose.asInstanceOf[js.Any])
    if (window != null) __obj.updateDynamic("window")(window.asInstanceOf[js.Any])
    __obj.asInstanceOf[WaitOnOptions]
  }
}

