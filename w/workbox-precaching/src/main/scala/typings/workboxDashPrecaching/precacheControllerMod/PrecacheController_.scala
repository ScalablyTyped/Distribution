package typings.workboxDashPrecaching.precacheControllerMod

import typings.std.Record
import typings.workboxDashPrecaching.precacheControllerMod.PrecacheController.InstallOptions
import typings.workboxDashPrecaching.typesCleanupResultMod.CleanupResult
import typings.workboxDashPrecaching.typesInstallResultMod.InstallResult
import typings.workboxDashPrecaching.typesPrecacheEntryMod.PrecacheEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("workbox-precaching/PrecacheController", "PrecacheController")
@js.native
class PrecacheController_ () extends js.Object {
  def this(cacheName: String) = this()
  def activate(): js.Promise[CleanupResult] = js.native
  def addToCacheList(entries: js.Array[String | PrecacheEntry]): Unit = js.native
  def getCacheKeyForURL(url: String): String = js.native
  def getCachedURLs(): js.Array[String] = js.native
  def getURLsToCacheKeys(): Record[String, String] = js.native
  def install(): js.Promise[InstallResult] = js.native
  def install(options: InstallOptions): js.Promise[InstallResult] = js.native
}

