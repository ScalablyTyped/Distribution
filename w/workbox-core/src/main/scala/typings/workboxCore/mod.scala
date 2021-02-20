package typings.workboxCore

import typings.workboxCore.anon.PartialCacheNameDetails
import typings.workboxCore.cacheNamesMod.CacheNames_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("workbox-core", "cacheNames")
  @js.native
  val cacheNames: CacheNames_ = js.native
  
  @JSImport("workbox-core", "clientsClaim")
  @js.native
  def clientsClaim(): Unit = js.native
  
  @JSImport("workbox-core", "registerQuotaErrorCallback")
  @js.native
  def registerQuotaErrorCallback(callback: js.Function0[Unit]): Unit = js.native
  
  @JSImport("workbox-core", "setCacheNameDetails")
  @js.native
  def setCacheNameDetails(details: PartialCacheNameDetails): Unit = js.native
  
  @JSImport("workbox-core", "skipWaiting")
  @js.native
  def skipWaiting(): Unit = js.native
}
