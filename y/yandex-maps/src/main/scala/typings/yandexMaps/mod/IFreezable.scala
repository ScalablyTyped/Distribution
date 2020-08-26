package typings.yandexMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IFreezable extends js.Object {
  var events: IEventManager = js.native
  def freeze(): IFreezable = js.native
  def isFrozen(): Boolean = js.native
  def unfreeze(): IFreezable = js.native
}

object IFreezable {
  @scala.inline
  def apply(
    events: IEventManager,
    freeze: () => IFreezable,
    isFrozen: () => Boolean,
    unfreeze: () => IFreezable
  ): IFreezable = {
    val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any], freeze = js.Any.fromFunction0(freeze), isFrozen = js.Any.fromFunction0(isFrozen), unfreeze = js.Any.fromFunction0(unfreeze))
    __obj.asInstanceOf[IFreezable]
  }
  @scala.inline
  implicit class IFreezableOps[Self <: IFreezable] (val x: Self) extends AnyVal {
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
    def setEvents(value: IEventManager): Self = this.set("events", value.asInstanceOf[js.Any])
    @scala.inline
    def setFreeze(value: () => IFreezable): Self = this.set("freeze", js.Any.fromFunction0(value))
    @scala.inline
    def setIsFrozen(value: () => Boolean): Self = this.set("isFrozen", js.Any.fromFunction0(value))
    @scala.inline
    def setUnfreeze(value: () => IFreezable): Self = this.set("unfreeze", js.Any.fromFunction0(value))
  }
  
}

