package typings.workboxDashPrecaching

import typings.workboxDashPrecaching.typesFetchListenerOptionsMod.FetchListenerOptions
import typings.workboxDashPrecaching.typesPrecacheEntryMod.PrecacheEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("workbox-precaching/precacheAndRoute", JSImport.Namespace)
@js.native
object precacheAndRouteMod extends js.Object {
  def precacheAndRoute(entries: js.Array[String | PrecacheEntry]): Unit = js.native
  def precacheAndRoute(entries: js.Array[String | PrecacheEntry], options: FetchListenerOptions): Unit = js.native
}

