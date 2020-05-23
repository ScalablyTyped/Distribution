package typings.ydnDb.ydn.db.events

import typings.ydnDb.ydn.db.EventType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RecordEvent extends Event {
  def getKey(): js.Any
  def getStoreName(): String
  def getValue(): js.Any
}

object RecordEvent {
  @scala.inline
  def apply(
    getKey: () => js.Any,
    getStoreName: () => String,
    getValue: () => js.Any,
    name: String,
    `type`: EventType
  ): RecordEvent = {
    val __obj = js.Dynamic.literal(getKey = js.Any.fromFunction0(getKey), getStoreName = js.Any.fromFunction0(getStoreName), getValue = js.Any.fromFunction0(getValue), name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecordEvent]
  }
}

