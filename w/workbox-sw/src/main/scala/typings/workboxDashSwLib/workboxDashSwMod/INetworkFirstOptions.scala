package typings
package workboxDashSwLib.workboxDashSwMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ===== NetworkFirst strategy =====
  */
trait INetworkFirstOptions extends ICacheFirstOptions {
  var networkTimeoutSeconds: scala.Double
}

object INetworkFirstOptions {
  @scala.inline
  def apply(
    cacheName: java.lang.String,
    fetchOptions: stdLib.RequestInit,
    networkTimeoutSeconds: scala.Double,
    plugins: js.Array[workboxDashSwLib.Plugin]
  ): INetworkFirstOptions = {
    val __obj = js.Dynamic.literal(cacheName = cacheName, fetchOptions = fetchOptions, networkTimeoutSeconds = networkTimeoutSeconds, plugins = plugins)
  
    __obj.asInstanceOf[INetworkFirstOptions]
  }
}

