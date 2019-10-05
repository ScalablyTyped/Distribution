package typings.ydnDashDb.ydn.db

import typings.std.Error
import typings.ydnDashDb.ydn.db.events.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ydn.db.events")
@js.native
object events extends js.Object {
  @js.native
  class Event () extends js.Object {
    var name: String = js.native
    var `type`: EventType = js.native
  }
  
  @js.native
  class RecordEvent () extends Event {
    def getKey(): js.Any = js.native
    def getStoreName(): String = js.native
    def getValue(): js.Any = js.native
  }
  
  @js.native
  class StorageEvent () extends Event {
    def getError(): Error = js.native
    def getOldVersion(): Double = js.native
    def getVersion(): Double = js.native
  }
  
  @js.native
  class StoreEvent () extends Event {
    def getKeys(): js.Array[_] = js.native
    def getStoreName(): String = js.native
    def getValues(): js.Array[_] = js.native
  }
  
}

