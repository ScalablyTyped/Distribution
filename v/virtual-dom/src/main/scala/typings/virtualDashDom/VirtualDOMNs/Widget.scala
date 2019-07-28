package typings.virtualDashDom.VirtualDOMNs

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Widget extends VTree {
  var `type`: String
  def destroy(node: Element): Unit
   // 'Widget'
  def init(): Element
  def update(previous: Widget, domNode: Element): Unit
}

object Widget {
  @scala.inline
  def apply(destroy: Element => Unit, init: () => Element, `type`: String, update: (Widget, Element) => Unit): Widget = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction1(destroy), init = js.Any.fromFunction0(init), update = js.Any.fromFunction2(update))
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Widget]
  }
}

