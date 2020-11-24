package typings.tooltipster.JQueryTooltipster

import typings.jquery.JQueryEventObject
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ITooltipEvent extends js.Object {
  
  var event: JQueryEventObject = js.native
  
  var instance: ITooltipsterInstance = js.native
  
  var origin: HTMLElement = js.native
}
object ITooltipEvent {
  
  @scala.inline
  def apply(event: JQueryEventObject, instance: ITooltipsterInstance, origin: HTMLElement): ITooltipEvent = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], instance = instance.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITooltipEvent]
  }
  
  @scala.inline
  implicit class ITooltipEventOps[Self <: ITooltipEvent] (val x: Self) extends AnyVal {
    
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
    def setEvent(value: JQueryEventObject): Self = this.set("event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstance(value: ITooltipsterInstance): Self = this.set("instance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrigin(value: HTMLElement): Self = this.set("origin", value.asInstanceOf[js.Any])
  }
}
