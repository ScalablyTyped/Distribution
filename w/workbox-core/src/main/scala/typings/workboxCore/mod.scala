package typings.workboxCore

import typings.std.Partial
import typings.workboxCore.cacheNamesMod.CacheNames_
import typings.workboxCore.setCacheNameDetailsMod.CacheNameDetails
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("workbox-core", JSImport.Namespace)
@js.native
object mod extends js.Object {
  val cacheNames: CacheNames_ = js.native
  def clientsClaim(): Unit = js.native
  def registerQuotaErrorCallback(callback: js.Function0[Unit]): Unit = js.native
  def setCacheNameDetails(details: Partial[CacheNameDetails]): Unit = js.native
  def skipWaiting(): Unit = js.native
}

