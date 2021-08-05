package typings.wonderJs

import typings.wonderJs.entityObjectMod.EntityObject
import typings.wonderJs.eventListenerMapMod.EventListenerMap
import typings.wonderJs.eventNameHandlerMod.EEventName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object customEventListenerMapMod {
  
  @JSImport("wonder.js/dist/es2015/event/structure/CustomEventListenerMap", "CustomEventListenerMap")
  @js.native
  class CustomEventListenerMap () extends EventListenerMap {
    
    def appendChild(eventName: EEventName, data: js.Any): js.Any = js.native
    def appendChild(target: EntityObject, eventName: EEventName, data: js.Any): js.Any = js.native
    
    /* protected */ def buildFirstLevelKey(uid: Double): js.Any = js.native
    
    def getChild(eventName: EEventName): js.Any = js.native
    def getChild(target: EntityObject): js.Any = js.native
    def getChild(target: EntityObject, eventName: EEventName): js.Any = js.native
    
    def hasChild(target: EntityObject): Boolean = js.native
    
    def removeChild(eventName: EEventName): Unit = js.native
    def removeChild(eventName: EEventName, handler: js.Function): Unit = js.native
    def removeChild(target: EntityObject): Unit = js.native
    def removeChild(target: EntityObject, eventName: EEventName): Unit = js.native
    def removeChild(target: EntityObject, eventName: EEventName, handler: js.Function): Unit = js.native
    def removeChild(uid: Double, eventName: EEventName): Unit = js.native
  }
  /* static members */
  object CustomEventListenerMap {
    
    @JSImport("wonder.js/dist/es2015/event/structure/CustomEventListenerMap", "CustomEventListenerMap")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(): CustomEventListenerMap = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[CustomEventListenerMap]
  }
}
