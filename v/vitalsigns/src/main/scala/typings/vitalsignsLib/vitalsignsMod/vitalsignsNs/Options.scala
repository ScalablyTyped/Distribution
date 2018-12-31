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

