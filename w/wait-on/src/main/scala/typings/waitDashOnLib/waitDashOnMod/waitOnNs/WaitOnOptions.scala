package typings
package waitDashOnLib.waitDashOnMod.waitOnNs

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
  var delay: js.UndefOr[scala.Double] = js.undefined
  var followAllRedirects: js.UndefOr[scala.Boolean] = js.undefined
  var followRedirect: js.UndefOr[scala.Boolean] = js.undefined
  var headers: js.UndefOr[stdLib.Record[java.lang.String, _]] = js.undefined
  var httpSignature: js.UndefOr[HttpSignature] = js.undefined
  /**
    * Poll resource interval in ms,
    * @default 250ms
    */
  var interval: js.UndefOr[scala.Double] = js.undefined
  /**
    * Flag which outputs to stdout, remaining resources waited on and when complete or any error occurs.
    */
  var log: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Array of string resources to wait for. prefix determines the type of resource with the default type of file:
    */
  var resources: js.Array[java.lang.String]
  /**
    * Flag to reverse operation so checks are for resources being NOT available.
    * @default false
    */
  var reverse: js.UndefOr[scala.Boolean] = js.undefined
  var strictSSL: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Tcp timeout in ms.
    * @default 300
    */
  var tcpTimeout: js.UndefOr[scala.Double] = js.undefined
  /**
    * Timeout in ms until it aborts with error.
    * @default Infinity
    */
  var timeout: js.UndefOr[scala.Double] = js.undefined
  /**
    * Flag which outputs debug output.
    * @default false
    */
  var verbose: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Stabilization time in ms
    * Waits this amount of time for file sizes to stabilize or other resource availability to remain unchanged.
    * @default 750ms.
    */
  var window: js.UndefOr[scala.Double] = js.undefined
}

object WaitOnOptions {
  @scala.inline
  def apply(
    resources: js.Array[java.lang.String],
    auth: WaitOnAuth = null,
    delay: scala.Int | scala.Double = null,
    followAllRedirects: js.UndefOr[scala.Boolean] = js.undefined,
    followRedirect: js.UndefOr[scala.Boolean] = js.undefined,
    headers: stdLib.Record[java.lang.String, _] = null,
    httpSignature: HttpSignature = null,
    interval: scala.Int | scala.Double = null,
    log: js.UndefOr[scala.Boolean] = js.undefined,
    reverse: js.UndefOr[scala.Boolean] = js.undefined,
    strictSSL: js.UndefOr[scala.Boolean] = js.undefined,
    tcpTimeout: scala.Int | scala.Double = null,
    timeout: scala.Int | scala.Double = null,
    verbose: js.UndefOr[scala.Boolean] = js.undefined,
    window: scala.Int | scala.Double = null
  ): WaitOnOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("resources")(resources)
    if (auth != null) __obj.updateDynamic("auth")(auth)
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (!js.isUndefined(followAllRedirects)) __obj.updateDynamic("followAllRedirects")(followAllRedirects)
    if (!js.isUndefined(followRedirect)) __obj.updateDynamic("followRedirect")(followRedirect)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (httpSignature != null) __obj.updateDynamic("httpSignature")(httpSignature)
    if (interval != null) __obj.updateDynamic("interval")(interval.asInstanceOf[js.Any])
    if (!js.isUndefined(log)) __obj.updateDynamic("log")(log)
    if (!js.isUndefined(reverse)) __obj.updateDynamic("reverse")(reverse)
    if (!js.isUndefined(strictSSL)) __obj.updateDynamic("strictSSL")(strictSSL)
    if (tcpTimeout != null) __obj.updateDynamic("tcpTimeout")(tcpTimeout.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (!js.isUndefined(verbose)) __obj.updateDynamic("verbose")(verbose)
    if (window != null) __obj.updateDynamic("window")(window.asInstanceOf[js.Any])
    __obj.asInstanceOf[WaitOnOptions]
  }
}

