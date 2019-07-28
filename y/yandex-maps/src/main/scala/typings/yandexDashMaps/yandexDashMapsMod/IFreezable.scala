package typings.yandexDashMaps.yandexDashMapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFreezable extends js.Object {
  var events: IEventManager
  def freeze(): IFreezable
  def isFrozen(): Boolean
  def unfreeze(): IFreezable
}

object IFreezable {
  @scala.inline
  def apply(
    events: IEventManager,
    freeze: () => IFreezable,
    isFrozen: () => Boolean,
    unfreeze: () => IFreezable
  ): IFreezable = {
    val __obj = js.Dynamic.literal(events = events, freeze = js.Any.fromFunction0(freeze), isFrozen = js.Any.fromFunction0(isFrozen), unfreeze = js.Any.fromFunction0(unfreeze))
  
    __obj.asInstanceOf[IFreezable]
  }
}

