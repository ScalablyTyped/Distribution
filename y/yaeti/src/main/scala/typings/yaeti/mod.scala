package typings.yaeti

import typings.std.Event
import typings.std.EventListenerOrEventListenerObject
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("yaeti", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def Event(`type`: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("Event")(`type`.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("yaeti", "EventTarget")
  @js.native
  open class EventTarget () extends StObject {
    
    var _listeners: Listeners = js.native
    
    def addEventListener(): Unit = js.native
    def addEventListener(`type`: String): Unit = js.native
    def addEventListener(`type`: String, newListener: EventListenerOrEventListenerObject): Unit = js.native
    def addEventListener(`type`: Unit, newListener: EventListenerOrEventListenerObject): Unit = js.native
    
    def dispatchEvent(event: Event): Boolean = js.native
    
    def listeners: Listeners = js.native
    
    def removeEventListener(): Unit = js.native
    def removeEventListener(`type`: String): Unit = js.native
    def removeEventListener(`type`: String, oldListener: EventListenerOrEventListenerObject): Unit = js.native
    def removeEventListener(`type`: Unit, oldListener: EventListenerOrEventListenerObject): Unit = js.native
  }
  
  type Listeners = Record[String, EventListenerOrEventListenerObject]
}
