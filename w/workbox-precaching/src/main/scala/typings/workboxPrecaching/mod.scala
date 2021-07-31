package typings.workboxPrecaching

import typings.workboxCore.workboxPluginMod.WorkboxPlugin
import typings.workboxPrecaching.fetchListenerOptionsMod.FetchListenerOptions
import typings.workboxPrecaching.precacheEntryMod.PrecacheEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("workbox-precaching", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("workbox-precaching", "PrecacheController")
  @js.native
  class PrecacheController ()
    extends typings.workboxPrecaching.precacheControllerMod.PrecacheController {
    def this(cacheName: String) = this()
  }
  
  @scala.inline
  def addPlugins(newPlugins: js.Array[WorkboxPlugin]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addPlugins")(newPlugins.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def addRoute(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addRoute")().asInstanceOf[Unit]
  @scala.inline
  def addRoute(options: FetchListenerOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addRoute")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def cleanupOutdatedCaches(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("cleanupOutdatedCaches")().asInstanceOf[Unit]
  
  @scala.inline
  def getCacheKeyForURL(url: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getCacheKeyForURL")(url.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def precache(entries: js.Array[String | PrecacheEntry]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("precache")(entries.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def precacheAndRoute(entries: js.Array[String | PrecacheEntry]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("precacheAndRoute")(entries.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def precacheAndRoute(entries: js.Array[String | PrecacheEntry], options: FetchListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("precacheAndRoute")(entries.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
