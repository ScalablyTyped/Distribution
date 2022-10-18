package typings.wonderJs

import typings.wonderJs.distEs2015EventObjectDomEventMod.DomEvent
import typings.wonderJs.distEs2015EventObjectEventMod.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEs2015EventObjectCustomEventMod {
  
  @JSImport("wonder.js/dist/es2015/event/object/CustomEvent", "CustomEvent")
  @js.native
  open class CustomEvent protected () extends Event {
    def this(eventName: String) = this()
    def this(eventName: String, userData: Any) = this()
    
    def copyPublicAttri(destination: Any, source: Any): Any = js.native
    
    def getDataFromDomEvent(event: DomEvent): Unit = js.native
    
    var userData: Any = js.native
  }
  /* static members */
  object CustomEvent {
    
    @JSImport("wonder.js/dist/es2015/event/object/CustomEvent", "CustomEvent")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(eventName: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(eventName.asInstanceOf[js.Any]).asInstanceOf[Any]
    inline def create(eventName: String, userData: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(eventName.asInstanceOf[js.Any], userData.asInstanceOf[js.Any])).asInstanceOf[Any]
  }
}
