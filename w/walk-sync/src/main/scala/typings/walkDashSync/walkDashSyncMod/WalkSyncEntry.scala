package typings.walkDashSync.walkDashSyncMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("walk-sync", "WalkSyncEntry")
@js.native
class WalkSyncEntry () extends js.Object {
  var basePath: String = js.native
  var fullPath: String = js.native
  var mode: Double = js.native
  var mtime: Date = js.native
  var relativePath: String = js.native
  var size: Double = js.native
  def isDirectory(): Boolean = js.native
}

/* static members */
@JSImport("walk-sync", "WalkSyncEntry")
@js.native
object WalkSyncEntry extends js.Object {
  def fromStat(relativePath: String, stat: js.Any): WalkSyncEntry = js.native
}

