package typings
package strongDashClusterDashControlLib.strongDashClusterDashControlMod.StrongClusterControlNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StartOptions extends js.Object {
  var env: js.UndefOr[js.Object] = js.undefined
  var shutdownTimeout: js.UndefOr[scala.Double] = js.undefined
  var size: js.UndefOr[scala.Double] = js.undefined
  var terminateTimeout: js.UndefOr[scala.Double] = js.undefined
  var throttleDelay: js.UndefOr[scala.Double] = js.undefined
}

object StartOptions {
  @scala.inline
  def apply(
    env: js.Object = null,
    shutdownTimeout: scala.Int | scala.Double = null,
    size: scala.Int | scala.Double = null,
    terminateTimeout: scala.Int | scala.Double = null,
    throttleDelay: scala.Int | scala.Double = null
  ): StartOptions = {
    val __obj = js.Dynamic.literal()
    if (env != null) __obj.updateDynamic("env")(env)
    if (shutdownTimeout != null) __obj.updateDynamic("shutdownTimeout")(shutdownTimeout.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (terminateTimeout != null) __obj.updateDynamic("terminateTimeout")(terminateTimeout.asInstanceOf[js.Any])
    if (throttleDelay != null) __obj.updateDynamic("throttleDelay")(throttleDelay.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartOptions]
  }
}

