package typings
package tooltipsterLib.JQueryTooltipsterNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITooltipEvent extends js.Object {
  var event: jqueryLib.JQueryEventObject
  var instance: ITooltipsterInstance
  var origin: stdLib.HTMLElement
}

object ITooltipEvent {
  @scala.inline
  def apply(event: jqueryLib.JQueryEventObject, instance: ITooltipsterInstance, origin: stdLib.HTMLElement): ITooltipEvent = {
    val __obj = js.Dynamic.literal(event = event, instance = instance, origin = origin)
  
    __obj.asInstanceOf[ITooltipEvent]
  }
}

