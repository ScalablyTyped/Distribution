package typings.wordpressComponents.contextMod

import typings.wordpressComponents.anon.Componentanyoccurrencenum
import typings.wordpressElement.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SlotFillContext extends js.Object {
  def getFills(name: String, instance: Component[js.Object, js.Object, _]): js.Array[Componentanyoccurrencenum]
  def getSlot(name: String): Component[js.Object, js.Object, _]
  // FIXME: instance is not correctly typed. but there's a bug in the code that assumes this type.
  def registerFill(name: String, instance: Component[js.Object, js.Object, _]): Unit
  def registerSlot(name: String, instance: Component[js.Object, js.Object, _]): Unit
  // FIXME: instance is not correctly typed. but there's a bug in the code that assumes this type.
  def unregisterFill(name: String, instance: Component[js.Object, js.Object, _]): Unit
  def unregisterSlot(name: String, instance: Component[js.Object, js.Object, _]): Unit
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
}

