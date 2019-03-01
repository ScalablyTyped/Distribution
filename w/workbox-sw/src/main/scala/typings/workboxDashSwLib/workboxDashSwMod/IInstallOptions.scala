package typings
package workboxDashSwLib.workboxDashSwMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IInstallOptions extends js.Object {
  /**
  	 * Plugins to be used for fetching and caching during install.
  	 */
  var plugins: js.Array[workboxDashSwLib.Plugin]
  /**
  	 * Suppress warning messages.
  	 */
  var suppressWarnings: scala.Boolean
}

object IInstallOptions {
  @scala.inline
  def apply(plugins: js.Array[workboxDashSwLib.Plugin], suppressWarnings: scala.Boolean): IInstallOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("plugins")(plugins)
    __obj.updateDynamic("suppressWarnings")(suppressWarnings)
    __obj.asInstanceOf[IInstallOptions]
  }
}

