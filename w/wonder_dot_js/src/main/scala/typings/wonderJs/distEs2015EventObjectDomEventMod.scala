package typings.wonderJs

import typings.wonderJs.distEs2015EventObjectCustomEventMod.CustomEvent
import typings.wonderJs.distEs2015EventObjectEventMod.Event
import typings.wonderJs.distEs2015EventObjectEventNameHandlerMod.EEventName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEs2015EventObjectDomEventMod {
  
  /* note: abstract class */ @JSImport("wonder.js/dist/es2015/event/object/DomEvent", "DomEvent")
  @js.native
  open class DomEvent protected () extends Event {
    def this(event: Any, eventName: EEventName) = this()
    
    var event: Any = js.native
    
    def getDataFromCustomEvent(event: CustomEvent): Unit = js.native
    
    def preventDefault(): Unit = js.native
  }
}
