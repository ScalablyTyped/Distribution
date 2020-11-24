package typings.tooltipster.JQueryTooltipster

import typings.std.HTMLElement
import typings.std.MouseEvent
import typings.std.TouchEvent
import typings.tooltipster.tooltipsterStrings.constrained
import typings.tooltipster.tooltipsterStrings.natural
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ITooltipsterHelper extends js.Object {
  
  /** provided on functionBefore and functionAfter callbacks */
  var event: js.UndefOr[MouseEvent | TouchEvent | Null] = js.native
  
  /** provided on position callback */
  var geo: js.UndefOr[ITooltipsterGeoHelper] = js.native
  
  /** provided on position callback */
  var mode: js.UndefOr[natural | constrained] = js.native
  
  var origin: HTMLElement = js.native
  
  /** provided on functionReady and open callbacks */
  var tooltip: js.UndefOr[HTMLElement] = js.native
  
  /** provided on position callback */
  var tooltipClone: js.UndefOr[HTMLElement] = js.native
}
object ITooltipsterHelper {
  
  @scala.inline
  def apply(origin: HTMLElement): ITooltipsterHelper = {
    val __obj = js.Dynamic.literal(origin = origin.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITooltipsterHelper]
  }
  
  @scala.inline
  implicit class ITooltipsterHelperOps[Self <: ITooltipsterHelper] (val x: Self) extends AnyVal {
    
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
    def setOrigin(value: HTMLElement): Self = this.set("origin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvent(value: MouseEvent | TouchEvent): Self = this.set("event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEvent: Self = this.set("event", js.undefined)
    
    @scala.inline
    def setEventNull: Self = this.set("event", null)
    
    @scala.inline
    def setGeo(value: ITooltipsterGeoHelper): Self = this.set("geo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGeo: Self = this.set("geo", js.undefined)
    
    @scala.inline
    def setMode(value: natural | constrained): Self = this.set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    
    @scala.inline
    def setTooltip(value: HTMLElement): Self = this.set("tooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTooltip: Self = this.set("tooltip", js.undefined)
    
    @scala.inline
    def setTooltipClone(value: HTMLElement): Self = this.set("tooltipClone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTooltipClone: Self = this.set("tooltipClone", js.undefined)
  }
}
