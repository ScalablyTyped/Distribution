package typings.tooltipster.JQueryTooltipsterNs

import typings.jquery.JQueryEventObject
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITooltipEvent extends js.Object {
  var event: JQueryEventObject
  var instance: ITooltipsterInstance
  var origin: HTMLElement
}

object ITooltipEvent {
  @scala.inline
  def apply(event: JQueryEventObject, instance: ITooltipsterInstance, origin: HTMLElement): ITooltipEvent = {
    val __obj = js.Dynamic.literal(event = event, instance = instance, origin = origin)
  
    __obj.asInstanceOf[ITooltipEvent]
  }
}

