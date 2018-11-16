package typings
package xdomainLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IXDomain extends js.Object {
  var cookies: XDomainCookies = js.native
  /**
     * When true, XDomain will log actions to console
     */
  var debug: scala.Boolean = js.native
  var origin: java.lang.String = js.native
  /**
     * Will initialize as a slave
     *
     * Each of the masters must be defined as: origin: path
     *
     * origin and path are converted to a regular expression by escaping all non-alphanumeric chars, then converting * into .* and finally wrapping it with ^ and $. path can also be a RegExp literal.
     *
     * Requests that do not match both the origin and the path regular expressions will be blocked.
     * @param masterObj
     */
  def masters(masterObj: js.Object): scala.Unit = js.native
  /**
     * event may be log, warn or timeout. When listening for log and warn events, handler with contain the message as
     * the first parameter. The timeout event fires when an iframe exeeds the xdomain.timeout time limit.
     * @param event
     * @param handler
     */
  @JSName("on")
  def on_log(
    event: xdomainLib.xdomainLibStrings.log,
    handler: js.Function1[/* message */ js.UndefOr[java.lang.String], _]
  ): scala.Unit = js.native
  /**
     * event may be log, warn or timeout. When listening for log and warn events, handler with contain the message as
     * the first parameter. The timeout event fires when an iframe exeeds the xdomain.timeout time limit.
     * @param event
     * @param handler
     */
  @JSName("on")
  def on_timeout(
    event: xdomainLib.xdomainLibStrings.timeout,
    handler: js.Function1[/* message */ js.UndefOr[java.lang.String], _]
  ): scala.Unit = js.native
  /**
     * event may be log, warn or timeout. When listening for log and warn events, handler with contain the message as
     * the first parameter. The timeout event fires when an iframe exeeds the xdomain.timeout time limit.
     * @param event
     * @param handler
     */
  @JSName("on")
  def on_warn(
    event: xdomainLib.xdomainLibStrings.warn,
    handler: js.Function1[/* message */ js.UndefOr[java.lang.String], _]
  ): scala.Unit = js.native
  /**
     * Will initialize as a master
     *
     * Each of the slaves must be defined as: origin: proxy file
     *
     * The slaves object is used as a list slaves to force one proxy file per origin.
     * @param slaveObj
     */
  def slaves(slaveObj: js.Object): scala.Unit = js.native
}

