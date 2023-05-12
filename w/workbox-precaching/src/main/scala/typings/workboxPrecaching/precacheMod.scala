package typings.workboxPrecaching

import typings.workboxPrecaching.typesMod.PrecacheEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object precacheMod {
  
  @JSImport("workbox-precaching/precache", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Adds items to the precache list, removing any duplicates and
    * stores the files in the
    * {@link workbox-core.cacheNames|"precache cache"} when the service
    * worker installs.
    *
    * This method can be called multiple times.
    *
    * Please note: This method **will not** serve any of the cached files for you.
    * It only precaches files. To respond to a network request you call
    * {@link workbox-precaching.addRoute}.
    *
    * If you have a single array of files to precache, you can just call
    * {@link workbox-precaching.precacheAndRoute}.
    *
    * @param {Array<Object|string>} [entries=[]] Array of entries to precache.
    *
    * @memberof workbox-precaching
    */
  inline def precache(entries: js.Array[PrecacheEntry | String]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("precache")(entries.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
