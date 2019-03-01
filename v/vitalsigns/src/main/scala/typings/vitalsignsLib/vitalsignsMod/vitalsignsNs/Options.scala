package typings
package vitalsignsLib.vitalsignsMod.vitalsignsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * Number of milliseconds to wait between automatic health checks.
    * @type {number|boolean}
    */
  var autoCheck: js.UndefOr[scala.Double | scala.Boolean] = js.undefined
  /**
    * HTTP response code to send back in the VitalSigns.
    * @type {number}
    */
  var httpHealthy: js.UndefOr[scala.Double] = js.undefined
  /**
    * HTTP response code to send back in the VitalSigns.
    * @type {number}
    */
  var httpUnhealthy: js.UndefOr[scala.Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    autoCheck: scala.Double | scala.Boolean = null,
    httpHealthy: scala.Int | scala.Double = null,
    httpUnhealthy: scala.Int | scala.Double = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (autoCheck != null) __obj.updateDynamic("autoCheck")(autoCheck.asInstanceOf[js.Any])
    if (httpHealthy != null) __obj.updateDynamic("httpHealthy")(httpHealthy.asInstanceOf[js.Any])
    if (httpUnhealthy != null) __obj.updateDynamic("httpUnhealthy")(httpUnhealthy.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

