package typings.ydnDb.ydn.db.events

import typings.ydnDb.ydn.db.EventType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RecordEvent extends Event {
  
  def getKey(): js.Any = js.native
  
  def getStoreName(): String = js.native
  
  def getValue(): js.Any = js.native
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
  
  @scala.inline
  implicit class RecordEventOps[Self <: RecordEvent] (val x: Self) extends AnyVal {
    
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
    def setGetKey(value: () => js.Any): Self = this.set("getKey", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetStoreName(value: () => String): Self = this.set("getStoreName", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetValue(value: () => js.Any): Self = this.set("getValue", js.Any.fromFunction0(value))
  }
}
