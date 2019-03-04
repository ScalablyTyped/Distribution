package typings
package workboxDashSwLib.workboxDashSwMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILogLevel extends js.Object {
  /**
  	 * Prints all logs from Workbox. Useful for debugging.
  	 */
  var debug: workboxDashSwLib.workboxDashSwLibNumbers.`0`
  /**
  	 * Print console error and groups.
  	 */
  var error: workboxDashSwLib.workboxDashSwLibNumbers.`3`
  /**
  	 * Prints console log, warn, error and groups. Default for debug builds.
  	 */
  var log: workboxDashSwLib.workboxDashSwLibNumbers.`1`
  /**
  	 * Force no logging from Workbox.
  	 */
  var silent: workboxDashSwLib.workboxDashSwLibNumbers.`4`
  /**
  	 * Prints console warn, error and groups. Default for non-debug builds.
  	 */
  var warn: workboxDashSwLib.workboxDashSwLibNumbers.`2`
}

object ILogLevel {
  @scala.inline
  def apply(
    debug: workboxDashSwLib.workboxDashSwLibNumbers.`0`,
    error: workboxDashSwLib.workboxDashSwLibNumbers.`3`,
    log: workboxDashSwLib.workboxDashSwLibNumbers.`1`,
    silent: workboxDashSwLib.workboxDashSwLibNumbers.`4`,
    warn: workboxDashSwLib.workboxDashSwLibNumbers.`2`
  ): ILogLevel = {
    val __obj = js.Dynamic.literal(debug = debug, error = error, log = log, silent = silent, warn = warn)
  
    __obj.asInstanceOf[ILogLevel]
  }
}

