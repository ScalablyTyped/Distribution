package typings.workboxDashExpiration.cacheExpirationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("workbox-expiration/CacheExpiration", "CacheExpiration")
@js.native
class CacheExpiration protected () extends js.Object {
  def this(cacheName: String) = this()
  def this(cacheName: String, config: CacheExpirationConfig) = this()
  def delete(): js.Promise[Unit] = js.native
  def expireEntries(): js.Promise[Unit] = js.native
  def isURLExpired(url: String): js.Promise[Boolean] = js.native
  def updateTimestamp(url: String): js.Promise[Unit] = js.native
}

