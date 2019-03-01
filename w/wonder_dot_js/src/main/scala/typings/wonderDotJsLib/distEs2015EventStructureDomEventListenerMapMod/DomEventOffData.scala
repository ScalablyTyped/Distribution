package typings
package wonderDotJsLib.distEs2015EventStructureDomEventListenerMapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DomEventOffData extends js.Object {
  var dom: stdLib.HTMLElement
  var domHandler: js.Function
  var eventName: wonderDotJsLib.distEs2015EventObjectEventNameHandlerMod.EEventName
}

object DomEventOffData {
  @scala.inline
  def apply(
    dom: stdLib.HTMLElement,
    domHandler: js.Function,
    eventName: wonderDotJsLib.distEs2015EventObjectEventNameHandlerMod.EEventName
  ): DomEventOffData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("dom")(dom)
    __obj.updateDynamic("domHandler")(domHandler)
    __obj.updateDynamic("eventName")(eventName)
    __obj.asInstanceOf[DomEventOffData]
  }
}

