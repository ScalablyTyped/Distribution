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

object ICacheFirstOptions {
  @scala.inline
  def apply(
    cacheName: java.lang.String,
    fetchOptions: stdLib.RequestInit,
    plugins: js.Array[workboxDashSwLib.Plugin]
  ): ICacheFirstOptions = {
    val __obj = js.Dynamic.literal(cacheName = cacheName, fetchOptions = fetchOptions, plugins = plugins)
  
    __obj.asInstanceOf[ICacheFirstOptions]
  }
}

