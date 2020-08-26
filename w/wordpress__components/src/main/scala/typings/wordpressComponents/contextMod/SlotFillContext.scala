package typings.wordpressComponents.contextMod

import typings.wordpressComponents.anon.Componentanyoccurrencenum
import typings.wordpressElement.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SlotFillContext extends js.Object {
  def getFills(name: String, instance: Component[js.Object, js.Object, _]): js.Array[Componentanyoccurrencenum] = js.native
  def getSlot(name: String): Component[js.Object, js.Object, _] = js.native
  // FIXME: instance is not correctly typed. but there's a bug in the code that assumes this type.
  def registerFill(name: String, instance: Component[js.Object, js.Object, _]): Unit = js.native
  def registerSlot(name: String, instance: Component[js.Object, js.Object, _]): Unit = js.native
  // FIXME: instance is not correctly typed. but there's a bug in the code that assumes this type.
  def unregisterFill(name: String, instance: Component[js.Object, js.Object, _]): Unit = js.native
  def unregisterSlot(name: String, instance: Component[js.Object, js.Object, _]): Unit = js.native
}

object SlotFillContext {
  @scala.inline
  def apply(
    getFills: (String, Component[js.Object, js.Object, _]) => js.Array[Componentanyoccurrencenum],
    getSlot: String => Component[js.Object, js.Object, _],
    registerFill: (String, Component[js.Object, js.Object, _]) => Unit,
    registerSlot: (String, Component[js.Object, js.Object, _]) => Unit,
    unregisterFill: (String, Component[js.Object, js.Object, _]) => Unit,
    unregisterSlot: (String, Component[js.Object, js.Object, _]) => Unit
  ): SlotFillContext = {
    val __obj = js.Dynamic.literal(getFills = js.Any.fromFunction2(getFills), getSlot = js.Any.fromFunction1(getSlot), registerFill = js.Any.fromFunction2(registerFill), registerSlot = js.Any.fromFunction2(registerSlot), unregisterFill = js.Any.fromFunction2(unregisterFill), unregisterSlot = js.Any.fromFunction2(unregisterSlot))
    __obj.asInstanceOf[SlotFillContext]
  }
  @scala.inline
  implicit class SlotFillContextOps[Self <: SlotFillContext] (val x: Self) extends AnyVal {
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
    def setGetFills(value: (String, Component[js.Object, js.Object, _]) => js.Array[Componentanyoccurrencenum]): Self = this.set("getFills", js.Any.fromFunction2(value))
    @scala.inline
    def setGetSlot(value: String => Component[js.Object, js.Object, _]): Self = this.set("getSlot", js.Any.fromFunction1(value))
    @scala.inline
    def setRegisterFill(value: (String, Component[js.Object, js.Object, _]) => Unit): Self = this.set("registerFill", js.Any.fromFunction2(value))
    @scala.inline
    def setRegisterSlot(value: (String, Component[js.Object, js.Object, _]) => Unit): Self = this.set("registerSlot", js.Any.fromFunction2(value))
    @scala.inline
    def setUnregisterFill(value: (String, Component[js.Object, js.Object, _]) => Unit): Self = this.set("unregisterFill", js.Any.fromFunction2(value))
    @scala.inline
    def setUnregisterSlot(value: (String, Component[js.Object, js.Object, _]) => Unit): Self = this.set("unregisterSlot", js.Any.fromFunction2(value))
  }
  
}

