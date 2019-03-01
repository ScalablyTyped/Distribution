package typings
package workboxDashSwLib.workboxDashSwMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IActivateOptions extends js.Object {
  /**
  	 * Plugins to be used for fetching and caching during install.
  	 */
  var plugins: js.Array[workboxDashSwLib.Plugin]
}

object IActivateOptions {
  @scala.inline
  def apply(plugins: js.Array[workboxDashSwLib.Plugin]): IActivateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("plugins")(plugins)
    __obj.asInstanceOf[IActivateOptions]
  }
}

