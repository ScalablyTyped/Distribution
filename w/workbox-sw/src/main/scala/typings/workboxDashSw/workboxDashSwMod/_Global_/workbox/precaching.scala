package typings.workboxDashSw.workboxDashSwMod._Global_.workbox

import org.scalablytyped.runtime.Instantiable0
import typings.workboxDashCore.typesWorkboxPluginMod.WorkboxPlugin
import typings.workboxDashPrecaching.typesFetchListenerOptionsMod.FetchListenerOptions
import typings.workboxDashPrecaching.typesPrecacheEntryMod.PrecacheEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("workbox.precaching")
@js.native
object precaching extends js.Object {
  @js.native
  class PrecacheController ()
    extends typings.workboxDashPrecaching.workboxDashPrecachingMod.PrecacheController
  
  var PrecacheController: js.Any | Instantiable0[typings.workboxDashPrecaching.workboxDashPrecachingMod.PrecacheController] = js.native
  def addPlugins(newPlugins: js.Array[WorkboxPlugin]): Unit = js.native
  def addRoute(): Unit = js.native
  def addRoute(options: FetchListenerOptions): Unit = js.native
  def cleanupOutdatedCaches(): Unit = js.native
  def getCacheKeyForURL(url: String): String = js.native
  def precache(entries: js.Array[String | PrecacheEntry]): Unit = js.native
  def precacheAndRoute(entries: js.Array[String | PrecacheEntry]): Unit = js.native
  def precacheAndRoute(entries: js.Array[String | PrecacheEntry], options: FetchListenerOptions): Unit = js.native
}

