package typings.workboxPrecaching

import typings.workboxPrecaching.fetchListenerOptionsMod.FetchListenerOptions
import typings.workboxPrecaching.precacheEntryMod.PrecacheEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object precacheAndRouteMod {
  
  @JSImport("workbox-precaching/precacheAndRoute", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def precacheAndRoute(entries: js.Array[String | PrecacheEntry]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("precacheAndRoute")(entries.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def precacheAndRoute(entries: js.Array[String | PrecacheEntry], options: FetchListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("precacheAndRoute")(entries.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
