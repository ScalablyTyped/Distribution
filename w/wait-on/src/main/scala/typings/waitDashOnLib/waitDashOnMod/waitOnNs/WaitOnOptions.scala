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

