package typings.yandexMaps.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IFreezable extends StObject {
  
  var events: IEventManager[js.Object]
  
  def freeze(): IFreezable
  
  def isFrozen(): Boolean
  
  def unfreeze(): IFreezable
}
object IFreezable {
  
  @scala.inline
  def apply(
    events: IEventManager[js.Object],
    freeze: () => IFreezable,
    isFrozen: () => Boolean,
    unfreeze: () => IFreezable
  ): IFreezable = {
    val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any], freeze = js.Any.fromFunction0(freeze), isFrozen = js.Any.fromFunction0(isFrozen), unfreeze = js.Any.fromFunction0(unfreeze))
    __obj.asInstanceOf[IFreezable]
  }
  
  @scala.inline
  implicit class IFreezableMutableBuilder[Self <: IFreezable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEvents(value: IEventManager[js.Object]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFreeze(value: () => IFreezable): Self = StObject.set(x, "freeze", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsFrozen(value: () => Boolean): Self = StObject.set(x, "isFrozen", js.Any.fromFunction0(value))
    
    @scala.inline
    def setUnfreeze(value: () => IFreezable): Self = StObject.set(x, "unfreeze", js.Any.fromFunction0(value))
  }
}
