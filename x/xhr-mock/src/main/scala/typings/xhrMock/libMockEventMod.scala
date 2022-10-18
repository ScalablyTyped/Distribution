package typings.xhrMock

import typings.std.Element
import typings.std.Event
import typings.std.EventInit
import typings.std.EventTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMockEventMod {
  
  @JSImport("xhr-mock/lib/MockEvent", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with MockEvent {
    def this(`type`: String) = this()
    def this(`type`: String, eventInitDict: EventInit) = this()
  }
  
  @js.native
  trait MockEvent
    extends StObject
       with Event {
    
    @JSName("currentTarget")
    val currentTarget_MockEvent: EventTarget = js.native
    
    def deepPath(): js.Array[EventTarget] = js.native
    
    val scoped: Boolean = js.native
    
    @JSName("srcElement")
    val srcElement_MockEvent: Element | Null = js.native
    
    @JSName("target")
    val target_MockEvent: EventTarget = js.native
    
    @JSName("timeStamp")
    val timeStamp_MockEvent: Double = js.native
  }
}
