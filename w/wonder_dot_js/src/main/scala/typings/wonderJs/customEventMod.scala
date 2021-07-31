package typings.wonderJs

import typings.wonderJs.domEventMod.DomEvent
import typings.wonderJs.eventMod.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object customEventMod {
  
  @JSImport("wonder.js/dist/es2015/event/object/CustomEvent", "CustomEvent")
  @js.native
  class CustomEvent protected () extends Event {
    def this(eventName: String) = this()
    def this(eventName: String, userData: js.Any) = this()
    
    def copyPublicAttri(destination: js.Any, source: js.Any): js.Any = js.native
    
    def getDataFromDomEvent(event: DomEvent): Unit = js.native
    
    var userData: js.Any = js.native
  }
  /* static members */
  object CustomEvent {
    
    @JSImport("wonder.js/dist/es2015/event/object/CustomEvent", "CustomEvent")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def create(eventName: String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(eventName.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    @scala.inline
    def create(eventName: String, userData: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(eventName.asInstanceOf[js.Any], userData.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  }
}
