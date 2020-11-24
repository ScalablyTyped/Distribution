package typings.ydnDb.ydn.db.events

import typings.std.Error
import typings.ydnDb.ydn.db.EventType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StorageEvent extends Event {
  
  def getError(): Error = js.native
  
  def getOldVersion(): Double = js.native
  
  def getVersion(): Double = js.native
}
object StorageEvent {
  
  @scala.inline
  def apply(
    getError: () => Error,
    getOldVersion: () => Double,
    getVersion: () => Double,
    name: String,
    `type`: EventType
  ): StorageEvent = {
    val __obj = js.Dynamic.literal(getError = js.Any.fromFunction0(getError), getOldVersion = js.Any.fromFunction0(getOldVersion), getVersion = js.Any.fromFunction0(getVersion), name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StorageEvent]
  }
  
  @scala.inline
  implicit class StorageEventOps[Self <: StorageEvent] (val x: Self) extends AnyVal {
    
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
    def setGetError(value: () => Error): Self = this.set("getError", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetOldVersion(value: () => Double): Self = this.set("getOldVersion", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetVersion(value: () => Double): Self = this.set("getVersion", js.Any.fromFunction0(value))
  }
}
