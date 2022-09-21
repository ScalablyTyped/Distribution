package typings.wonderJs

import typings.wonderJs.customEventMod.CustomEvent
import typings.wonderJs.eventMod.Event
import typings.wonderJs.eventNameHandlerMod.EEventName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object domEventMod {
  
  @JSImport("wonder.js/dist/es2015/event/object/DomEvent", "DomEvent")
  @js.native
  abstract class DomEvent protected () extends Event {
    def this(event: Any, eventName: EEventName) = this()
    
    var event: Any = js.native
    
    def getDataFromCustomEvent(event: CustomEvent): Unit = js.native
    
    def preventDefault(): Unit = js.native
  }
}
