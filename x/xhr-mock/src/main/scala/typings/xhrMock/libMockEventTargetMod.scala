package typings.xhrMock

import typings.std.AddEventListenerOptions
import typings.std.EventListenerOptions
import typings.std.EventTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMockEventTargetMod {
  
  @JSImport("xhr-mock/lib/MockEventTarget", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with MockEventTarget
  
  @js.native
  trait MockEventTarget
    extends StObject
       with EventTarget {
    
    def addEventListener(`type`: String, listener: Unit, options: Boolean): Unit = js.native
    def addEventListener(`type`: String, listener: Unit, options: AddEventListenerOptions): Unit = js.native
    
    /* private */ var listeners: Any = js.native
    
    def removeEventListener(`type`: String, listener: Unit, options: Boolean): Unit = js.native
    def removeEventListener(`type`: String, listener: Unit, options: EventListenerOptions): Unit = js.native
  }
}
