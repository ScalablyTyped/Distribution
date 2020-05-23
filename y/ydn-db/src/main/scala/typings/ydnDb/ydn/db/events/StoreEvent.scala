package typings.ydnDb.ydn.db.events

import typings.ydnDb.ydn.db.EventType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StoreEvent extends Event {
  def getKeys(): js.Array[_]
  def getStoreName(): String
  def getValues(): js.Array[_]
}

object StoreEvent {
  @scala.inline
  def apply(
    getKeys: () => js.Array[_],
    getStoreName: () => String,
    getValues: () => js.Array[_],
    name: String,
    `type`: EventType
  ): StoreEvent = {
    val __obj = js.Dynamic.literal(getKeys = js.Any.fromFunction0(getKeys), getStoreName = js.Any.fromFunction0(getStoreName), getValues = js.Any.fromFunction0(getValues), name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StoreEvent]
  }
}

