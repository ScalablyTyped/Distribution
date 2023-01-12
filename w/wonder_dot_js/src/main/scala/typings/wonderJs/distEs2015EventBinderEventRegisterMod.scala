package typings.wonderJs

import typings.std.HTMLElement
import typings.wonderJs.distEs2015CoreEntityObjectEntityObjectMod.EntityObject
import typings.wonderJs.distEs2015EventObjectEventNameHandlerMod.EEventName
import typings.wonderJs.distEs2015EventStructureEventListenerMapMod.EventListenerMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEs2015EventBinderEventRegisterMod {
  
  /* note: abstract class */ @JSImport("wonder.js/dist/es2015/event/binder/EventRegister", "EventRegister")
  @js.native
  open class EventRegister () extends StObject {
    
    def clear(): Unit = js.native
    
    def forEachAll(
      func: js.Function2[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Collection<any> */ /* list */ Any, 
          /* eventName */ EEventName, 
          Unit
        ]
    ): Unit = js.native
    
    def forEachEventName(
      func: js.Function2[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Collection<EventRegisterData> */ /* list */ Any, 
          /* eventName */ EEventName, 
          Unit
        ]
    ): Unit = js.native
    
    def getChild(dom: HTMLElement): Any = js.native
    def getChild(dom: HTMLElement, eventName: EEventName): Any = js.native
    def getChild(target: EntityObject): Any = js.native
    def getChild(target: EntityObject, eventName: EEventName): Any = js.native
    
    def getEventRegisterDataList(currentTarget: EntityObject, eventName: EEventName): Any = js.native
    def getEventRegisterDataList(dom: HTMLElement, eventName: EEventName): Any = js.native
    def getEventRegisterDataList(eventName: EEventName): Any = js.native
    
    /* protected */ var listenerMap: EventListenerMap = js.native
    
    def register(args: Any*): Unit = js.native
    
    def remove(args: Any*): Any = js.native
  }
  
  trait EventRegisterData extends StObject {
    
    var domHandler: js.Function
    
    var handler: js.Function
    
    var originHandler: js.Function
    
    var priority: Double
  }
  object EventRegisterData {
    
    inline def apply(domHandler: js.Function, handler: js.Function, originHandler: js.Function, priority: Double): EventRegisterData = {
      val __obj = js.Dynamic.literal(domHandler = domHandler.asInstanceOf[js.Any], handler = handler.asInstanceOf[js.Any], originHandler = originHandler.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventRegisterData]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EventRegisterData] (val x: Self) extends AnyVal {
      
      inline def setDomHandler(value: js.Function): Self = StObject.set(x, "domHandler", value.asInstanceOf[js.Any])
      
      inline def setHandler(value: js.Function): Self = StObject.set(x, "handler", value.asInstanceOf[js.Any])
      
      inline def setOriginHandler(value: js.Function): Self = StObject.set(x, "originHandler", value.asInstanceOf[js.Any])
      
      inline def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    }
  }
}
