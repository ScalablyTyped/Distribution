package typings.ydnDashDb.ydnNs.dbNs.eventsNs

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ydn.db.events.StorageEvent")
@js.native
class StorageEvent () extends Event {
  def getError(): Error = js.native
  def getOldVersion(): Double = js.native
  def getVersion(): Double = js.native
}

