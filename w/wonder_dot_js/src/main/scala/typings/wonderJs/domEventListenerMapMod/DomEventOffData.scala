package typings.wonderJs.domEventListenerMapMod

import typings.std.HTMLElement
import typings.wonderJs.eventNameHandlerMod.EEventName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DomEventOffData extends js.Object {
  var dom: HTMLElement
  var domHandler: js.Function
  var eventName: EEventName
}

object DomEventOffData {
  @scala.inline
  def apply(dom: HTMLElement, domHandler: js.Function, eventName: EEventName): DomEventOffData = {
    val __obj = js.Dynamic.literal(dom = dom.asInstanceOf[js.Any], domHandler = domHandler.asInstanceOf[js.Any], eventName = eventName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DomEventOffData]
  }
}

