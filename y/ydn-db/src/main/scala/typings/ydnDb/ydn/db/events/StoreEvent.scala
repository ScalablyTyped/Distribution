package typings.ydnDb.ydn.db.events

import typings.ydnDb.ydn.db.EventType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StoreEvent extends Event {
  def getKeys(): js.Array[_] = js.native
  def getStoreName(): String = js.native
  def getValues(): js.Array[_] = js.native
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
  @scala.inline
  implicit class StoreEventOps[Self <: StoreEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGetKeys(value: () => js.Array[_]): Self = this.set("getKeys", js.Any.fromFunction0(value))
    @scala.inline
    def setGetStoreName(value: () => String): Self = this.set("getStoreName", js.Any.fromFunction0(value))
    @scala.inline
    def setGetValues(value: () => js.Array[_]): Self = this.set("getValues", js.Any.fromFunction0(value))
  }
  
}

