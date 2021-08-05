package typings.workboxCore

import typings.workboxCore.anon.PartialCacheNameDetails
import typings.workboxCore.cacheNamesMod.CacheNames_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("workbox-core", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("workbox-core", "cacheNames")
  @js.native
  val cacheNames: CacheNames_ = js.native
  
  inline def clientsClaim(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clientsClaim")().asInstanceOf[Unit]
  
  inline def registerQuotaErrorCallback(callback: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerQuotaErrorCallback")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def setCacheNameDetails(details: PartialCacheNameDetails): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setCacheNameDetails")(details.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def skipWaiting(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("skipWaiting")().asInstanceOf[Unit]
}
