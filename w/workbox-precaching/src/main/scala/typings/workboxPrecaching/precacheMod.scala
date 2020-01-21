package typings.workboxPrecaching

import typings.workboxPrecaching.precacheEntryMod.PrecacheEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("workbox-precaching/precache", JSImport.Namespace)
@js.native
object precacheMod extends js.Object {
  def precache(entries: js.Array[String | PrecacheEntry]): Unit = js.native
}

