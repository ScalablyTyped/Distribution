package typings
package workboxDashSwLib.workboxDashSwMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * ===== CacheFirst strategy =====
 */


trait ICacheFirstOptions extends ICacheOnlyOptions {
  /**
  	 * Values passed along to the init of all fetch() requests made by this strategy.
  	 */
  var fetchOptions: stdLib.RequestInit
}

