package typings.yandexMaps.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IEventEmitter extends StObject {
  
  var events: IEventManager[js.Object] = js.native
}
object IEventEmitter {
  
  @scala.inline
  def apply(events: IEventManager[js.Object]): IEventEmitter = {
    val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEventEmitter]
  }
  
  @scala.inline
  implicit class IEventEmitterMutableBuilder[Self <: IEventEmitter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEvents(value: IEventManager[js.Object]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
  }
}
