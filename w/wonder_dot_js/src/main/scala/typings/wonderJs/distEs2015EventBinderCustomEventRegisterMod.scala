package typings.wonderJs

import typings.wonderJs.distEs2015CoreEntityObjectEntityObjectMod.EntityObject
import typings.wonderJs.distEs2015EventBinderEventRegisterMod.EventRegister
import typings.wonderJs.distEs2015EventObjectEventNameHandlerMod.EEventName
import typings.wonderJs.distEs2015EventStructureCustomEventListenerMapMod.CustomEventListenerMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEs2015EventBinderCustomEventRegisterMod {
  
  @JSImport("wonder.js/dist/es2015/event/binder/CustomEventRegister", "CustomEventRegister")
  @js.native
  open class CustomEventRegister () extends EventRegister {
    
    /* protected */ @JSName("listenerMap")
    var listenerMap_CustomEventRegister: CustomEventListenerMap = js.native
    
    def register(
      eventName: EEventName,
      handler: js.Function,
      originHandler: js.Function,
      domHandler: js.Function,
      priority: Double
    ): Any = js.native
    def register(
      target: EntityObject,
      eventName: EEventName,
      handler: js.Function,
      originHandler: js.Function,
      domHandler: js.Function,
      priority: Double
    ): Any = js.native
    
    def remove(eventName: EEventName): Any = js.native
    def remove(eventName: EEventName, handler: js.Function): Any = js.native
    def remove(target: EntityObject): Any = js.native
    def remove(target: EntityObject, eventName: EEventName): Any = js.native
    def remove(target: EntityObject, eventName: EEventName, handler: js.Function): Any = js.native
    def remove(uid: Double, eventName: EEventName): Any = js.native
    
    def setBubbleParent(target: EntityObject, parent: EntityObject): Unit = js.native
  }
  /* static members */
  object CustomEventRegister {
    
    @JSImport("wonder.js/dist/es2015/event/binder/CustomEventRegister", "CustomEventRegister")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getInstance(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")().asInstanceOf[Any]
  }
  
  trait CustomEventRegisterData extends StObject {
    
    var domHandler: js.Function
    
    var handler: js.Function
    
    var originHandler: js.Function
    
    var priority: Double
    
    var target: EntityObject
  }
  object CustomEventRegisterData {
    
    inline def apply(
      domHandler: js.Function,
      handler: js.Function,
      originHandler: js.Function,
      priority: Double,
      target: EntityObject
    ): CustomEventRegisterData = {
      val __obj = js.Dynamic.literal(domHandler = domHandler.asInstanceOf[js.Any], handler = handler.asInstanceOf[js.Any], originHandler = originHandler.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[CustomEventRegisterData]
    }
    
    extension [Self <: CustomEventRegisterData](x: Self) {
      
      inline def setDomHandler(value: js.Function): Self = StObject.set(x, "domHandler", value.asInstanceOf[js.Any])
      
      inline def setHandler(value: js.Function): Self = StObject.set(x, "handler", value.asInstanceOf[js.Any])
      
      inline def setOriginHandler(value: js.Function): Self = StObject.set(x, "originHandler", value.asInstanceOf[js.Any])
      
      inline def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
      
      inline def setTarget(value: EntityObject): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
}
