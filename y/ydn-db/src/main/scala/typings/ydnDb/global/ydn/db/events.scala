package typings.ydnDb.global.ydn.db

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ydn.db.events")
@js.native
object events extends js.Object {
  @js.native
  class Event ()
    extends typings.ydnDb.ydn.db.events.Event {
    /* CompleteClass */
    override var name: String = js.native
    /* CompleteClass */
    override var `type`: typings.ydnDb.ydn.db.EventType = js.native
  }
  
  @js.native
  class RecordEvent ()
    extends typings.ydnDb.ydn.db.events.RecordEvent {
    /* CompleteClass */
    override var name: String = js.native
    /* CompleteClass */
    override var `type`: typings.ydnDb.ydn.db.EventType = js.native
    /* CompleteClass */
    override def getKey(): js.Any = js.native
    /* CompleteClass */
    override def getStoreName(): String = js.native
    /* CompleteClass */
    override def getValue(): js.Any = js.native
  }
  
  @js.native
  class StorageEvent ()
    extends typings.ydnDb.ydn.db.events.StorageEvent {
    /* CompleteClass */
    override var name: String = js.native
    /* CompleteClass */
    override var `type`: typings.ydnDb.ydn.db.EventType = js.native
    /* CompleteClass */
    override def getError(): Error = js.native
    /* CompleteClass */
    override def getOldVersion(): Double = js.native
    /* CompleteClass */
    override def getVersion(): Double = js.native
  }
  
  @js.native
  class StoreEvent ()
    extends typings.ydnDb.ydn.db.events.StoreEvent {
    /* CompleteClass */
    override var name: String = js.native
    /* CompleteClass */
    override var `type`: typings.ydnDb.ydn.db.EventType = js.native
    /* CompleteClass */
    override def getKeys(): js.Array[_] = js.native
    /* CompleteClass */
    override def getStoreName(): String = js.native
    /* CompleteClass */
    override def getValues(): js.Array[_] = js.native
  }
  
}

