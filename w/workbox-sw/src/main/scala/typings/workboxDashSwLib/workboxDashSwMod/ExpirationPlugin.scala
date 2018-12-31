package typings
package workboxDashSwLib.workboxDashSwMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ===== ExpirationPlugin =====
  */
/**
  * This plugin can be used in the Workbox API's to regularly enforce a limit on the age and / or the number of cached requests.
  * Whenever a cached request is used or updated, this plugin will look at the used Cache and remove any old or extra requests.
  * When using maxAgeSeconds, requests may be used once after expiring because the expiration clean up will not have occurred
  * until after the cached request has been used. If the request has a "Date" header, then a light weight expiration check is
  * performed and the request will not be used immediately.
  * When using maxEntries, the last request to be used will be the request that is removed from the Cache.
  */
trait ExpirationPlugin extends js.Object

