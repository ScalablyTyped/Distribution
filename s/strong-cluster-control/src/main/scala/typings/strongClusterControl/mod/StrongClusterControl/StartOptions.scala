package typings.strongClusterControl.mod.StrongClusterControl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StartOptions extends js.Object {
  var env: js.UndefOr[js.Object] = js.undefined
  var shutdownTimeout: js.UndefOr[Double] = js.undefined
  var size: js.UndefOr[Double] = js.undefined
  var terminateTimeout: js.UndefOr[Double] = js.undefined
  var throttleDelay: js.UndefOr[Double] = js.undefined
}

object StartOptions {
  @scala.inline
  def apply(
    env: js.Object = null,
    shutdownTimeout: js.UndefOr[Double] = js.undefined,
    size: js.UndefOr[Double] = js.undefined,
    terminateTimeout: js.UndefOr[Double] = js.undefined,
    throttleDelay: js.UndefOr[Double] = js.undefined
  ): StartOptions = {
    val __obj = js.Dynamic.literal()
    if (env != null) __obj.updateDynamic("env")(env.asInstanceOf[js.Any])
    if (!js.isUndefined(shutdownTimeout)) __obj.updateDynamic("shutdownTimeout")(shutdownTimeout.get.asInstanceOf[js.Any])
    if (!js.isUndefined(size)) __obj.updateDynamic("size")(size.get.asInstanceOf[js.Any])
    if (!js.isUndefined(terminateTimeout)) __obj.updateDynamic("terminateTimeout")(terminateTimeout.get.asInstanceOf[js.Any])
    if (!js.isUndefined(throttleDelay)) __obj.updateDynamic("throttleDelay")(throttleDelay.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartOptions]
  }
}

