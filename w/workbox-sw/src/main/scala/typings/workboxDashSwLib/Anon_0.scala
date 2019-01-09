package typings
package workboxDashSwLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_0
  extends org.scalablytyped.runtime.Instantiable0[workboxDashSwLib.workboxDashSwMod.CoreNamespace] {
  /**
  	 * The available log levels in Workbox: debug, log, warn, error and silent.
  	 */
  val LOG_LEVELS: workboxDashSwLib.workboxDashSwMod.ILogLevel = js.native
  /**
  	 * cacheNames.precache is used for precached assets, cacheNames.googleAnalytics is used by workbox-google-analytics to store analytics.js, and cacheNames.runtime is used for everything else.
  	 */
  val cacheNames: workboxDashSwLib.workboxDashSwMod.ICacheNames = js.native
  /**
  	 * Get the current log level.
  	 */
  val logLevel: workboxDashSwLib.workboxDashSwLibNumbers.`0` | workboxDashSwLib.workboxDashSwLibNumbers.`1` | workboxDashSwLib.workboxDashSwLibNumbers.`2` | workboxDashSwLib.workboxDashSwLibNumbers.`3` | workboxDashSwLib.workboxDashSwLibNumbers.`4` = js.native
  /**
  	 * You can alter the default cache names used by the Workbox modules by changing the cache name details.
  	 * Cache names are generated as <prefix>-<Cache Name>-<suffix>.
  	 * @param {Partial<ICacheNameDetails>} details
  	 */
  def setCacheNameDetails(details: stdLib.Partial[workboxDashSwLib.workboxDashSwMod.ICacheNameDetails]): scala.Unit = js.native
  /**
  	 * Set the current log level passing in one of the values from LOG_LEVELS.
  	 * @param {number} logLevel - The new log level to use.
  	 */
  def setLogLevel(logLevel: workboxDashSwLib.workboxDashSwLibNumbers.`0`): scala.Unit = js.native
  def setLogLevel(logLevel: workboxDashSwLib.workboxDashSwLibNumbers.`1`): scala.Unit = js.native
  def setLogLevel(logLevel: workboxDashSwLib.workboxDashSwLibNumbers.`2`): scala.Unit = js.native
  def setLogLevel(logLevel: workboxDashSwLib.workboxDashSwLibNumbers.`3`): scala.Unit = js.native
  def setLogLevel(logLevel: workboxDashSwLib.workboxDashSwLibNumbers.`4`): scala.Unit = js.native
}

