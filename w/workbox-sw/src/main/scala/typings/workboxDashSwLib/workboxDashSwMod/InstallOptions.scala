package typings
package workboxDashSwLib.workboxDashSwMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstallOptions extends js.Object {
  /**
  	 * The install event (if needed).
  	 */
  var event: stdLib.Event
  /**
  	 * Plugins to be used for fetching and caching during install.
  	 */
  var plugins: js.Array[Plugin]
}

object InstallOptions {
  @scala.inline
  def apply(event: stdLib.Event, plugins: js.Array[Plugin]): InstallOptions = {
    val __obj = js.Dynamic.literal(event = event, plugins = plugins)
  
    __obj.asInstanceOf[InstallOptions]
  }
}

