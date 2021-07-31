package typings.xhrMock

import typings.std.AddEventListenerOptions
import typings.std.EventListenerOptions
import typings.std.EventTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mockEventTargetMod {
  
  @JSImport("xhr-mock/lib/MockEventTarget", JSImport.Default)
  @js.native
  class default ()
    extends StObject
       with MockEventTarget
  
  @js.native
  trait MockEventTarget
    extends StObject
       with EventTarget {
    
    def addEventListener(`type`: String, listener: Unit, options: Boolean): Unit = js.native
    def addEventListener(`type`: String, listener: Unit, options: AddEventListenerOptions): Unit = js.native
    
    var listeners: js.Any = js.native
    
    def removeEventListener(`type`: String, listener: Unit, options: Boolean): Unit = js.native
    def removeEventListener(`type`: String, listener: Unit, options: EventListenerOptions): Unit = js.native
  }
}
