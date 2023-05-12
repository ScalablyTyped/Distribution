package typings.workboxPrecaching

import typings.workboxPrecaching.typesMod.PrecacheEntry
import typings.workboxPrecaching.typesMod.PrecacheRouteOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object precacheAndRouteMod {
  
  @JSImport("workbox-precaching/precacheAndRoute", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * This method will add entries to the precache list and add a route to
    * respond to fetch events.
    *
    * This is a convenience method that will call
    * {@link workbox-precaching.precache} and
    * {@link workbox-precaching.addRoute} in a single call.
    *
    * @param {Array<Object|string>} entries Array of entries to precache.
    * @param {Object} [options] See the
    * {@link workbox-precaching.PrecacheRoute} options.
    *
    * @memberof workbox-precaching
    */
  inline def precacheAndRoute(entries: js.Array[PrecacheEntry | String]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("precacheAndRoute")(entries.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def precacheAndRoute(entries: js.Array[PrecacheEntry | String], options: PrecacheRouteOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("precacheAndRoute")(entries.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
