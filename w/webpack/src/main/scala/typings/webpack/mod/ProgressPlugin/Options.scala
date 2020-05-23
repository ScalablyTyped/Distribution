package typings.webpack.mod.ProgressPlugin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * Show active modules count and one active module in progress message
    * Default: true
    */
  var activeModules: js.UndefOr[Boolean] = js.undefined
  /**
    * Show entries count in progress message
    * Default: false
    */
  var entries: js.UndefOr[Boolean] = js.undefined
  /**
    * Function that executes for every progress step
    */
  var handler: js.UndefOr[Handler] = js.undefined
  /**
    * Show modules count in progress message
    * Default: true
    */
  var modules: js.UndefOr[Boolean] = js.undefined
  /**
    * Minimum modules count to start with, only for mode = modules
    * Default: 500
    */
  var modulesCount: js.UndefOr[Double] = js.undefined
  /**
    * Collect profile data for progress steps
    * Default: false
    */
  var profile: js.UndefOr[Boolean | Null] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    activeModules: js.UndefOr[Boolean] = js.undefined,
    entries: js.UndefOr[Boolean] = js.undefined,
    handler: (/* percentage */ Double, /* msg */ String, /* repeated */ String) => Unit = null,
    modules: js.UndefOr[Boolean] = js.undefined,
    modulesCount: js.UndefOr[Double] = js.undefined,
    profile: js.UndefOr[Null | Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(activeModules)) __obj.updateDynamic("activeModules")(activeModules.get.asInstanceOf[js.Any])
    if (!js.isUndefined(entries)) __obj.updateDynamic("entries")(entries.get.asInstanceOf[js.Any])
    if (handler != null) __obj.updateDynamic("handler")(js.Any.fromFunction3(handler))
    if (!js.isUndefined(modules)) __obj.updateDynamic("modules")(modules.get.asInstanceOf[js.Any])
    if (!js.isUndefined(modulesCount)) __obj.updateDynamic("modulesCount")(modulesCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(profile)) __obj.updateDynamic("profile")(profile.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

