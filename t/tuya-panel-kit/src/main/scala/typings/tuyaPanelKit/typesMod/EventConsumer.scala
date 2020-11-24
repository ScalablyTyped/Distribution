package typings.tuyaPanelKit.typesMod

import typings.std.Extract
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventConsumer[EventMap /* <: EventMapBase */] extends js.Object {
  
  /**
    * Subscribe to events from the parent navigator.
    *
    * @param type Type of the event (e.g. `focus`, `blur`)
    * @param callback Callback listener which is executed upon receiving the event.
    */
  def addListener[EventName /* <: Extract[/* keyof EventMap */ String, String] */](`type`: EventName, callback: EventListenerCallback[EventMap, EventName]): js.Function0[Unit] = js.native
  
  def removeListener[EventName /* <: Extract[/* keyof EventMap */ String, String] */](`type`: EventName, callback: EventListenerCallback[EventMap, EventName]): Unit = js.native
}
object EventConsumer {
  
  @scala.inline
  def apply[EventMap /* <: EventMapBase */](
    addListener: (js.Any, EventListenerCallback[EventMap, js.Any]) => js.Function0[Unit],
    removeListener: (js.Any, EventListenerCallback[EventMap, js.Any]) => Unit
  ): EventConsumer[EventMap] = {
    val __obj = js.Dynamic.literal(addListener = js.Any.fromFunction2(addListener), removeListener = js.Any.fromFunction2(removeListener))
    __obj.asInstanceOf[EventConsumer[EventMap]]
  }
  
  @scala.inline
  implicit class EventConsumerOps[Self <: EventConsumer[_], EventMap /* <: EventMapBase */] (val x: Self with EventConsumer[EventMap]) extends AnyVal {
    
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
    def setAddListener(value: (js.Any, EventListenerCallback[EventMap, js.Any]) => js.Function0[Unit]): Self = this.set("addListener", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRemoveListener(value: (js.Any, EventListenerCallback[EventMap, js.Any]) => Unit): Self = this.set("removeListener", js.Any.fromFunction2(value))
  }
}
