package typings.wonderJs

import typings.wonderJs.distEs2015CoreEntityObjectEntityObjectMod.EntityObject
import typings.wonderJs.distEs2015EventObjectEventNameHandlerMod.EEventName
import typings.wonderJs.distEs2015EventStructureEventListenerMapMod.EventListenerMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEs2015EventStructureCustomEventListenerMapMod {
  
  @JSImport("wonder.js/dist/es2015/event/structure/CustomEventListenerMap", "CustomEventListenerMap")
  @js.native
  open class CustomEventListenerMap () extends EventListenerMap {
    
    def appendChild(eventName: EEventName, data: Any): Any = js.native
    def appendChild(target: EntityObject, eventName: EEventName, data: Any): Any = js.native
    
    /* protected */ def buildFirstLevelKey(uid: Double): Any = js.native
    
    def getChild(eventName: EEventName): Any = js.native
    def getChild(target: EntityObject): Any = js.native
    def getChild(target: EntityObject, eventName: EEventName): Any = js.native
    
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
