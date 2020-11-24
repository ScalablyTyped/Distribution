package typings.yandexMaps.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OriginalEventOriginalEvent[OriginalEvent] extends js.Object {
  
  var originalEvent: OriginalEvent = js.native
}
object OriginalEventOriginalEvent {
  
  @scala.inline
  def apply[OriginalEvent](originalEvent: OriginalEvent): OriginalEventOriginalEvent[OriginalEvent] = {
    val __obj = js.Dynamic.literal(originalEvent = originalEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[OriginalEventOriginalEvent[OriginalEvent]]
  }
  
  @scala.inline
  implicit class OriginalEventOriginalEventOps[Self <: OriginalEventOriginalEvent[_], OriginalEvent] (val x: Self with OriginalEventOriginalEvent[OriginalEvent]) extends AnyVal {
    
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
    def setOriginalEvent(value: OriginalEvent): Self = this.set("originalEvent", value.asInstanceOf[js.Any])
  }
}
