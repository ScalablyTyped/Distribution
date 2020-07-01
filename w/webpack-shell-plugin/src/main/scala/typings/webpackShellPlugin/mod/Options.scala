package typings.webpackShellPlugin.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * Switch for development environments.
    * This causes scripts to execute once.
    * Useful for running HMR on webpack-dev-server or webpack watch mode.
    * @default true
    */
  var dev: js.UndefOr[Boolean] = js.undefined
  /**
    * scripts to execute after files are emitted at the end of the compilation
    * @default []
    */
  var onBuildEnd: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * scripts to execute after webpack process is complete
    * @default []
    */
  var onBuildExit: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * scripts to execute on the initial build
    * @default []
    */
  var onBuildStart: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Switches script execution process from spawn to exec.
    * If running into problems with spawn, turn this setting on.
    * @default false
    */
  var safe: js.UndefOr[Boolean] = js.undefined
  /**
    * Enable for verbose output
    * @deprecated
    * @default false
    */
  var verbose: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    dev: js.UndefOr[Boolean] = js.undefined,
    onBuildEnd: js.Array[String] = null,
    onBuildExit: js.Array[String] = null,
    onBuildStart: js.Array[String] = null,
    safe: js.UndefOr[Boolean] = js.undefined,
    verbose: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(dev)) __obj.updateDynamic("dev")(dev.get.asInstanceOf[js.Any])
    if (onBuildEnd != null) __obj.updateDynamic("onBuildEnd")(onBuildEnd.asInstanceOf[js.Any])
    if (onBuildExit != null) __obj.updateDynamic("onBuildExit")(onBuildExit.asInstanceOf[js.Any])
    if (onBuildStart != null) __obj.updateDynamic("onBuildStart")(onBuildStart.asInstanceOf[js.Any])
    if (!js.isUndefined(safe)) __obj.updateDynamic("safe")(safe.get.asInstanceOf[js.Any])
    if (!js.isUndefined(verbose)) __obj.updateDynamic("verbose")(verbose.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

