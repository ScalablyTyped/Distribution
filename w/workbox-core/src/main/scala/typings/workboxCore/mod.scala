package typings.workboxCore

import typings.workboxCore.anon.PartialCacheNameDetails
import typings.workboxCore.cacheNamesMod.CacheNames_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("workbox-core", JSImport.Namespace)
@js.native
object mod extends js.Object {
  val cacheNames: CacheNames_ = js.native
  def clientsClaim(): Unit = js.native
  def registerQuotaErrorCallback(callback: js.Function0[Unit]): Unit = js.native
  def setCacheNameDetails(details: PartialCacheNameDetails): Unit = js.native
  def skipWaiting(): Unit = js.native
}

