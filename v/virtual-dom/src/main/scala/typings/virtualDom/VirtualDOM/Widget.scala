package typings.virtualDom.VirtualDOM

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Widget extends VTree {
  var `type`: String = js.native
  def destroy(node: Element): Unit = js.native
   // 'Widget'
  def init(): Element = js.native
  def update(previous: Widget, domNode: Element): Unit = js.native
}

object Widget {
  @scala.inline
  def apply(destroy: Element => Unit, init: () => Element, `type`: String, update: (Widget, Element) => Unit): Widget = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction1(destroy), init = js.Any.fromFunction0(init), update = js.Any.fromFunction2(update))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Widget]
  }
  @scala.inline
  implicit class WidgetOps[Self <: Widget] (val x: Self) extends AnyVal {
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
    def setDestroy(value: Element => Unit): Self = this.set("destroy", js.Any.fromFunction1(value))
    @scala.inline
    def setInit(value: () => Element): Self = this.set("init", js.Any.fromFunction0(value))
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpdate(value: (Widget, Element) => Unit): Self = this.set("update", js.Any.fromFunction2(value))
  }
  
}

